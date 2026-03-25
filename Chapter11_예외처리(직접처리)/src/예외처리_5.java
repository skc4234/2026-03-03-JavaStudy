/*
 *  1. 인터페이스
 *  	=> 표준화 가능
 *  	=> 소스의 통일화
 *  	=> 다른 클래스와 연결시에 주로 사용 : 리모콘
 *  	   -------------------------
 *         => 결합성이 낮아진다
 *         => client -------- server
 *         				|
 *                   interface  <= 결합성을 낮춤
 *      => 유지보수가 쉽다
 *      => 관련된 모든 클래스를 모아서 한개의 이름으로 관리
 * 
 * 
 * 
 */
interface Animal {
	// 변수는 only 상수형 => 반드시 초기화
	int a = 10; // public static final int a = 10; 생략
	public void eat();
	// public abstract void eat(); => 추상메소드는 only public
	// private 메소드 사용 가능 => 인터페이스 자체에서만 사용
	private void display() {
		System.out.println("공통사용");
	}
	public default void aaa() {
		display();
	}
	public default void bbb() {
		display();
	}
	public default void ccc() {
		display();
	}
}

public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
