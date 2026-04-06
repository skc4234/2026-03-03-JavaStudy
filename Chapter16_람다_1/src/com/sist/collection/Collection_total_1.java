package com.sist.collection;
import java.util.*;
public class Collection_total_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순서가 없음 => 어떤 데이터가 먼저 출력될지 모름 => for-each보다 Iterator 사용 권장
		// => 네트워크 / Cookie
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
//		for(int i=0; i<1000; i++) {
//			int r = (int)(new Random().nextInt(100));
//			set.add(String.valueOf(r));
//		}
		
		// for-each만 사용 가능
		//  => Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for(String s : set) {
//			System.out.println(s);
//		}
	}

}
