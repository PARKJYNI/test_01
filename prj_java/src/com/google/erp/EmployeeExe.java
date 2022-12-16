package com.google.erp;

public class EmployeeExe {
	public static void main(String[] args) {
		
		// <1> Dept 객체의 메위주 저장할 변수 dept 선언함.
		// <2> 수입한 클래스 중, new 우측에 생성자 호출이 가능한, 생성자를 가지고 있는 클래스를 찾아서 복사한 후, 메모리에 올려 객체화 함.
		// <3> 객체의 생성자를 new 오른쪽 Dept(10, "관리부", "서울")로 호출하기
		// <4> 객체의 메위주를 리턴하기
		// <5> 리턴한 객체의 메위주를 employee 에 저장하기.
		Dept dept = new Dept(10, "관리부", "서울");
		
		// ====< 이제 메소드 호출 ~ ! >====
		// Dept 객체의 메소드 호출로 얻은 데이 출력하기.
		System.out.println("부서번호 : " + dept.getDep_no());
		System.out.println("부서이름 : " + dept.getDep_name());
		System.out.println("부서위치 : " + dept.getLoc());

		// Dept 객체의 메소드 호출로 객체의 속성변수 데이터를 수정하기
		// 리턴할 데이터가 없는 구문(메소드의 리턴자료형이 void)은 실행구문에 위치(데이터가 나오지 않는 자리)
		dept.setDep_name("사업부");
		
		// 리턴할 데이터가 있는 구문(메소드의 리턴자료형이 void X)은 데이터가 나오는 위치
		System.out.println("부서번호 : " + dept.getDep_no());
		System.out.println("부서이름 : " + dept.getDep_name());
		System.out.println("부서위치 : " + dept.getLoc());
		
		
		
		
		
		
		// Employee 객체 생성하고 객체의 메위주 얻어 employee 변수에 저장.
		Employee employee = new Employee( 1, "사오정", dept);
													//Dept 객채의 메위주가 담긴 dept를 employee클래스의 생성자에 넣어야지.
		/*
		< 6/9 추가 >
		
		기본자료형 변수명 = 데이터;  int age = 30;
		
		클래스명 변수명;   Employee employee;
		메모리 공간을 확보할 예정 -> Employee 클래스를 객체화 했을 때의 메위주가 들어갈 예정 -> 메모리 공간의 이름은 employee로 지정 
		
		*/
		
		
		
		
 
		// ====< 이제 메소드 호출 ~ ! >====
		// Employee 객체의 메소드 호출하여 원하는 작업하기.
		
		// Employee 객체의 메소드 호출로 얻은 데이 출력하기.
		System.out.println("직원번호 : " + employee.getEmp_no());
		System.out.println("직원명 : " + employee.getEmp_name());
		
		System.out.println("직원의 소속부서번호 : " + dept.getDep_no());
		
		// Dept 객체의 메위주 ( = employee.getDept() ) 의 리턴값이 들어감 / 메위주를 아니까 . 붙이고 객체가 갖고 있는 메소드 호출하면 됨.
		// employee.getDept() 자리에 getDept() 메소드의 리턴값이 들어감. 리턴값이 메위주니까 -> 메위주를 알면 메소드 호출 가능함. 어케하냐고? 메위주 뒤에 . 을 붙이고 메소드 호출해
		// Employee 객체의 getDept() 메소드 호출로 리턴되는 Dept 객체의 메위주를 가지고, Dept 객체의 getDep_name() 메소드 호출하여 얻은 부서 번호 출력하기.
			// 객체의 메소드 호출 방법 : 객체의 메위주.메소드명(~)
		System.out.println("직원명 소속부서명 : " + employee.getDept().getDep_name());
		
		// Employee 객체의 getDept() 메소드 호출로 리턴되는 Dept 객체의 메위주를 가지고, Dept 객체의 getLoc() 메소드 호출하여 얻은 부서 번호 출력하기.
		System.out.println("직원명 소속부서위치 : " + employee.getDept().getLoc());
		//      employee  .  getDept()  .  getLoc());
		//   객체의 메위주ㅣ 메소드 호출 ㅣ  
		//                ㅣ객체의 메위주ㅣ 메소드 호출  
		// " . "이 두 개 -> " . " 왼쪽은 객체의 메위주 / " . " 오른쪽은 메소드 호출 => 첫번째 " . " 오른쪽 getDept()의 리턴값이 객체의 메위주가 되는 거임. 
		// +) " . " 오른쪽에 속성변수가 올 수도 있음. 
		
		//=======================================
		// FM 으로 효율적으로 코딩 하려면 아래와 같이!!
		Dept dept2 = employee.getDept();
		System.out.println("직원의 소속부서번호 : " + dept2.getDep_no());
		System.out.println("직원명 소속부서명 : " + dept2.getDep_name());
		System.out.println("직원명 소속부서위치 : " + dept2.getLoc());
		//=======================================
	
		
		// 객체 Employee 의 메소드 호출로, 객체의 속성변수 데이터 수정 후 출력하기.
		employee.setEmp_name("저팔계");
		System.out.println("직원번호 : " + employee.getEmp_no());
		System.out.println("직원명 : " + employee.getEmp_name());
		
		
		Dept dept3 = new Dept(20, "자재부", "부산");
		employee.setDept(dept2);
		
		employee.setDept(new Dept(20, "자재부", "부산"));
		
		
		
		
		
		
	}
}
