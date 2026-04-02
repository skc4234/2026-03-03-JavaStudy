package com.sist.collection;
/*
 *  1. 컬렉션이란?
 *      => 데이터(값)를 담아두는 상자(메모리)들을 모은 클래스
 *      ex) 친구 이름 / 전화 번호 / 맛집 정보
 *      - 쉽게 관리하게 만들어준 것 => 컬렉션 프레임워크
 *      - 컬렉션 프레임워크 장점
 *         => 표준화(통일화) => 기본 틀
 *  2. 사용 이유
 *      - 배열의 단점
 *         1) 배열 크기 고정 => 늘리거나 줄이는게 어려움
 *         2) 고정적이다 => 목록 출력은 쉽지만 검색이 어렵다
 *         3) 기능 부족 => 정렬/검색 같은 기능이 없다 => 직접 구현
 *         => 배열의 단점 보완 => 컬렉션
 *          1) 크기 자동 조절
 *          2) 정렬/검색 기능 추가
 *          3) 모든 개발자가 동일하게 사용 => 표준화
 *  3. 컬렉션 종류
 *      - Collection(Interface)
 *             |
 *             |
 *    ----------------------- 구현된 클래스
 *    |          |          |
 *  List        Set        Map
 *    |          |          |
 *    |      ---------      ------------
 *    |      |       |         |       |
 *    |   HashSet TreeSet  Hashtable HashMap
 *    |
 *    ---------------------
 *      |        |        |
 * **ArrayList Vector LinkedList => Queue
 *  
 *  => 기준점에 따라 사용되는 컬렉션이 다름
 *      - List
 *         => 순서가 있다(추가할때마다 자동 인덱스 번호 부여)
 *         => 데이터 중복 허용
 *         => ArrayList
 *      - Set
 *         => 순서가 없다
 *         => 데이터 중복 불가
 *         => HashSet
 *         => 오라클에서는 DISTINCT : 중복 불가 => 영화등록 시 장르
 *      - Map
 *         => 목차
 *         => 키, 값 - 동시에 저장
 *         => HashMap
 *         => 클래스 관리, SQL
 *         => Spring, MyBatis
 *  ------------------------------------
 *          순서     중복       예시 
 *  -----------------------------------
 *  List   순서 O    중복 O    목록/전화번호
 *  -------------------------------------
 *  Set    순서 X    중복 X    로또번호/수험번호
 *  -----------------------------------
 *  Map  Key-Value  Key는 중복불가, Set은 중복가능 
 *  -----------------------------------------
 *  => 데이터 관리가 편하다
 *     => React / Vue => 증권
 *  
 *  - List
 *     => 순차적으로 데이터를 저장할 때
 *     => 인덱스를 통한 접근이 필요한 경우
 *     => 예약 / 장바구니
 *     => 구현된 클래스
 *         - ArrayList : 데이터베이스(웹 핵심)
 *            => 비동기
 *         - Vector : 네트워크 => 접속자 관리
 *            => 동기화
 *         - LinkedList : 파일관리 => C언어
 *         
 *  ----------------------------------------------
 *  ArrayList
 *   => 배열 기반 / 검색 속도가 빠름
 *   => 순차적 저장
 *   => 추가/삭제 시 속도가 느리다
 *  ----------------------------------------------
 *  LinkedList
 *   => 노드 기반 / 속도가 빠르다
 *   => 파일 기반 / 접근 속도가 느리다
 *   => 추가/수정이 많은 경우에 사용
 *  ----------------------------------------------
 *  Vector
 *   => 동기화: 멀티쓰레드(네트워크, 게임)
 *   Vector를 보완 => ArrayList
 *  ----------------------------------------------
 *  
 *  회원 관리 시스템
 *   - 회원 ID 저장  => Set
 *   - 회원 정보 저장 => Map
 *  게시판
 *   - 목록 => ArrayList
 *   - 댓글 순서 관리 => LinkedList
 *  검색엔진
 *   - HashSet
 *  랭크 시스템
 *   - TreeSet => 자동정렬
 *      순서를 가지고 있다=ㅣ
        메모리 상에 저장 => CRUD
        비동기적 => 데이터베이스 연결 => 최적화
        주요 기능
         - 추가 : add(데이터) => 맨 뒤에 추가
                 add(int index, 데이터) => 지정된 위치에 추가
                 0 1 2 3 4
                     |
                 0 1 2 5 3 4  => 항상 순차적 => for
         - 삭제 : remove(int index)
                 0 1 2 3 4 5
                      |
                 2 3 4 
 *       - 수정 : set(int index, 데이터)
 *       - 읽기 : get(int index)
 *       - 갯수 : size()
 *       - 전체 작제 : clear()
 *       - 데이터 존재 여부 : isEmpty() => List
 *       
 *        주 사용처
 *         => 오라클 데이터를 읽어서 브라우저에 전송
 *         => 쿠키를 읽어서 브라우저에 전송
 * 
 */
import java.util.*;


public class Collection_1 {
	public static void display(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ". " + list.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장공간 만들기
		ArrayList list = new ArrayList();
		
		// 추가
		list.add("홍길동"); // 0
		list.add("심청이"); // 1
		list.add("박문수"); // 2
		list.add("춘향이"); // 3
		list.add("이순신"); // 4
		
		// 저장된 데이터 출력
//		for(Object name : list) {
//			System.out.println(name);
//		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ". " + list.get(i));
		}
		
		// 저장
		System.out.println("====== 지정된 위치에 저장 ======");
		list.add(2, "김두한");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ". " + list.get(i));
		}
		
		// 삭제
		System.out.println("====== 지정된 위치값 삭제 ======");
		list.remove(3);
		display(list);
		
		// 수정
		System.out.println("====== 지정된 위치값 수정 ======");
		list.set(2, "강감찬");
		display(list);
		
		// 데이터 갯수 출력
		System.out.println("===========================");
		System.out.println("현재 인원 : " + list.size());
		
		// 전체 인원 삭제
		list.clear();
		System.out.println("현재 인원 : " + list.size());
		
		// 데이터 존재 여부
		if(list.isEmpty()) {
			System.out.println("현재 저장된 데이터가 없습니다");
		}
		else {
			System.out.println("저장된 데이터가 있습니다");
		}
	}
	
	

}
