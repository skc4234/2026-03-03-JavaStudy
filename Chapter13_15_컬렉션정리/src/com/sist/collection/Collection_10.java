package com.sist.collection;
/*
 *  Map
 *   => Iterator : 단방향
 *   => ListIterator : 양방향
 *    ------------------------> for-each 대신 사용
 *    
 *  - 메소드 정리
 *     1. 데이터 추가/수정
 *        => put(key, value)
 *        => key가 같으면 덮어쓴다(수정)
 *        
 *     2. 값 읽기
 *        => get(key)
 *     3. 삭제
 *        => remove(key)
 *        => Set은 remove(실제 데이터), List는 remove(인덱스 번호)
 *     4. 키 존재 여부
 *        => boolean containsKey(key)
 *        => if문에서 주로 사용
 *     5. 값 존재 여부
 *        => boolean containsValue(값)
 *     6. 전체 삭제
 *        => clear()
 *     7. 키 전체만 가져오기
 *        => keySet()
 *     8. 값 전체 읽기
 *        => values()
 *     9. key+value 동시에 가져오기
 *        => entrySet()
 * 
 * 
 *   => HashMap 주로 사용
 *       - 키(key) : 중복 x
 *       - 값(value) : 중복 가능
 *       - 순서 유지 x
 * 
 */
import java.util.*;
public class Collection_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		// key=String, value=Integer
		// 1. 값 대입 => put(key, value)
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("포도", 300);
		
		// 2. 값 읽기 => get(key)
		System.out.println("사과 개수 : " + map.get("사과"));
		System.out.println("바나나 개수 : " + map.get("바나나"));
		System.out.println("포도 개수 : " + map.get("포도"));
		
		// 3. 전체 출력
		System.out.println("전체 데이터 : " + map);
		
		// 4. Key 존재 여부 => boolean containsKey(key)
		if(map.containsKey("바나나")) {
			System.out.println("바나나 있음");
		}
		else {
			System.out.println("바나나 없음");
		}
		
		// 5. 값 수정
		map.put("사과", 1000); // Key가 같으면 덮어쓴다 => 수정
		// Key는 중복할 수 없다
		System.out.println(map);

		// 6. 삭제 remove(key)
		map.remove("바나나");
		System.out.println(map);
		
		// 7. 반복문 사용해서 데이터 출력
		// key 전체 읽어오기 => keySet()
		for(String key : map.keySet()) {
			System.out.println(key + "=" +map.get(key));
		}
		
		// 8. 값 전체 가져오기
		for(int i : map.values()) {
			System.out.println(i);
		}
		
		// 9. key+value 값 전체 가져오기
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
	}
	

}
