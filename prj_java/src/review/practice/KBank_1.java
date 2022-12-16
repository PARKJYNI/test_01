package review.practice;

public class KBank_1 {
	
	private static int money;
	
	public KBank_1(int money) {
		this.money = money;
	}
	
	public KBank_1() {
		this(100);
	}
	
	public int getMoney() {
		return money;
	}
	
	public void add(int money) {
		this.money = this.money + money;
	}
	
	public void minus(int money) {
		if(this.money >= money) {
			this.money -= money;
		} else {
			System.out.println("출금 실패.");
		}
	}
	
	
	
	
}
