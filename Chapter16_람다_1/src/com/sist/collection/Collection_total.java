package com.sist.collection;
/*
 *  1. 목록 출력 => 데이터 수집
 *      1) 표준화
 *      2) 기능에 따라 분리
 *          List      Set      Map
 *           |         |        |
 *       ArrayList  HashSet  HashMap
 *                            ㄴ(Spring, MyBatis)
 *    => 실무
 *        List -> Map (조회 최적화)
 *        List -> Set (중복 제거)
 *        Map+Set (중복없는 그룹핑)
 *        Map => 캐시구조 => 로그파일
 *        
 *    - 순서 우선 (순위: 인기검색어, 노래순위) => List
 *    - 중복 없는 데이터 우선 (장르, 부서, ...) => Set
 *    - 빠른 조회 / 조건문 없이 사용 => Map
 *    - 그룹처리 (채팅: 방개설, 1:1채팅) => Map
 *    - 중복 체크 => Set
 * 
 *  2. Iterator / ***ListIterator
 *      단방향      양방향
 *      
 *     - Iterator
 *        - 컬렉션의 데이터를 순차적으로 접근하기 위한 인터페이스
 *        - 주요 메소드
 *           - hasNext() : while문으로 데이터가 존재할때까지 수행
 *           - next() : 실제 데이터 읽기
 *           - remove() : 삭제
 *        - 단방향 처리 : 위 => 아래
 *        - List / Set 에서 주로 사용
 *        - 목적 : 컬렉션을 안정적으로 사용하기 위해서
 *        - 복잡한 크롤링이 있는 경우 한번에 데이터 모아서 처리
 *  
 *  
 */
import java.util.*;
public class Collection_total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>(List.of("홍길동","심청이","김문수","강감찬","손흥민"));
		// 한번에 모아서 출력
		Iterator<String> it = names.iterator();
		// 출력
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		//it = names.iterator()
		// 한번 가지고 오면 재사용 불가능
		//  => 불필요한 데이터를 삭제 => 안정성이 있다
//		while(it.hasNext()) {
//			String name = it.next();
//			System.out.println(name);
//		}
		System.out.println("===================");
		for(String name : names) {
			names.remove(name);
		}
//		for(String name : names) {
//			System.out.println(name);
//		}
	
	}

}
