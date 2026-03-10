/*
 * 	제어문 : 프로그램을 제어할때 사용
 * 			=> 건너뛰기, 원하는 데이터 출력
 * 			=> 반복적으로 수행
 * 			=> 반복을 제어
 * 			=> 프로그램의 흐름
 * 	1) 제어문의 종류
 * 		단일/선택/for/while/break
 * 		1. 조건문 => 회원가입, 아이디중복, 아이디 찾기, 에러처리
 * 			단일조건문
 * 				형식)
 * 					if(조건) {  조건은 무조건 true/false만 사용 가능
 * 											부정연산자, 비교연산자, 논리연산자
 *						명령문;
 *						명령문;
 *					}
 *					=> 1. 조건 결과가 false면 건너뛴다.
 *						2. 조건 결과가 true일때 {}명령문 수행
 *						3. 독립적으로 모든 if의 조건을 검사 => 속도가 느리다
 * 			선택조건문
 * 			다중조건문
 * 		2. 선택문
 * 			선택문 : 다중조건문 단순화 => 메뉴처리, 네트워크
 * 		3. 반복문
 * 			for => 반복횟수가 지정됐을때
 * 			while => 반복횟수 지정이 없는 경우 => 선 조건 검색
 * 			do~while => 반복횟수 지정이 없는 경우 => 반드시 한번 이상 수행
 * 		4. 반복제어문
 * 			break : 반복 문장 중단
 * 			continue : 특정 부분 제외
 * 		5. 혼합
 * 			for=>if, while=>if
 * ---------------------기본문법
 * 	관련된 데이터 묶기 : 배열/클래스
 *	관련된 명령문 묶기 : 메소드
 *----------------------- + 묶기(객체지향)
 * 
 * 
 * */
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단일조건문
		int num = 15;
		if(num%3==0) {
			System.out.println(num + "은 3의 배수다.");
		}
		else if(num%5==0) {
			System.out.println(num + "은 5의 배수다.");
		}
		else if(num%7==0) {
			System.out.println(num + "은 7의 배수다.");
		}
		// 범위/기간 => 논리연산자
		char c = 'A';
		if(c>='A' && c<='Z') {
			System.out.println(c + "는 대문자입니다.");
		}
		if(c>='a' && c<='z') {
			System.out.println(c + "는 소문자입니다.");
		}
		if(c>='0' && c<='9') {
			System.out.println(c + "는 숫자입니다.");
		}
		
		String id = "admin";
		String pwd = "1234";
//		if(id.equals("admin")&&pwd.equals("1234")) {
//			System.out.println("로그인 되었습니다.");
//		}
//		if(!(id.equals("admin")&&pwd.equals("1234"))) {
//			System.out.println("아이디나 비밀번호가 틀립니다.");
//		}
		if(id=="admin" && pwd=="1234") {
			System.out.println("로그인 되었습니다.");
		}
		
		int a = 10;
		int b = 0 ;
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		if(b!=0) {
			System.out.println(a/(double)b);
		}
	}

}