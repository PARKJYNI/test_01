package review.practice;

public class KBank extends Bank {
	
	//생성자 선언
	public KBank() {
		super(3000,"국민");
		print_msg();	
	}
	
	public void print_msg() {
		System.out.println("업무 시간은 09:00 ~ 17:00");
	}
	
	

}
