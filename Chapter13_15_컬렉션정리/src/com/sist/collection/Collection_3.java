package com.sist.collection;
/*
 *  - retainAll() : 교집합   => INTERSECT
 *  - addAll()    : 전체집합 => UNION ALL
 *  - removeAll() : 차집합   => MINUS
 * --------------------------
 *  Genie / Melon => 데이터를 크롤링해서 ArrayList 각각 저장
 *  => 교집합, 전체집합, 차집합 응용 
 * 
 * 
 *  컬렉션 프레임워크
 *   - 다수의 데이터를 쉽게 다룰 수 있게 만든 라이브러리
 *                 ---------------> 데이터 관리(추가,읽기,수정,삭제) => 자료구조
 *   - 수집 데이터 관리 명령어
 *      => 메모리 : add, set, remove, get
 *      => 파일 : read, write, delete
 *      => 데이터베이스 : insert, update, select, delete
 *   - 동적 메모리 할당
 *      => 자동으로 크기 조절
 *      => 배열의 고정크기 보완
 *   - 자동 인덱스 번호 부여
 *      => 순서 유지, 빈 공백이 없다 => 메모리 누수가 없다
 *      => 인덱스는 항상 순차적
 *   - List의 주요 메소드
 *      => add(Object o) : 제네릭 타입 선언시 모든 매개변수/리턴형 변경
 *      => get(int index)
 *      => remove(int index)
 *      => isEmpty()
 *      => clear()
 *      => size()
 *     ==========================
 *     데이터 비교 연산(불변x)
 *      => retainAll() : 교집합
 *      => removeAll() : 차집합
 *      => addAll()    : 전체집합(중복허용)
 *     ==============================
 *     Arrays.asList(배열명) => 값을 한번에 저장
 * 
 * 
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class Collection_3 {
	public List<String> genieData() {
		List<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://genie.co.kr/chart/top200").get();
			// 곡명
			Elements title = doc.select("table.list-wrap a.title");
			for(int i=0; i<title.size(); i++) {
				list.add(title.get(i).text());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<String> melonData() {
		List<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0; i<title.size(); i++) {
				list.add(title.get(i).text());
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection_3 co = new Collection_3();
		List<String> genie = co.genieData();
		List<String> melon = co.melonData();
		System.out.println("============= 지니 뮤직 ==============");
		for(int i=0; i<genie.size(); i++) {
			System.out.println((i+1) + ". " + genie.get(i));
		}
		System.out.println("============= 멜론 뮤직 ==============");
		for(int i=0; i<melon.size(); i++) {
			System.out.println((i+1) + ". " + melon.get(i));
		}
		
		// 차집합
		// 지니뮤직에만 있는 노래
//		System.out.println("====== 지니 뮤직에만 있는 노래 목록 ======");
//		genie.removeAll(melon); // 차집합
//		// genie뮤직에서 melon뮤직에 있는 노래 제외
//		// genie 객체 자체 변경
//		for(int i=0; i<genie.size(); i++) {
//			System.out.println((i+1) + ". " + genie.get(i));
//		}
		

		// 멜론뮤직에만 있는 노래
//		System.out.println("====== 멜론 뮤직에만 있는 노래 목록 ======");
//		melon.removeAll(genie);
//		for(int i=0; i<melon.size(); i++) {
//			System.out.println((i+1) + ". " + melon.get(i));
//		}
		

		// 교집합
//		System.out.println("============ 공통 노래 목록 ============");
//		genie.retainAll(melon); // genie에 저장된 데이터 변경
//		System.out.println("공통 곡 개수 : " + genie.size());
//		for(int i=0; i<genie.size(); i++) {
//			System.out.println((i+1) + ". " + genie.get(i));
//		}
		
		
		// 합집합
		List<String> list = new ArrayList<String>();
		System.out.println("============ 전체 노래 목록 ============");
		list.addAll(genie);
		list.addAll(melon);
		for(int i=0; i<list.size(); i++) {
			System.out.println((i+1) + ". " + list.get(i));
		}
		// 중복(교집합) 제거 => Set
		System.out.println("======== 전체 노래 목록(중복 제거) ========");
		Set<String> set = new HashSet<String>();
		set.addAll(genie);
		set.addAll(melon);
		int i=1;
		for(String s : set) {
			System.out.println(i + ". " + s);
			i++;
		}
		
	}

}
