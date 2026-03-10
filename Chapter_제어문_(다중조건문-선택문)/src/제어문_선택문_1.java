/*
 * 1. case "": break;
 * 2. case "" ->
 * */

import java.util.Scanner;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner에서 값을 받는 경우
		//1. 정수 = nextInt()
		//2. 실수 = nextDouble()
		//3. 문자열 = next() => 공백까지, nextLine() => 전체문장
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
//		System.out.print("문자열 입력 : ");
//		String msg = scan.nextLine();
//		System.out.println(msg);
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println(month + "월은 봄입니다.");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println(month + "월은 여름입니다.");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println(month + "월은 가을입니다.");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println(month + "월은 겨울입니다.");
//			break;
//		default: System.out.println("존재하지 않는 달입니다."); break;
//		}
		switch(month) {
		case 3,4,5 -> System.out.println(month + "월은 봄입니다.");
		case 6,7,8 -> System.out.println(month + "월은 여름입니다.");
		case 9,10,11 -> System.out.println(month + "월은 가을입니다.");
		case 12,1,2 -> System.out.println(month + "월은 겨울입니다.");
		default -> System.out.println("존재하지 않는 달입니다.");
		}

	}

}
