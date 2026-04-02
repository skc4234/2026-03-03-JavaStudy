package com.sist.apply;
import java.util.*;
import java.io.*;
// 출력 - 윈도우 / 브라우저
public class FoodSystem {
	// <> : 데이터형을 변경 => 형변환 문제 해결
	// 데이터형을 모르는 경우 <?>
	// 컬렉션에서 데이터형의 안정성을 가지고 있다
	// => 컴파일 시 변경
	// 컬렉션 / 함수형 인터페이스(람다) 에서 사용
	// 클래스에 있는 모든 데이터형을 통일
	// Object => 모든 데이터 가능 => 프로그램이 불안정하다
	private static ArrayList<Food> fList = new ArrayList<Food>();
	static {
		try {
			FileReader fr = new FileReader("c:\\javadv\\food.txt");
			int i=0 ;
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())!=-1) { // 파일에 있는 전체 문자열 저장
				sb.append((char)i); 
			}
			fr.close();
			String[] datas = sb.toString().split("\n");
			
			for(String food : datas) {
				Food f = new Food();
				StringTokenizer st = new StringTokenizer(food, "|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster("https://www.menupan.com" + st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 1. 목록 출력(페이징 기법 - subList)
	public ArrayList<Food> food_list(int page) {
		final int ROWSIZE = 12;
		int start = (page*ROWSIZE)-ROWSIZE;
		int end = page*ROWSIZE;
		ArrayList<Food> list = new ArrayList<Food>(fList.subList(start, end));
		
		
		return list;
	}
	
	public int FoodTotalPage() {
		return (int)(Math.ceil(fList.size()/12.0));
	}
	
	// 2. 상세 보기
	public Food food_detail(int no) {
		
		return fList.get(no-1);
	}
	
	// 3. 검색
	public ArrayList<Food> food_find(String address) {
		ArrayList<Food> list = new ArrayList<Food>();
		for(Food f : fList) {
			if(f.getAddress().contains(address)) {
				list.add(f);
			}
		}
		
		
		return list;
	}
	
	// 4. 
	
}
