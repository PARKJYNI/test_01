// < 반복문 for문, while문 >
// 아래 클래스의 소속 패키지를 선언. 모든 클래스의 최상단에는 무조건 패키지 선언이 등장.
package com.daum.test;

// Test_04 이라는 클래스 선언. 자바는 class 또는 interface라는 최소 단위 프로그램들로 구성.
// class 이름은 관용적으로 대문자로 시작, 의미있게 주기(가독성)
public class Test_04 {

	// 자바 가상머신(JVM)이 찾아서 호출하는 main메소드 선언. 
	// main메소드에 붙어 있는 public static void의 키워드는 나중에 배울테니 당분간 main메소드 안의 코딩에 집중.
	public static void main(String[] args) {
	
/*
		
		
	//<문><입>
	
	//<문1>
	int a = 10;
	int c = 0;
	long b = 30;
//	c = a + b; //int에 long 못집어 넣음.
	System.out.println(c);

	//<문2>
	int a2 = 1;
	int b2 = 5;
	int c2 = 3;
	c = ++a2 + b2++;  // 2 + 5 = 7
	//c += b; <- 주석 실행X
	System.out.println(c);
	
	//<문3>
	int a3 = 3;
	if(a3-- > 4) {   // false
		a3++;
	}
	if(++a3 > 7) {   // false
		++a3;
	} else {
		a3 = ++a3 + a3++;  // 4 + 4
	}
	System.out.println(a3);  // 8 
	
	//<문4>
	int a4 = 2;
	switch( a4 ) {
	case 1 : a4++;
	case 2 : a4++; break;
	case 3 : a4++;
	}
	System.out.println(a4);
	
	//<문5>
	int b5 = 1, c5 = 0;
	for(int a5 = 2; a5 < 5; a5++) {
		if(c5++ > b5) {b5 = a5 + c5;}
	}
//	System.out.println(a5 + b5 + c5);
	
	//<문6>
	int a6 = 0, b6 = 5;
	jump : for( ; ; a6++) {
			for( ; ;--b6) {
				if(a6 > b6) {
					break jump;
				}
			}
	}
	System.out.println(a6+ b6);
	
	//<문7>
	int a7 = 1, b7 = 5;
	jump : for( ; ; ) {
		a7++;
		for( ; ; ) {
			if(a7 > --b7) break jump;
		}
	}
	System.out.println(a7+b7);
	
	//<문8>
	int a8 = 0, b8 = 5;
	outer : for(a8 = 0; a8 < 5; a++) {
		inner : for(b8 = 0; b8 < 5; b8++) {
			if(a8 == 1 && b8 == 0) { break outer; }
			if(a8 == 2 && b8 == 1) { continue inner;}
		}
	}
	System.out.println(a+b);
	
	*/
	
	
	// <while>
	
	// while 문을 사용하여 1 ~ 5까지 더한 결과 출력
	int tot = 0;
	int i = 1;
	
	while(i < 6) {
		tot = tot + i++;
		
		// tot = tot + i;
		// i++;
	}
	System.out.println("----");
	System.out.println(tot);
	
	// do-while 문을 사용하여 1 ~ 5까지 더한 결과 출력
	tot = 0;
	i = 1;
	
	do {
		tot = tot + i;
		i++;
	}
	while(i < 6);
	
	System.out.println(tot);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
