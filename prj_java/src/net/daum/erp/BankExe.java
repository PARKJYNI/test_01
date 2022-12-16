package net.daum.erp;

//KBank 클래스를 객체화하고 메소드를 호출하는 [KBankExe] 클래스 선언.
public class BankExe {

	//JVM이 가장 먼저 찾아 자동으로 호출하는 main 메소드 선언.
	public static void main(String[] args) {
		
		
		// <1>HBank 객체의 메위주 저장할 변수 hbank 선언하기
		// <2>수입한 클래스 중에 new 오른쪽 생성자 호출이 가능한 생성자를 가진 클래스를 찾아 복사해서 메모리에 올려 객체화하기
		//    + 이때 메모리에 올라가는 클래스의 조상 클래스도 모두 메모리로 올라가 객체화 됨.
		//    + 현재 조상 클래스는 Bank 클래스 이므로 Bank 클래스도 메모리로 올라가 객체화 됨. 
		// <3>객체의 생성자를 new 오른쪽 HBank( ) 로 호출하기
		//    + 이때 호출되는 생성자 내부 첫줄에는 반드시 부모생성자를 호출하는 코딩이 나와야 함.
		//    + But, 부모생성자를 호출하는 코딩이 없다면, 부모생성자 중에 기본 생성자를 호출하는 코딩이 자동 삽입 됨.
		// <4>객체의 메위주를 리턴하기
		// <5>리턴한 객체의 메위주를 hbank 에 저장하기
		//-----------------------------------------------
			// <1>은 HBank HBank 의 해설
			// <2>~<4>은 new HBank(   ); 의 해설
			// <5>은 = 의 해설
		HBank hbank = new HBank();
		// HBank 객체의 메소드 호출하기 
		// <주의> HBank 객체의 메소드 호출 시 메소드가 없으면 슈퍼클래스꺼를 호출.
		hbank.add(3000);
		hbank.minus(300);
		System.out.println(hbank.getMoney());
		System.out.println("===============");
		
		
		KBank kbank = new KBank();
		kbank.add(4000);
		kbank.minus(400);
		System.out.println(kbank.getMoney());
		System.out.println("===============");
		
		
		WBank wbank = new WBank();
		wbank.add(3000);
		wbank.minus(300);
		System.out.println(wbank.getMoney());
		System.out.println("===============");

		
		System.out.println("모든 은행의 총 잔액 : " + Bank.getTotMoney() );
		
		
		
	}
	
	
}


/*
	public static void main(String[] args) {
	
		HBank hbank = new HBank();
		hbank.add(3000);
		hbank.minus(300);
		System.out.println(hbank.getMoney());
		System.out.println("===============");
		
		
		KBank kbank = new KBank();
		kbank.add(4000);
		kbank.minus(400);
		System.out.println(kbank.getMoney());
		System.out.println("===============");
		
		
		WBank wbank = new WBank();
		wbank.add(3000);
		wbank.minus(300);
		System.out.println(wbank.getMoney());
		System.out.println("===============");
		
		
		int sum = 0;
		sum = hbank.getMoney() + kbank.getMoney() + wbank.getMoney();
		
		System.out.println("모든 은행의 총 잔액 : " + sum);
	}

*/
