package com.sist.collection;
/*
 *  실제 사용
 *   - ArrayList로 관리하지만 중복 제거 필요시 Set을 이용해서 제거 후 다시 ArrayList로 제어
 *   - 오라클에서 중복제거 => DISTINCT
 *   - 장바구니 / 웹 채팅 => Set으로 저장하고 중복은 제거
 *   - 네트워크 프로그래밍 => Vector => Set으로 중복 제거
 * 
 */
import java.util.*;
public class Collection_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {
				"홍길동", "심청이", "춘향이", "박문수","강감찬","을지문덕",
				"이순신","강감찬","김두한","이이","홍길동","심청이","김김"
		};
		// 제어 => ArrayList
		List<String> list = Arrays.asList(names);
	
		System.out.println("==== 전체 사원 목록 출력 ====");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1) + ". " + list.get(i));
			
		}
		// 중복 제거
		Set<String> set = new HashSet<String>();
		set.addAll(list); // ArrayList를 Set에 저장 => 호환성 높음
		System.out.println("==== 중복 제거한 사원 목록 ====");
		int k=1;
		for(String name : set) {
			System.out.println(k + ". " + name);
			k++;
		}
		// 중복 제거 후 ArrayList로 다시 전송 => 인덱스로 제어
		System.out.println("==== 중복 제거 후 리스트로 전송 ====");
		List<String> list2 = new ArrayList<String>();
		list2.addAll(set);
		for(int i=0;i<list2.size();i++) {
			System.out.println((i+1) + ". " + list2.get(i));
			
		}
	}

}
