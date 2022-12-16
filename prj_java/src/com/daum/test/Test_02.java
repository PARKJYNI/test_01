// < 증감연산자 + case 연산자>
// 아래 클래스의 소속 패키지를 선언. 모든 클래스의 최상단에는 무조건 패키지 선언이 등장.
package com.daum.test;

// Test_02 이라는 클래스 선언. 자바는 class 또는 interface라는 최소 단위 프로그램들로 구성.
// class 이름은 관용적으로 대문자로 시작, 의미있게 주기(가독성)
public class Test_02 {

	// 자바 가상머신(JVM)이 찾아서 호출하는 main메소드 선언. 
	// main메소드에 붙어 있는 public static void의 키워드는 나중에 배울테니 당분간 main메소드 안의 코딩에 집중.
	public static void main(String[] args) {
		
		int num1 = 3;
		
		//num2 변수 선언하고, num1 변수 안의 데이터 1 증가하고 num2에 저장하기.
		int num2 = ++num1;
			// ++num1; int num2 = num1;
			// num1++; int num2 = num1;
			// 출력
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// num3 변수 선언하고, num1 변수 안의 데이터를 num2 변수 안에 저장. num1 변수안의 데이터 1 증가하기.
		int num3 = num1++;  
			// int num3 = num1; ++num1;
			// int num3 = num1; num1++;
			// 출력
		System.out.println("num1 : " + num1);
		System.out.println("num3 : " + num3);

		int num4 = 5;
		int num5 = ++num4 + num4; // 6 + 6 = 12
		System.out.println("num4 : " + num4); // 6
		System.out.println("num5 : " + num5); // 12
		
		
		int num6 = 2;
		int num7 = num6++ + num6; // 2 + 3 = 5
		System.out.println("num6 : " + num6); // 3
		System.out.println("num7 : " + num7); // 5

		int num8 = 4;
		int num9 = num8++ + ++num8;
		
		int num10 = -2;
		int num11 = num10 + --num10 - num10++ - --num10;
		//           -2   +    -3   -   -3    -    -3
		System.out.println("num10 : " + num10); // -3
		System.out.println("num11 : " + num11); // 1
		
		int num20 = 0;
		int num21 = -3;
		int num22 = num20*2 - --num21 + num21++ - ++num20*3;
		//            -2    -   -3    +  -3     -    -1 * 3
		System.out.println("num20 : " + num20); // 0
		System.out.println("num21 : " + num21); // -3 
		System.out.println("num22 : " + num22); // -3
		
		// 정수형 데이터가 저장되는 변수 n, m 을 선언, 정수값 저장하기.
		// 정수형 데이터가 저장되는 변수 p 를 선언, n변수값/m변수값의 연산 결과 저장하기.
		int n = 5;
		int m = 2;
		int p = n / m;
		System.out.println("p 의 값 : " + p); // 2 (소수점 짤림)
		// 정수/정수 = 정수.
		// <참고> JavaScript는 2.5가 나옴.
		
		
		// 실수형 데이터가 저장되는 변수 q 선언, n/m 의 연산 결과 저장하기.
		double q = n / m;
		System.out.println("q 의 값 : " + q); // 2 -> 2.0
		// 정수/정수 = 정수.
		// 암시적 형변환 (연산할 땐 형변환X -> 연산 결과를 q 에 저장할 때 형변환)
		// 변수의 자료형과 저장되는 자료형이 다르기 때문에 형변환이 발생

		
		// 실수형 데이터가 저장되는 변수 a, b, c 선언, 5, 2, a/b 연산 결과 저장하기.
		double a = 5; // 5 -> 5.0 형변환 되어 변수 a에 저장
		double b = 2; // 2 -> 2.0 형변환 되어 변수 b에 저장
		double c = a/b; // 5.0/2.0 의 결과 2.5가 변수 c 에 저장
		System.out.println("c 의 값 : " + c);
		
		
		int a2 = 5; // 5를 변수 a에 저장
		double b2 = 2; // 2 -> 2.0 형변환 되어 변수 b에 저장
		double c2 = a2/b2; // 5/2.0 -> 5.0/2.0 으로 자료형변환
		System.out.println("c2 의 값 : " + c2);
		
		
		int a3 = 5; // 5를 변수 a3에 저장
		int b3 = 2; // 2를 변수 b3에 저장
		double c3 = (double)a3/b3; // (double)5/2 -> 5.0/2 -> 5.0/2.0 -> 2.5
		System.out.println("c3 의 값 : " + c3); // 형변환 두 번 발생

		// <입>
		int a4 = 5; // 5를 변수 a3에 저장
		int b4 = 2; // 2를 변수 b3에 저장
		double c4 = (double)(a4/b4); // (double)(5/2) -> (double)(2) -> 2.0
		System.out.println("c4 의 값 : " + c4); // 형변환 두 번 발생

		
		
		
	}
}