package com.sist.collection;
/*
 *  웹
 *   => 처음부터 예외처리 까지 문법은 기본 사항
 *   => 라이브러리
 *       - java.lang.* : Object - toString
 *                     : ****String
 *                     : StringBuffer - append
 *                     : Math - ceil()
 *                     : Wrapper - Integer(parseInt), Double(parseDouble), Boolean(parseBoolean)
 *       - java.util.* : StringTokenizer - counterTokens, hasMoreTokens, nextToken
 *                     : Random - nextInt()
 *                     : Date, Calendar - set, get
 *                     : SimpleDateFormat - 날짜 형식 변환
 *                     : DecimalFormat - 숫자 형식 변환 => toLacaleString() : 자바스크립트
 *                     : **Collection
 *                          => List - add, get, size, isEmpty, clear
 *                          => Set - add, remove, isEmpty
 *                          => Map - put, get
 *        => 9,12,13,15장 정리
 * 
 */
import java.util.*;
public class Collection_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
//		set.add("apple");
//		set.add("orange");
//		set.add("kiwi");
//		set.add("banana");
//		set.add("apple");
//		set.add("watermelon");
//		set.add("melon");
//		set.add("papaya");
//		set.add("grape");
//		System.out.println(set.ceiling("blue"));
//		System.out.println(set.floor("red"));
		set.add("박문수");
		set.add("홍길동");
		set.add("심청이");
		set.add("강감찬");
		set.add("이성계");
		set.add("장나라");
		set.add("김두한");
		set.add("신사임당");
		// AI에서 근사치를 찾아서 문장을 만듦
		for(String name : set) {
			System.out.println(name);
		}
		System.out.println("============================");

		System.out.println(set.ceiling("박진수"));
		System.out.println(set.floor("최홍석"));
		
		/*
		 *  ceiling : 같거나 큰값 하나
		 *  floor   : 같거나 작은 값 하나
		 * 
		 */
	}

}
