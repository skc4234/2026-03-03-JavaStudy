package com.sist.lang;
import java.util.*;
/*
 *  - Date
 *     => 현재 본인 운영체제의 날짜와 시간 리턴
 *     => 기능은 없고 리턴만 함
 *     => 가장 많이 사용 : *데이터베이스와 호환
 *     
 *  - Calendar
 *     => 날짜, 시간에 대한 처리 기능
 *     => Date 클래스에 없는 기능 추가
 *     => set()
 *  
 *  - LocalDateTime => LocalDate, LocalTime
 *  
 *  
 *  
 *  - *SimpleDateFormat : 날짜, 시간 출력 형식 변경
 *  - *DecimalFormat : 숫자 관련 출력 형식 변경
 *   => 웹 출력 시 자주 나옴 
 *   
 *  - *MessageFormat : 문자열 출력 형식 변경
 *      => SQL문 만들때 사용           
 *  
 *  String id,name,sex,address,phone;
 *  int age;
 *  SQL: INSERT INTO member VALUES('"+id+"','"+name+"','"+sex+"','"+address+"','"+phone+"',"+age+")
 *       INSERT INTO member VALUES(?,?,?,?,?,?)
 */


public class 날짜_시간_형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(); // 일반 클래스
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance(); // 추상 클래스
		// 일요일부터 1번 시작 => 화요일은 3
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일
		String[] strWeek = {"", "일", "월", "화", "수","목", "금", "토"};
		System.out.println("오늘은 " + strWeek[week] + "요일입니다");
		
		int last = cal.getActualMaximum(Calendar.DATE); // 달의 마지막 날짜
		System.out.println("이번달 마지막 날은 " + last + "일입니다");
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0부터 시작
		int day = cal.get(Calendar.DATE);
		// cal.set(Calendar.MONTH, month-1)
		
		System.out.println("오늘은 " + year + "년 "+ month + "월 "+ day + "일입니다");
	}

}
