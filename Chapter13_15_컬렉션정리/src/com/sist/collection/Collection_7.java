package com.sist.collection;
/*
 *  TreeSet
 *   - 자주 안나옴
 *   - 검색 속도가 빠르다 => 코딩테스트
 *   - 정렬된 데이터 집합
 * 
 *   - 주요 메소드
 *      - tailSet() : 같거나 이상인 값 출력
 *      - headSet() : 같거나 이하인 값 출력
 *         => 자음으로 검색
 */
import java.util.*;
public class Collection_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			int k = r.nextInt(10000)+1; // 0~99 => 1~100
			set.add(k); // 오토박싱 Integer i =10;
			//System.out.println((i+1) + ". " + k);
		}
		System.out.println("실제 저장된 데이터 개수 : " + set.size());
		System.out.println("====== Set에 저장된 데이터 ======");
		for(Integer i : set) {
			System.out.print(i + " ");
		}
		
		// TreeSet에 저장
		System.out.println("\n\n======= TreeSet에 저장 =======");
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(set);
		for(Integer i : set2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("====== 50 이상인 숫자 찾기 ======");
		for(Integer i : set2) {
			if(i>=50) System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(set2.tailSet(50));

		System.out.println("\n====== 50 이하인 숫자 찾기 ======");
		System.out.println(set2.headSet(50));
		

		System.out.println("\n========= 바로 위에 값 =========");
		System.out.println(set2.higher(30));
		

		System.out.println("\n========= 같거나 큰 값 =========");
		System.out.println(set2.ceiling(60));
		

		System.out.println("\n========= 바로 아래 값 =========");
		System.out.println(set2.lower(60));
		

		System.out.println("\n========= 같거나 작은 값 =========");
		System.out.println(set2.floor(20));
		

		System.out.println("\n======= 첫 값과 마지막 값 =======");
		System.out.println(set2.first());
		System.out.println(set2.last());
		

		System.out.println(set2.headSet(33));
		System.out.println(set2.headSet(100));
	}

}
