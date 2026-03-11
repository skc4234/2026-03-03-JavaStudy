/*
 * break : 주로사용 => switch~case / 반복문에서 사용가능
 * 				  => 해당 제어문을 종료
 * 				  => if문 안에서 사용하면 안됨(반복문없이)
 * continue : 반복문 안에서만 사용가능
 * 			  => for : 특정부분 제외
 * 			  => while, do~while : 처음부터 다시 시작
 * --------------------------
 * 자신의 반복문만 제어할 수 있다
 * for() {
 * 		for() {
 * 			break
 * 		}
 * 		//break후 여기로 나옴
 * 
 * 		switch() {
 * 			case 1: ... break;
 * 		}
 *		//break후 여기로 나옴
 * }
 * 
 */
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i==5) break; //for문 종료
			System.out.print(i + " ");
			
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i==5) continue; //5를 제외
			System.out.print(i + " ");
			
		}
	}

}
