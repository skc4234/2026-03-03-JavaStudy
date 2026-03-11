/*
 * 1. 형식
 * 		초기값             1
 * 		do { 
 * 			실행문장        2
 * 			증가값         3
 * 		} while(조건식);   4 // 증가후에 조건검색
 * 		//자바 웹에서는 거의 사용 x
 * 		//비트이동연산자/비트연산자/do~while 등은 웹에서 사용x
 * 
 * 		continue : 조건식으로 이동
 * 				   while, do~while문에서 잘못쓰면 무한루프 가능성있음 => continue 가급적 사용금지
 * 		ex)
 * 			int i=1;
 * 			while(i<=10) {
 * 				if(i==2) continue;     // 2에서 더이상 증가하지 않기 때문에 무한루프에 걸림
 * 				System.out.println(i); // 1
 * 				i++;
 * 			}
 *		
 * 
 * 
 * 
 * */

import javax.swing.JOptionPane;

public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지


int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		System.out.println("");
		char c = 'A';
		do {
			System.out.print(c + " ");
			c++;
		} while(c<='Z');
		System.out.println();
		c='0';
		do {
			System.out.print(c + " ");
			c++;
		} while(c<='9');
		
		System.out.println();
		
		String s = JOptionPane.showInputDialog("문자열 입력");
		System.out.println("입력된 문자열 : " + s);
		System.out.println("글자수 : " + s.length());
		// A, a가 몇개인가?
		int count = 0;
		i=0;
		do {
			char d = s.charAt(i);
			if(d=='A' || d=='a') count++;
			i++;
		} while(i<s.length());
		System.out.println("A나 a의 개수는 " + count + "개이다.");
	}

}
