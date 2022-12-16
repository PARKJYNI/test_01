package net.naver.erp2;

import java.util.ArrayList;
import java.util.HashMap;

class Oracle_P{
	
	// ArrayList 클래스를 객체화 했을 때의 메위주가 empList에 들어가!
	// ArrayList 형 변수 empList 선언, ArrayList 객체 생성하고 메위주 저장하기.
	ArrayList empList = new ArrayList();
	
	// 생성자 선언
	public Oracle_P(){
		
	}
	
	// ----------------------------------
	// 메소드 선언 1. insert
	// ----------------------------------
	public void insert(String emp_name, String jumin_num, String jikup, String birthday) {
		// 변수 map을 선언하고, HashMap 객체 생성하여 메위주 얻어 객참변수 map 에 저장.
		HashMap map = new HashMap();
		map.put("emp_no", ""+ (empList.size()+1));
		map.put("emp_name", emp_name);
		map.put("jumin_num", jumin_num);
		map.put("jikup", jikup);
		map.put("birthday", birthday);
		
		// HashMap 객체를 ArrayList 객체에 저장하기.
		empList.add(map);
	
		//print();
	}
	
	
	// ----------------------------------
	// 메소드 선언 2. update_jikup
	// - 속성변수 empList에 저장된 ArrayList 객체의 안에 저장된 HashMap 객체를 수정하는 메소드 선언
	// - 직원번호(emp_no)에 해당하는 행을 찾아 직급(jikup) 변경!
	// ----------------------------------
	public void update_jikup(String emp_no, String jikup) {
		
		int cnt = 0;
		for( int i = 0 ; i < empList.size() ; i++ ) {
			
			//ArrayList 객체 안에 i 번째에 저장된 HashMap 객체를 꺼내서 변수 map 에 저장.
			HashMap map = (HashMap)empList.get(i);
			
			//꺼낸 HashMap 객체 안에서 키값 "emp_no" 에 대응하는 데이터를 꺼내, 새로운 emp_no2에 저장.
			String emp_no2 = (String)map.get("emp_no");
			
			//매개변수로 들어온 직원번호(emp_no)와 지금꺼낸 직원번호(map.get("emp_no"))가 일치하면 직급 수정.
			if( emp_no.equals(emp_no2) ) {
				map.put("jikup", jikup);
				cnt++;
				break;
			}		
		}
		if( cnt == 0 ) {
			System.out.println("직원번호" + emp_no + "는 없는 번호입니다.");
		}
		
	}
	
	
	//메소드 선언 3. update_name
	public void update_name(String emp_no, String emp_name) {
		
		for(int i = 0; i < empList.size(); i++) {
			HashMap map = (HashMap)empList.get(i);
			String emp_no2 = (String)map.get("emp_no");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


public class OracleExe_P {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
