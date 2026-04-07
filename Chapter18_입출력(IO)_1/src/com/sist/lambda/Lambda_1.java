package com.sist.lambda;
/*
 *  1. 코딩
 *  2. 메모하는 습관
 *  3. 실무(구현)
 *  4. 확장
 *  -------- 자신감 / 끈기
 * 
 *  
 *  1. 람다식
 *      => 이름 없는 함수
 *      => 선언이 없다 => 코드가 간결해진다
 *      () -> { 구현문 }
 *      |        |
 *      함수    구현부
 *      (a,b) -> { ... }
 *      매개변수는 데이터형을 붙이지 않는다
 *      - 생략 : 매개변수의 데이터형, 함수명, 리턴형
 *      - 메소드 참조 : 클래스에서 메소드 참조가 가능하다 ::
 *         - System.out::println
 *         - String::toUpperCase
 *         - Customer::getName
 *   2. 람다스트림
 *       - 소스가 간결 => 유지보수가 편하다
 *       - 재사용 불가, 구현이 복잡하면 권장x
 *       - stream() : 데이터를 모아줌
 *       - 중간처리 : filter(), map(), sort()
 *          - filter() => if(조건)
 *          - map() => format(변환)
 *          - sorted => 정렬
 *       - 최종처리 : forEach(), collect(), count()
 *          - forEach() => 출력
 *          - collect() => 데이터를 모아서 전송
 *             - Collectors.toList() 등
 *       - Null 오류 처리
 *          => Optional 클래스 => JPA : 데이터베이스 등
 *       - SpringBoot의 보안처리 -> 람다
 *       - 주요 메소드
 *          - filter()
 *          - map()
 *          - sorted() : ASC만 가능(DESC 불가) => 역순으로 구현
 *   ==============================================
 *    **** 면접 => 자바/오라클
 *     - 객체지향 프로그램
 *        - 객체들이 협력해서 상호작용 => 조립식 프로그램
 *        - 코드의 재사용성 / 유지보수 / 확장 가능 / 신뢰성이 높다
 *     - 함수형 프로그램(람다)
 *        - 입력값에 따른 결과가 달라짐
 *        - 검증이 쉽다, 성능이 뛰어나다(최적화)
 *        - 캐시 메모리(임시 메모리) 사용 => 메모리 리소스 절약 -> 속도가 빠름
 *        - 캐시 메모리에서 데이터 가져오기 => stream()
 *        - 스트림 : 데이터 처리
 *                 ----------> 조건/출력/데이터 모아서 전송
 *        - 람다 : 코드를 줄여줌(함수를 한줄로 사용)
 *                자바(->) , 자바스크립트(=>)
 *          function funcName {
 *          	 
 *          }
 *          lef funcName= ()=>{}
 *          
 *  - 람다 => 코드를 줄인다
 *  - 스트림-> 임시메모리에 데이터를 한개씩 읽느넋
 *  - Optional -> null 안전하게 처리
 *     => 데이터베이스에서 데이터를 읽어올때 사용
 *          
 *          
 *      
 *      => 최종 프로젝트 : 보안 / JPA / Mybatis 사용
 *       
 *             
 * 
 */
import java.util.*;
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		//String name = null;
		//System.out.println(name.length());
		// null 값 방지 클래스 Optional
		Optional<String> name = Optional.ofNullable(null);	
		System.out.println(name.orElse("이름 없음"));
		// 검색 / 데이터베이스 프로그램
		// 데이터베이스 => isNotNull() isNull
		Optional<String> userName = Optional.of("홍길동");
		userName.ifPresent(n->System.out.println("이름  : " + n));
		// null 주의
		// orElse("기본갑") : 값이 없는 경우(Null) 대신 사용
		// ifPresent() => 값이 있는 경우에만 수행
		
		// Optional<String> a = Optional.of("Hello")
		// Optional<String> b = Optional.ofNullable(null)
		// Optional<String> a = Optional.empty()
		
		// 값 변경
		Optional<String> opt = Optional.of("Hello");
		Optional<Integer> len = opt.map(s->s.length());
		System.out.println(len.get());
		
		// Optional 안에 Optional
		Optional<String> opt2 = Optional.of("hello");
		Optional<Integer> result = opt2.flatMap(s->Optional.of(s.length()));
		// flatMap : Optional 제거
		System.out.println(result.get());

		// 필터링
		Optional<Integer> opt3 = Optional.of(10);
		opt3.filter(n-> n>5).ifPresent(n->System.out.println("5보다 큼"));
		// filter의 조건이 true일때만 소행
		
		// null => String, 클래스만 가능 -int는 0
		Optional<String> opt4 = Optional.ofNullable(null);
		System.out.println(opt4.isPresent());
		// 값이 있는지 확인
		System.out.println(opt4.isEmpty());
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
		
	}

}
