import java.util.Random;
public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		int apple = 3;
		//2번
		int pencil = 5;
		int er = 2;
		//3번
		int classroom = 30;
		//4번
		int milk_price = 2500;
		//5번
		double height = 175.5;
		//6번
		String name = "민수";
		//7번
		int bus = 12;
		int subway = 20;
		//8번
		int korean = 85;
		int english = 90;
		//9번
		double pie = 3.14;
		//10번
		int labtop = 1;
		int mouse = 2;
		int keyboard = 1;
		
		
		
		//1번
		int answer1 = 5+3;
		//2번
		int answer2 = 10-4;
		//3번
		int answer3 = 6*7;
		//4번
		int answer4 = 20/4;
		//5번
		int answer5 = 15%4;
		//6번
		int answer6 = (8+2)*3;
		//7번
		int answer7 = 10;
		answer7++;
		//8번
		int answer8 = 10;
		answer8--;
		//9번
		boolean answer9 = 7 > 5;
		//10번
		int a = 5;
		int b = 10;
		boolean answer10 = a>3 && b<20;
		
		
		
		
		
		
		//1번
//		int num = 11;
//		if(num > 10) {
//			System.out.println("10보다 큽니다.");
//		}
		//2번
//		int score = 60;
//		if(score >= 60) {
//			System.out.println("합격");
//		}
		//3번
//		int age = 20;
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		}
		//4번
//		int num = 9;
//		if(num%2==0) {
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
		//5번
//		int score = 40;
//		if(score >= 60) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
		//6번
		int temperature = 29;
		if(temperature >= 30) {
			System.out.println("덥다");
		}
		else {
			System.out.println("덥지 않다");
		}
		//7번
		int score = 69;
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		//8번
//		int num = 1;
//		if(num > 0) {
//			System.out.println("양수");
//		}
//		else if(num == 0) {
//			System.out.println("0");
//		}
//		else {
//			System.out.println("음수");
//		}
		//9번
		int age = 19;
		if(age >= 0 && age <= 13) {
			System.out.println("어린이");
		}
		else if(age>=14 && age <=19) {
			System.out.println("청소년");
		}
		else {
			System.out.println("성인");
		}
		//10번
		int num = 100;
		if(num > 10) {
			System.out.println("10보다 큼");
		}  
		else if(num == 10) {
			System.out.println("10과 같음");
		}
		else {
			System.out.println("10보다 작음");
		}
	}

}