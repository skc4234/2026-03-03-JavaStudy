/*
 *  컴퓨터와 가위바위보 10번 => 승패무승부 확인
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		Scanner scan = new Scanner(System.in);
		String[] res = {"가위","바위","보"};
		for(int i=0; i<10; i++) {
			int com = (int)(Math.random()*3);
			System.out.print("가위(0), 바위(1), 보(2) 중 하나를 내시오 : ");
			int user = scan.nextInt();
			if(user<0 || user>2) {
				System.out.println("잘못된 입력.....");
				i--;
				continue; // 증가식으로 이동 => 10번이 안됨
			}
			System.out.println("사용자 : " + res[user]);
			
			System.out.println("컴퓨터 : " + res[com]);
			int r = com - user;
			if(r==1 || r==-2) {
				lose++;
				System.out.println("Com Win!!");
			}
			else if(r==-1 || r==2) {
				win++;
				System.out.println("User Win!!!!");
			}
			else {
				same++;
				System.out.println("Draw...");
			}
			System.out.println();
			
		}
		System.out.println("게임 종료!!!!!");
		System.out.println("승 : " + win + "\t패 : " + lose + "\t무승부 : " + same);
		
		
//			int com = (int)(Math.random()*3); // 0, 1, 2
//
//			System.out.print("가위(0), 바위(1), 보(2) 중 하나를 내시오 : ");
//			int user = scan.nextInt();
//			System.out.println("사용자 : " + res[user]);
//		
//			System.out.println("컴퓨터 : " + res[com]);
//			int r = com - user;
//			if(r==1 || r==-2) {
//				System.out.println("Com Win!!");
//			}
//			else if(r==-1 || r==2) {
//				System.out.println("User Win!!!!");
//			}
//			else {
//				System.out.println("Draw...");
//			}
//			System.out.println();
//		}
		
			
			
			
//		if(com == 0) {
//			System.out.println("가위");
//		}
//		else if(com == 1) {
//			System.out.println("바위");
//		}
//		else if(com ==2) {
//			System.out.println("보");
//		}
		
	}

}
