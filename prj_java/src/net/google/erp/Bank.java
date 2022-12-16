package net.google.erp;

//Bank 인터페이스 선언
public interface Bank {

	//메소드 선언
		//인터페이스의 메소드 특징
		// public 과 abstract 의 성격을 가지고 있음.
		// public 과 abstract 가 없으면 컴파일 시 넣어줌. 
		//  (*public 없다고 default 가 아니야!)

	public void minus(int money);
	public void plus(int money);
	public void print_msg();
	
}

/*
<문> 인터페이스는 왜 만들었나? 왜 존재하나?
<풀> n개의 클래스를 각각 객체화하고 메소드를 호출하고 싶음.
	 만약, 메소드 이름이 규격화 되지 않으면 유지보수가 힘듦.
	 n개의 클래스가 인터페이스를 구현하게 만들면 인터페이스의 모든 메소드를 재정의하게 되므로 유지보수가 쉬워짐.

----------------------------------

<문> public void minus(int money); 를 void minus(int money); 로 수정하면?
<풀> 에러 발생 없음
	 - public 이 없으면 컴파일 시 넣어준다.

----------------------------------

<문> public void minus(int money); 
		를 
	private void minus(int money); 
		또는
	protected void minus(int money); 
		로 수정하면?
<풀> 에러 발생
	 - private 또는 protected 를 붙이면 public 성질을 잃어버리기 때문에.
	 - 결론적으로 public 을 붙이던가, 안 붙이면 자동으로 넣어줌.

----------------------------------



*/