package com.sist.manager;

import java.util.Scanner;

import com.sist.vo.FoodVO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		FoodManager fm = new FoodManager();
        int total = fm.food_total(); 
        System.out.print("페이지 입력(1~" + total + ") : ");
        int page = scan.nextInt();
		FoodVO[] food = fm.food_list(page);
		//System.out.println(food.length);
		for(FoodVO vo : food) {
			System.out.println(vo.getNo() + ". " + vo.getName());
		}
		
		System.out.print("\n상세보기 할 음식점 번호 입력 : ");
		int no = scan.nextInt();
		FoodVO vo = fm.food_detail(no);
		System.out.println("맛집 번호 : " + vo.getNo());
		System.out.println("맛집 이름 : " + vo.getName());
		System.out.println("카테고리 : " + vo.getType());
		System.out.println("전화번호 : " + vo.getPhone());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println("주차정보 : " + vo.getParking());
		System.out.println("영업시간 : " + vo.getTime());
		System.out.println("평점 : " + vo.getScore());
		
		System.out.print("\n카테고리 입력 : ");
		String type = scan.next();
		FoodVO[] filter = fm.food_filter(type);
		System.out.println(filter.length);
		//  System.out.println(filter[filter.length-1].getName());
		// 오류
//		for(int i=0; i<filter.length; i++) {
//			System.out.println("========================================");
//			System.out.println("맛집 번호 : " + filter[i].getNo());
//			System.out.println("맛집 이름 : " + filter[i].getName());
//			System.out.println("카테고리 : " + filter[i].getType());
//			System.out.println("전화번호 : " + filter[i].getPhone());
//			System.out.println("주소 : " + filter[i].getAddress());
//			System.out.println("주차정보 : " + filter[i].getParking());
//			System.out.println("영업시간 : " + filter[i].getTime());
//			System.out.println("평점 : " + filter[i].getScore());
//			System.out.println("========================================");
//		}
		for(FoodVO f : filter) {
			
		}
		
		
		
		
		
		//int data = 29;
//		/*int total = data/10;
//		if(data%10>0) total++;
//		System.out.println(total);*/
//		int total = (int)(Math.ceil(data/10.0));
//		// round(반올림) ceil(올림)
//		System.out.println(total);
	}

}
