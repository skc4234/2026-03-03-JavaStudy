package com.sist.lang;
import java.text.SimpleDateFormat;
/*
 *  현재 날짜를 읽오온다 => 제어 (Calendar)
 *  
 */
import java.util.*;
public class Date_Time_SimpleDataFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		// 오라클 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		// 년도 yy / yyyy
		// 월  MM / M
		// 일 dd / d
		
		// 시간 => hh / h
		// 분  mm / m
	}

}
