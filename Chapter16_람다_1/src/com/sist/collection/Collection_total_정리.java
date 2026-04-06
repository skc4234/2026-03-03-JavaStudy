package com.sist.collection;
/*
 *                     Collection => 데이터 모음 => 관리하기 쉽게 만든 라이브러리(표준화)
 *                          |
 *         -------------------------------------------Iterator / ListIterator
 *         |                |                 |
 *       List              Set               Map
 *         |                |                 |
 *     ---------        ---------        ----------
 *     |       |        |       |        |        | 
 * ArrayList Vector  HashSet TreeSet  HashMap HashTable
 * 
 * - ArrayList : 데이터베이스 연동
 * - Vector : 네트워크 저장
 * - HashSet, TreeSet : 쿠키, 세션
 * - HashMap : 웹에서 주로 사용 => 라이브러리 / Spring, MyBatis 
 *  
 *  => 주요 메소드(웹)
 *      - List : add() / size() / get() / isEmpty() => for-each
 *      - Set : add() / size() / isEmpty() => 출력 X, 중복제거
 *      - Map : put() / size() / get() / isEmpty()
 *      
 *      - Iterator : hasNext() / next() => 출력 전용
 *      - ListIterator : hasNext()/next() => List 전용 출력
 *    => 반드시 제네릭을 이용해서 데이터형을 통일
 *       <클래스형> : 기본 데이터형은 Wrapper 클래스 사용
 * 
 */
import java.util.*;
public class Collection_total_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
