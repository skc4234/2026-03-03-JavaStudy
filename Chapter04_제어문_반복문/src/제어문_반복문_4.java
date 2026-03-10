/*
 * 1~100까지 정수중에 3의 배수 / 5의 배수 / 7의 배수 의 갯수
 * 				   단일 조건문 / 다중조건문x => 중복처리
 * 
 * 
 * 
 * */
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a3 = 0;
		//int a5 = 0;
		//int a7 = 0;
		int a3=0, a5=0, a7=0; // 데이터형이 동일하면 한줄에 가능
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				a3++;
			}
			if(i%5==0) {
				a5++;
			}
			if(i%7==0) {
				a7++;
			}
		}
		//System.out.println("3의 배수의 갯수 : " +  a3);
		//System.out.println("5의 배수의 갯수 : " +  a5);
		//System.out.println("7의 배수의 갯수 : " +  a7);
		
		
		// 1. 변수, 반복문, 결과값
		// 1~100 사이의 짝수의 합과 홀수의 합 출력
		int odd = 0, even = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		
		//배수를 구함 => %2, %4, %5 등 %사용
	}

}
