package com.sist.lambda;
/*
 *  - 사용법
 *     - 인터페이스 사용
 *     - 조건 : 1. 구현이 안된 메소드 단 한개 => @FunctionalInterface => jdk 1.8~(오라클 인수) => C언어에서 필요한 부분 도입
 *             2. default/static 등 구현 메소드는 상관없음
 *     - 사용자 정의보다 라이브러리 활용이 많다
 *       - 조건 검색(if) : filter()
 *       - 화면 출력 : forEach()
 *       - AWT(스프링 보안) => 람다
 *       
 *   - 람다식 구조
 *      ( 매개변수 ) -> { 구현식 }
 *      --데이터전송--   --실행--
 *      1) 매개변수가 없는 경우
 *          () -> {}
 *      2) 매개변수가 한개인 경우
 *          (매개변수) -> {}
 *      3) 매개변수가 여러개인 경우
 *          (a, b, ...) -> {}
 *      4) 리턴형이 있는 경우
 *          (a,b) -> { ... return c; }
 *      => 소스가 간결해진다
 *      => 실무에서는 stream 주로 사용 => 람다 사용
 *      (x,y) -> x+y;
 *      입력값 이렇게 해라
 *      
 *      => List에서 주로 사용(컬렉션)
 *          1) 정렬
 *          2) 조건 필터링
 *          3) 값 반환
 *          4) 문자열 처리
 *          5) 합계 계산
 *          6) 평균 계산
 *          7) 최소/최대값 계산
 *          
 *    16장(형식) -> 17장(Stream) 실제 처리
 *     - 생성 : list.stream() ==> Consumer
 *     - 가공 : 중간 연산 => 필터링 => filter() ==> Supplier
 *     - 최종결과 : forEach() / collect() ==> 
 *                화면 출력     모아서 브라우저에 전송     
 *     - filter() : 조건에 맞는 데이터만 남김
 *     - map() : 데이터를 다른 형태로 변환 => 급여 인상
 *     - collect() : 해당 데이터 모으기(toList)
 *     - forEach() : 화면에 출력
 *     
 *     
 *     for, if 제어문을 쉽게 처리
 *     반복처리 => stream()
 *     - stream() 
 *        1. 처리 속도가 빠르다
 *        2. 데이터 처리 가능 => 통계
 *        3. 데이터를 잘라서 처리 => 페이징 가능
 *     
 *     
 */
/*
 * C001,
 * user001,
 * pw001,
 * 김민수,
 * minsu.kim1@test.com,
 * 010-1000-0001,
 * 서울,
 * 2023-01-02,
 * VIP
 */
/*
 *  ~예외처리 => 기본 문법
 *  - 라이브러리
 *     1. String / Math / Wrapper
 *     2. StringTokenizer / Date / Calendar
 *  - **Collection
 *     - ArrayList, HashMap, HashSet
 *  - IO
 *  - SQL => JDBC
 * ============================ 웹 적용
 * 
 * 
 */
import java.util.*;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
@Getter
@Setter
class Customer {
	 private String cno;
	 private String id;
	 private String pwd;
	 private String name;
	 private String email;
	 private String phone;
	 private String loc;
	 private String regdate;
	 private String grade;
}

class CustomerManager {
	public static List<Customer> cList = new ArrayList<Customer>();
	static {
		try {
			FileReader fr = new FileReader("c:\\javadv\\고객.txt");
			String data = "";
			int i=0;
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			fr.close();
			String[] datas = data.split("\n");
			for(String cust : datas) {
				StringTokenizer st = new StringTokenizer(cust, ",");
				Customer c = new Customer();
				c.setCno(st.nextToken());
				c.setId(st.nextToken());
				c.setPwd(st.nextToken());
				c.setName(st.nextToken());
				c.setEmail(st.nextToken());
				c.setPhone(st.nextToken());
				c.setLoc(st.nextToken());
				c.setRegdate(st.nextToken());
				c.setGrade(st.nextToken());
				cList.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
public class Lambda_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 메뉴 생성
		Scanner scan = new Scanner(System.in);
		CustomerManager cm = new CustomerManager();
		while(true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 전체 목록");
			System.out.println("2. VIP 목록");
			System.out.println("3. 서울 거주");
			System.out.println("4. 종료");
			System.out.println("=====================");
			System.out.print("메뉴 입력 : ");
			int menu = scan.nextInt();
			// 람다 사용 => 메소드명 생략 / 리턴 생략 / break 생략
			switch(menu) {
			case 4 -> {
				System.out.println("프로그램 종료....");
				System.exit(1);
			}
			case 1 -> {
//				for(Customer c : cm.cList) {
//					System.out.print(c.getCno() + " " + c.getName() + " " + c.getId() +  " " + 
//				                       c.getLoc() + " " + c.getGrade());
//				}
				cm.cList.forEach(c->System.out.print(c.getCno() + " " + c.getName() + " " + c.getId() +  " " + 
	                       c.getLoc() + " " + c.getGrade()));
				System.out.println();
			}
			case 2 -> {
//				for(Customer c : cm.cList) {
//					if(c.getGrade().contains("VIP")) {
//						System.out.print(c.getCno() + " " + c.getName() + " " + c.getId() +  " " + 
//			                       c.getLoc() + " " + c.getGrade());
//					}
//				}
				
				// filter() 사용
				cm.cList.stream().filter(c->c.getGrade().contains("VIP")).forEach(c->System.out.print(c.getCno() + " " + c.getName() + " " + c.getId() +  " " + 
	                       c.getLoc() + " " + c.getGrade()));
				System.out.println();
			}
			case 3 -> {
				cm.cList.stream().filter(c->c.getLoc().equals("서울")).forEach(c->System.out.print(c.getCno() + " " + c.getName() + " " + c.getId() +  " " + 
	                       c.getLoc() + " " + c.getGrade()));
			}
			default -> {
				System.out.println("입력이 잘못되었습니다");
				continue;
			}
			}
		}
	}

}
