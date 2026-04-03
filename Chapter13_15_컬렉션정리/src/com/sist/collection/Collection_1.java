package com.sist.collection;
/*
 *  컬렉션 프레임워크
 *   - 다수의 데이터 모음 => 데이터 관리, 기본 틀 => 표준화, 라이브러리
 *                     Collection - interface
 *                          |
 *                ----------------------
                  |                    |
 * interface => List                  Set                Map
 *                |                    |                  |
 *      --------------------       ---------         ----------
 *      |         |        |       |       |         |        |
 * ArrayList LinkedList Vector  HashSet TreeSet   HashMap HashTable
 * 
 *  - ArrayList
 *     => 접근 속도가 빠르다
 *     => 웹에서는 검색 기능을 자주 사용하기 때문에 대부분 ArrayList 사용
 *     => 자동 인덱스 부여 => 수시로 변경
 *     => 추가/삭제가 느림
 *  - LinkedList
 *     => 접근 속도가 느리다
 *     => 추가/삭제가 빠르다
 *     => 댓글/게시판 기능에 사용
 *  - Vector
 *     => ArrayList와 구조가 비슷하다
 *     => 동기적 프로그램 => 속도가 느리다
 *     => 신뢰성이 뛰어나다 => 네트워크 프로그래밍에 사용
 *     
 *  특징
 *   - 데이터 중복 허용 => 인덱스를 이용해서 데이터 제어
 *   - 순서가 유지된다 => 인덱스 번호
 *   
 *  활용
 *   - **ArrayList => 데이터에서 값을 저장(목록 등) => 브라우저로 전송
 *   - Vector => 네트워크의 유저 관리(접속자 관리)
 *   - LinkedList => 파일로 프로그램 제작
 * 
 *  제네릭 : 클래스형만 지원
 *   => <클래스형>
 *   => 기본 데이터형을 사용하려면 Wrapper 클래스 사용
 *   => int, double, boolean, long => Integer, Double, Boolean, Long
 *   => 사용자 정의 클래스 사용 가능
 *   => ArrayList<Movie> == Movie[]
 *   => 가독성이 좋다 / 제어하는 데이터를 알 수 있다
 *   => 라이브러리 => Object => 형변환 처리(보완)
 *   => 모든 Object로 된 내용을 한번에 변경이 가능하다
 *          ---------------> 변수, 매개변수, 리턴형 등
 *       => 데이터형의 통일화
 *   => Wrapper 클래스 사용
 *       ArrayList<Integer>
 *       -----------------------
 *       Integer(10) Integer(100) => 오토박싱
 *       -----------------------
 *       int a=10;    int a=20;   => 언박싱
 *       
 *   정리 : 제네릭은 데이터형을 통일 => 누구나 알아보기 쉽게 만든 데이터 구조 형식
 *   
 *   List list = new ArrayList();
 *               new Vector();
 *               new LinkedList();
 *   - 메소드
 *     => CRUD
 *      => add()    : 데이터 추가(INSERT-create)
 *      => get(i)   : 데이터 읽기(SELECT-read)
 *      => set()    : 데이터 수정(UPDATE-update)
 *      => remove() : 데이터 삭제(DELETE-delete)
 *     
 *     => size()    : 객체 갯수 => length()
 *     => isEmpty() : 데이터 존재 여부
 *     => clear()   : 전체 삭제
 * 
 * 
 */
import java.util.*; // Date, Calendar, Random, StringTokenizer, Collection
// import java.lang.*
class A {
	public void display() {
		System.out.println("A:display() call...");
	}
}
class B {

	public void display() {
		System.out.println("B:display() call...");
	}
}

class C {

	public void display() {
		System.out.println("C:display() call...");
	}
}

public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n = {"홍길동", "심청이", "박문수", "이순신", "강감찬"};
		
		List<String> names = new ArrayList<String>();
		names = Arrays.asList(n);
		
//		names.add("홍길동");
//		names.add("심청이");
//		names.add("박문수");
//		names.add("이순신");
//		names.add("강감찬");
		for(String s : names) {
			System.out.println(s);
		}
		System.out.println("인원 : " + names.size());
		System.out.print("인원 존재 여부 : ");
		
		if(names.isEmpty()) {
			System.out.println("존재 x\n");
		}
		else {
			System.out.println(names.size() + "명 있습니다\n");
		}
		/*ArrayList names = new ArrayList();
		names.add(new A());
		names.add(new A());
		names.add(new B());
		names.add(new A());
		names.add(new C());
		names.add(new A());
		names.add(new B());
		names.add(new A());
		names.add(new C());
		names.add(new A());
		names.add(new B());
		names.add(new A());
		names.add(new C());
		names.add(new A());
		names.add(new B());
		names.add(new A());
		names.add(new C());
		A a = null;
		B b = null;
		C c = null;
		for(Object obj : names) {
			if(obj instanceof A) {
				 a = (A)obj;
				a.display();
			}
			if(obj instanceof B) {
				b = (B)obj;
				b.display();
			}
			if(obj instanceof C) {
				c = (C)obj;
				c.display();
			}
			
		}*/
		
	}

}
