package com.sist.thread;
/*
 *  스프링에서 Task 사용 => 스케쥴러(지정된 시간에 반복 수행)
 *   => 데이터베이스 백업 / 실시간 순위 등
 *  
 *  - ExecutorService : 쓰레드 풀
 *     => 쓰레드를 관리하는 영역
 *     => 쓰레드 생성 개수 제한 => 재사용
 *     => 실무 게임 => 총알개수 / 비행기 이동 횟수 확인 가능
 *     - ConnectionPool : 데이터베이스
 *     
 *     - 주요 메소드
 *       - submit() : 작업실행
 *       - shutdown() : 종료
 *       - invokeAll() : 여러 작업 동시 수행
 *       - get() : 결과값 받기 
 * 
 * 
 */
import java.util.concurrent.*;
// 한번만 실행(단일 쓰레드)
public class Service_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(()->System.out.println("실행1"));
		es.submit(()->System.out.println("실행2"));
		es.submit(()->System.out.println("실행3"));
		es.submit(()->System.out.println("실행4"));
		es.shutdown();
	}

}
