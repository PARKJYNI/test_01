package com.google.erp;

// [부서 정보]를 관리하는 [Dept] 클래스 선언.
public class Dept {

	// 속성변수 선언. (목적: 클래스 내부에서 서로 공유하고 싶은 데이터를 속성변수에 넣는다)
	private int dep_no; //초기화
	private String dep_name; //초기화
	private String loc; //속성변수를 지우면 속성변수를 거론한 곳이 Error 뜸. //final 붙으면 초기화는 여기가 아니라
	
	// 생성자(목적: 객체 생성할 때 한 번 호출 + 외부에서 데이터가 들어옴->속성변수의 초기화 작업)
	// 생성자는 코딩상 0개 이상, 존재상 1개 이상. --> 생성자 없앤다고 Error 나지 않음. 필수 요소이기 때문.
	public Dept(int dep_no, String dep_name, String loc) {
		this.dep_no = dep_no;
		this.dep_name = dep_name;
		this.loc = loc; //final 붙으면 예외적으로 default 값이 안 들어가서 초기화는 여기임!
	//  this.속성변수 = 매개변수
	}
	
	// 메소드 (목적:원하는 실행구문 반복호출)
	// <tip> Source - Generate Getters and Setters = 속성변수 기반으로 메소드 자동생성
	// 부서번호를 리턴하는 메소드 선언 (리턴 선언만 하는 거니 매개변수 필요 無)
	// return 의미 : 메소드 내부에 있음 + (1)메소드 중단 (2)return 오른쪽에 데이터가 있으면 메소드를 호출한 놈한테 
	// 메소드 왼쪽에 void가 아니라면, 실행구문 안에는 무조건 'return + 데이터;'가 有
	public int getDep_no() {
			return this.dep_no;		
	}	

	// 부서이름을 리턴하는 메소드 선언
	public String getDep_name() {
		return this.dep_name;
	}

	// 부서위치를 리턴하는 메소드 선언
	public String getLoc() {
		return this.loc;
	}

	// 부서번호를 수정하는 메소드 선언 (void -> 메소드 왼쪽자리에 나오는 리턴자료형.(리턴할 게 없다는 뜻))
	public void setDep_no(int dep_no) {
		this.dep_no = dep_no;
	}

	// 부서이름을 수정하는 메소드 선언 (void 잊지 말자!)
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}	

	// 부서위치를 수정하는 메소드 선언 (void 잊지 말자!)
	public void setDep_no(String loc) {
		this.loc = loc;
	}	
	
	
	// <문>
	// 메소드 왼쪽에 void 가 붙으면 메소드 내부에서는 return 이란 키워드가 등장할수 없다. (x)
	// 메소드 왼쪽에 void 가 안 붙으면 메소드 내부에서는 return 데이터;  이란 코딩이 반드시 등장한다. (0)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
