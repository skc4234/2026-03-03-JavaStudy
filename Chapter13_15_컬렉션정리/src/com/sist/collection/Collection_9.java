package com.sist.collection;
/*
 *        Map
 *         |
 *     ----------
 *     |        |
 *  HashMap HashTable    <= 구현된 클래스
 *            동기 => 신뢰성 낮음 => HashTable의 단점 보완 => HashMap
 *  - HashMap 
 *     => 비동기 방식
 *     
 *  - 특징
 *     두개를 동시에 저장(Key, Value)
 *     key를 가지고 value를 가져온다
 *     key는 중복불가지만 value는 중복 가능
 *     => 응용 : Spring, MyBatis, 웹 라이브러리, Session, Cookie, Request, Response
 *                 |      ㄴ형식(id, "SQL 문장")
 *          형식(id, 클래스 주소)
 *  - 사용처 : 클래스 관리
 *           메모리 할당 후 관리
 *    map.put("a", new A())
 *          ---------------> 한번만 메모리 할당(싱글턴, SingleTone)
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
class AA {
	public void dispaly() {
		System.out.println("A:display() call...");
	}
}
public class Collection_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, AA> map  = new HashMap<String, AA>();
		map.put("aa", new AA());
		

		AA a = new AA();
		AA b = new AA();
		AA c = new AA();

		System.out.println("a="+a);
		System.out.println("b="+a);
		System.out.println("c="+a);
	 
	}

}
