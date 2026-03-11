/*
 * 멤버변수
 * 		지역변수 : {}안에서만 사용 가능 => 자동 메모리 해제
 * 			=> 초기화가 된 상태에서 사용가능
 * 			=> char c = '' => 오류 발생 => null
 *			   char c = ' ';
 * 		전역변수 : 다른 클래스에서 사용가능 => 사용자가 삭제 / GC
 * 
 * 
 * 
 * 
 */


public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 ABCDE 출력
		char c = 'A';
		for(int i=0; i<5; i++) {
			System.out.print(c++);
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			//c='A';
			char d = 'A';
			System.out.print(d++);
		}
		
		System.out.println();
		
		//상수 선언 방법 => final, 대문자
		final double PIE = 3.14; // 배열개수, 오라클주소 등
		//PIE = 2.00;
	}

}
