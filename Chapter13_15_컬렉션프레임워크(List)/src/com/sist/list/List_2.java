package com.sist.list;
/*
 *  ArrayList / Vector / LinkedList
 *   => 데이터 저장 공간 : 효율적으로 사용할 수 있게 만든 자료구조
 *   => 프레임워크(표준화) : 모든 개발자가 동일
 *   => 라이브러리 : 변수x, 메소드 사용
 *   - 메소드
 *      1) add(Object o)
 *            -----------> 제네릭 <클래스형> => 데이터형 통일
 *      2) set() / remove() => 자주 사용 x
 *      3) get() => 데이터 읽기(Read)
 *      4) isEmpty() => 비어있는지 확인
 *      5) clear() => 전체 삭제 - ex) 장바구니
 *      6) size() => 데이터 총 개수
 *     ----------------------------
 *     - subList(start, end) : 인덱스 번호 start부터 end-1만큼의 데이터 저장
 *     - retainAll() : 교집합
 *     - addAll() : 전체 데이터
 *     
 *     List====Set    Map(Key, Value)
 *       |      |
 *       ========
 *          |
 *         호환
 * 
 * 
 */
import java.util.*;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"aaa","eee", "DSf","aaa", "eee", "abnb", "wef"};
		  List<String> list = Arrays.asList(arr);
		Set<String> set = new HashSet<String>(list); // List타입 호환 가능
		for(String s : set) {
			System.out.println(s);
		}
	}

}
