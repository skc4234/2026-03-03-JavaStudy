package com.sist.exception;
/*
 *  예외 처리
 *   => 프로그램 실행중에 발생하는 오류(예외)를 처리
 *   	 1) 회피
 *   		 throws => 간접처리
 *   	 2) 복구
 *   		 try-catch => 직접처리
 *    -----------------------------> 예외 처리가 안된 상태 : 에러 위치에서 종료
 *   => 강제 종료 방지 => 정상 수행 유지
 *   1. try {
 *   		정상 수행문장 => 예측
 *   
 *   	}
 *   	catch(Exception e) {
 *   		예측된 에러 처리 => 확인 및 복구
 *   		웹에서 전송 => 팝업창 등으로 알려준다
 *   	}
 *   => 웹은 무조건 데이터 전송
 * 
 *   => 0으로 나누는 경우 / 배열 범위 초과 / 정수 변환 / 파일 찾기 실패 / IP주소 / URL
 * 	 기타
 *   finally : 서버, 파일 => 닫기 => 생략이 가능
 *    => try-catch 상관없이 무조건 수행
 *   
 *   
 *   2. throws
 *       - 위치 : 메소드 뒤에
 *       ex) 
 *     		 void display() throws Exception {
 *     		 	
 *     		 }
 *     		 
 *           display() 호출 시에 에러 예측 => 반드시 예외처리해서 사용
 *           - try-catch / throws
 *           => 보통 라이브러리
 *   
 *   ==> try : 자동으로 닫기 / 멀티 catch
 */
import java.io.*;

public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader in = null;
//		try {
//			in = new FileReader("C:\\Users\\sist-2\\git\\java-study\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
//			int i = 0; // 문자 하나씩 읽기 => 정수로 읽어오기 때문
//			while((i=in.read())!=-1) { // -1은 EOF
//				System.out.print((char)i);
//				
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
		
		// close 안써도 자동으로 파일 닫힘 => try-with-resource => Auto-closed => jdk 1.7부터
		// 파일 입출력에서 주로 사용
		
		try (FileReader in = new FileReader("C:\\Users\\sist-2\\git\\java-study\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java")) {
			int i=0;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
