package com.google.erp;	

public class Employee {

	   private int emp_no;
	   private String emp_name;
	   
	   // Dept 객체의 메위주를 속성변수로 담기
	   // Dept 객체의 메위주가 저장 예정인 [참조형 속성변수] 선언하기
	   // <명심> 객체의 메모리 위치 주소값은 메소드 or 속성변수 호출할 때 사용됨.
	   private Dept dept;
	   // Dept 가 갖고있는 모든 데이터를 소유할 수 있는 이점이 있어서 속성변수로 만듦.
	   
	   
	   
	   public Employee (int emp_no, String emp_name, Dept dept) {
		   this.emp_no = emp_no;     // 1이 들어간 거 
		   this.emp_name = emp_name; // 사오정이 들어간 거
		   this.dept = dept; 
	   //   this.속성변수 = 매개변수   
		   // 생성자의 매개변수로 dept 변수의 메모리 위치 주소값이 들어왔음.
	   }
	   
	   // < 메소드 선언하기 >
	   public int getEmp_no(){
	      // 속성변수 emp_no의 데이터를 리턴하기 
	      return emp_no;
	   }
	   
	   public String getEmp_name() {
	      // 속성변수 emp_name의 데이터를 리턴하기 
	      return emp_name;
	   }
	   
	   
	   // [직원번호]를 수정하는 메소드 선언하기.
	   // 매개변수로 직원번호가 들어오니까 emp_no 로 넣고 자료형은 int
	   public void setEmp_no(int emp_no) {
		   this.emp_no = emp_no;
	   }
	   
	   
	   //[직원명]을 수정하는 메소드 선언하기.
	   // 매개변수로 들어온 데이터를 속성변수로 넣기!
	   public void setEmp_name(String emp_name) {
		   this.emp_name = emp_name;
		   // this.속성변수  = 	매개변수
		   // 위에 private String emp_name;에 final을 붙이면, final로 선언된 속성변수를 갱신 시도하는 코딩( "this.emp_name = emp_name" )이 불가능 해짐.
	   }   
		   
	   // [Dept 객체]의 메위주를 리턴하는 메소드 선언하기.
	   // 메소드 왼쪽에 클래스명 씀. -> 이 메소드는 그 클래스를 객체화 했을 때의 메위주를 리턴할 거야.
		public Dept getDept() {
			return this.dept;
		}
		
		//[Dept 객체]의 메위주를 수정하는 메소드 선언하기.
		public void setDept(Dept dept) {
			this.dept = dept;
		}  
		   
		   
		   
		   
		   
		   
		
		
		
		   
		   
		   
	  
	   
}	  

