package com.sist.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UnCheckedException => NumberFormatException  /  NullPointerException / IllegalArgumentException
		//                  - 가급적 예외처리(웹/윈도우/모바일)     - 500 오류 코드          - 매개변수값이 다른 경우
		//                      - 서버 데이터 전송 / 수신
		//                      -  모든 데이터가 문자열
		
		String image = null;
		// => IS NOT NULL => sql
		try {
			System.out.println(image.length());
			System.out.println("Image를 브라우저에 출력");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("이미지 없음");
			//e.printStackTrace();
		}
		/*
		 *  String page = request.getParameter("page")
		 *   => ?page=1 => null이면 page=1 디폴트
		 *   if(page == null) {
		 *   	page = "1";
		 *   }
		 */
		System.out.println("aaa");
		System.out.println("aaa");
		System.out.println("aaa");
		FileReader in = null;
		try {
			in = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aaa");
		System.out.println("aaa");
		try {
			in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}

}
