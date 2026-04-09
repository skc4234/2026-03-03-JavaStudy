package com.sist.thread;
/*
 *  - 프로세스 : 한 개의 프로그램
 *  - 쓰레드 : 한 개의 프로세스 안에서 여러개의 기능을 동시에 수행
 *     ex) 슈팅 게임 - 프로세스
 *          1. 비행기
 *          2. 총알
 *          --------> 쓰레드
 *          3. 아바타 - 게이머가 조절
 *    - 메소드 호출 : 동시성, 시분할
 *    - 게임에서 자주 등장
 *    - 서버(여러명이 동시에 접속)
 *       => 웹서버, DB 서버
 *       => tomcat, 오라클
 *    - 쓰레드 구현 방법
 *       1. Thread 상속
 *         => class A extends Thread
 *       2. *인터페이스 구현
 *         => class A implements Runnable
 *       3. **ExecutorService : 쓰레드 풀(관리)
 *         => 쓰레드 미리 생성 => 필요할때 할당/회수  => 재사용
 *         => 실무에서 많이 사용
 *         
 *     - 쓰레드의 생명주기                                  === Blocked(일시정지)
 *        new ========== Runnable ========== Running ==|
 *        생성                                           === Dead(메모리 해제)
 *       1. new : 생성
 *          Thread t = new Thread()
 *          => JVM
 *             이름 부여 => 변경
 *                        Thread-0
 *             => getName() / setName()
 *          - 우선순위 부여
 *            1. MIN_PRIORITY : GC
 *            ...
 *            5. NORM_PRIORITY : 생성
 *            ...
 *            10. MAX_PRIORITY : main => 쓰레드
 *            
 *          - 기준(작업기준)
 *             - 쓰레드는 한가지 일만 수행
 *               ex) 총알 발사 / 비행기 움직임
 *        2. Runnable
 *           대기상태 => 자원공유(CPU 메모리 공간)
 *           - start()
 *           
 *        3. Running
 *           쓰레드 실행 => 쓰레드가 어떻게 동작할 지
 *           run() : 동작 코딩
 *        4. 일시정지 : sleep(), wait()...
 *        5. 종료 : 쓰레드 해제
 *           interrupt()
 *       ----------------------------------- 시분할 : 쓰레드, 네트워크 : 서버에서 필수
 *            
 *            
 *            
 *            
 *       
 */
// 1. Thread 상속 => 시분할 : 한번씩 나눠서 작업
class MyThread extends Thread {
	// 동작
	public void run() {
		for(int i=1; i<100; i++) {
			System.out.println(getName()+" : "+i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		t1.setName("쥐");
		t2.setName("말");
		t3.setName("호랑이");
		
		// 우선순위
		t1.setPriority(10); // 높을수록 빠름
		t2.setPriority(3);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
