/*
 * String은 변경할 수 없다 / 있는 그대로 사용
 * 검색 => 단점 : final
 * ------------
 *  startsWith : 첫글자가 동일
 *  endsWith : 끝문자열이 동일
 *  -----------서제스트 : 자동완성기
 *  contains : 문자포함된
 *  -----------검색
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String[] subject = {
			"혼자 배우는 자바",
			"자바 and Spring",
			"기본 자바",
			"Java and JSP",
			"Oracle and Java",
			"자바로 시작한 JSP",
			"JSP and 자바"
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = scan.next();

		System.out.println("시작하는 문자열 찾기");
		for(String data : subject) {
			if(data.startsWith(fd)) {
				//검색어로 시작하는 교재를 읽어온다
				// => 웹의 쿠키 읽기
				System.out.println(data);
			}
		}
		
		System.out.println("\n끝나는 문자열 찾기");
		for(String data : subject) {
			if(data.endsWith(fd)) {
				System.out.println(data);
			}
		}
		
		System.out.println("\n포함된 문자열 찾기(많이 사용)");
		for(String data : subject) {
			if(data.contains(fd)) {
				System.out.println(data);
			}
		}
	}

}
