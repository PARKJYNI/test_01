//소속 패키지 선언
package net.google.erp;

// 국민은행 정보를 관리하는 [KBank]클래스 선언
public class KBank implements Bank{
	//속성변수 선언
	private int money;
	
	
	//생성자 선언
	public KBank() {
		System.out.println("국민 은행 거래 시작 !");
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
		money = money + 2;
		this.money = this.money + money;
		System.out.println("입금액 : " + money + ".  현재 잔액 : "+ this.money );
	}
	
	
	//메소드 선언
	public void print_msg() {
		System.out.println("업무시간은 오전 9:00 ~ 오후 5:00 입니다.");
	}
	
	public void alert() {
		System.out.println("되도록 마스크를 쓰고 입장해주세요.");
	}
	
	
	
}


