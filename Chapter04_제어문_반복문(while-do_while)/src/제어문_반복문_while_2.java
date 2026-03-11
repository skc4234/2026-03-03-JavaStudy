/*
 * 1. while
 * 		사용자가 구구단 => 단입력 => 구구단 출력
 * 		변수1 => 사용자가 입력한 단 이 필요
 * 		변수2 => 루프 변수(1~9)
 * 
 * */

import java.util.Scanner; // nextInt(), nextDouble, next(), nextLine()
public class 제어문_반복문_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단 입력 : ");
		int dan = scan.nextInt();
		// 사용자가 요청한 데이터 저장
		// 요구사항 출력 -> 처리
		int i=1; // 1~9 변수
		while(i<=9) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan*i); //%2d 출력하는 형식 => 명령 프롬프트만 사용
																// 라이브러리로 형식 가능
			i++;
		}
		
	}

}
