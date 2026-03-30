package com.sist.lang;
/*
 *  수학 연산 관련 클래스
 *  1) ceil() : 올림함수
 *      => 총 페이지 수
 *  2) random()
 *      => double형 리턴, 0.0~0.99 사이의 난수 
 *  
 *  3) round()
 *      => 반올림 함수
 *      
 *  => 오라클에도 있음 => SELECT CEIL(COUNT(*)/10) FROM emp;
 * 
 *  Math => only static
 *  라이브러리 => 메소드
 *   => 원형 / 예외처리
 *   => 리턴형 메소드명(매개변수) => 예외처리 여부
 *   double random()  ====>  (int)Math.random()
 */

public class Math_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {
			"홍길동","심청이","ㅇㅇㅇ","aaa","bbb","ccc","ddd","eee","fff",
			"ggg","hhh","zzz","yyy","xxx","www","vvv","uuu"
		};
		System.out.println((int)Math.ceil(names.length/5.0));
		// 원형 : double ceil(double a)
		
		int rand = (int)(Math.random()*100+1); // 0~99
		
		System.out.println(rand);
		
		double d = Math.round(10.78);
		System.out.println((int)d);
	}

}
