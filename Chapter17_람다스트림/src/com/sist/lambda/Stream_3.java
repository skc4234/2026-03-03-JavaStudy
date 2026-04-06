package com.sist.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

// 회원+주문 => 관리자 통계
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User {
	private String name;
	private int age;
	
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Order {
	private String userName;
	private int price;
	
}
public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> uList = Arrays.asList(
				new User("홍길동", 25),
				new User("이순신", 34),
				new User("심청이", 15),
				new User("박문수", 47),
				new User("김두한", 30)
		);
		List<Order> orders = Arrays.asList(
				new Order("홍길동", 20000),
				new Order("이순신", 30000),
				new Order("심청이", 15000),
				new Order("박문수", 40000),
				new Order("김두한", 25000),
				new Order("이순신", 36000),
				new Order("심청이", 23000),
				new Order("박문수", 15000),
				new Order("김두한", 23000),
				new Order("홍길동", 14000),
				new Order("이순신", 33000)
		);
		
		// 1. 성인 회원만 출력
		System.out.println("========== 성인 회원 ==========");
		List<User> adults = uList.stream().filter(user->user.getAge()>=20).collect(Collectors.toList());
		// List에 조건에 맞는 회원만 담아준다
		adults.stream().forEach(user->System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge()));
		
		System.out.println("======= 회원 이름만 추출 ========");
		List<String> names = uList.stream().map(User::getName).collect(Collectors.toList());
		names.stream().forEach(System.out::println);
		
		
		System.out.println("===== 특정 회원의 주문만 조회 =====");
		DecimalFormat df = new DecimalFormat("#,###,###");
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String n = scan.next();
		
		List<Order> kims = orders.stream().filter(o->o.getUserName().contains(n)).collect(Collectors.toList());
		kims.stream().forEach(u->System.out.println(u.getUserName() + " : " + df.format(u.getPrice())+"원"));
	
		// reduce : 통계(매출)
		System.out.println("======= 총 주문 금액 계산 =======");
		int total = orders.stream().map(Order::getPrice) // 처리할 데이터
									.reduce(0, Integer::sum);
		
		System.out.println("총 금액 : " + df.format(total)+"원");
	
		// 사용자 별로 통계
		System.out.println("========= 사용자별 통계 =========");
		int hong = 0, kim=0,lee=0,shim=0,park=0;
		for(Order o : orders) {
			if(o.getUserName().equals("홍길동")) hong+=o.getPrice();
			else if(o.getUserName().equals("이순신")) lee+=o.getPrice();
			else if(o.getUserName().equals("심청이")) shim+=o.getPrice();
			else if(o.getUserName().equals("박문수")) park+=o.getPrice();
			else if(o.getUserName().equals("김두한")) kim+=o.getPrice();
		}
		System.out.println("홍길동 : " + df.format(hong) + "원");
		System.out.println("이순신 : " + df.format(lee) + "원");
		System.out.println("심청이 : " + df.format(shim) + "원");
		System.out.println("박문수 : " + df.format(park) + "원");
		System.out.println("김두한 : " + df.format(kim) + "원");
		
		// *******************************
		// 사용자별 통계 람다 사용 버전
		System.out.println("======= stream() 람다 사용 =======");
		// Collectors.groupingBy + summingInt => 실무에서 많이 등장
		Map<String, Integer> result = orders.stream().collect(Collectors.groupingBy(Order::getUserName, Collectors.summingInt(Order::getPrice)));
		//System.out.println("홍길동 : " + df.format(result.get("홍길동"))+ "원");
		
		// ********************
		// Map에 있는 key를 전부 가져온다
		// 값 모음 : values()
		// 키+값 : entrySet()
		// 웹 소켓
		Set<String> set = result.keySet();
		for(String s : set) {
			System.out.println(s + " : " + df.format(result.get(s)) + "원");
		}
		
		System.out.println("====== 가장 많이 주문한 사람 ======");
		Optional<Order> maxOrder = orders.stream().max(Comparator.comparing(Order::getPrice));
		System.out.println("maxOrder : " + maxOrder);
		
		System.out.println("");
	}

}
