/*
 * 목표
 * 1. 메소드 이해
 * 2. String 클래스 이해
 * 3. 객체지향 개념 이해
 * -----------------
 * 4. 상속 / 포함
 * 5. 다형성
 * 6. 클래스 설계
 * 7. 인터페이스
 * ----------------
 * 8. 예외 처리
 * 9. java.util / java.lang -> String, Math
 * 10. java.io / java.net
 * 11. java.sql
 * ------------------
 * import java.lang.*은 자주 사용해서 생략가능
 * 
 * 
 * String 클래스 -  원하는 위치 찾기(인덱스 번호)
 * indexOf     /  lastIndexOf
 * 앞에서부터 찾음    뒤에서부터 찾음
 * ㄴ문자찾는 경우    ㄴ경로 찾기, 파일 관련
 * int indexOf(char c) / int indexOf(String s) => -1 리턴시 해당 문자가 없음
 * int lastIndexOf(char c) / (String s)
 * 
 * 
 */
import java.io.*;
public class String_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		File dir = new File("c:\\javadv");
//		File[] files = dir.listFiles();
//		for(File f : files) {
//			if(f.isFile()) {
//
//				String name = f.getName();
//				String ext = name.substring(name.lastIndexOf(".")+1);
//				System.out.println(ext);
//			}
//		}
		String msg = "Hello Java!!";
		//            01234567891011
		System.out.print("a의 위치 : " + msg.indexOf("a"));
		System.out.print("\na의 위치 : " + msg.lastIndexOf("a"));
		System.out.print("\na의 위치 : " + msg.indexOf("b"));
		String ext = msg.substring(msg.indexOf("b")+1);
		System.out.println("\n" + ext);
		// 문자열을 사용해서 제어 => 원본은 불변
		
	} 

}
