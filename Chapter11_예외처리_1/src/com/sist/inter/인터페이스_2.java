package com.sist.inter;
import java.util.*;
// 같은 메소드를 하나로 묶어서 처리 => 응집성이 높다
interface 게시판 {
	public void handlerRequest();
}
class 게시판_글쓰기 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 글쓰기 요청");
	}
}

class 게시판_목록 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 목록 요청");
	}
}

class 게시판_상세보기 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 상세보기 요청");
	}
}

class 게시판_수정 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 수정 요청");
	}
}

class 게시판_삭제 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 삭제 요청");
	}
}


public class 인터페이스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴 선택(1~5) : ");
		int menu = scan.nextInt();
		
//		게시판 a = null;
//		if(menu==1) a=new 게시판_글쓰기();
//		else if(menu==2) a=new 게시판_목록();
//		else if(menu==3) a=new 게시판_상세보기();
//		else if(menu==4) a=new 게시판_수정();
//		else if(menu==5) a=new 게시판_삭제();
//		
//		a.handlerRequest();

		Map map = new HashMap();
		map.put(1, new 게시판_글쓰기());
		map.put(2, new 게시판_목록());
		map.put(3, new 게시판_상세보기());
		map.put(4, new 게시판_수정());
		map.put(5, new 게시판_삭제());
		
		게시판 a = (게시판)map.get(menu);
		a.handlerRequest();
		
//		// 1. 글쓰기
//		if(menu == 1) {
//			 게시판_글쓰기 a = new 게시판_글쓰기();
//			 a.handlerRequest();
//		}
//		
//		// 2. 목록
//		else if(menu == 2) {
//			게시판_목록 a = new 게시판_목록();
//			a.handlerRequest();
//		}
//		
//		// 3. 상세보기
//		else if(menu == 3) {
//			게시판_상세보기 a = new 게시판_상세보기();
//			a.handlerRequest();
//		}
//		
//		// 4. 수정
//		else if(menu == 4) {
//			게시판_수정 a = new 게시판_수정();
//			a.handlerRequest();
//		}
//		
//		// 5. 삭제
//		else if(menu == 5) {
//			게시판_삭제 a = new 게시판_삭제();
//			a.handlerRequest();
//		}
	
	
	}

}
