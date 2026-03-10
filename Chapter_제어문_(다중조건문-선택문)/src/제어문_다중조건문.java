/*
 * 객체지향 프로그래밍
 * 1. 기본문법 : 변수,데이터형,연산자,제어문
 * 2. 프로그램 제어 : 관련된 명령문, 변수 묶기
 * 					-메소드		-배열/클래스
 * 3. 데이터 보호  / 재사용   /  수정 쉽게 / 추가 기능
 * 		-캡슐화	-상속/포함	오버라이딩		오버로딩
 * 4. 설계 : 인터페이스
 * -----------------------------
 * 5. 프로그램이 비정상 종료 방지 / 미리 에러에 대한 처리 => 예외 처리
 * 6. 라이브러리(자바제공)
 * ----------------------------
 * 최종 : 네트워크와 연결 / *데이터베이스와 연결
 * 
 * 
 * 
 * 제어문 : 다중 조건문 => 일반 프로그램에서 자주 사용
 * 						1. 화면 => 메뉴 클릭시
 * 						2. 성적 처리
 * 						3. 계산기 프로그램
 * 						웹에서는 가끔 사용
 * 						-----------------부메뉴가 있는 경우
 * 1) 형식
 * 		if(조건문) {
 * 			조건이 true면 실행하는 명령문 => 종료
 * 			조건이 false면 다음 조건으로 이동(else if)
 * 		}
 * 		else if(조건문) { ... }
 * 		else { ... }// 필요시에만
 * 		=> 한 개의 해당 조건만 수행
 * 
 * 2) 동작
 * 		처음부터 시작 => 해당 조건을 찾는다 => 해당 조건을 찾으면 문장을 실행하고 종료
 * 3) 처리
 * 		경우의 수가 여러개인 경우
 * 			+, -, *, /, 키보드값 처리, 메뉴가 여러개일때 등
 * =>단순화 : 1. switch~case : 한개의 값 처리
 * 			2. 다중조건문 : 범위가 있는 경우 (웹은 범위처리가 많음)
 * 
 * 
 * 
 * */

// 사칙연산처리 +, -, *, / => 다른 연산 처리 else
// 입력 => Scanner
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// System.in => 키보드 입력값 받아서 메모리에 저장하는 역할 => API(자바에서 제공)
		// 1. 첫번째 숫자 2. 연산자 3. 두번째 숫자 => 저장 => 결과값 출력시 읽기
		// 1. 입력받을 준비
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
		
		// 처리(연산처리)
		if(op.equals("+")) {
			System.out.printf("%d + %d = %d \n", num1, num2, num1+num2);
		}
		else if(op.equals("-")) {
			System.out.printf("%d - %d = %d \n", num1, num2, num1-num2);
		}

		else if(op.equals("*")) {
			System.out.printf("%d * %d = %d \n", num1, num2, num1*num2);
		}
		else if(op.equals("/")) {
			// 에러 발생
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.printf("%d / %d = %d \n", num1, num2, num1/num2);
				
			}
		}
		else {
			System.out.println("연산자 입력 오류");
		}
	}

}
