package com.sist.collection;
/*
 *       Hash
 *         |
 *     ---------
 *     |       |
 *  HashSet TreeSet
 *  
 *  특징
 *   - 중복 허용 x
 *   - 순서가 존재하지 않는다
 *   - 추가/삭제가 빠르지만 검색은 느리다
 *   - 장르 / 카테고리 / 부서명 / 근무지
 *   - 웹에서는 사용빈도가 거의 없다 => 오라클이 대부분의 기능을 할 수 있기 때문
 * 
 *  사용법
 *   Set<> set = new HashSet()
 *             = new TreeSet()
 * 
 *  메소드
 *   - add() : 데이터 추가
 *   - remove() : 데이터 삭제
 *   - clear() : 데이터 전체 삭제
 *   - 데이터를 한번에 모아서 관리 => ***iterator()
 * 
 * 
 */
// 중복 제거
import java.util.*;


public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		// 중복 없는 데이터를 저장하는 공간 생성
		// 값 추가
		set.add("사과");
		set.add("바나나");
		set.add("참외");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("파인애플");
		set.add("딸기");
		set.add("바나나");
		
		System.out.println("======== 과일 종류 ========");
		// 인덱스를 사용하지 않음 => for-each 사용
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("과일 개수 : " + set.size());
		System.out.println("======== 과일 제거 ========");
		set.remove("배");
		
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("과일 개수 : " + set.size());
		
	}

}
