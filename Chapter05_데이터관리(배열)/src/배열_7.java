/*
 * 배열 : 메모리 주소를 이용하는 프로그램
 * => 주소에 있는 데이터가 손상될 수 있다.
 * => 배열 / 클래스
 * 
 *  char[] op = {'+', '-', '*', '/'};
 *              주소값
 *      op    100 102 104 106
 *값    100---> +   -   *   /
 *    op[0] => 100번지
 *    op[1] => 102번지
 * 
 */
import java.util.Arrays;
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[10];
		//1. 배열의 저장개수
		System.out.println("생성된 메모리 개수 : " + alpha.length );

		//2. 배열의 초기값
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)((int)(Math.random()*26)+65);
									// 0~25          +65 => 65~90 => 대문자
		}
		
		//출력
		for(char c : alpha) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		int i = 0;
		//변경
		alpha[0] = 'C';
		//전체 변경
		for(char c='A'; c<='J'; c++) {
			alpha[i] = c;
			i++;
		}
		System.out.println(Arrays.toString(alpha));
		
		// 다른 클래스에서 사용 => 자체 변경 / 새로운 메모리
		//                       대입      char[]copy = alpha.clone(); => Call By Value
		//                char[] copy = alpha;
		// => 메소드 매개변수 전송
		// => 데이터를 모아서 편리하게 관리 => 도구(구분자 = 인덱스) 
	
	}

}
