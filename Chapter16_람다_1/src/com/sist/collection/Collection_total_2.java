package com.sist.collection;
/*
 *  - ListIterator
 *     => 데이터를 모아서 순차적으로 출력할 목적
 *     - 양방향
 *     - 주요 메소드
 *        - hasNext() : 처음부터 끝까지
 *        - next() : 실제 값
 *        - hasPrevious() : 마지막부터 처음까지 
 *        - previous() : 실제 값
 *        - add(), set(), remove()
 *        => JDBC와 같은 구조
 *     - Set이랑 달리 인덱스 위치 확인 가능
 *     - nextIndex() / previousIndex()
 * 
 * 
 */
import java.util.*;
public class Collection_total_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(List.of("A","B","C","D","E"));
		ListIterator<String> it = list.listIterator();
		// 순서대로 출력
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======== 역순 =========");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		// => 오라클에서 ASC/DESC가 가능하기 때문에 웹에서는 사용이 거의 없음
		// => 순수 자바만 사용할 때 사용
		
		// *List 전용
		
	}

}
