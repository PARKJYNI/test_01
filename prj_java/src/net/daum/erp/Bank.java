//소속 패키지 선언
package net.daum.erp;

// 하나은행 정보를 관리하는 [KBank]클래스 선언
public class Bank{

	//속성변수 선언
	private int money;
	private String bank_name;
	private static int tot_money;
	
	//동료 생성자 호출. <주의> Bank(0,””); 이건 안 됨
	public Bank( ) {
		this(0,"");
	}

	//생성자 선언
	public Bank(int money, String bank_name) {
		// 매개변수 money로 들어온 데이터를 속성변수 money 에 누적 시킴.
		// 매개변수 bank_name 로 들어온 데이터를 속성변수 bank_name 에 갱신 시킴.
		this.money = this.money + money;
		this.tot_money += money; // 생성자 쪽에서도 초기 원금도 누적시켜야 함. 
		this.bank_name = bank_name;
		System.out.println( "**************************");
		System.out.println( this.bank_name + " 은행 거래 시작!");
		System.out.println( "**************************");
	}
	
	
	
	//[저금액] 메소드
	public int getMoney() {
		return money;
	}
	
	public static int getTotMoney() {
		return tot_money;
	}
	
	
	//[입금] 메소드
	public void add(int money) {
		money++;
		this.money += money;
		this.tot_money += money;
		System.out.println("입금 성공. 입금액 : " + money + "원. / 잔액 : " + this.money);
	}

	
	//[출금] 메소드
	public void minus(int money) {
		if(this.money >= money) {
			this.money = this.money - money;
			this.tot_money -= money;
			System.out.println("출금 성공. 출금액 : " + money + "원. / 잔액 : " + this.money);
		} else {
			System.out.println(bank_name + "출금 실패. 잔액이 부족합니다.");
					
		}
		
	}
	


	public void print_msg() {
		System.out.println("업무시간은 오전 9:00 ~ 오후 6:00 입니다.");
	}
	
	
	
	
	
	
	
}
