/*
 * 1) 제어문의 형식
 * 	   조건문
 * 		단일
 * 			if(조건문) { 조건이 true일때 처리 }
 * 			for안에 if 사용 => 검색
 * 		선택
 * 			if(조건문) { 조건이 true일때 } else {조건이 false 일때 }
 * 		다중
 * 			if(조건문1) { 조건문1이 true일때 => 처리 후 다른 조건문 검사x } else if(조건문2) {} ... else { 모든 조건이 false일때 }
 * 	   선택문
 * 			switch(변수) { //문자, 문자열, 정수만 가능
 * 				case 값 : 처리문장; break;
 * 				case 값 -> 처리문장;
 * 				default -> 처리문장; => 반드시 추가
 * 			}
 * 	   반복문
 * 			for
 * 				=> 반복 횟수가 지정된 경우
 * 				for(초기값; 조건식; 증감식) { 실행문장 }
 * 					  1     2      4        3
 * 					1->2->3->4->(2->3->4)->(2->3->4)->...
 * 					초기값에는 정수, 문자만 가능
 * 					조건 검사 false 시 반복문 종료
 * 			while
 * 			do~while
 * 			--------
 * 			break
 * 				반복문을 끝냄
 * 			continue
 * 				아래 문장 실행안하고 다시 처음으로 돌아감
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */



import java.util.Scanner;
import java.util.Random;
public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int ran = r.nextInt(10)+1;
		//1번
		int sum = 0;
		for(int i=1; i<=100; i++) { // for(int = 2; i<=100; i+=2)
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1. 짝수의 합 : " + sum);
		
		//2번
		int answer2 = 0;
		Scanner s = new Scanner(System.in);
		//System.out.print("숫자를 입력하시오 : ");
		//int n = s.nextInt();
		for(int i=1; i<=ran; i++) {
		//for(int i=1; i<=n; i++) {
			answer2 += i;
		}
		//System.out.println("2. 1부터  " + n + "까지의 합 : " + answer2);
		System.out.println("2. 1부터  " + ran + "까지의 합 : " + answer2);
		
		//3번
		System.out.print("3. 1~50까지에서 3의 배수 : ");
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//4번
		int answer4 = 0;
		for(int i=1; i<=100; i++) {
			if(i%7==0) {
				answer4++;
			}
		}
		System.out.println("4. 1~100까지에서 7의 배수의 갯수 : " + answer4);
		
		//5번
		System.out.print("5. 문자 하나씩 출력 : ");
		String str = "JavaProgramming";
		for(int i=0; i<str.length(); i++) { //문자열은 무조건 0부터
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		
		//6번
		/*
		 * while
		 * 	=>순차적
		 * 	초기값             1
		 * 	while(조건문) {    2
		 * 		반복수행문장     3
		 * 		증가식         4 
		 * 	}
		 *	=> 보통은 while(true) 사용
		 * */
		int i = 1;
		System.out.print("6. while문 출력 : ");
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		
		//7번
		//System.out.print("숫자를 입력하시오 : ");
		//int num = s.nextInt();
		//System.out.print("7. 1부터 " + num + "까지 출력 : ");
		System.out.print("7. 1부터 " + ran + "까지 출력 : ");
		for(int j=1; j<=ran; j++) {
		//for(int j=1; j<=num; j++) {
			System.out.print(j + " ");
			
		}
		System.out.println();
		
		//8번
		System.out.print("8. 1~100까지에서 홀수 출력 : ");
		for(int j=1; j<=100; j++) { //for(i=1; i<=100; i+=2)
			if(j%2==1) {
				System.out.print(j + " ");
			}
		}

		System.out.println();
		
		//9번
		int answer9 = 0;
		for(int j=1; j<=100; j++) {
			if(j%5==0) {
				answer9 += j;
			}
		}
		System.out.println("9. 1~100까지에서 5의 배수의 합 : " + answer9);
		
		//10번
		System.out.print("10. 역순 출력 : ");
		for(int j=10; j>=1; j--) {
			System.out.print(j + " ");
		}
		
		/*
		 * 지역변수 => 선언이 되면 다음에 사용시 변경만 해서 사용 => 재사용 가능 => {} 확인
		 * 
		 * 
		 * */
	}

}
