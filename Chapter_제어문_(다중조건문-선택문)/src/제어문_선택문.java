/*
 * 선택문 => 다중조건문을 단순화
 * 			복잡한 소스코딩에서 주로 사용
 * 			ex) 게임 / 네트워크
 * 1. 형식
 * 		switch(정수/문자/문자열) { => boolean, double 불가
 * 			case 값1:             // case 값1 -> {처리문장} // break 생략
 * 				처리문장
 * 				break; => 종료
 * 			case 값2:
 * 				처리문장
 * 				break; => 종료
 * 			...
 * 			default: 처리문장 break; // else와 동일
 * 		}
 * 
 * 
 * 
 * */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 첫번째 숫자
		System.out.print("첫번째 점수 입력 : ");
		int num1 = scan.nextInt();
		
		// 2. 연산자
		System.out.print("연산자 입력(+, - , *, /) : ");
		String op = scan.next();
		// 자바에서는 문자 입력이 char(x) String
		// Scanner 단점은 엔터/공백
		// ex) aaa bbb ccc로 입력시 저장되는 값은 aaa
		// nextLine()
		
		// 3. 두번째 숫자
		System.out.print("두번째 점수 입력 : ");
		int num2 = scan.nextInt();
		
		// 처리 => 다중조건문->선택문
//		switch(op) {
//		case "+":
//			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
//			break;
//		case "-":
//			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
//			break;
//		case "*":
//			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
//			break;
//		case "/":
//			if(num2==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}
//			else {
//				System.out.printf("%d / %d = %d", num1, num2, num1/num2);
//			}
//			break;
//		default: System.out.println("연산자 오류"); break;
//		}
		
		switch(op) {
		case "+"-> // 두개 이상 값일시 case "+", "%" -> {}  
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		case "-"->
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		case "*"->
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
		case "/"->{
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.printf("%d / %d = %d", num1, num2, num1/num2);
			}
		}
		default-> System.out.println("연산자 오류");
		}
	}

}
