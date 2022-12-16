package net.naver.erp;

import java.util.ArrayList;
import java.util.HashMap;

class Employee{
	
	private int emp_no;
	private String emp_name;
	private String jumin_num;
	private String jikup;
	private String birthday;
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getJumin_num() {
		return jumin_num;
	}
	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}
	public String getJikup() {
		return jikup;
	}
	public void setJikup(String jikup) {
		this.jikup = jikup;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
}

class Oracle {
	// ----------------------------------
	//속성변수 선언
	// ----------------------------------
	// ArrayList 클래스를 객체화 했을 때 메위주가 empList에 들어가!
	// ArrayList 형 변수 empList 선언하고 ArrayList 객체 생성하고 메위주 저장하기
	//-------------------------------------------------------
	// <1>ArrayList 객체의 메위주가 저장될 변수 empList 선언하기
	// <2> 수입한 클래스중에 ArrayList() 이런 생성자 클래스 찾아서
	//		메모리 공간에 올려 객체화하기.
	// <3> 메모리 공간에 올려 객체의 생성자 ArrayList() 호출하기.
	// <4> 객체의 메위 주 리턴하기
	// <5> 객체의 메위주를 변수 empList 에 저장하기

	private ArrayList empList = new ArrayList();
	
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
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 HashMap 객체를 저장하는 메소드 선언.
	//HashMap 객체 안에 들어갈 문자를 받아들이기!
	public void insert(String emp_name, String jumin_num, String jikup, String birthday) {
		// 변수 map 을 선언하고, HashMap 객체 생성하여 메위주 얻어 객체참조변수 map에 저장하기.
		HashMap map = new HashMap();
		
				/* ------------------------------------------------------
				 public class Sample {
    				public static void main(String[] args) {
        				HashMap<String, String> map = new HashMap<>();
        				map.put("people", "사람");
        				map.put("baseball", "야구");
    				}
				}
				인터넷보면 전부 HashMap<key, value> map = new HashMap<>(); 와 비슷한 식 넣는데, < > 는 가 제네릭스 인가?
				------------------------------------------------------
				 */
		
		// 매개변수로 들어온 문자 데이터에 키값 문자를 붙여 HashMap 객체에 저장하기.
		// map.put("emp_no", ArrayList 객체 안에 저장된 HashMap 객체 개수 + 1);
		// 회사에 입사할 때 기존에 있는 직원의 명수(개수)에 +1을 해줘야 신입의 번호가 부여 됨.
		// ""+ 길이가 없는 문자데이터를 더해줘! 정수이기 때문에 정수문자로 바꿔주는 거임. size메소드의 리턴형이 int니까 정수 들어가잖아!! 해쉬맵 객체엔 기본형 저장 못하니까 앞에 ""+ 붙여서 형변환 시켜주는 거임

		
		map.put("emp_no"   , ""+ (no++));   // ++no 이면 no값을 0으로 줘야겠지?
	//	map.put("emp_no"   , ""+ (empList.size()+1) );
		map.put("emp_name"   , emp_name);
		map.put("jumin_num"  , jumin_num);
		map.put("jikup"      , jikup);
		map.put("birthday"   , birthday);
		
		// HashMap 객체를 ArrayList 객체에 저장하기.
		empList.add(map);
		
		//print();
		
		//++++++++++++++++++++++++++++++++++++++++++
		Employee emp_arr = new Employee();
		empList.add(emp_arr);
		//++++++++++++++++++++++++++++++++++++++++++
	}
	
	//empList라는 속성변수. arrayList의 객체가 저기에 들어가있었음. 해쉬맵객체안에 emp_no-1 과 쟤네를 맞물려서 

	// ----------------------------------
	// 메소드 선언 2. update_jikup
	// ----------------------------------
	//속성변수 empList 에 저장된 ArrayList 객체의 안에 저장된 HashMap 객체를 [수정]하는 메소드 선언.
	//직원번호에 해당하는 행을 찾아 직급을 변경
	// ( 직원번호로 찾아 수정 vs 주민번호로 찾아 수정 ) --> 주민번호는 나라에서 부여, 직원번호는 데이터베이스에서 준 거.
	public void update_jikup(String emp_no, String jikup) {
		
		int cnt = 0;
		//반복문 돌리는 이유는 ArrayList객체 안에서 HashMap 객체의 데이터 하나씩 꺼내기 위해서.
		// ArrayList 객체 안에 저장된 HashMap 객체를 1개씩 꺼내서 
		//    매개변수로 들어온 직원번호와 일치한 HashMap 객체 안에 
		//    직급을 매개변수로 들어온 직급으로 수정하기.
		// empList.size() 지금 여기엔 2(철수, 영희만 있었을 때..) 가 들어있는 거랑 동일! 개수를 리턴하니까!
		for( int i = 0 ; i < empList.size() ; i++ ){
		
			// ArrayList 객체 안에 i 번째에 저장된 HashMap 객체를 꺼내서 변수 map에 저장 
			// 여기서 [get] 은 ArrayList 객체의 메소드
			// (참고) ArrayList empList = new ArrayList();
			HashMap map = (HashMap)empList.get(i);
			
			//꺼낸 HashMap 객체 안에서 키값 emp_no에 대응하는 데이터를 꺼내서 emp_no2에 저장하기.
			// 여기서 [get]은 HashMap 객체의 메소드
			String emp_no2 = (String)map.get("emp_no");
		
			//매개변수로 들어온 직원번호와 (지금꺼낸 직원번호랑) 일치하면 직급을 수정하기
			// 이퀄즈는 스트링객체의 메소드 
			// 변수 emp_no2 의 데이터와 매개변수로 들어온 직원번호와 일치하면 HashMap 객체안의 직급을 수정하기.
			if( emp_no.equals(emp_no2 )) {
				//매개변수로 들어온 직급 덮어씌우면 됨
				map.put("jikup", jikup);
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
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 HashMap 객체를 [수정]하는 메소드 선언.
	public void update_name(String emp_no, String emp_name) {
		int cnt = 0;
		for( int i=0 ; i<empList.size() ; i++ ){
			HashMap map = (HashMap)empList.get(i);
			
			String emp_no2= (String)map.get("emp_no");
		
			if( emp_no.equals(emp_no2 )) {
				map.put("emp_name", emp_name);
				cnt++;
				break;
			}
		}
		if( cnt == 0) {
			System.out.println("직원번호" + emp_no + "는 없는 번호입니다.");
		}
	}
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 HashMap 객체를 [삭제]하는 메소드 선언.
	public void delete(String emp_no) {
		
		int cnt = 0;
		for( int i=0 ; i<empList.size() ; i++ ){
				HashMap map = (HashMap)empList.get(i);
				String emp_no2= (String)map.get("emp_no");
			
				if( emp_no.equals(emp_no2 )) {
					empList.remove(i);
					cnt++;
					break;
				}
			}
			if( cnt == 0) {
				System.out.println("직원번호" + emp_no + "는 없는 번호입니다.");
			}	
	}
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 HashMap 객체를 [검색]하는 메소드 선언.
	public void select(String keyword) {
		
		//검색 결과물에 맞는 결과들 저장
		//검색 결과물이 저장되는 Array 객체 생성하고 메위주를 변수 list에 저장하기.
		ArrayList list = new ArrayList();
		
		//ArrayList 객체에 저장된 HashMap 객체를 자례대로 꺼내서 매개변수로 들어온 문자가 
		//일부라도 들어있으면 새롭게 생성한 ArrayList 객체에 저장하기.
		for( int i=0 ; i<empList.size() ; i++ ){
				HashMap map = (HashMap)empList.get(i);
				String emp_no     = (String)map.get("emp_no");
				String emp_name   = (String)map.get("emp_name");
				String jikup      = (String)map.get("jikup");
				String birthday   = (String)map.get("birthday");
				String jumin_num  = (String)map.get("jumin_num");
				
				//만약 매개변수 keyword 안의 데이터가 emp_name 변수 안에 일부라도 들어있으면
				if( emp_name.indexOf(keyword) >= 0) {
					list.add(map);
				}
				//만약 매개변수 keyword 안의 데이터가 jikup 변수 안에 일부라도 들어있으면 
				else if( jikup.indexOf(keyword) >= 0) {
					list.add(map);
				}
				
				//만약 매개변수 keyword 안의 데이터가 birthday 변수 안에 일부라도 들어있으면 
				else if( birthday.indexOf(keyword) >= 0) {
					list.add(map);
				}
				//만약 매개변수 keyword 안의 데이터가 jumiin_num 변수 안에 일부라도 들어있으면 
				else if( jumin_num.indexOf(keyword) >= 0) {
					list.add(map);
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
	
	
	/*

	//남성 직원만 검색해서 출력하는 메소드
	public void select_men( ) {
		ArrayList sex = new ArrayList();
		
		for( int i=0 ; i<empList.size() ; i++ ){
			HashMap map = (HashMap)empList.get(i);
			String gender  = (String)map.get("gender");
		
			if( gender.indexOf("남") >= 0) {
				sex.add(map);
			}
		}	
		
		System.out.println( "===============================================" );
		System.out.println( "번호   이름   직급    생일     주민번호     성별" );
		System.out.println( "===============================================" );
		for( int i=0 ; i<sex.size() ; i++ ){
			HashMap map = (HashMap)sex.get(i);

			String emp_no    = (String)map.get("emp_no");
			String emp_name  = (String)map.get("emp_name");
			String jikup     = (String)map.get("jikup");
			String birthday  = (String)map.get("birthday");
			String jumin_num = (String)map.get("jumin_num");
			String gender    = (String)map.get("gender");
			
			System.out.println( emp_no +"    " +emp_name +"    " +jikup +"    " +birthday +"   " +jumin_num  +"   " +gender);
		}
		System.out.println( "===============================================" );
	}
		
	
	
	//여성 직원만 검색해서 출력하는 메소드
	public void select_women(  ) {
	ArrayList sex = new ArrayList();
		
		for( int i=0 ; i<empList.size() ; i++ ){
			HashMap map = (HashMap)empList.get(i);
			String gender  = (String)map.get("gender");
		
			if( gender.indexOf("여") >= 0) {
				sex.add(map);
			}
		}	
		
		System.out.println( "===============================================" );
		System.out.println( "번호   이름   직급    생일     주민번호     성별" );
		System.out.println( "===============================================" );
		for( int i=0 ; i<sex.size() ; i++ ){
			HashMap map = (HashMap)sex.get(i);

			String emp_no    = (String)map.get("emp_no");
			String emp_name  = (String)map.get("emp_name");
			String jikup     = (String)map.get("jikup");
			String birthday  = (String)map.get("birthday");
			String jumin_num = (String)map.get("jumin_num");
			String gender    = (String)map.get("gender");
			
			System.out.println( emp_no +"    " +emp_name +"    " +jikup +"    " +birthday +"   " +jumin_num  +"   " +gender);
		}
		System.out.println( "===============================================" );
	}
	
	*/
	
	
	
	
	//속성변수 empList 에 저장된 ArrayList 객체 안에 저장된 모든 HashMap 객체 안의 데이터 [출력]하는 메소드 선언.
	public void print(  ) {
		System.out.println( "===============================================" );
		System.out.println( "번호   이름   직급    생일     주민번호" );
		System.out.println( "===============================================" );
		// empList.size() 는ArrayList 가 갖고 있는 데이터 개수 . 즉 ,  HashMap  객체의 데이터 개수
		for( int i=0 ; i<empList.size() ; i++ ){
			// ArrayList 객체 안에 i 번째에 저장된 HashMap 객체를 꺼내서 변수 map에 저장 
			// get 은 ArrayList 객체의 메소드
			HashMap map = (HashMap)empList.get(i);
			
			//꺼낸 HashMap 객체 안에서 키값 emp_no에 대응하는 데이터를 꺼내서 emp_no에 저장하기.
			// 여기서 get은 HashMap 객체의 메소드
			String emp_no= (String)map.get("emp_no");
			
			//꺼낸 HashMap 객체 안에서 키값 emp_no에 대응하는 데이터를 꺼내서 emp_name에 저장하기.
			String emp_name= (String)map.get("emp_name");
			
			//꺼낸 HashMap 객체 안에서 키값 emp_no에 대응하는 데이터를 꺼내서 jikup에 저장하기.
			String jikup= (String)map.get("jikup");
			
			//꺼낸 HashMap 객체 안에서 키값 emp_no에 대응하는 데이터를 꺼내서 birthday에 저장하기.
			String birthday= (String)map.get("birthday");
			
			//꺼낸 HashMap 객체 안에서 키값 emp_no에 대응하는 데이터를 꺼내서 jumin_num에 저장하기.
			String jumin_num= (String)map.get("jumin_num");
			
			//도스창에 꺼낸 문자들을 출력하기.
			System.out.println( emp_no +"    " +emp_name +"    " +jikup +"    " +birthday +"   " +jumin_num );
		}
		System.out.println( "===============================================" );
	}


	
	// public void print()
	
	// 매개변수로 들어오는 ArrayList 객체 안의 데이터를 도스창에 출력하기
	// ArrayList list 호출하면서 매개변수에 뭐들어올지 몰라 그래서 ArrayList 안에 있는 데이터만 골라 찍겠다는 의미 
	public void print( ArrayList list ) {
		System.out.println( "===============================================" );
		System.out.println( "번호   이름   직급    생일     주민번호" );
		System.out.println( "===============================================" );
		for( int i=0 ; i<list.size() ; i++ ){
			// ArrayList 객체 안에 i 번째에 저장된  HashMap 객체를 꺼내서 변수 map 에 저장하기
			HashMap map = (HashMap)list.get(i);
			// 꺼낸 HashMap 객체 안에서 키값 emp_no 에 대응하는 데이터를 꺼내서 변수 emp_no 에 저장하기
			String emp_no= (String)map.get("emp_no");
			// 꺼낸 HashMap 객체 안에서 키값 emp_name 에 대응하는 데이터를 꺼내서 변수 emp_name 에 저장하기
			String emp_name= (String)map.get("emp_name");
			// 꺼낸 HashMap 객체 안에서 키값 jikup 에 대응하는 데이터를 꺼내서 변수 jikup 에 저장하기
			String jikup= (String)map.get("jikup");
			// 꺼낸 HashMap 객체 안에서 키값 birthday 에 대응하는 데이터를 꺼내서 변수 birthday 에 저장하기
			String birthday= (String)map.get("birthday");
			// 꺼낸 HashMap 객체 안에서 키값 jumin_num 에 대응하는 데이터를 꺼내서 변수 jumin_num 에 저장하기
			String jumin_num= (String)map.get("jumin_num");
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

public class OracleExe {

	public static void main(String[] args) {
		Oracle oracle = new Oracle();

		
		oracle.insert("김철수", "001225-4018333", "대리", "2000-12-25");
		//인서트하면 해쉬맵객체로 들어감 해쉬맵객체에서 ArrayList 객체로 들어감
	
		oracle.insert("이영희", "961024-1018333", "과장", "1996-10-24");

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

		
//		oracle.update_jikup("2", "부장");
//		oracle.print();
//		
//		oracle.update_name("2", "박진영");
//		oracle.print();
//		
//		oracle.delete("3");
		oracle.print();

	}

}



//해쉬맵객체 메위주가 저렇게 들어있음