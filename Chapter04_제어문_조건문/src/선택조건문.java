/*
 * 프로그램에서 가장 많이 사용되는 조건문
 * 
 * 	=> 조건 : true / false
 * 		단일 조건문은 => true 수행, false 건너뜀
 * 		선택 조건문은 true => 처리1, false => 처리2
 * 	형식)
 * 		if(조건문) { // 홀수/짝수, 로그인/로그아웃, 아이디 중복여부 등   
 * 			true일때
 * 		}
 * 		else {
 * 			false일때
 * 		}
 * 
 * 		출력 System.out.println() => 세로 (한줄씩)
 * 			System.out.print() => 가로 옆으로 출력
 * 
 * 
 * */

// => 짝수 / 홀수 => 1~100
import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int i = r.nextInt(100)+1; // 1~100
		System.out.println("정수값 : " + i);
		if(i%2==0) {
			System.out.println(i + "는 짝수입니다.");
		}
		else {
			System.out.println(i + "는 홀수입니다.");
		}
		char c = 'A';
		if(c>='A' && c<='Z') { // && 포함, ||미포함
			System.out.println(c + "는 대문자입니다.");
		}
		else {
			System.out.println(c + "는 소문자입니다.");
		}
		
		// 웹 로그인 ox
		
	}

}