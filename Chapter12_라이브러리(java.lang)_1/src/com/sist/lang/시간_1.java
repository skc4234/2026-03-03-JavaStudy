package com.sist.lang;
//import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/*
 *  LocalDateTime
 *   => 날짜와 시간 제어
 *     -LocalDate
 *       => 날짜
 *     -LocalTime
 *       => 시간
 * 
 * 
 */
public class 시간_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 현재 날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		// final 클래스 => 변경불가(오버라이딩 불가)
		//             => Math, String, StringBuffer, System
		System.out.println(now);
		// timezone이 없다
		
		// 2. 특정 날짜와 시간
		LocalDateTime dateTime = LocalDateTime.of(2026, 3,30,14,30,30);
		System.out.println(dateTime);
		
		// 3. 날짜/시간 더하기/빼기
		// 오라클 SYSDATE
		LocalDateTime f = now.plusDays(3).plusHours(3);
		System.out.println(f);
		LocalDateTime p = now.minusMonths(1);
		System.out.println(p);
		
		// 4. 값 추출
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int min = now.getMinute();
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+min);
		
		// 5. 문자열 => 날짜형으로 변환
		// 오라클은 날짜형(Date)으로 저장하기 때문에 변환 필요
		String str="2026-03-31 15:47:50"; // 등록 날짜
		// => 가끔 사용
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// 패턴 MM : 월, mm : 분, HH : 시간(24h), hh : 시간(12h)
		LocalDateTime t = LocalDateTime.parse(str, ff);
		String fff = t .format(ff);
		System.out.println(fff);
		
	}

}
