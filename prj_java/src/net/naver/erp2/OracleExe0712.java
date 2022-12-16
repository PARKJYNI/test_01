package net.naver.erp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Employee 클래스 선언하기
//1명의직원정보를 관리하는 클래스임.
class Employee{
	
	// Employee 객체를 따로 만들면 직원번호의 자료형을 살린 채로 각각 저장할 수 있어서 씀.
	// 해쉬맵은 자료형을 String으로 밖에 못해. 그래서 출력만 하려면 해쉬맵
	//속성변수 선언
	private int emp_no;
	private String emp_name;
	private String jumin_num;
	private String jikup;
	private String birthday;

	//-----------------------------------
	// 메소드 선언 
	//-----------------------------------
	// 직원번호를 리턴하는 메소드 선언하기 
	// this 안 붙여도 되는데, 매개변수랑 헷갈릴 수 있으니까 붙여도 됨. + 부모클래스가 갖고있는 메소드랑 속성변수랑 헷갈릴까봐
	public int getEmp_no() {
		return this.emp_no;
	}
	
	//매개변수로 들어오는 직원번호를 속성변수로 저장하는 메소드 선언하기
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	// ----------------------------------	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	// ----------------------------------
	public String getJumin_num() {
		return jumin_num;
	}
	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}
	// ----------------------------------
	public String getJikup() {
		return jikup;
	}
	public void setJikup(String jikup) {
		this.jikup = jikup;
	}
	// ----------------------------------
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}



// Oracle 선언하기
// n개의 Employee 객체를 저장하여 관리하는 클래스임.
// n개의 Employee 객체를 입력/수정/삭제/검색하는 메소드로 구성돼있음.
class Oracle {
	// ----------------------------------
	//속성변수 선언
	// ----------------------------------
	// 이 empList 변수에는 Employee 객체만 저장하라고 제네릭스(Generic)를 선언.
	// 제네릭스 썼으니, 꺼낼 때 형변환을 할 필요가 없음.
	private List<Employee> empList = new ArrayList<Employee>();
	
	// ----------------------------------	
	// 입사하는 직원이 사용할 직원번호가 저장되는 속성변수 no 선언
	// ----------------------------------
	private int no = 1;
	//	private int no; //0이 자동초기화로 들가있음
	
	// ----------------------------------
	// 삭제된 직원번호가 저장되는 속성변수 선언하고 , ArrayList 객체 저장.
	// 속성변수 선언 ArrayList로 직원의 번호가 들어 와야함(삭제된 직원번호를 부여받는 신입직원)
	// private ArrayList del_no = 1; -> private ArrayList del_no = new ArrayList();
	// ----------------------------------
	
	
	//생성자 선언
	public Oracle() {
		
	}
	
	// ----------------------------------
	// 메소드 선언 1. insert
	// ----------------------------------
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 Employee 객체를 저장하는 메소드 선언.
	public void insert(String emp_name, String jumin_num, String jikup, String birthday) {
		// --------------------------------------------------------------------
		// 매개변수로 들어온 데이터를 Employee 객체에 저장. HashMap을 안 쓸 거야.
		// HashMap은 자료형은 못살림, Employee객체 생성해서 저장하면 자료형을 살릴 수 있지만 Employee 클래스를 만들어야한다는 수고스러움 有
		// --------------------------------------------------------------------
		Employee employee = new Employee();
		employee.setEmp_no(no++);
		employee.setEmp_name(emp_name);
		employee.setJumin_num(jumin_num);
		employee.setJikup(jikup);
		employee.setBirthday(birthday);

		// Employee 객체를 ArrayList 객체에 저장하기.
		empList.add(employee);
		
	}
	
	//empList라는 속성변수. arrayList의 객체가 저기에 들어가있었음. 해쉬맵객체안에 emp_no-1 과 쟤네를 맞물려서 

	// ----------------------------------
	// 메소드 선언 2. update_jikup
	// 속성변수 empList 에 저장된 ArrayList 객체의 안에 저장된 Employee 객체를 [수정]하는 메소드 선언.
	// ----------------------------------
	// 직원번호에 해당하는 행을 찾아 직급을 변경
	// ( 직원번호로 찾아 수정 vs 주민번호로 찾아 수정 ) --> 주민번호는 나라에서 부여, 직원번호는 데이터베이스에서 준 거.
	public void update_jikup(int emp_no, String jikup) {
		
		int cnt = 0;
		//반복문 돌리는 이유는 ArrayList객체 안에서 Employee 객체의 데이터 하나씩 꺼내기 위해서.
		// ArrayList 객체 안에 저장된 Employee 객체를 1개씩 꺼내서 
		//    매개변수로 들어온 직원번호와 일치한 Employee 객체 안에 
		//    직급을 매개변수로 들어온 직급으로 수정하기.
		// empList.size() 지금 여기엔 2(철수, 영희만 있었을 때..) 가 들어있는 거랑 동일! 개수를 리턴하니까!
		for( int i = 0 ; i < empList.size() ; i++ ){
		
			// ArrayList 객체 안에 i 번째에 저장된 Employee 객체를 꺼내서 변수 employee에 저장 
			// 여기서 [get] 은 ArrayList 객체의 메소드
			// (참고) ArrayList empList = new ArrayList();
			employee = empList.get(i);
			
			//꺼낸 Employee 객체 안에서 직원번호 데이터를 꺼내서 emp_no2에 저장하기.
			// 사실 그냥 꺼내면 돼서 cast연산자 사용하여 형변환 할 필요는 없음.
			int emp_no2 = (int)employee.getEmp_no();
		
			// 변수 emp_no2 의 데이터와 매개변수로 들어온 직원번호와 일치하면 Employee 객체안의 직급을 수정하기.
			if( emp_no == emp_no2) {
				//매개변수로 들어온 직급 덮어씌우면 됨
				employee.setJikup(jikup);
				cnt++;
				break;
			}
			// else는 왜 안 돼??-> 수정 타겟번호가 1번이면, 첫번째 해쉬맵 객체에 1번이니까 
			// 첫번째께 꺼낸게 철수. 그럼 운좋게 if에 걸려서
			// 끝나게 돼있음. 근데 2번이라면 , 첫번째 꺼낸 직원번호는 1번이라 if 에 안 걸리니까 else에 걸려버려서 직원번호 없다고 출력됨.
			// + 매개변수는 2번인데 첫번째 해쉬맵객체 안에 들어있는건1번이라 if에 안 걸리고 else 
		}
		if( cnt == 0) {
			System.out.println("직원번호" + emp_no + "는 없는 번호입니다.");
		}
	}
	
	
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 Employee 객체를 [수정]하는 메소드 선언.
	public void update_name(int emp_no, String emp_name) {
		int cnt = 0;
		for( int i=0 ; i<empList.size() ; i++ ){
			// ArrayList 객체 안에 i 번째에 저장된 Employee 객체를 꺼내서 변수 employee에 저장 
			employee = empList.get(i);
			
			//꺼낸 Employee객체 안에서 직원번호를 꺼내서 변수 emp_no2에 저장하기
			int emp_no2= (int)employee.getEmp_no();
		
			if( emp_no == emp_no2 ) {
				employee.setEmp_name(emp_name);
				cnt++;
				break;
			}
		}
		if( cnt == 0) {
			System.out.println("직원번호" + emp_no + "는 없는 번호입니다.");
		}
	}
	
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 Employee 객체를 [삭제]하는 메소드 선언.
	public void delete(int emp_no) {
		
		int cnt = 0;
		for( int i=0 ; i<empList.size() ; i++ ){

			// ArrayList 객체 안에 i 번째에 저장된 Employee 객체를 꺼내서 변수 employee에 저장 
			Employee employee = (Employee)empList.get(i);
	
			//꺼낸 Employee객체 안에서 직원번호를 꺼내서 변수 emp_no2에 저장하기
			int emp_no2= employee.getEmp_no();
			
				//변수 emp_no2의 데이터와 매개변수로 들어온 직원번호와 일치하면 Employee 객체 삭제하기
				if( emp_no == emp_no2 ) {
					empList.remove(i);
					cnt++;
					break;
				}
			}
			if( cnt == 0) {
				System.out.println("직원번호" + emp_no + "는 없는 번호입니다.");
			}	
	}
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 Employee 객체를 [검색]하는 메소드 선언.
	public void select(String keyword) {
		
		//검색 결과물에 맞는 결과들 저장
		//검색 결과물이 저장되는 Array 객체 생성하고 메위주를 변수 list에 저장하기.
		ArrayList list = new ArrayList();
		
		//ArrayList 객체에 저장된 Employee 객체를 차례대로 꺼내서 매개변수로 들어온 문자가 
		//일부라도 들어있으면 새롭게 생성한 ArrayList 객체에 저장하기.
		for( int i=0 ; i<empList.size() ; i++ ){
				Employee employee = (Employee)empList.get(i);
				
				int	   emp_no     = employee.getEmp_no();
				String emp_name   = employee.getEmp_name();
				String jikup      = employee.getJikup();
				String birthday   = employee.getBirthday();
				String jumin_num  = employee.getJumin_num();
				
				//만약 매개변수 keyword 안의 데이터가 emp_name 변수 안에 일부라도 들어있으면
				if( emp_name.indexOf(keyword) >= 0) {
					list.add(employee);
				}
				
				//만약 매개변수 keyword 안의 데이터가 jikup 변수 안에 일부라도 들어있으면 
				else if( jikup.indexOf(keyword) >= 0) {
					list.add(employee);
				}
				
				//만약 매개변수 keyword 안의 데이터가 birthday 변수 안에 일부라도 들어있으면 
				else if( birthday.indexOf(keyword) >= 0) {
					list.add(employee);
				}
				
				//만약 매개변수 keyword 안의 데이터가 jumiin_num 변수 안에 일부라도 들어있으면 
				else if( jumin_num.indexOf(keyword) >= 0) {
					list.add(employee);
				}
		}	
		// 만약에 검색 결과물이 저장된 ArrayList 객체가 비어있으면(=검색 결과물이 없다면)
		if( list.size() == 0 ) {
			System.out.println("검색 결과물이 없습니다.");
		} 
		// 만약 검색 결과물이 저장된 ArrayList 객체가 비어있지 않으면 (=검색 결과물이 있다면)
		else {
			System.out.println( "===============================================" );
			System.out.println( "번호   이름   직급    생일     주민번호" );
			System.out.println( "===============================================" );
			// empList.size() 는ArrayList 가 갖고 있는 데이터 개수 . 즉 ,  HashMap  객체의 데이터 개수
			for( int i=0 ; i<list.size() ; i++ ){
				HashMap map = (HashMap)list.get(i);

				String emp_no    = (String)map.get("emp_no");
				String emp_name  = (String)map.get("emp_name");
				String jikup     = (String)map.get("jikup");
				String birthday  = (String)map.get("birthday");
				String jumin_num = (String)map.get("jumin_num");
				
				System.out.println( emp_no +"    " +emp_name +"    " +jikup +"    " +birthday +"   " +jumin_num );
			}
			System.out.println( "===============================================" );
		}
		
		
	}
	
	
	public void select_men( ) {
		ArrayList gender = new ArrayList();
	}
	
	public void select_women(  ) {
		
	}
	
	// + 추가 숙제 직원을 한번삭제하는데, 직원번호 중복되지 않게 하려면 어케핧지..ㅋ 내가 그걸 어케알아 .. 아휴 ㅅ비ㅏㄹ...
	
	

	
	
	
	
	//***************************************************************************************************
	// 속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 모든 HashMap 객체 안의 데이터 출력하기
	//***************************************************************************************************
	public void print(  ) {
		print( empList );
	}

	//***************************************************************************************************
	// 매개변수로 들어오는 ArrayList 객체 안의 데이터를 도스창에 출력하기
	//***************************************************************************************************
	public void print( ArrayList<Employee> list ) {
		System.out.println( "===============================================" );
		System.out.println( "번호   이름   직급    생일     주민번호" );
		System.out.println( "===============================================" );
		for( int i=0 ; i<list.size() ; i++ ){
			// ArrayList 객체 안에 i 번째에 저장된  Employee 객체를 꺼내서 변수 employee 에 저장하기
			Employee employee = (Employee)list.get(i);
			// 꺼낸 Employee 객체 안에서 직원번호 데이터를 꺼내서 변수 emp_no 에 저장하기
			int emp_no= employee.getEmp_no( );
			// 꺼낸 Employee 객체 안에서 직원이름을 꺼내서 변수 emp_name 에 저장하기
			String emp_name= employee.getEmp_name();
			// 꺼낸 Employee 객체 안에서 직급를 꺼내서 변수 jikup 에 저장하기
			String jikup= employee.getJikup();
			// 꺼낸 Employee 객체 안에서 생일를 꺼내서 변수 birthday 에 저장하기
			String birthday= employee.getBirthday();
			// 꺼낸 Employee 객체 안에서 주민번호 꺼내서 변수 jumin_num 에 저장하기
			String jumin_num= employee.getJumin_num();
			// 도스창에 꺼낸 문자들을 출력하기
			System.out.println( emp_no +"    " +emp_name +"    " +jikup +"    " +birthday +"   " +jumin_num );
		}
		System.out.println( "===============================================" );
	}

	
	
	
	private int emp_no;
	private String emp_name;
	private String jumin_num;
	private String jikup;
	private String birthday;
	
} // class Oracle 끝



// Oracle 클래스 객체화 하고 메소드를 호출하기 위한 용도의 클래스
public class OracleExe0712 {

	public static void main(String[] args) {
		
		
		// Oracle 클래스를 객체화하고 객체의 메위주를 변수 oracle 에 저장하기
		// 객체의 메위주를 알아야 메소드 또는 속성변수 호출이 가능함.
		Oracle oracle = new Oracle();

		// Oracle 객체의 insert 메소드 호출로 직원정보 저장하기
		oracle.insert("김철수", "001225-4018333", "대리", "2000-12-25");
		//인서트하면 해쉬맵객체로 들어감 해쉬맵객체에서 ArrayList 객체로 들어감
	
		oracle.insert("이영희", "961024-1018333", "과장", "1996-10-24");
		
		
		// Oracle 객체의 delete 메소드 호출로 직원정보 삭제하기
		// 이때 매개변수로 전달되는 데이터가  삭제할 직원번호이다
		oracle.delete( 1 );
		
		
		oracle.insert( "김덕배", "961024-1018123", "사원", "1996-10-24");
		oracle.insert( "저팔순", "001225-4018333", "대리", "2000-12-25");
		oracle.insert( "사오순", "951225-1018311", "과장", "1995-12-20");
		oracle.insert( "선호정", "010324-3024519", "사원", "2001-03-24");
		oracle.insert( "손석구", "830207-1234567", "회장", "1983-02-07");
		oracle.insert( "마동석", "710301-1987654", "회장", "1971-03-01");
		oracle.insert( "손흥민", "921025-1117513", "사원", "1992-10-25");
		oracle.insert( "김이연", "000315-4078990", "대리" , "2001-03-15");
		oracle.insert( "피콜로", "011225-1214634" ,"인턴" , "2001-12-25");
		oracle.insert( "김덕배", "961024-1018123", "사원",  "1996-10-24");
		oracle.insert( "최우식", "900326-1093948", "차장",  "1990-03-26" );

		// Oracle 객체의 update_jikup 메소드 호출로 특정 직원의 직급을 수정하기
//		oracle.update_jikup("2", "부장");
//		oracle.print();
//		
//		oracle.update_name("2", "박진영");
//		oracle.print();
//	
//		oracle.delete("3");
		
		
		// Oracle 객체의 select 메소드 호출로 "대리" 가 들어 있는 직원을 검색해하서 도스창에 출력하기
		oracle.select("대리");
		
		
		// Oracle 객체의 print 메소드 호출로 모든 직원정보 도스창에 출력하기

		oracle.print();

	}

}


------------------------------------
<문1>
private ArrayList<Employee> empList = new ArrayList<Employee>();  
		를
private List<Employee> empList = new ArrayList<Employee>();
		로 수정하면?
<풀> 에러 없음.
왜냐? List는 ArrayList의 조상클래스 or 조상인터페이스 이기 때문. (List는 조상 인터페이스임.)
-> List라는 인터페이스에서 정한 메소드만 호출할 수 있도록 압박을 가한 것임.
-> Xxx|Xxx의조상클래스|Xxx의조상인터페이스명 객참변수 = new Xxx()

------------------------------------

<문2>
private ArrayList<Employee> empList = new ArrayList<Employee>();  
		를
private ArrayList empList = new ArrayList();
		로 하지 않는 이유는?
				
				
<풀>
  * ArrayList<Employee> empList = new ArrayList<Employee>();				
	-> ArrayList 객체를 생성하고 객체의 메위주를 변수 employee 에 저장하기.
	   단, ArrayList 객체에 Employee 객체만 저장하기로 선언함.
	   이렇게 하면 좋은 점 :
		   (1) Employee 객체 외에는 저장이 안 됨.(내가 원하는 객체만 저장)
		   (2) 저장된 Employee 객체를 꺼낼 때 형변환 할 필요가 없음. 
				
  * ArrayList<HashMap<String, String>> empList = new ArrayList<HashMap<String, String>>();				
	-> HashMap 객체의 키값으로 String , 저장객체로 String 을 저장함.			

------------------------------------
				
<문3>jumin_num.indexOf("-2")>=0  가 뭘까?

<풀>
- jumin_num 안에 뭐있니? 주민번호 문자를 관리하는 String 객체의 메위주가 저장됨. 
- indexOf     는   뭐니? String 객체가 소유한 메소드.
- indexOf( 문자열1 ) -> String 객체가 관리하는 문자열 안에 문자열1이 있는 곳의 인덱스 번호를 리턴함. 
				     -> 만약 문자열1 이 없으면 -1을 리턴함. 
				     -> ex) String name = "정발산기슭곰발냄새타령부인사잘해"
				     		int idx = name.indexOf("새타"); -> 8 리턴
				
		
		
		
		
		
		
		
		
				
				
				
