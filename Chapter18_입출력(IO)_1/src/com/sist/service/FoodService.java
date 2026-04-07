package com.sist.service;
import java.util.*;
import java.util.stream.Collectors;

import com.sist.dao.*;
import com.sist.vo.*;
// 사용자 요청 처리 부분
public class FoodService {
	private List<FoodVO> fList = new ArrayList<FoodVO>();
	private static final int ROW=10;
	public FoodService() {
		fList = FoodDAO.getfList();
	}
	
	// 1. 페이지 당 목록 출력
	public List<Optional<FoodVO>> food_list(int page) {
		List<FoodVO> list = new ArrayList<FoodVO>();
		int start = (page*ROW)-ROW;
		/*
		 *  1 page 0~9
		 *  2 page 10~19
		 *  3 page 20~29
		 * 
		 */
		int end = page*ROW;
		list = fList.subList(start, end); // end-1
//		List<Optional<FoodVO>> result = list.stream().flatMap(Optional<FoodVO>::stream).collect(Collectors.toList());
		return list.stream().map(Optional::ofNullable).collect(Collectors.toList());
	}
	
	// 2. 상세보기
	public FoodVO food_detail(int no) {
		return fList.get(no);
	}
	
	
	// 3. 검색 => stream()
	// 카테고리별 검색
	public List<FoodVO> food_type_find(String type) {
		List<FoodVO> list = new ArrayList<FoodVO>();
		list = fList.stream().filter(f->f.getType().contains(type)).collect(Collectors.toList());
		return list;
	}
	
	// 4. 주소로 검색
	public List<FoodVO> food_address_find(String address) {
		return fList.stream().filter(f->f.getAddress().contains(address)).collect(Collectors.toList());

	}
	
}
