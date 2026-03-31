package com.sist.lang;

import java.util.StringTokenizer;

/*
 *  문자열 클래스
 *  - String
 *  
 *  - StringBuffer  ==> 문자를 모아서 관리(비동기) => 속도
 *  - StringBuilder ==> 동기화                 => 안정성
 *  
 *  
 *  - StringTokenizer / *split
 *   ================   ======> 데이터가 많거나 복잡한 문자가 있는 경우
 *   간단한 문자 분리           => String[]
 *   리턴형 : String
 *   네트워크 / 크롤링
 * 
 * 
 */
public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "28,000원 | 2026년 2월 26일 발행 | 396쪽";
		long start = System.currentTimeMillis();
		String[] data = info.split("\\|");
		for(String s : data) {
			System.out.println(s);
		}
		long end = System.currentTimeMillis();
		System.out.println("데이터 개수 : " + data.length);
		System.out.println("걸린 시간 : " + (end-start));
		System.out.println("==== StringTokenizer ====");
		StringTokenizer st = new StringTokenizer(info, "|");

		System.out.println("데이터 개수 : " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("걸린 시간 : " + (end-start));
	}

}
