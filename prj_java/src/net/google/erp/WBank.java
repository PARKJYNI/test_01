//소속 패키지 선언
package net.google.erp;

// 우리은행 정보를 관리하는 [KBank]클래스 선언
public class WBank implements Bank{
	//속성변수 선언
	private int money;
	
	
	//생성자 선언
	public WBank() {
		System.out.println("우리 은행 거래 시작 !");
	}


	public void minus(int money) {
		if( this.money >= money ){
			this.money = this.money - money;
			System.out.println("출금액 : " + money + "현재 잔액 : " + this.money);
		} else {
			System.out.println( money + ". 출금 실패!");
		}
	}
	
	public void plus(int money) {
		money = money + 3;
		this.money = this.money + money;
		System.out.println("입금액 : " + money + ".  현재 잔액 : "+ this.money );
	}
	
	
	//메소드 선언
	public void print_msg() {
		System.out.println("업무시간은 오전 9:00 ~ 오후 6:00 입니다.");
	}
	
	public void warnning() {
		System.out.println("마스크를 벗고 입장하셔도 됩니다.");
	}
	
	
	
	
}

