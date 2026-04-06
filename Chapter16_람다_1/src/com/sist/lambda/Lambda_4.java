package com.sist.lambda;
/*
 *  - stream() : 내부 반복자 => 전체 데이터 수집
 *  - filter() : 조건 검색 => 데이터 추출
 *  - forEach() : 반복 출력(추출된 데이터 출력)
 *  - sort, min, max, sum, avg, ...
 * 
 * 
 * 
 */
/*
 * 1|
 * 아름드리카페|
 * 카페/주점-카페|
 * (070) 8872-4418|
 * 강원 동해시 평릉동 487-1|
 * 0.0|
 * 10대, 주차방법: 무료, 주차장소: 업소앞|
 * /restaurant/restimg/002/zzmenuimg/d20034222_z.jpg|
 * 10:30 ~ 22:00|
 * 펜션과 함께 운영하고 있는 아름드리 커피숍을 소개한다. 깔끔하고 넓은 매장 내부는 탁 트인 주변 경치도 구경할 수 있게 되어 있어서 좋은 곳이다. 비영리 봉사단체에서 운영하는 곳으로 여러 사람들의 정성을 모아 이웃들에게 함께 나누는 착한 카페이다. 예쁜 그릇에 담긴 팥빙수와 진한 향의 페퍼민트, 그리고 너무 예쁜 카페라떼까지 분위기 좋은 곳에서 함께 즐기기 좋은 카페이다.|
 * 일상데이트 , 더운날 , 야외테라스 , 포장 가능|
 * 5,000원미만
 */

import java.util.*;

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
public class Lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodManager fm = new FoodManager();
		fm.fList.forEach(f->System.out.println(f.getNo() + ". " + f.getName() + " " + f.getScore()));
		System.out.println("=========== for =============");
		for(Food f : fm.fList) { // stream()
			if(f.getScore() >= 4.0) { // filter()
				System.out.println(f.getNo() + ". " + f.getName() + " " + f.getScore()); // forEach()
			}
		}
		System.out.println("=========== filter ============");
		fm.fList.stream().filter(f->f.getScore()>=4.0).forEach(f->System.out.println(f.getNo() + ". " + f.getName() + " " + f.getScore()));
		System.out.println("================ 정렬 ================");
		System.out.println("=========== 가격 기준 별 정렬 ===========");
		System.out.println("=========== 카테고리별 그룹핑 ===========");
		System.out.println("============ 평점별 그룹핑 ============");
	}

}
