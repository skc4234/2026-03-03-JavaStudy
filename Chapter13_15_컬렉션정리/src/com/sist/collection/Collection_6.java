package com.sist.collection;
/*
 *  객체 단위 저장 => 중복 제거 가능?
 */
import java.util.*;
class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 변수의 초기값을 다르게 설정 : 매개변수가 있는 생성자
	// 명시적 초기화, 초기화 블록 => 모든 객체가 동일한 값
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 객체 식별자
	// 변수가 같으면 식별자가 동일하게 바꿈
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
	// equals => 메모리 주소 비교
	// 오버라이딩 => 변수값과 비교
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) { // 객체 비교
			// 매개변수의 객체 타입이 Student인지
			Student s = (Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
	
	
}
public class Collection_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동", 20);
		Student s2 = new Student("홍길동", 20);
		// hashCode가 다르므로 둘은 다른 객체
		System.out.println("s1 = " + s1.hashCode());
		System.out.println("s2 = " + s2.hashCode());
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2 ? "같은 객체입니다" : "다른 객체입니다");
		
		// Set에 저장
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		// 데이터 무결성 => 이상현상
		// 수정이나 삭제가 되었을때 원하지 않은 데이터가 문제가 생기는 현상
		for(Student s : set) {
			System.out.println("이름 : " + s.getName() + ", 나이 : " + s.getAge());
		}
	}

}
