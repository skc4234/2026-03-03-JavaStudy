/*
 * 3개의 숫자를 난수
 * -------------
 * 사용자 3개 입력
 * ------------
 * 힌트
 * 자리수+숫자 -> S
 * 숫자만 -> B
 * 
 * 1. 난수 발생
 * -------------------loop
 * 2. 사용자의 입력과 비교
 * 3. 힌트
 * 4. 정답
 * ------------------
 * 5. 종료
 * 
 * 
 */
import java.util.Scanner;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3]; //컴퓨터 난수값 저장
		int[] user = new int[3]; //사용자 입력시 저장
		
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9)+1; //1~9
			// j는 이미 저장된 값, i는 새로 발생한 난수값
			for(int j=0; j<i; j++) {
				if(com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("숫자 3개를 입력하시오(중복, 0금지) : ");
			int input = scan.nextInt();
			
			// 잘못된 입력 예외 처리
			if(input<100 || input >999) {
				System.out.println("😭잘못된 입력😭");
				//처음으로 이동
				continue; // for문은 증가식으로, while문은 처음으로
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			// 잘못된 입력 : 1. 중복 숫자 금지
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("😭중복된 숫자 사용금지😭");
				//처음으로 이동
				continue; // for문은 증가식으로, while문은 처음으로
			}
			
			// 잘못된 입력 : 2. 0이 들어가면 안됨
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("😭0은 사용할 수 없습니다...😭");
				//처음으로 이동
				continue; // for문은 증가식으로, while문은 처음으로
			}
			 //유효성 검사 => 프로그램에 필요한 값이 입력되었는지 확인
			
			//비교
			int s=0,b=0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			//힌트
			System.out.printf("Input number : %d / %dS, %dB\n", input, s, b);
			if(s==3) {
				System.out.println("👍정답입니다!!");
				break; //프로그램 종료
			}
			System.out.println();
		}
	}

}
  