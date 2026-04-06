package com.sist.lambda;
/*
 *  - 람다 : 함수 인터페이스(포인터)
 *     - 익명으로 처리 => 가독성 떨어짐
 *     - 장점 : 소스가 간결해짐
 *    ex)
 *    new Thread(new Runnable() {
 *    		public void run() {
 *    			System.out.println("쓰레드처리");
 *    		}
 *    })
 *    ====== 람다 사용 ======
 *    new Thread(()-> System.out.println("쓰레드 처리");)
 *               -- run()
 *               => 인터페이스 메소드가 하나인 경우만 사용가능
 *               
 *     - 사용법
 *        () -> {...}
 *        메소드명 생략
 *        이름이 없어서 익명 함수 / 이름이 없는 미니 함수
 *     1) 기본 문법
 *         (매개변수) -> { 실행문 }
 *         (a,b) -> { return a+b; } (자바스크립트 => 화살표 함수)
 *        기존 방식    람다 방식
 *        메소드 제작   바로 사용
 *        구현이 길다   코드가 짧다
 *        재사용 중심   즉석 사용
 *     2) 사용처
 *         - 반복문, List 처리, 조건 필터랑
 *         ex)
 *          for(int i=0; i<list.size; i++) {
 *          	if(list.get(i)>10) System.out.println(list.get())
 *          }
 *          ====== 필터 사용 =======
 *          list.stream().filter(x->x>10).forEach(System.out::println)
 *          
 *        => 단순한 조건일때 사용(복잡한 조건 x)
 * 
 * 
 */
import java.util.*;
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		for(int i : list) {
			if(i%2==0) 
				System.out.println(i);
		}
		System.out.println("========== 람다 사용 ============");
		// DB 값 읽기, 크롤링, 파일 읽기
		list.stream()
		    .filter(x->x%2==0)
		    .forEach(System.out::println);
	}

}
