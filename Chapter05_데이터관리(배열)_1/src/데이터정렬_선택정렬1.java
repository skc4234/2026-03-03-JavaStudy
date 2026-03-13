/*
 * 문자 정렬
 * 
 */


import java.util.Arrays;

public class 데이터정렬_선택정렬1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[5];
		for(int i = 0; i<alpha.length; i++) {
			alpha[i] = (char)((int)(Math.random()*26)+'A');
			for(int j=0; j<i; j++) {
				if(alpha[i]==alpha[j]) {
					System.out.println((i+1) + "번째와 " + (j+1) + "번째가 중복(" + alpha[j] + ")"); 
					i--;
					break;
				}
			}
		}
		System.out.print("정렬 전 : ");
		for(char c : alpha) {
			System.out.print(c + " ");
		}
		System.out.println();
		//정렬
		System.out.println("\n정렬 과정");
		for(int i=0; i<alpha.length-1; i++) {
			for(int j = i+1; j<alpha.length; j++) {
				if(alpha[i] > alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
			System.out.println(Arrays.toString(alpha));
		}
		System.out.print("\n정렬 후 : ");
		for(char c : alpha) {
			System.out.print(c + " ");
		}
	}
}
