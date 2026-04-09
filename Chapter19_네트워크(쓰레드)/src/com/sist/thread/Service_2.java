package com.sist.thread;
import java.util.concurrent.*;
// 메모리 낭비 최소화
public class Service_2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		//ExecutorService ex = Executors.newFixedThreadPool(2);
		//ex.submit(()->System.out.println("A"));
		//ex.submit(()->System.out.println("B"));
		//ex.shutdown();
		
//		for(int i=1;i<=1000;i++) {
//			int n=i;
//			ex.submit(()->System.out.println("작업 : " + n));
//			
//		}
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> result = ex.submit(()->10+20);
		// 쓰레드 실행 결과 받기
		System.out.println(result.get());
		ex.shutdown();
	}

}
