package com.sist.apply;

import java.util.ArrayList;
import java.util.Scanner;
// 데이터 설정(변수) => 클래스로 필요한 변수 모으기 => 캡슐화
// 데이터 수집 : 크롤링 / 파일 / 데이터베이스
// 어떤 기능이 필요한지 : 사용자가 요구하는 내용 => 요구사항
// 출력 : 프롬프트, 웹, 윈도우
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 입력 : ");
		int page = scan.nextInt();
		FoodSystem fs = new FoodSystem();
		ArrayList<Food> list = fs.food_list(page);
		for(Food f : list) {
			System.out.println(f.getNo() + " " +f.getName());
		}

		System.out.print("상세보기 할 맛집 번호 입력 : ");
		int no = scan.nextInt();
		Food food = fs.food_detail(no);
		System.out.println("========== 맛집 정보 ===========");
		System.out.println("번호 : " + food.getNo());
		System.out.println("이름 : " + food.getName());
		System.out.println("종류 : " + food.getType());
		System.out.println("주소 : " + food.getAddress());
		System.out.println("전화번호 : " + food.getPhone());
		System.out.println("가격 : " + food.getPrice());
		System.out.println("설명 : " + food.getContent());
		System.out.println("평점 : " + food.getScore());
		System.out.println("==============================");
		
		
		System.out.print("주소 입력 : ");
		String address = scan.next();
		list = fs.food_find(address);
		for(Food f : list) {
			System.out.println(f.getNo());
			System.out.println(f.getName());
			System.out.println(f.getAddress());
			System.out.println("--------------");
		}
	}

}
