package com.sist.inter;
import java.util.Random;
import java.util.Scanner;
interface Game {
	public void start();
}

class MoleGame implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); // 난수 발생 1~3 => 두더지 게임
		
		// 점수 계산
		int score = 0;
		
		// 1~3 중에 하나 입력 => 난수와 값이 같으면 점수 +1 => 총 5번
		System.out.println("🦔 두더지 게임 시작 !!🦔");
		System.out.println("1~3 사이의 숫자를 입력해서 두더지를 찾아보세요.");
		for(int i=1; i<=5; i++) {
			int mole = rand.nextInt(3)+1; // 0~2 +1 => 1~3
			System.out.println("\n[라운드 " + i + "]");
			System.out.print("두더지가 나타났다!(1~3) : ");
			
			// 시작 시간
			long startTime = System.currentTimeMillis();
			
			int input = scan.nextInt();
			long endTime = System.currentTimeMillis(); // 밀리초 단위 => 1000밀리초=1초
			
			// 걸린 시간
			long time = endTime - startTime;
			if(time >=2000) {
				System.out.println("⌛ 너무 느려요!!! 두더지가 도망갔어요...");
				continue; // 증가식으로 이동, 한 라운드 실패
			}
			if(input == mole) {
				System.out.println("🎉 두더지 잡기 성공!!!!!");
				score++;
			}
			else {
				System.out.println("😭 두더지 잡기 실패ㅜㅜㅜ");
			}
		}
		System.out.println("\n📢 당신의 점수는 " + (score*20) + "점입니다!!");
	}
	
}
class SpeedGame implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("🎖️ 순발력 게임 시작!! 🎖️");
		System.out.println("지금! 이 뜨면 빠르게 Enter를 누르세요!!!!");
		try {
			System.out.println("\n🚶‍♂️준비...");
			Thread.sleep(rand.nextInt(3000)+2000); // 0~3초 +2 => 2~5초
			
			   // CheckException => 예외처리 반드시 필요
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("지금!!!!!");
		long startTime = System.currentTimeMillis();
		scan.nextLine(); // Enter
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		if(time<100) {
			System.out.println("🥴반칙! 너무 빠릅니다!");
		}
		else if(time<300) {
			System.out.println("엄청 빠르네요!!!!");
			System.out.println("걸린 시간[" + time + " ms]");
		}
		else if(time<700) {
			System.out.println("적당한 속도에요!");
			System.out.println("걸린 시간[" + time + " ms]");
		}
		else {
			System.out.println("너무 느려요......");
			System.out.println("걸린 시간[" + time + " ms]");
		}
	}
	
}
/*
 * 	class A {
 * 		int a=10;
 * 		void display() {}
 * 	}
 *  class B extends A {
 *  	int a=20;
 *  	void display() {}
 *  }
 *  A a = new A();
 *  B b = new B();
 *  A c = new B(); => 동적 바인딩 : 주소를 바꿔서 호출 덮어쓰기
 *  
 *  
 *  c.a => 10
 *  c.display() => B의 메소드
 * 
 * 
 */
public class 인터페이스_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		System.out.print("게임 선택[두더지 게임(1) / 순발력 게임(2)] : ");
		int menu = scan.nextInt();
		Game game = null;
		if(menu==1) {
			// 오버라이딩 => 메소드 호출 시 덮어쓰기
			game = new MoleGame();
		}
		else if(menu==2) {
			game = new SpeedGame();
			// 변수는 클래스명, 메소드는 생성자 타입
		}
		game.start();*/
		MoleGame mole = new MoleGame();
		SpeedGame speed = new SpeedGame();

		if(mole instanceof Game) { // 객체 크기 비교
			System.out.println("mole < Game");
		}
		else {
			System.out.println("mole > Game");
			
		}
		
		if(speed instanceof Game) {
			System.out.println("speed < Game");
			
		}
		else {
			System.out.println("speed > Game");
			
		}
		
		Object obj = new Object();
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		/*
		 *        Object
		 *        	|
		 *     -----------
		 *     |         |
		 *  String  StringBuffer
		 *      
		 *      
		 *      
		 */
		
		if(str instanceof Object) {
			System.out.println("String < Object");  
		}
		if(obj instanceof String) {
			System.out.println("Object < String");
		}
//		if(sb instanceof String) { // 상속관계가 아니기 때문에 오류 발생
//			
//		}
		/* 비교
		 *  일반 기본형 => ==  /  !=
		 *  문자열     => equals
		 *  객체       => instanceof ==> 객체 찾기
		 *  @Autowired => 자동화
		 */
	}

}
