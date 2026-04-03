package com.sist.collection;
/*
 *  제네릭
 *   - 코드 재사용 / 타입 안정성을 위한 도구
 *   - 형식 : 클래스/메소드<클래스 타입>
 *   1. 제네릭을 사용하는 이유
 *      ArrayList list = new ArrayList();
 *      ---------------> 모든 데이터 저장(Object)
 *      list.add("Java");
 *      list.add(10)
 *      
 *      => String str = list.get(0); // 오류 발생
 *         - get() 메소드는 리턴형이 Object => 형변환 필요
 *         - String str = (String)list.get(0);
 *      => int a = list.get(1); // 오류 발생
 *         - 형변환 => (Integer)list.get(1);
 * 	    ==> 어떤 데이터형이 들어올지 알 수 없음
 *          데이터 읽기마다 형변환 필요
 *          ClassCastException 발생 가능성
 *   2. 프로그램에서는 데이터형을 반드시 고정
 *      => 프로그램 언어는 가능 => 자바스크립트는 데이터형 구분x
 *         ----------- 코틀린 제외(var, val)
 *   3. 불필요한 형변환 자제
 *       => 데이터형을 한가지만 설정 => 가독성이 좋다
 *       => 컴파일 시 오류 방지
 *       => 형변환 없이 사용 => 소스가 간결해짐
 *       
 *  class Box<T> {
 *  	T t;
 *  	public void setT(T t) {
 *  		this.t = t;
 *  	}
 *  	public T getT() {
 *  		return t;
 *  	}
 *  }
 *  
 *  Box box = new Box(); => T는 자동으로 Object
 *  box.setT(...);
 *  
 *  Box<String> box = new Box<String>(); => T는 String
 *   => 클래스에 있는 데이터를 한번에 통일화
 *   
 *  class Pair<K,V> {
 *  	K key;
 *  	V value;
 *  }
 *  
 *  Pair<String, Integer> p = new Pair<String, Integer>(); => K는 String, V는 Integer
 *   => 먼저 만들어놓고 나중에 데이터형을 변경해서 사용
 *   
 *  => 제네릭을 사용하지 않으면 알림(경고)
 *  
 *   4. 제한된 제네릭
 *      class Box<T extends Number> { // Number 클래스형만 사용
 *      	T value;
 *      }
 *      Box<Integer> box;
 *         <Double>
 *         <Float>
 *         ...
 *         <String> => 오류
 *   5. 데이터형을 모르는 경우 => 와일드카드(?)
 *      제네릭 안붙인 List와 같지만 경고를 지워줌
 *      ArrayList list (x)
 *      ArrayList<?> list (o)
 *      => Class<?> 등 사용
 *      => 읽기 전용
 *   
 *    |- extends => 제한된 제네릭     => 꺼내기 전용
 *    |- ?       => 타입을 모르는 경우 => only 읽기
 *    --------> 자바 제공 라이브러리에서 사용
 *   
 *   - List.of(값...) => 값을 한번에 add 할 수 있다
 * 
 *        **출력 : <?>
		  **계산 : extends
		  추가 : super
 */
import java.util.*;

public class Collection_2 {
	public static void print(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	/*               Number
	 *                  |
	 *    ------------------------------
	 *    |        |      |     |      |
	 * Integer  Double  Float  Long  Byte
	 */
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for(Number obj : list) {
			sum += obj.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		print(List.of("A","B","C"));
		print(List.of(1,2,3));
		// 어떤 데이터형이든 관계없다
		// 읽기만 가능 => 출력용
		// add() 불가능
		System.out.println(sum(List.of(1,34,5,24,1,5,2,54)));
		System.out.println(sum(List.of(1,2,3,4,5,6,7,8,9)));
		System.out.println(sum(List.of(1,2.5,3,5.3,64.2,56L,34.1)));
		
	}

}
