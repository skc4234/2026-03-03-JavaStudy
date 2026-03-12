/*
 * 동작하는 과정
 *  1. 몇 줄 출력   => 1차 for문
 *  2. 내용물 몇 개 => 2차 for문
 *  
 *  for() {
 *  	for() {
 *  		if() {
 *  			break; => 2차 for문 종료
 *  			break Label; => Label for문 종료
 *  			}
 *  	}
 *  	=> break 시 여기로 나옴
 *  }
 *  
 *  break / continue => 자신이 포함된 for문만 종료
 *  
 *  for(int i=1; i<=3; i++) {
 *  	for(int j=1; j<=3; j++) {
 *  		출력문
 *  	}
 *  	줄만들기
 *  }
 *  i=1일때 2차 for문 => j=1,2,3
 * 
 * 
 * 
 * 
 * 
 */
public class 제어문_중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
	}

}
