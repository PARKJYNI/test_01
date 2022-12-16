package com.google.erp;

//KBank 클래스를 객체화하고 메소드를 호출하는 [KBankExe] 클래스 선언.
public class KBankExe2 {

	//JVM이 가장 먼저 찾아 자동으로 호출하는 main 메소드 선언.
	public static void main(String[] args) {
		
		//KBank 클래스의 속성변수 호출하여 얻은 데이터 출력.
		// <주의> static 이 붙은 속성변수는 객체생성 없이 클래스명.속성변수명 으로 호출 가능.
		// <주의> static 이 붙은 속성변수를 가진 클래스를 n 개 객체화하면 객체끼리 이 속성변수를 공유하게 됨.
		System.out.println("입출금 전 메시지 : " + KBank.msg);
		System.out.println("======================================");
		
		
		// KBank 클래스를 객체화해서 객체의 메위주를 bank에 집어넣음
		KBank bank1 = new KBank();
		//KBank 객체의 메소드 호출하여원하는 작업하기
		System.out.println("현재 저금 총액 : " + bank1.getMoney());
		bank1.add(2000);
		System.out.println("현재 저금 총액 : " + bank1.getMoney());
		bank1.minus(300);
		System.out.println("현재 저금 총액 : " + bank1.getMoney());
		
		System.out.println("======================================");
		
		// KBank 객체의 메위주가 저장되는 변수 bank2 선언하고
		// KBank 객체 생성하고 객체의 메.위.주를 bank2 변수에 저장하기.
		KBank bank2 = new KBank( );
		//KBank 객체의 메소드 호출하여원하는 작업하기
		System.out.println("현재 저금 총액 : " + bank2.getMoney());
		bank2.add(3000);
		System.out.println("현재 저금 총액 : " + bank2.getMoney());
		bank2.minus(400);
		System.out.println("현재 저금 총액 : " + bank2.getMoney());	
		System.out.println("======================================");		

		// <주의> static 이 붙은 속성변수는 객체생성 없이 클래스명.속성변수명 으로 호출 가능.
		// <주의> static 이 붙은 속성변수를 가진 클래스를 n 개 객체화하면 객체끼리 이 속성변수를 공유하게 됨.
		System.out.println("총 입출금 메시지 : " + bank1.msg);
//		System.out.println("총 입출금 메시지 : " + KBank.msg); 도 가능. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*

  
 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
