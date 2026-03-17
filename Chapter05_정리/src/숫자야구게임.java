/*
 * 소스는 변경사항이 없음
 * 어디까지가 한개의 기능 => 메소드
 * 1. 난수발생 => 3자리 난수(중복없는, 0안됨)
 * 2. 사용자 입력 => 유효성 검사
 * 3. 숫자 비교
 * 4. 힌트 및 결과 출력
 * 5. 종료 여부
 * 
 * 
 * static boolean isYear(int year) {
 * 		//boolean bCheck = false; // else 필요없음
 * 		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
 * 			//bCheck = true;
 * 			return true;
 * 		}
 * 		//return bCheck;
 *      return false;
 * }
 * 
 */
import java.util.*;
public class 숫자야구게임 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 1. 난수 발생 => Set클래스 => 중복없음 => DISTINCT 
		int[] com = new int[3];
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(com[i] == com[j]) {
					//System.out.println("중복");
					i--;
					break;
				}
			}
		}
		
//		int su = 0;
//		int count = 0;
//		boolean bCheck = false;
//		for(int i=0; i<com.length; i++) {
//			bCheck = true;
//			// 중복체크 => 중복있으면 bCheck true, 없으면 false
//			while(bCheck) {
//				su = (int)(Math.random()*9)+1;
//				bCheck = false; // while문 종료
//				for(int j=0; j<i; j++) {
//					if(com[j] == su) {
//						count++;
//						//System.out.println("중복");
//						bCheck = true;
//						break;
//					}
//				}
//			}
//			com[i] = su;
//		}
		//System.out.println("중복 횟수 : " + count);
		//System.out.println(Arrays.toString(com));
		

		// 2. 사용자 입력
		int user[] = new int[3];
		while(true) {
			int s = 0, b = 0;
			System.out.print("숫자를 입력하시오(중복, 0 금지) : ");
			int input = scan.nextInt();
			if(input <100 || input >999) {
				System.out.println("잘못 입력했습니다!!");
				continue;
			}
			
			// 배열 저장
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]) {
				System.out.println("중복입니다!!!!!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0이 포함되어 있습니다.");
				continue;
			}
			
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<com.length; j++) {
					if(com[i] == user[j]) {
						if(i==j) {
							s++;
							break;
						}
						else {
							b++;
							break;
						}
					}
				}
			}
			
			//힌트
			System.out.print("S : ");
			for(int i=0; i<s; i++) {
				System.out.print("●");
			}
			System.out.print("\nB : ");
			for(int i=0; i<b; i++) {
				System.out.print("○");
			}
			
			System.out.println();
			

			if(s==3) {
				System.out.println("정답입니다!!!!!");
				break;
			}
		}
	}

}
