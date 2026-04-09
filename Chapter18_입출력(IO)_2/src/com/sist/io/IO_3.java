package com.sist.io;
/*
 *  파일 생성 / 폴더 생성 / 삭제
 *  파일 제어 : 입출력
 *   - FileInputStream
 *   - FileOutputStream
 *   - BufferedInputStream
 *   - BufferedOutputStream
 *   - FileReader / FileWriter
 *   - BufferedReader / BufferedWriter
 *   - ObjectInputStream / ObjectOutputStream
 *   - PrintWriter : 자바에서 브라우저로 전송 : Servlet(순수 자바 => 볼수 없음)
 *      => JspWriter : JSP에서 처리(HTML과 합쳐진 코드 => 볼수 있음, Front, 속도 느림)
 *   
 *   
 *   
 */
import java.io.*;

public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir = new File("c:\\upload");
//			if(!dir.exists()) {
//				dir.mkdir();
//				System.out.println("폴더 생성");
//			}
//			else {
//				System.out.println("이미 존재하는 폴더입니다.");
//			}
//			if(!dir.exists()) {
//				dir.createNewFile();
//				System.out.println("파일 생성");
//			}
//			else {
//				System.out.println("이미 존재하는 파일입니다.");
//			}
			if(dir.exists()) {
				dir.delete();
				System.out.println("파일 삭제");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
