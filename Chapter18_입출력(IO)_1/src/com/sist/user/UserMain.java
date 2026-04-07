package com.sist.user;
import java.util.*;
import com.sist.service.*;
import com.sist.vo.FoodVO;
import com.sist.dao.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		FoodService fService = new FoodService();
		while(true) {
			System.out.println("======== Menu ========");
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색(음식종류)");
			System.out.println("4. 검색(주소)");
			System.out.println("5. 종료");
			System.out.println("======================");
			int menu = scan.nextInt();
			switch(menu) {
			case 5->{
				System.out.println("프로그램 종료...");
				System.exit(0);
			}
			case 1->{
				System.out.print("페이지 입력 : ");
				int page = scan.nextInt();
				List<Optional<FoodVO>> fList = fService.food_list(page);
//				if(fList!=null) {
//
//					fList.stream().forEach(food->System.out.println(food.getNo() + ". " + food.getName()));	
//				}
//				else {
//					System.out.println("데이터가 없습니다.");
//				}
//				String result = fList.stream()
//						.flatMap(Optional::stream).map(FoodVO::getName)
//						.findFirst()
//						.orElse("데이터가 없음");
				List<FoodVO> foods = fList.stream() 
						                  .flatMap(Optional::stream)
						                  .toList();
				if(foods.isEmpty()) {
					System.out.println("데이터가 없습니다");
				}
				else {
					foods.forEach(food->System.out.println(food.getNo() + ". " + food.getName()));
				}
			}
			case 2->{
				System.out.print("상세보기 할 맛집 번호 입력 : ");
				int no = scan.nextInt();
				FoodVO vo = fService.food_detail(no-1);
				System.out.println(vo);
				//System.out.println(vo.getNo() + ". " + vo.getName());
				
			}
			case 3->{
				System.out.print("음식종류 입력(한식, 분식, 양식, 중식, 일식) : ");
				String type = scan.next();
				List<FoodVO> list = fService.food_type_find(type);
				//list.stream().forEach(System.out::println);
				list.stream().forEach(f->System.out.println(f.getNo() + ". " + f.getName() + " (" + f.getType() + ")"));
			}
			case 4->{
				System.out.print("주소 입력 : ");
				String address = scan.next();
				List<FoodVO> list = fService.food_address_find(address);
				//list.stream().forEach(System.out::println);
				list.stream().forEach(f->System.out.println(f.getNo() + ". " + f.getName() + " (" + f.getAddress() + ")"));
			}
			default->{
				System.out.println("없는 메뉴입니다");
			}
			}
		}
		
	}

}
