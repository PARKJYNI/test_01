// < 조건문 if, switch>
// 아래 클래스의 소속 패키지를 선언. 모든 클래스의 최상단에는 무조건 패키지 선언이 등장.
package com.daum.test;

// Test_03 이라는 클래스 선언. 자바는 class 또는 interface라는 최소 단위 프로그램들로 구성.
// class 이름은 관용적으로 대문자로 시작, 의미있게 주기(가독성)
public class Test_03 {

	// 자바 가상머신(JVM)이 찾아서 호출하는 main메소드 선언. 
	// main메소드에 붙어 있는 public static void의 키워드는 나중에 배울테니 당분간 main메소드 안의 코딩에 집중.
	public static void main(String[] args) {
		
		// int kor = 90, eng = 80, mat = 70; 로 가능.
		int kor = 90;
		int eng = 80;
		int mat = 75;
		
		int tot = kor + eng + mat;
		double avg = tot/3.0;  //double avg = (double)tot/3.0;
		// double avg = tot/3 으로 하지 않도록 주의. 정수/정수 하면 정수가 나오기 때문에 81.6이 81.0으로 나옴.
				
		
		// 학점이 저장되는 변수 hakjum 선언. 값 저장 안 하고 선언만 할 경우, 추후에 변수 사용할 때 에러.
		// char hakjum; 만 할 경우, 변수가 초기화가 안 돼서 모든 if문에 false가 될 수 있기 때문에 추후에 에러가 발생하게 됨.
		// 비효율 적인 code임. 모든 if를 다 거치기 때문.
		char hakjum = 'F';
		
		if(avg>=90 && avg<=100) {
			hakjum = 'A';
		}		
		if(avg>=80 && avg<90) {
			hakjum = 'B';
		}		
		if(avg>=70 && avg<80) {
			hakjum = 'C';
		}		
		if(avg>=60 && avg<70) {
			hakjum = 'D';
		}		
			
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hakjum);
		
		// 만약 avg 변수 안의 데이터가 90이상 100이하 이면, hakjum 변수 안에 문자 A 저장.
		if(avg >= 90 && avg <= 100) {
			hakjum = 'A';
		} 
		// 그렇지 않고 만약(=위 조건식이 false면), avg 변수 안의 데이터가 80이상 90미만이면, hakjum 변수 안에 문자 B 저장.
		else if(avg >= 80) {
			hakjum = 'B';
		} else if(avg >= 70) {
			hakjum = 'C';
		} else if(avg >= 60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
	
		// flag 변수 선언하고 true 저장하기
		boolean flag = true;
		if(100 < avg) {
			System.out.println("경고 : 평균이 100보다 큽니다.");
			flag = false;
		} else if(avg >= 90) {
			hakjum = 'A';
		} else if(avg >= 80) {
			hakjum = 'B';
		} else if(avg >= 70) {
			hakjum = 'C';
		} else if(avg >= 60) {
			hakjum = 'D';
		} else if(avg >= 0) {
				hakjum = 'F';
		} else {
			System.out.println("경고 : 평균이 0보다 작습니다.");
			flag = false;
		} 
		if(flag == true) {
			System.out.println("학점 : " + hakjum);
		}
/*
<문> 평균이 80이상이면 "합격", 80미만이면 "불합격"을 출력하시오.
-----------------------
<풀1>	if(avg >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
-----------------------		
<풀2>	String result = "합격";
		if(avg < 80){
			result = "불합격";
		}
		System.out.println(result);
-----------------------
<풀3> *삼항연산자: 변수 = 조건식?데이터1:데이터2;
		String result = (avg >= 80)?"합격":"불합격";
		System.out.println(result);
*/

/*
<문> 국, 영, 수 각각 40점 이상 + 평균 60 이상만 합격
----------------------------------------------
<풀1> AND 연산자 이용
if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
	result = "합격";
} else {
	result = "불합격";
}
System.out.println(result);

----------------------------------------------
<풀2> OR 연산자 이용
if(avg<60 || kor<40 || eng<40 || mat<40) {
	result = "불합격";
} else {
	result = "합격";
}
System.out.println(result);

----------------------------------------------
<풀3> 반전연산자 이용
if(  !(avg>=60 && kor>=40 && eng>=40 && mat>=40)  ) {
	result = "불합격";
} else {
	result = "합격";
}
System.out.println(result);

----------------------------------------------
<풀4> if ~ else if 문 입력
if(avg<60){
	result = "불합격";
} else if(kor<40) {
	result = "불합격";
} else if(eng<40) {
	result = "불합격";
} else if(mat<40) {
	result = "불합격";
} else {
	result = "합격";
}
System.out.println(result);

----------------------------------------------
<풀5> 다중 if 
result = "불합격";
if(avg>=60){
	if(kor>=40 && eng>=40 && mat>=40){
		result = "합격";
	}
}
System.out.println(result);

----------------------------------------------
<풀6> 다중 if 
result = "불합격";
if(avg>=60){
	if(kor>=40){
		if(eng>=40){
			if(mat>=40){
				result = "합격";
			}
		}
	}
}
System.out.println(result);

----------------------------------------------
<풀7> 삼항연산자(비추)
result = (avg>=60 && kor>=40 && eng>=40 && mat>=40)?"합격":"불합격";
System.out.println(result);

----------------------------------------------
<풀8> 변수 지정1
boolean is_pass = avg>=60 && kor>=40 && eng>=40 && mat>=40;

if(is_pass) {
	result = "불합격";
} else {
	result = "합격";
}
System.out.println(result);

----------------------------------------------
<풀9> 변수 지정2
boolean is_pass1 = avg>=60
boolean is_pass2 = kor>=40 && eng>=40 && mat>=40;

if(is_pass1 && is_pass2) {
	result = "불합격";
} else {
	result = "합격";
}
System.out.println(result);

----------------------------------------------
<풀10> 변수 지정3

int cnt = 0;
if(avg >= 60){cnt++};
if(kor >= 40){cnt++};
if(eng >= 40){cnt++};
if(mat >= 40){cnt++};

if(cnt == 4){
	result = "불합격";
} else {
	result = "합격";

*/
		
		

//<문> 평균 60이상이고, 두 과목이 70이상이 합격.
//----------------------------------------------
//<내 풀이>
if(avg >= 60) {
	if( (kor>=70 && eng>=70) || (mat>=70 && eng>=70) || (kor>=70 && mat>=70)  ) {
		System.out.println("합격");
	} else {
	System.out.println("불합격");
	} 
} else {
	System.out.println("불합격");
}

//----------------------------------------------
//<풀1>
String result = "";
if(  avg>=60 && ( (kor>=70 && eng>=70) || (mat>=70 && eng>=70) || (kor>=70 && mat>=70) )  ) {
	result = "합격";
} else {
	result = "불합격";
}
// 항상 &&가 || 보다 먼저 계산되기 때문에, 70점 이상을 ()로 묶어줘야 함

System.out.println(result);

//----------------------------------------------
//<풀2>
	result = "불합격";
	if(avg >= 60) {
		if( (kor>=70 && eng>=70) || (mat>=70 && eng>=70) || (kor>=70 && mat>=70)  ) {
			result = "합격";
		}
	}

//----------------------------------------------
//<풀2>		
	result = "불합격";
	if(avg >= 60) {
		if(kor>=70 && eng>=70) {
			result = "합격";
		} 
		else if(mat>=70 && eng>=70) {
			result = "합격";
		}
		else if(kor>=70 && mat>=70) {
			result = "합격";
		}	
	}
	System.out.println(result);

//----------------------------------------------
//<내 풀이>	논리연산자 안 쓰고

int cnt = 0;
result = "합격";

if(avg >= 60) {cnt++;
	if(kor>=70) {cnt++;}
	if(mat>=70) {cnt++;}
	if(eng>=70) {cnt++;}
}

if(cnt >= 3){
	result = "합격";
} else {
	result = "불합격";

//----------------------------------------------
//<풀3>	논리연산자 안 쓰고
result = "불합격";
cnt = 0;

if(kor>=70) {cnt++;}
if(mat>=70) {cnt++;}
if(eng>=70) {cnt++;}
if(avg>=60) {
	if(cnt>=2) {
		result = "합격";
	}
}
System.out.println(result);

//----------------------------------------------
//<풀4>	논리연산자 안 쓰고
result = "불합격";
cnt = 0;

if(avg>=60) {cnt = cnt + 2;}
if(kor>=70) {cnt++;}
if(mat>=70) {cnt++;}
if(eng>=70) {cnt++;}

if(cnt>=4) {
		result = "합격";
	}
}
System.out.println(result);


//----------------------------------------------
//<문> switch구문 이용해서 평균 80이상 합격, 80미만 불합격 출력.
//<풀> 
int num = (int)avg/10;
switch(num) {
case 10 :
case 9 : 
case 8 : result = "합격"; break;
case 7 :
case 6 : 
case 5 : 
case 4 : 
case 3 : 
case 2 : 
case 1 :  
case 0 : result = "불합격"; break;

default : result = "평균이 100초과하거나 0 미만입니다."; break; 
}

System.out.println(result);

//----------------------------------------------
//<문> switch구문 이용해서 학점 출력.
//<풀>
// String result = "";
int grade = (int)avg/10;
switch(grade){
case 10 : 
case 9 : result = "A"; break;
case 8 : result = "B"; break;
case 7 : result = "C"; break;
case 6 : result = "D"; break;
case 5 :
case 4 :
case 3 :
case 2 :
case 1 :  result = "F"; break;
default : result = "오류 : 점수가 100을 초과하거나 0미만입니다."; break;
}
















}
}

