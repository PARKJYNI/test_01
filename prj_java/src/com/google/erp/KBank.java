//소속 패키지 선언
package com.google.erp;

//은행 정보를 관리하는 [KBank]클래스 선언
public class KBank {

	//속성변수 선언(공유 데이터 선언)
	//[저금액]이 저장되는 int형 속성변수 money 선언
	//int형 속성변수 선언 후 수동 초기화가 없으면 디폴트 값으로 0으로 자동 초기화 됨 
	private static int money;

	// 입금 또는 출금 시 경고 문자 저장하는 속성변수 선언
	public static String msg = "";
	
	
	//[생성자] 선언(외부데이터 들어옴)
	//<주의>생성자는 리턴형이 없다. 그러므로 생성자 내부에 "return 데이터;" 가 나오면 안 됨
	// [매개변수로 돈이 들어오는 생성자] 선언
	public KBank(int money) {
		//생성자 호출 시 매개변수로 들어온 데이터를 속성변수에 저장.
		//속성변수명과 생성자 매개변수명이 동일하면 속성변수는 this.속성변수명 으로 사용
		this.money = this.money + money;
	}
	//속성변수에 final 붙이고. this.money = money; 수동 초기화 안 해주면 -> 생성자 쪽에서 역할을 안 했기 때문에 public KBank(int money) 에서 에러가 터지게 만들음
	
	// [매개변수가 없는 생성자] 선언
	public KBank( ) {
		//this() <- 동료생성자 호출하기
		//동료 생성자를 KBank(100); 로 호출
		this(0);
	}
	
	
	//메소드 선언(실행구문 실행)
	//[저금액] 리턴하는 메소드 선언
	public int getMoney() {
		//속성변수 money의 데이터를 리턴하기
		return money;
	}
	
	//[입금] 메소드 선언
	//메소드 호출 시 매개변수 money로 들어온 데이터를 속성변수 money에 [누적]하여 저장
	//this. 뒤의 변수는 속성변수명.
	//속성변수 money 와 매개변수 money 가 동일하므로 헷갈리지 않기 위해 this. 를 붙임.
	public void add(int money) {
		//this.money = this.money + money;
		this.money += money;
		System.out.println("입금 성공. 입금액 : " + money + "원 입니다.");
		
		msg = msg + " [입금 성공. 입금액] : " + money;
	}

	
	//[출금] 메소드 선언
	//잔액이 출금액보다 크거나 같을 때, 작을 때
	public void minus(int money) {
		if(this.money >= money) {
			this.money = this.money - money; //잔액 - 출금액
			System.out.println("출금 성공. 출금액 : " + money + "원 입니다.");
			msg = msg + " [출금 성공. 출금액] : " + money;
		} else {
			System.out.println("출금 실패. 잔액이 부족합니다.");
			msg = msg + " [출금 실패. 잔액이 부족합니다] : ";
					
		}
		
	}
	
	
	
	
	
}
