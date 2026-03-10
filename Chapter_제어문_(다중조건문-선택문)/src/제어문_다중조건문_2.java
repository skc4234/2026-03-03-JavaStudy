/*
 * 1. 경우의 수
 * ex) 정수 입력 받아서 음수/양수  if~else
 * 		문자 입력 받아서 대문자/소문자 if~else
 * 2. 문법사항 
 * 	조건문 { }
 * 3. 어떤 조건 => 비교/논리/부정연산자
 * ---모든 연산이 true/false
 * 
 * 
 * */
import java.util.Scanner;
public class 제어문_다중조건문_2 {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("점수 입력 : ");
			int score = scan.nextInt();
			//처리 => 학점 ==> ChoiceFormat 라이브러리
			char c = 'A';
//			if(score>=90) {
//				c = 'A';
//			}
//			else if(score>=80) {
//				c = 'B';
//			}
//			else if(score>=70) {
//				c = 'C';
//			}
//			else if(score>=60) {
//				c = 'D';
//			}
//			else {
//				c='F';
//			}
			
//			switch(score/10) {
//			case 10:
//			case 9:
//				c='A';
//				break;
//			case 8:
//				c='B';
//				break;
//			case 7:
//				c='C';
//				break;
//			case 6:
//				c = 'D';
//				break;
//			default: c='F'; break;
//			}
			
			String s = switch(score/10) {
			case 10,9 -> "A";
			case 8 -> "B";
			case 7 -> "C";
			case 6 -> "D";
			default -> "F"; //default가 반드시 있어야함
			};
			System.out.println("학점은 " +  s);
		}
}
