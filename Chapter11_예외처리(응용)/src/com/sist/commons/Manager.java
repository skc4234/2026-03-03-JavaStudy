package com.sist.commons;

import com.sist.vo.FoodVO;
/*
 *  인터페이스
 *   => 서로 다른 클래스를 연결해서 사용
 *      --------------------------> 결합성이 낮은 프로그램 구현
 *      A ==== I ===== B
 *                    --- 수정 => A 영향x => A와 B는 결합성이 낮다
 *   => 공통으로 사용되는 기능을 모아서 재사용/확장 - 오버라이딩
 *   => 독립적으로 사용 가능
 *  -----------------------
 *  구성요소 
 *   public interface 인터페이스명 {
 *   	--------------------
 *   	1. 변수 : 상수형 변수
 *          변수를 설정하면 반드시 초기값을 구현
 *          (public static final) int a = 10;
 *          => 생략 시 자동추가
 *   	-------------------
 *   	2. 구현안된 메소드
 *   		선언만 하는 메소드
 *           => 상속을 내려서 구현한 뒤에 사용
 *           (public abstract) void display();
 *           => 생략 시 자동 추가
 *           => 구현이 불가능할때 선언만 하고 개발자에게 상황에 맞게 구현(강제성)
 *            ex) 버튼 클릭 시 기능 / 목록 출력 다양화
 *           => 자유롭게 처리
 *   	------------------
 *   	3. 구현된 메소드(default)
 *          - 공통으로 사용되는 내용이 있는 경우
 *             => 그대로 사용 / 변경해서 사용(오버라이딩)
 *             => 강제성이 없다
 *   	    - (public) default void 메소드명() { 구현 }
 *   	-------------------
 *   	4. 구현된 메소드(static)
 *   		=> 메모리 할당 없이 접근이 가능한 메소드 => 사용빈도 거의 없음
 *          - (public) static void 메소드명() { 구현 }
 *   	---------------------
 *   	5. 자체 처리 => 인터페이스 내 공통으로 사용하는 부분 => 메소드화
 *   		private 리턴형 메소드명() { 구현 }
 *   	-----------------------
 *   
 *   	==> only public => public 안쓰면 자동추가
 *   }
 *   
 *   => 관련된 클래스를 여러개 모아서 하나의 인터페이스로 제어
 *       웹 - 스프링 => 인터페이스 기반
 *       스프링 => 결합성이 낮은 프로그램
 *   
 *   
 *   - 상속
 *      interface A
 *      	|
 *      interface B extends A    => 단일 상속
 *     
 *      interface A    interface B
 *          |              |
 *          ----------------
 *                 |
 *       interface C extends A,B => 다중 상속
 * 
 * 		interface A
 * 			|
 * 	    class B implements A
 * 
 * 	    class A    interface B    interface C
 *         |           |              |
 *         ----------------------------
 *                     |
 *        class D extends A implements B,C => class와 인터페이스 다중 상속 시 class 먼저
 *        
 *      => 기존의 기능을 재사용 => 필요시 변경해서 사용이 가능(오버라이딩)
 *      
 *      
 *    -   오버라이딩              오버로딩
 *          변경                  추가
 *      메소드명이 동일         메소드명이 동일
 *       매개변수 동일     매개변수의 갯수나 데이터형 다름
 *       리턴형이 동일          리턴형과 관계없음
 *    접근지정어 확대 가능      접근지정어 관계 없음
 *     
 *     
 *    - 클래스 : 다른 클래스와 연결 => **public, default
 *    - 멤버변수 : 데이터 보호 => private(은닉화)
 *    			 접근시(수정, 읽기) => 메소드화(getter, setter)
 *             => 변수+메소드 한개로 묶음 => 캡슐화
 *    - 메소드 : 다른 클래스와 통신 => **public
 *    - 생성자 : 다른 클래스에서 객체 생성 => **public
 *    
 *     
 * 
 */
public interface Manager {
	// 페이지 나누기
	public int food_total();
	
	// 목록
	public FoodVO[] food_list(int page);
	
	// 상세보기
	public FoodVO food_detail(int no);
	
	// 검색 - 주소 / 음식종류 / 맛집명
	public FoodVO[] food_find(String type, String fd);
	
 	// 필터링 => 한식 / 중식 / 양식 / 일식 / 분식
	public FoodVO[] food_filter(String type);
}
