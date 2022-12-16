package review.practice;

public class HBank extends Bank{
	
	//생성자 선언 
	public HBank() {
		//부모생성자 호출
		super(1000, "하나");
		
		//동료 메소드 호출
		print_msg();
	}
	
	//오버라이딩 규칙: 슈퍼클래스의 메소드 접근제어자 보다, 범위가 크거나 같아야 함. 
	@Override
	public void print_msg() {
		System.out.println("업무시간은 09:00 ~ 16:00");
	}
	
	
}
