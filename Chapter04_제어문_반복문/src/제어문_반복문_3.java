/*
 * 1~100의 합
 * => 누적 변수 sum => 반드시 초기값은 0, 곱셉은 1
 * 
 * */
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		//int sum2 = 1;
		for(int i=1; i<=100  ; i++) {
			sum += i;
			//sum2 *= i;
			System.out.println("i = " + i + ", sum = " + sum);
			//System.out.println("i = " + i + ", sum = " + sum2);
		}
		// 지역변수는 {}를 벗어나면 사라진다
		// 지역변수는 반드시 초기값이 존재
		// 같은 블록에서 같은이름 사용불가
		System.out.println("1 ~ 100까지의 총합은 = " + sum);
		//System.out.println("1 ~ 100까지의 곱셈은 = " + sum2);
	}

}
