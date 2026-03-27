package com.sist.exception;
/*
 *  IOException => Exception => Throwable
 *   
 */
import java.io.*;
import java.sql.SQLException;
public class 예외처리_2 {
	
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\javadv\\javastudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
			int i=0;
			while((i=in.read())!=-1) {
				//int k=i/0;
				System.out.print((char)i);
			}
		} catch(IOException e) { // (IOException | SQLException e)
			e.printStackTrace(); // 에러 위치 확인
			// e.getMessage()
		}
		
		finally { // 무조건 수행하는 문장이 없으면 생략 가능
			try {
				in.close();
				System.out.println("파일 닫기");
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*
		 *  try-resource : 자동 닫기
		 *  *throws
		 *  throw
		 *  사용자 정의
		 *  -----------------------
		 *  
		 */
	}

}
