/*
 * 로또번호 6개 추출=> 1~45 => 중복없이
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Arrays;
public class 배열_9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//6개 번호 저장하는 배열


int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//중복제거
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break; // 해당 반복문 종료
				}
			}
		}
		//System.out.println(Arrays.toString(lotto));
		Arrays.sort(lotto);
		for(int i : lotto) {

			Thread.sleep(2000);
			System.out.print(i + " ");
			
		}
		
	}

}
