//소속 패키지 선언
package net.daum.erp;

// 우리은행 정보를 관리하는 [KBank]클래스 선언
public class WBank  extends Bank{
	
	//생성자 선언
	public WBank( ) {
		//부모생성자 호출하기
		// 서브클래스의 생성자 첫줄에는 반드시 슈퍼클래스의 생성자를 호출하는 super(~) 가 반드시 나와야 함.
		// super(~)가 없다면 자동으로 super( )가 삽입 됨.
		super(2000, "우리"); // 없으면 은신 중!!
		
		//동료메소드 호출하기
		print_msg();
		
		}
	

	
	
	
}


/*
-----------------------------------
<문1> 생성자 안에서   print_msg( ); 에 의해서 print_msg 라는 메소드를 호출하고 있다.
     동료 중에는 print_msg 라는 메소드 없다. 그럼 누구 꺼를 호출하는가?
<풀> 동료 중에 print_msg 라는 메소드가 없으면 슈퍼클래스의 print_msg 라는 메소드를 호출함.
 - 현재 슈퍼클래스 Bank 에는 print_msg 라는 메소드 有.
 









*/
