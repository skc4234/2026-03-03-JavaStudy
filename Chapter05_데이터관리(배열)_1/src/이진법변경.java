/*
 * 16비트 => 32767
 * 
 * 10 => 0000 0000 0000 1010
 * 
 */
import java.util.Scanner;

public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] binary = new int[16]; // 같은 용도로 사용되는 변수를 모아서 관리
		
		//저장순서 => 0부터 / *15부터
		int index = 15; // 뒤에서부터 저장
		System.out.print("0~32767 사이의 숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		//라이브러리
		//자바 => 기본문법 => 검색(라이브러리(80)+사용자 정의(20))
		// CBD 프로그램
		// Junit => 테스트 프로그램
		System.out.println("라이브러리2 : " + Integer.toBinaryString(num));
		System.out.println("라이브러리8 : " + Integer.toOctalString(num));
		System.out.println("라이브러리16 : " + Integer.toHexString(num));
		
		//  횟수가 지정되지 않음 => while
		while(true) {
			// 2로 나누고 나머지 저장 => 나머지가 0/1이 나올때까지 반복
			binary[index] = num%2;
			num = num/2; // num/=2;
			if(num==0) break;
			index--;
		}
		
		//출력
		for(int i=0; i<binary.length; i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
