package com.sist.manager;
// 백엔드
import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;
public class FoodManager implements Manager {
	// 맛집 데이터 저장
	public static FoodVO[] foods = new FoodVO[452];
	/*
	 *  1. 데이터형
	 *  	- 기본형
	 *  	   => 정수(int) 등
	 * 		- 참조형 
	 * 		   => Class, 배열 => 주소를 이용한 방식
	 *           --------
	 *           자바 라이브러리 클래스 / 사용자 정의 클래스
	 *         클래스 1개는 한 개의 맛집에 대한 정보를 가지고 있다
	 *  2. 데이터 공유
	 *      => 모든 사용자가 같은 데이터를 사용 => 공유변수(static)
	 *                                    오라클 DB => static (공유된 데이터)
	 *  3. 모든 클래스에서 접근 가능 => public
	 *     모든 변수는 private이 아니다 => 선택적
	 *  4. 초기화 => 값을 저장
	 *      1) 명시적 초기화
	 *      2) 초기화 블럭
	 *          - 인스턴스 블럭      {}
	 *          - *static 블럭    static {}
	 *          - *생성자
	 *             => 클래스 {}은 선언만 가능하기 때문에 초기화 블럭이나 생성자에서 초기화해야 한다
	 *             => 초기화 블록은 상속 예외이다
	 */
	
	// 초기화 => 배열에 값 저장
	static {
		// 구현=>초기화 가능=>자동 호출
		// 파일 읽기 => IOException(ChekcedException) => 반드시 예외 처리
		// 초기화 블록/생성자는 throws 사용 불가 => 메소드에만
		try {
			// 문자열을 모을 수 있는 임시 저장소
			// 문자열 결합 속도 높음 => 최적화
			StringBuffer sb = new StringBuffer();
			int i=0;
			FileReader in = new FileReader("c:\\javadv\\food.txt");
			while((i=in.read())!=-1) { // -1은 EOF
				sb.append((char)i);
				// int read() => 리턴형이 int, 한 글자씩 읽어온다 => char로 형변환
				// BufferedReader => 한줄씩 읽음, 속도 빠름
				
			}
			in.close();
			//System.out.println(sb.toString());
			
			// foods에 값 채우기
			String[] datas = sb.toString().split("\n");
			i = 0;
			/*
			 * 452|
			 * 포로이 대학로점
			 * |기타/세계-퓨전푸드
			 * |(02) 766-6444
			 * |서울 종로구 동숭동 1-83
			 * |4.0
			 * |20대, 주차방법: 무료, 주차장소: 업소앞
			 * |/restaurant/restimg/003/zzmenuimg/t1683638_z.jpg
			 * |10:00 ~ 23:00
			 * |쌀국수 하면 떠오르는 20년 전통의 쌀국수 맛집 대학로점 "포로이". 베트남의 이색적인 풍미를 느낄 수 있는 곳으로 소문난 쌀국수 맛집으로, 1998년 서울 강북 최초의 베트남 쌀국수집으로 문을 연 이래 20년 가까이 한자리를 지키고 있어 단골 손님이 많다.
			 * |가족외식 , 어른과 함께라면 , 아이와 함께라면 , 술 마시는 친구와 함께 , 술 못마시는 친구와 함께 , 일상데이트 , 특별한 날엔 , 국물요리 , 아시안 면요리 , 비엣남푸드
			 * |10,000 ~ 20,000원
			 * 
			 */
			for(String data : datas) {
				//System.out.println(data);
				String[] s = data.split("\\|");
				FoodVO vo = new FoodVO();
				vo.setNo(Integer.parseInt(s[0]));
				vo.setName(s[1]);
				vo.setType(s[2]);
				vo.setPhone(s[3]);
				vo.setAddress(s[4]);
				vo.setScore(Double.parseDouble(s[5]));
				vo.setParking(s[6]);
				vo.setImages(s[7]);
				vo.setTime(s[8]);
				vo.setContent(s[9]);
				vo.setTheme(s[10]);
				vo.setPrice(s[11]);
				foods[i] = vo;
				i++;
			}
			
		} catch (Exception e) {	}
		
	}

	// 목록출력
	@Override
	public FoodVO[] food_list(int page) {
		// TODO Auto-generated method stub
		// ArrayList => 배열의 단점 보완
		
		int j=0;
		int pagecnt = (page)*10-10; // 페이지 수의 첫번째 자리 배열 인덱스번호 0, 10, 20
		int row = 10; // 마지막 페이지의 출력목록 개수
		int total = food_total();
		
		if(total == page) {
			row = foods.length%10;
		}
		
		FoodVO[] food = new FoodVO[row];
		for(int i=0; i<foods.length; i++) {
			// i>=pagecnt : 배열의 시작점
			if(j<10 && i>=pagecnt) {
				food[j] = foods[i];
				j++;
			}
		}
		
		return food;
	}

	// 상세정보
	@Override
	public FoodVO food_detail(int no) {
		// TODO Auto-generated method stub
		
		return foods[no-1];
	}

	// 검색
	@Override
	public FoodVO[] food_find(String type, String fd) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	// 필터
	@Override
	public FoodVO[] food_filter(String type) {
		// TODO Auto-generated method stub
		int row = 0;
		for(FoodVO vo : foods) {
			if(vo.getType().contains(type)) row++; // 배열 크기 계산
		}
		
		FoodVO[] food = new FoodVO[row];
		
		int i=0;
		for(FoodVO vo : foods) {
			if(vo.getType().contains(type)) {
				food[i] = vo;
			}
		}
		
		return food;
	}

	// 페이지 나누기(총 페이지 수)
	@Override
	public int food_total() {
		// TODO Auto-generated method stub
		
		return (int)(Math.ceil(foods.length/10.0));
	}
}
