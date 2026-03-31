package com.sist.lang;
import java.text.*;
import java.util.Date;
/*
 *  - SimpleDateFormat
 *     => 날짜 변환
 *  - DecimalFormat
 *     => 숫자 변환
 *  - MessageFormat
 *     => 문자열 형식 변환
 * =========================
 *   문자   숫자     날짜     변환         기타
 * String  Math  Calendar  Format  switch,if 등 
 * ==============================================> 오라클 함수와 매칭
 * 
 * 
 */
public class 형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. SimpleDateFormat
		// 년도 yyyy/yy, 월 MM/M, 일 dd/d, 시간 hh/HH, 분 mm/m, 초 ss/s
		// 09월이면 8진법으로 오해할 수 있어서 M 사용
		//
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		DecimalFormat df = new DecimalFormat("###,###,###");
		int won = 10000;
		System.out.println(df.format(won));
		
		int no=1;
		String name="홍길동";
		String sex="남자";
		String address="서울";
		String phone="011-2222-1113";
		int age=20;
		String content="홍길동입니다";
		
		// 오라클에 전송
		String sql = "INSERT INTO member VALUES("+no+",'"+name+"','"+sex+"','"+address+"','"
				      +phone+"',"+age+",'"+content+"')";
		System.out.println(sql);
		sql="INSERT INTO member VALUES("+"{0},''{1}'',''{2}'',''{3}'',''{4}'',{5},''{6}'')";
		Object[] obj = {no, name, sex, address, phone, age, content};
		System.out.println(MessageFormat.format(sql, obj));
	}

}
