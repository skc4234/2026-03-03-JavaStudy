package com.sist.lang;
/*
 *  System
 *   1) 프로그램 종료
 *       => System.exit(리턴값)
 *                     => 0 이면 정상종료
 *                     => -1 / 1 이면 비정상종료
 *           => 윈도우나 애플리케이션 종료 시(웹에서는 사용x)
 *   2) 입출력
 *       => System.in, System.out
 *          -=====================> 자바 표준 입출력
 *          System.out.println() => 화면 출력
 *          System.in.read()     => 키보드 입력값을 받는 경우 => 예외 처리 필요
 *               ------           => 리턴형이 int
 *           in = InputStream
 *           out = OutputStream
 *   3) 메모리 회수
 *       System.gc() => 가비지 컬렉션
 *   4) 시간 측정
 *       System.currentTimeMillis()
 *        => 웹(로그파일)
 *       
 *  System 클래스는 대부분이 static으로 만들어져 있다
 * 
 * 
 * 애플리케이션 개발 => ERP(윈도우)
 * 웹개발은 윈도우 
 * 
 * 
 */
public class System_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for(int i=1; i<10; i++) {
			if(a==i) {
				System.out.println("프로그램 종료");
				//System.exit(0); // main 종료
				break; // for문 종료
			}
			System.out.println("i="+i);
		}
		System.out.println("시작");
		System.out.println("종료");
	}

}
