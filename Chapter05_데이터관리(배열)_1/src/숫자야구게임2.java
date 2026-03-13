/*
 * 3개의 영어를 난수
 * -------------
 * 사용자 3개 입력
 * ------------
 * 힌트
 * 자리수+알파벳 -> S
 * 알파벳만 -> B
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
import java.util.Arrays;
import java.util.Scanner;
public class 숫자야구게임2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] com = new char[3]; //컴퓨터 난수값 저장
		char[] user = new char[3]; //사용자 입력시 저장
		
		for(int i=0; i<com.length; i++) {
			com[i] = (char)((int)(Math.random()*26)+'A');
			// j는 이미 저장된 값, i는 새로 발생한 난수값
			for(int j=0; j<i; j++) {
				if(com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		
		while(true) {
			System.out.print("알파벳 3개를 입력하시오(중복 금지) : ");
			String input = scan.next();
			
			//System.out.println(input.length()); 
			
			if(input.length()!=3) {
				System.out.println("😭잘못 입력되었습니다.😭");
				//처음으로 이동
				continue; // for문은 증가식으로, while문은 처음으로
			}
			
			for(int i=0; i<user.length; i++) {
				user[i] = input.charAt(i);
			}
			
			if(user[0]>'Z' || user[0] <'A' || user[1]>'Z' || user[1] <'A' || user[2]>'Z' || user[2] <'A') {
				System.out.println("😭소문자가 입력되었습니다.😭");
				continue;
			}
			
			// 잘못된 입력 : 1. 중복 알파벳 금지
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("😭중복된 알파벳 사용금지😭");
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
			System.out.printf("Input : %s / %dS, %dB\n", input, s, b);
			if(s==3) {
				System.out.println("👍정답입니다!!");
				break; //프로그램 종료
			}
			System.out.println();
		}
	}

}
  