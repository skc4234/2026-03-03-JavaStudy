/*
 * 1-2+3-4+5-6+7-8+9-10
 * 반복문은 규칙이 있어야함
 * 
 * */


public class 제어문_반복문_5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum -=i;
			}
			else {
				sum +=i;
			}
		}
		//System.out.println("합 : " + sum);
		
		
		// 1~10 => 3의 배수는 제외하고 출력
		for(int i=1; i<=10; i++) {
			if(i%3!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//1~10 => 2의배수이고 3의배수인 값을 출력
		for(int i=1; i<=10 ; i++) {
			if(i%2==0 && i%3==0) {
				System.out.print(i + " ");
				
			}
		}
		//for은 웹 화면출력, while은 데이터베이스, 크롤링
		//배열/컬렉션 처리시에 많이 사용 
		// 모든 언어(자바/자바스크립트 등)  =>  인덱스는 0번부터 시작
		//            					  오라클은 인덱스가 1번부터 시작 
	}
}
