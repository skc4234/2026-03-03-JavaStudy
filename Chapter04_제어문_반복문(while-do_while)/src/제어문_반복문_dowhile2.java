/*
 * 난수 1~100 사이의 수를 추출
 * => 난수 맞히기 게임(UP/DOWN)
 * 
 * 
 * 
 * */

import java.util.*; // Random, Scanner 등
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터 난수
		Random r = new Random();
		int com = r.nextInt(100)+1; // nextInt(1,5) => 1,2,3,4
									// 메소드 변경해서 사용 => 오버라이딩(Override)
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("1~100사이의 정수 입력 : ");
			int user = scan.nextInt();
			System.out.println();
			// 사용자가 잘못된 값을 입력했을때 => 예외처리
			if(user<1 || user>100) {
				System.out.println("잘못된 입력");
				continue;
			}
			// 결과비교
			if(user>com) {
				System.out.println("입력값보다 작은 정수를 입력해주세요");
			}
			else if(user<com) {
				System.out.println("입력값보다 큰 정수를 입력해주세요");
				
			}
			else {

				System.out.println("정답입니다!!!!");
				break;    // break, continue 뒤에 문장을 추가할 경우 오류!!
			}
		} while(true);
	}

}
