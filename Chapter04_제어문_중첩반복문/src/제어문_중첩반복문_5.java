/*
 * =>2차 for문의 조건
 * *
 * **
 * ***
 * ****
 * *****
 * i   j
 * 1   1
 * 2   2
 * 3   3
 * 4   4
 * 5   5
 * 
 * 
 * 
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * i   j
 * 1   5
 * 2   4
 * 3   3
 * 4   2
 * 5   1
 * 
 * 
 * 
 * 
 */

public class 제어문_중첩반복문_5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6- i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
