package com.daum.test;

public class Practice {
	
public void method1() {	

	int kor = 70;
	int eng = 20;
	int mat = 70;
	int tot = kor + eng + mat;
	double avg = tot / 3.0;
	
	int cnt = 0;
	
	String result = "합격";

	if(avg >= 60) {cnt++;
		if(kor>=70) {cnt++;}
		if(mat>=70) {cnt++;}
		if(eng>=70) {cnt++;}
	}

	if(cnt >= 3){
		result = "합격";
	} else {
		result = "불합격";
	}
	
	System.out.println(result);
	
}
	
	
	
public void method2() {	
	
	int a3 = 5; // 5를 변수 a3에 저장
	int b3 = 2; // 2를 변수 b3에 저장
	double c3 = a3/(double)b3; // 5/(double)2 -> 5/2.0 -> 5.0/2.0 -> 2.5
	System.out.println("c3 의 값 : " + c3); // 형변환 두 번 발생
	
	
	int stoper = 49;
	int i = 1;
	int j;
	
	for(i = 1; i < 10; i++) {
		for(j = 2; j < 10; j++) {
			System.out.print( j + "X" + i + " = " + j * i + " ");
			if(i * j == stoper) {
				break;
			}
		}	if(i * j == stoper) {
				break;
		}
		System.out.println("");
	}
	
	
}	



























}
	
