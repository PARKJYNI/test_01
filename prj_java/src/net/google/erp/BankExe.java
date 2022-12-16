package net.google.erp;

//BankExe 클래스를 객체화하고 메소드를 호출하는 [BankExe] 클래스 선언.
public class BankExe {

	//JVM이 가장 먼저 찾아 자동으로 호출하는 main 메소드 선언.
	public static void main(String[] args) {
		
		//overriding한 메소드만 호출 가능해져(인터페이스에서 정한 메소드만 호출해라!)
		// 얻는 이득? 프로젝트 전체에 호출할 메소드가 정해져서 메소드의 남발을 막아 유지보수↑
		//인터페이스명 객체참조변수 = new 구현생성자명( );
		Bank hBank = new HBank();
		hBank.plus(3000);
		hBank.minus(150);
		hBank.print_msg();
//		hBank.print_alert();
		
		Bank kBank = new KBank();
		kBank.plus(4000);
		kBank.minus(250);
		kBank.print_msg();
//		kBank.alert();
		
		Bank wBank = new WBank();
		wBank.plus(5000);
		wBank.minus(350);
		wBank.print_msg();
//		wBank.warnning();
		
		
		



    

		
		
	}
}


/*

<문> HBank 클래스 내부의 minus 메소드 영역을 주석 처리하면?
<풀> 주석처리 시, HBank 클래스 객체화가 불가능함. 
	- 인터페이스를 구현한 클래스는 인터페이스의 모든 메소드를 오버라이딩하지 않으면 객체화가 블가능함.

<문> Bank HBank = new HBank(  );  를
     HBank hBank = new HBank(  ); 로 선언하지 않는 이유는?
<풀> Bank 인터페이스에 정한 메소드만 호출하도록 하기 위해.
	- 프로젝트 전체의 메소드 호출 규격을 만들어 유지 보수성을 높임.
	- 인터페이스명 객체참조변수 = new 인터페이스구현한클래스생성자(~);
	- 인터페이스를 구현한 클래스의 객체에서 오버라이딩한 메소드만 호출 가능.
	- 고유멤버는 호출 불가능.
	- 프로젝트 전체의 메소드 호출 규격을 만들어	유지 보수성을 높이기 위함. 

<문> hBank.print_msg( ); 다음에 hBank.print_alert( ) 를 삽입하면?
<풀> 에러발생.
	- Bank 인터페이스에 정한 메소드만 호출하도록 하기 위해.
	- 프로젝트 전체의 메소드 호출 규격을 만들어 유지 보수성을 높임.
	- 인터페이스명 객체참조변수 = new 인터페이스구현한클래스생성자(~);
	- 인터페이스를 구현한 클래스의 객체에서 오버라이딩한 메소드만 호출 가능.
	- 고유멤버는 호출 불가능.
	- 각자 소유한 메소드 호출을 허락하면 유지 보수성이 떨어지므로 불허함.
 
 
 
 
 */








