package com.sist.manager;
/*
 *  공통으로 적용되는 메소드 / 변수 => static
 *   => 상속
 *       - 코딩을 줄일 수 있다
 *       - 필요 시 변경해서 사용이 가능하다
 * 		 => 오버라이딩
 *   => 추상클래스 / 인터페이스 => 상속/오버라이딩
 *   p286-290 생성자 호출
 *   => 상속 내리는 클래스 생성자 자동 호출
 *      매개변수가 있는 생성자는 상속 받는 클래스에서 반드시 super(매개변수) 호출
 *   p294
 */
public class MelonMusicManager extends GenieMusicManager {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
