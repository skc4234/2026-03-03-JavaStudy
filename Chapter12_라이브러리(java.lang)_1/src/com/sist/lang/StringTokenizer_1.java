package com.sist.lang;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 *   java.util.StringTokenizer
 *   예약일, 예약시간, 파일업로드
 * 
 * 
 */
public class StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] reserve = new int[(int)(Math.random()*10)+6];
		for(int i=0; i<reserve.length; i++) {
			reserve[i] = (int)(Math.random()*31)+1;
			for(int j=0; j<i; j++) {
				if(reserve[i]==reserve[j]) { 
					i--;
					break;
				}
			}
		}
		Arrays.sort(reserve);
		// 데이터베이스에 전송
		// 문자열로
		String s="";
		for(int i : reserve) {
			s+=i+",";
		}
		
		s=s.substring(0, s.lastIndexOf(","));
		System.out.println(s);
		
		System.out.println("예약이 가능한 날");
		StringTokenizer st = new StringTokenizer(s,",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) { // 데이터가 없을때까지
			System.out.println(st.nextToken()); // 실제 데이터 읽기
		}
		
		/*
		 *  --------
		 *  Begin
		 *  --------
		 *  10 st.nextToken()
		 *  --------
		 *  20
		 *  --------
		 *  30
		 *  ---------
		 *  End => false
		 *  --------------------
		 * 
		 * 
		 * 
		 */
		String color = "red|blue|yello";
		st = new StringTokenizer(color, "|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
	}
	

}
