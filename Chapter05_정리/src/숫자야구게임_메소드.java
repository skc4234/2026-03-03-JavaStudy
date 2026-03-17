import java.util.Arrays;
import java.util.Scanner;

public class 숫자야구게임_메소드 {
	static int[] getRand() {
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
		return com;
	}
	
	static int[] userInput() {
		Scanner scan = new Scanner(System.in);
		int[] user = new int[3];
		while(true) {
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
			break;
		}
		
		return user;
	}
	
	static void compare(int[] com, int user[]) {
		int s = 0, b = 0;
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
		
		hint(s,b);
		if(isEnd(s)) {
			System.out.println("정답입니다!!!!!");
			System.exit(0);
		}
	}
	
	static void hint(int s, int b) {
		System.out.print("S : ");
		for(int i=0; i<s; i++) {
			System.out.print("●");
		}
		System.out.print("\nB : ");
		for(int i=0; i<b; i++) {
			System.out.print("○");
		}
		
		System.out.println();
	}
	
	static boolean isEnd(int s) {
		if(s==3) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] com = getRand();
		//System.out.println(Arrays.toString(com));
		int[] user = new int[3];
		while(true) {
			user = userInput();
			compare(com, user);
		}
	}
}
