//소속 패키지 선언
package net.google.erp;

// 하나은행 정보를 관리하는 [HBank]클래스 선언
// 클래스 HBank 는 인터페이스 Bank를 구현함.
public class HBank implements Bank{
	//속성변수 선언
	private int money;
	
	
	//생성자 선언
	public HBank() {
		System.out.println("하나 은행 거래 시작 !");
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
		money++;
		this.money = this.money + money;
		System.out.println("입금액 : " + money + ".  현재 잔액 : "+ this.money );
	}
	
	//메소드 선언
	public void print_msg() {
		System.out.println("업무시간은 오전 9:00 ~ 오후 4:00 입니다.");
	}
	
	public void print_alert() {
		System.out.println("마스크를 쓰고 입장해주세요.");
	}
	
	
}

/*
<문> [HBank] 클래스는 왜 Bank 인터페이스를 구현하도록 만들었나?
<풀> 인터페이스 Bank 의 모든 메소드를 재정의하고 그 재정의한 메소드만 호출하게 하여
     프로젝트 전체의  메소드 호출 규격을 만들어 유지보수성을 높인다.

-----------------------------

<문> public void minus(int money) {~} 생략하면?
<풀> 에러 발생.
- 에러 발생 지점 -> public class HBank implements Bank{ ~
- public void minus(int money) {~} 생략하면	오버라이딩을 1개 안 한 거임.
- 오버라이딩을 안 했으니 객체화가 불가능하다고 클래스 머리에 abstract 를 붙여야 하는데 안 붙여서 에러 발생.
	 (오버라이딩 안 한 게 에러는 아님)





*/