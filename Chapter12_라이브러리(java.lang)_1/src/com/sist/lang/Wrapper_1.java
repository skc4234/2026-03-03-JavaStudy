package com.sist.lang;
/*
 *  포장 클래스 => 데이터형을 쉽게 다루기 위한 클래스
 *            => 제네릭에서 사용 가능
 *               <> : 데이터형을 통일  <Integer> <String>
 *  기본형 - int, double, long, char, boolean
 *  => 클래스화
 *      byte => Byte
 *      short => Short
 *      *int => Integer
 *      *long => Long
 *    -----------------
 *      char => Character
 *      float => Float
 *      *double => Double
 *      *boolean => Boolean
 *      *char[] => String
 *    --------------------
 *    
 *  - AutoBoxing
 *     Integer i = new Integer(10)
 *     => Integer i = 10;
 *     => 클래스에 실제 값 주입
 *  - UnBoxing
 * 	   int ii = i;
 *     => 기본형에 클래스 객체 주입
 * 
 */
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer i=10; // 오토박싱
//		Integer j=20;
//		System.out.println(i+j);
//		
//		int k=j;
//		int m=20;
//		System.out.println(k+m);
		
		// 주요 메소드
		// 웹/윈도우에서 넘어오는 모든 값은 String
		// => 정수형으로 변경
		// 네트워크는 정수(x), 문자열 전송
		
		/*
		 * - 값을 받았을때
		 *  parseXxx() : 정수형을 데이터형으로 변환
		 *  정수형변환 : Integer.parseInt("10");
		 *  실수형 변환 : Double.parseDouble("10.4");
		 *  논리형 변환 : Boolean.parseBoolean("true");
		 *  
		 *  - 값을 전송할때
		 *  String.valueOf() : 데이터형을 정수형으로 변환
		 *  
		 *  
		 */
		
		int a=10;
		System.out.println(Integer.toBinaryString(a)); // *2진법  0b
		System.out.println(0b1010);
		/*
		 *  우분투
		 *  
		 *  0   0   0
		 * r-- w-- x--  chmod 755
		 *  4   4   4
		 * 
		 */
		
		
		System.out.println(Integer.toHexString(a)); // 16진법  0x
		System.out.println(Integer.toOctalString(a)); // 8진법  0
	}

}
