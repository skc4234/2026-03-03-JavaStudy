/*	1.
 *  ★★★★★
 *  ★★★★★
 *  ★★★★★
 *  ★★★★★
 * 
 * 
 *  2.
 * 	ABCD
 *  EFGH
 *  IJKL
 *  MNOP 줄수4, 가로출력4
 *  
 *  
 *  3.
 *  ABCD
 *  ABCD
 *  ABCD
 *  ABCD
 */
public class 제어문_중첩반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//					System.out.print("★");
//					
//			}
//			System.out.println();
//		}
		
		//2번
		char c = 'A';
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
		//3번
		c = 'A';
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(c++);
			}
			c='A'; // 변수위치에 따라서 결과가 다름 
			System.out.println();
		}
	}

}
