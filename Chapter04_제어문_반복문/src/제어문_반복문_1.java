/*
 * 사용자로부터 숫자를 받아서 구구단 만들기
 * 
 * 
 * 
 * */
import java.util.Scanner;
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		System.out.println(); //다음줄에 출력
		for(int i=9; i>=1; i--) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
		String str = "Hello Java";
		//		 	  0123456789 => 문자열은 0부터 시작(인덱스) 
		for(int i=0; i<str.length(); i++) { //.length() 문자개수
			System.out.print(str.charAt(i)); // .charAt(i) 문자열의 인덱스 번호의 문자 출력
		}
		System.out.println();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//변수 - 1. a=대문자개수 2. b=소문자개수
		int a = 0;
		int b = 0;
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i); //알파벳을 하나씩 읽어옴
			if(c>='A' && c<='Z') {
				a++;
			}
			if(c>='a' && c<='z') {
				b++;
			}
		}
		System.out.println("대문자 개수 : " + a + "개, 소문자 개수 : " + b +"개");
		
	}

}
