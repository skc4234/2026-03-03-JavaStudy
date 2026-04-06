package com.sist.lambda;
/*
 *  - 많이 사용되는 함수형 인터페이스
 *   - Function<T,R> : T -> R리턴
 *      => Function<Integer, Integer> f = (x)->x*2;
 *   - Consumer<T> : 입력만 받고 반환 없음
 *   - Supplier<T> : 반환만 있는 상태
 *   - Predicate<T> : 조건 검사 => true/false 반환
 *      => Predicate<Integer> p = (x) -> x>10;
 *  ==============================================
 *  - 스트림(Stream)
 *     => 데이터를 함수형 방식으로 처리하는  API
 *        ------> List / Set
 *     - 컬렉션.stream() : 컬렉션에 있는 모든 데이터를 읽어온다
 *            .중간연산() : filter(), map(), sort()
 *            .최종연산() : forEach(), collect(), count()
 *            
 *  - 사용법
 *     List<Integer> list = ArrayList<Integer>(List.of(1,2,3,4,5));
 *     list.stream()
 *         .filter(x->x%2=0)
 *         .forEach(System.out.println(x));
 *         .forEach(System.out::println);  // 외부의 메소드 참조
 * 
 *         .map(x->x*2) // 변환
 *         
 *  - 람다 ====> 함수형 인터페이스 ====> 스트림 ====> 데이터 처리
 *  함수처럼 사용   람다의 타입           람다를 활용한 데이터 처리 도구
 * 
 */
import java.util.*;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
@Getter
@Setter
class Food {
	private int no;
	private String name;
	private String type;
	private String phone;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
}

class FoodManager {
	// 맛집 전체 데이터는 공유 => static
	// 오라클은 전부 static 데이터
	public static List<Food> fList = new ArrayList<Food>();
	// 메모리 할당 없이 초기화
	// 정적 변수 = static 블록에서 초기화
	// 인스턴스 변수 = 생성자에서 초기화
	// 사용자 정의 데이터형 => 한 개에 대한 정보 묶음 - ex) 학생정보, 식당정보
	// DTO              => 데이터를 모아서 한번에 브라우저에 전송
	
	static {
		try {
			FileReader fr = new FileReader("c:\\javadv\\food.txt");
			// 한 줄씩 읽는 클래스 => BufferedReader(기본)
			//StringBuilder sb = new StringBuilder();
			StringBuffer sb = new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] data = sb.toString().split("\n");
			for(String s : data) {
				StringTokenizer st = new StringTokenizer(s, "|");
				Food f = new Food();
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				fList.add(f);
				//System.out.println(f.getNo() + ". " + f.getName());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}




public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodManager fm = new FoodManager();
//		double sum = 0.0;
//		int len = fm.fList.size();
//		for(Food f : fm.fList) {
//			sum+=f.getScore();
//		}
//		
//		System.out.printf("전체 평점 평균 : %.2f\n", (sum/len));
		double avg = fm.fList.stream().collect(Collectors.averagingDouble(f->f.getScore()));
		System.out.printf("전체 평점 평균 : %.2f\n", avg);
		
	}

}
