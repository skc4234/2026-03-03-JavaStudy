package com.sist.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 *  CRUD
 *   => add, get, set, remove
 *    - 두 개의 list에서 중복된 데이터 가져오기
 *       => containsAll() => UNION
 *    - retainAll() => 교집합 => INTERSECT
 *    - addAll() => 전체 데이터 => UNIONALL
 *    - subList() => 부분적 복사(중복구매)
 *    - 오라클에서는 JOIN 후 사용
 * 
 * 
 */
public class Collection_2 {
	public static void display(ArrayList list) {
		for(Object obj : list) { // 데이터형이 같거나 큰 데이터형 사용
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // 모든 데이터가 Object
		list.add(3); // 0
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6); // 8
		
		// 데이터 출력
		System.out.println("======= 데이터 출력 =======");
		for(Object obj : list) { // 데이터형이 같거나 큰 데이터형 사용
			System.out.println(obj);
		}
		
		// 일부만 추출
		System.out.println("===== 일부 데이터 출력 =====");
		// 인덱스 번호 1, 2, 3 출력
		ArrayList list2 = new ArrayList(list.subList(1, 4)); // subList(int start, int end)
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(Object obj : list2) { // 데이터형이 같거나 큰 데이터형 사용
			System.out.println(obj);
		}
		
		// 정렬(sort)
		System.out.println("======= 데이터 정렬 =======");
		
		Collections.sort(list);
		display(list);
		
		// 같은 데이터 추출(교집합)
		System.out.println("===== 같은 데이터 추출 =====");
		list.retainAll(list2);
		display(list);
		
		// 전체 복사
		System.out.println("======= 전체 복사 =======");
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		display(list3);
		
		// containAll(교집합, retainAll과 비슷)
		System.out.println("===== containsAll =====");
		list.containsAll(list2);
		display(list);
		
		/*
		 *  subList(int start, int end)
		 *   => start~end-1
		 *   => 페이징 기법
		 *   
		 *  addAll(list) : list에 있는 모든 데이터 복사
		 *  retainAll(list) : 두개의 list의 공통 데이터 추출
		 *   => containsAll(list)  
		 *  Collections.sort() : 정렬
		 *  -----------------------------
		 *  => 표준화
		 *   
		 *   
		 *   pagelist = 10;
		 *   subList(page*pagelist-pagelist, page*pagelist)
		 *   
		 * 
		 * 
		 * 
		 */
		
	}
	
}
