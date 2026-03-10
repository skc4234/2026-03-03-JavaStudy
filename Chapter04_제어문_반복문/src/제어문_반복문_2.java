/*
 * 1. 업다운 게임
 * 	  컴퓨터가 1~100사이의 랜덤한 숫자를 정하면 사용자가 입력한 수와 비교해서 맞추는 게임
 * 	  =>맞출때까지 반복 => while, for(;;)
 * 	  프로그램 종료 => System.exit(0);
 * */
import java.util.Scanner;
import java.util.Random;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(100)+1;
		for(;;) { //반드시 종료하는 시점 지정
			System.out.print("1 ~ 100 사이의 정수 입력 : ");
			int user = scan.nextInt();
			//System.out.println("유저 입력 값 : " + user);
			if(com>user) {
				System.out.println("입력값보다 큰 수를 입력하시오...\n");
			}
			else if(com<user) {
				System.out.println("입력값보다 작은 수를 입력하시오...\n");
			}
			else { //종료 시점
				System.out.println("Game over!!!");
				System.exit(0);
			}
		}
		
	}

}
