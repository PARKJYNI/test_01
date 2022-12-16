package com.naver.erp;

// com.google.erp 패키지 안의 KBank 클래스를 수입하기.
import com.google.erp.KBank;

//KBank 클래스를 객체화하고 메소드를 호출하는 [KBankExe] 클래스 선언.
public class KBankExe {

	//JVM이 가장 먼저 찾아 자동으로 호출하는 main 메소드 선언.
	public static void main(String[] args) {
		
		// KBank 클래스를 객체화해서 객체의 메위주를 bank에 집어넣음
		// 사진
		KBank bank = new KBank( 3000 );
		//KBank 객체의 메소드 호출하여원하는 작업하기
		System.out.println("현재 저금 총액 : " + bank.getMoney());
		bank.add(3000);
		System.out.println("현재 저금 총액 : " + bank.getMoney());
		bank.minus(2500);
		System.out.println("현재 저금 총액 : " + bank.getMoney());
		
		KBank bank2 = new KBank( );
		System.out.println("현재 저금 총액2 : " + bank2.getMoney());

/*
=======================================

<문1> import com.google.erp.KBank; 구문을 생략하면?
<풀> 에러 발생.
- 에러 발생 지점 -> KBank bank = new KBank( 3000 );
- new 에 의해 객체화하는 클래스는 수입을 해야 함. 그래서 import com.google.erp.KBank; 구문을 생략하면 KBank 클래스 수입되지 않아 생성자를 찾을 수 없어 객체화가 불가능함.
- 생성자 호출을 감당할 클래스를 못찾아. KBank bank = new KBank( 3000 ); 만 정상적이면 밑에 
		System.out.println("현재 저금 총액 : " + bank.getMoney());
		bank.add(3000);
		System.out.println("현재 저금 총액 : " + bank.getMoney());
		bank.minus(2500);
		System.out.println("현재 저금 총액 : " + bank.getMoney())
		
는 정상적으로 실행되기 때문에 에러가 안 뜸(형식에 어긋나지 않아). getMoney는 근본적으로 public 이야.  

=======================================

<문2> com.google.erp.KBank 클래스 中, public class KBank {~} 를 -> class KBank {~} 로 수정하면?
<풀> 에러 발생.
- 에러 발생 지점 1 -> import com.google.erp.KBank;
- 에러 발생 지점 2 -> KBank bank = new KBank( 3000 ); (수입 안 된 생성자의 클래스를 찾고 있어~)
- 클래스 앞에 public 이 없으면 타 패키지의 타 클래스에서 import 구문으로 수입하는 것을 막음.
- 즉, 타 패키지의 타 클래스에서 수입을 할 수 없음.
- 현재 KBank 클래스 KBankExe 클래스는 다른 패키지에 있으므로
	KBank 클래스 앞에 public 이 없으면 KBank 클래스는 타 패키지 타 클래스에서 수입이 안 됨.

=======================================

<문3> KBank 클래스에서 public KBank( int money ){~} 를 

	(1) protected KBank( int money ){~}
	    또는
	(2) void KBank( int money ){~}
	    또는
    (3) private KBank( int money ){~}
    	로 수정하면?

<풀> 3가지 경우 모두 에러 발생.
- public 외에는 생성자를 찾을 수 없음
- 3가지 모두 에러 발생
- 3가지 모두 에러 발생 지점 -> KBank bank = new KBank( 3000 );
- 타 패키지의 클래스를 수입한 후, new 에 의해 생성자 찾기가 가능 하려면 생성자는 public 만 붙여야 함.

=======================================

<문4> KBank 클래스에서 public KBank( int money ){~} 를 

	(1) protected void add( int money ){~}
	    또는
	(2) void void add( int money ){~}
	    또는
    (3) private void add( int money ){~}
		로 수정하면?
		
<풀> 3가지 경우 모두 에러 발생.
- 3가지 모두 에러 발생 지점 -> KBank bank = new KBank( 3000 );
- protected, default, private 이 붙은 메소든느 타 클래스에서 호출이 불가능함.
- public 이 붙은 메소드는 타 클래스에서 호출이 가능. (단, 수입성공 + 객체화 성공이 됐을 경우)








 */
		
		
		
	}

}
