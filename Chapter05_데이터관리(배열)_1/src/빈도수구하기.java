/*
 * 0~9 난수 100개 발생
 * 각 숫자의 빈도수 구하기
 * 
 * 
 */

import java.util.Arrays;
public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[45];
		
		//초기화


		for(int i=1; i<=1000; i++) {
			int rand = (int)(Math.random()*45)+1;
			arr[rand-1]++;
		}
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			double per = (arr[i]/1000.0)*100;
			if(arr[i] > 26) {
				System.out.printf("%d이(가) 나올 확률 : %.1f%%\n", (i+1), per);
				System.out.println("===================================");
				System.out.println("🥰" + (i+1) + "이 높은 확률로 나옵니다🥰");
				System.out.println("===================================");
				continue;
			}
			System.out.printf("%d이(가) 나올 확률 : %.1f%%\n", (i+1), per);
		}
	}

}
