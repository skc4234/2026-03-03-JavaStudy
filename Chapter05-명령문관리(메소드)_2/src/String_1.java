/*
 * 웹 개발
 * --- String / ArrayList / Integer
 * 	   ------ 자바에서 지원하는 메소드 => 리턴형/매개변수/어떤 값 읽기
 * 
 * 비교
 *  equals     / equalsIgnoreCase
 *  | id/PW      | 검색
 *  ㄴ대소문자 구분   ㄴ대소문자 구분x
 * 
 */


public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong = "admin";
		String shim = "admin";
		String park = new String("admin");
		if(hong == shim) {
			System.out.println("hong과 shim은 같다");
			
		}
		else {
			System.out.println("hong과 shim은 같지 않다");
		}
		

		if(hong == park) {
			System.out.println("hong과 shim은 같다");
			
		}
		else {
			System.out.println("hong과 shim은 같지 않다");
		}
		

		if(hong.equals(park)) {
			System.out.println("hong과 shim은 문자열이 같다");
			
		}
		else {
			System.out.println("hong과 shim은 문자열이 같지 않다");
		}
		

		if(hong.equalsIgnoreCase(park)) {  //대소문자 구분x
			System.out.println("hong과 shim은 같다");
			
		}
		else {
			System.out.println("hong과 shim은 같지 않다");
		}
	}

}
