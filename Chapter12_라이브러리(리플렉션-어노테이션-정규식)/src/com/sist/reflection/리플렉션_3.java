package com.sist.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *   
 * 
 * 
 * 
 */
class Member {
	private int mno=1;
	private String name="홍길동";
	private String address="서울";
	public Member() {}
	public Member(int mno, String name, String address) {
		this.mno = mno;
		this.name = name;
		this.address = address;
	}
	
	// CRUD 구조
	public void select() {
		
	}
	public void insert() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	
	// 구조(Spring, MyBatis, JPA)
}
public class 리플렉션_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 클래스 객체 생성
			// getClass()
			Member mem = new Member();
			// Class.forName("패키지.클래스명")
			Class cls = mem.getClass();
			System.out.println("============ 메소드 정보 ============");
			Method[] methods = cls.getDeclaredMethods();
			for(Method m :methods) {
				System.out.println(m.getName());
			}
			System.out.println("============ 멤버 변수 ==============");
			Field[] fields = cls.getDeclaredFields();
			for(Field f : fields) {
				System.out.println(f.getName());
			}
			System.out.println("============ 생성자 ================");
			Constructor[] con = cls.getDeclaredConstructors();
			for(Constructor c : con) {
				System.out.println(c.getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
