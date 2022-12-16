package review.practice;

public class Bank {
	//속성변수 선언
	private int money;
	private String bank_name;
	
	//생성자 선언
	public Bank(int money, String bank_name){ 
		this.money = money;
		this.bank_name = bank_name;
	}

	//동료 생성자 선언
	public Bank() {
		this(0, "");
	}
	
	//저금액 메소드
	public int getMoney(){
		return money;
	}

	//입금 메소드
	public void add(int money){
		this.money = this.money + money;
	}

	//출금 메소드
	public void minus(int money){
		if(this.money >= money){
			this.money = this.money - money;
		} else {
			System.out.println("출금 실패");
		}
	}

	public void print_msg(){
		System.out.println("업무 시간은 09:00 ~ 18:00");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
