//2차 for문 => 배열에서 주로 사용
/*
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 *  줄  공백 별
 *  i   j   k
 *  1   4   1
 *  2   3   2
 *  3   2   3
 *  4   1   4
 *  5   0   5
 *  i+j=5, i=k
 *  k+j=5
 *  
 *  
 *  *****
 *   ****
 *    ***
 *     **
 *      *
 * 줄  공백  별
 * i   j    k
 * 1   0    5
 * 2   1    4
 * 3   2    3
 * 4   3    2
 * 5   4    1
 * j+k=5, j=i-1
 * k=6-i
 * 
 * 
 *   *
 *  ***
 * *****
 *  
 * 
 * 
 */



public class 제어문_중첩반복문_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		for(int i=1; i<=6; i++) {
//			int lotto = (int)(Math.random()*45) + 1;
//			Thread.sleep(1000);
//			System.out.print(lotto + " ");
//		}
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {

				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=6-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
