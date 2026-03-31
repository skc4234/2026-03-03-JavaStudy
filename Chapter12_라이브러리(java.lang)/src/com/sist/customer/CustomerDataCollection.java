package com.sist.customer;

import java.io.FileReader;
import java.util.Scanner;

public class CustomerDataCollection {
	public static CustomerVO[] customers = new CustomerVO[100];
	public final static int LISTOFPAGE = 12;
	// 고객 누구나 접근이 가능하다(public static)
	// 초기화
	static {
		try {
			 FileReader in = new FileReader("c:\\javadv\\고객.txt");
			 String data = "";
			 int i=0;
			 while((i=in.read())!=-1) {
				 data+=(char)i;
			 }
			 in.close();
			 //System.out.println(data);
			 String[] datas = data.split("\n");
			 int j=0;
			 for(String s : datas) {
				 String[] cust = s.split(",");
				 CustomerVO vo = new CustomerVO();
				 vo.setCustomer_id(cust[0]);
				 vo.setLogin_id(cust[1]);
				 vo.setPwd(cust[2]);
				 vo.setName(cust[3]);
				 vo.setEmail(cust[4]);
				 vo.setPhone(cust[5]);
				 vo.setLoc(cust[6]);
				 vo.setRegdate(cust[7]);
				 vo.setGrade(cust[8]);
				 customers[j] = vo;
				 j++;
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 기능
	// 1. 로그인 => equals
	public String isLogin(String id, String pwd) {
		String result = "";
		String name = "";
		
		int count=-1;
		for(CustomerVO vo : customers) {
			if(vo.getLogin_id().equals(id)) {
				if(vo.getPwd().equals(pwd)) {
					count = 1;
					name = vo.getName();
					break;
				}
				count = 0;
				break;
			}
		}
		if(count==-1) { // id가 존재하지 않음
			result = "NO_ID";
		}
//		else { // id가 정보가 있음
//			count=0;
//			login : for(CustomerVO vo : customers) {
//				if(vo.getLogin_id().equals(id)) {
//					if(vo.getPwd().equals(pwd)) {
//						count=1;
//						name = vo.getName();
//						break login;
//					}
//				}
//			}
//		}
		else if(count==0) {
			result = "NO_PWD";
		}
		else {
			result = "OK|"+name; // session
		}
		return result;
	}
	
	// 2. 목록출력 => 페이지 나누기
	public int customerTotalPage() {
		return (int)(Math.ceil(customers.length/(double)LISTOFPAGE));
	}
	
	public CustomerVO[] customerListData(int page) {
		int totalpage = customerTotalPage();
		int row = LISTOFPAGE;
		if(totalpage == page && customers.length%LISTOFPAGE>0) {
			row = customers.length%LISTOFPAGE;
		}
		
		CustomerVO[] cust = new CustomerVO[row];
		
		// 배열에 값 채우기
		// => 오라클 자체 페이징 기법 => 인라인뷰
		// => MySql => limit
		int j=0; // 10개씩 나눠주는 변수
		int pagecnt = (page*LISTOFPAGE)-LISTOFPAGE; // 배열의 시작점
		for(int i=0; i<customers.length; i++) {
			if(j<row && i>=pagecnt) {
				cust[j] = customers[i];
				j++;
			}
		}
		
		
		
//		int j=0;
//		for(int i=page*10-10; i<page*10-10+row; i++) {
//			cust[0]=customers[i];
//			j++;
//		}
		
		return cust;
	}
	
	// 3. 검색 => 지역 / 등급 / 등록일 => contains, toUpperCase(소문자로 검색해도 대문자로 검색), substring
	
	
	
	// 4. 등록 / 삭제 (배열은 불가) => Collection
	
	public static void main(String[] args) {
//		CustomerDataCollection cdc = new CustomerDataCollection();
//		Scanner scan = new Scanner(System.in);
//		System.out.print("아이디 입력 : ");
//		String id = scan.next();
//		System.out.print("비밀번호 입력 : ");
//		String pwd = scan.next();
//		
//		String res = cdc.isLogin(id, pwd);
//		
//		if(res.equals("NO_ID")) {
//			System.out.println("아이디가 존재하지 않습니다.");
//		}
//		else if(res.equals("NO_PWD")) {
//			System.out.println("비밀번호가 존재하지 않습니다.");
//		}
//		else {
//			System.out.println("로그인 성공!!");
//		}
		CustomerDataCollection cdc = new CustomerDataCollection();
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 입력 : ");
		int page = scan.nextInt();
		CustomerVO[] cust = cdc.customerListData(page);
		System.out.println(cust.length);
		for(CustomerVO vo : cust) {
			System.out.println(vo.getCustomer_id() + " " + vo.getName() + " " + vo.getEmail() + " " +
							vo.getPhone() + " " + vo.getLoc() + " " + vo.getRegdate() + " " + vo.getGrade()
			);
		}
	}
}
