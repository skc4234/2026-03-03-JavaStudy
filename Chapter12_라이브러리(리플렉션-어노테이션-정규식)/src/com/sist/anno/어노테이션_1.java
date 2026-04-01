package com.sist.anno;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * - 어노테이션
 *    => 다른 프로그램에게 정보를 제공하는 역할
 *    => 목차 만들어 주기 => 쉽게 찾을 수 있게
 *    => 구분자
 *        - 멤버변수
 *        - *클래스
 *        - *메소드
 *        - 생성자
 *   
 *   1. 구분
 *       => 구분자 종류
 *       - @Target
 *           TYPE        => 클래스
 *           METHOD      => 메소드
 *           CONSTRUCTOR => 생성자
 *           FIELD       => 멤버 변수
 *   2. 저장 기간
 *      - SOURCE  => .class파일이 존재할때 까지
 *        CLASS   =>  컴파일 시만 유지 => 실행 시 사라짐
 *        RUNTIME(default) => 파일 존재/프로그램 종료하기 전까지
 *   3. public @interface 어노테이션
 *      {
 *      	메소드 선언
 *      }
 *      => 기능은 없고 찾기 기능만 있다
 *   4. 배치 => 항상 위에 배치
 *   	 @TYPE
 *       class ClassName {
 *       	@FIELD
 *       	변수
 *       	@CONSTRUCTOR
 *       	생성자
 *       	@METHOD
 *       	메소드
 *       }
 * 
 *     분업 시 편리함 
 * 
 */
class Controller {
	@RequestMapping("1") // GetMapping / PostMapping 
	public void main_page() {
		System.out.println("Main Page 이동");
	}

	@RequestMapping("2")
	public void memberJoin() {
		System.out.println("회원가입 이동");
	}

	@RequestMapping("3")
	public void login() {
		System.out.println("로그인 이동");
	}

	@RequestMapping("4")
	public void board_list() {
		System.out.println("게시판 이동");
	}

	@RequestMapping("5")
	public void food_list() {
		System.out.println("맛집 목록 이동");
	}

	@RequestMapping("6")
	public void food_detail() {
		System.out.println("맛집 상세보기 이동");
	}
	
	@RequestMapping("7")
	public void food_jjim() {
		System.out.println("맛집 찜하기 이동");
	}
	
	@RequestMapping("8")
	public void food_like() {
		System.out.println("맛집 좋아요 이동");
	}
}
public class 어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("============= 메뉴 =============");
		System.out.println("1. 메인페이지");
		System.out.println("2. 회원가입");
		System.out.println("3. 로그인");
		System.out.println("4. 게시판");
		System.out.println("5. 맛집 목록");
		System.out.println("6. 맛집 상세보기");
		System.out.println("7. 맛집 찜하기");
		System.out.println("8. 맛집 좋아요");
		System.out.println("===============================");
		System.out.print("메뉴 입력 : ");
		int menu=scan.nextInt();
		
		try {
			// 클래스 정보 얻기
			Class clsName = Class.forName("com.sist.anno.Controller");
			// 객체 생성
			Object obj = clsName.getDeclaredConstructor().newInstance();
			// 메소드 정보 가져오기
			Method[] methods = clsName.getDeclaredMethods();
			for(Method m : methods) {
				// 메소드 위에 있는 어노테이션 정보 가져오기
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				// 어노테이션 문자열과 사용자가 보낸 값이 같으면 해당 메소드 호출
				if(rm.value().equals(String.valueOf(menu))) {
					m.invoke(obj, null); // invoke(객체, 매개변수)
					                     // 매개변수가 다를 경우 => 가변 매개변수 ...
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
//		Controller c = new Controller();
//		if(menu==1) {
//			c.main_page();
//		}
//		else if(menu==2) {
//			c.memberJoin();
//		}
//		else if(menu==3) {
//			c.login();
//		}
//		else if(menu==4) {
//			c.board_list();
//		}
//		else if(menu==5) {
//			c.food_list();
//		}
//		else if(menu==6) {
//			c.food_detail();
//		}
	}

}
