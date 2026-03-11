/*
 * 1~100 사이의 총합 / 짝수합 / 홀수합
 * 변수 4개 - 루프변수, 총합, 짝수합, 홀수합
 * 
 * 
 * */
public class 제어문_반복문_while_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, even = 0, odd = 0;
		int i = 1;
		while(i<=100) {
			sum += i;
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i ;
			}
			i++;
		}
		System.out.println("총합 : " + sum + ", 짝수합 : " + even + ", 홀수합 : " + odd);
	}

}
