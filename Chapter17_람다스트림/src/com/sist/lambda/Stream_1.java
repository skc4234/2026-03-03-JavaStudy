package com.sist.lambda;

import java.util.Arrays;
import java.util.List;

/*
 *  활용 => 실제 프로젝트 2개
 * 
 * 
 * 
 */

public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 => 짝수면 제곱 출력
		//               ---- -> map
		//         ---- 조건 -> filter 
		List<Integer> list = Arrays.asList(1,2,3,4,5); // == List.of()
		list.stream().filter(data -> data%2==0).map(data->data*data).forEach(System.out::println);
		
		System.out.println("==========================");
		// 문자열을 대문자로 변환 => map
		List<String> names = Arrays.asList("king","scott","clock","dragon","banana");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
					//.map(name->name.toUpperCase()).forEach(name->System.out.println(name));
		System.out.println("======= for문 이용 =======");
		for(String name : names) {
			System.out.println(name.toUpperCase());
		}
	}

}
