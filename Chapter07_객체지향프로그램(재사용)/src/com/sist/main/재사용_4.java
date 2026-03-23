package com.sist.main;
/*
 *  ---s---
 *   0x100
 *  -------    --------------------------
 *                -----super------
 *                 name="심청이"
 *                 sex="여자"
 *                 ---------------
 *                 -----this------
 *                 name
 *                 sex
 *                 display()
 *                 ----------------
 *              ---------------------------
 * 
 *  생략(자동컴파일) : void return / 기본생성자 / extends Object / import java.lang / 
 * 
 */
class Human {
	String name;
	String sex;
	public Human() { // 상속에서 제외
		name = "심청이";
		sex = "여자";
		System.out.println("Human() Call...");
	}
	
}
//class Student extends Human {
//	// String name, sex;
//	public Student(String name, String sex) {
//		this.name = name;
//		this.sex = sex;
//	}
//	public void display() {
//		System.out.println("이름 : " + name);
//		System.out.println("성별 : " + sex);
//	}
//}

// 상속 내린 클래스가 메모리 할당을 먼저 해야함 => 상위 클래스의 생성자
// 상속받은 클래스 => 메모리 할당
class Sawon extends Human {
	// name, sex
	//String name,sex; // 변수의 오버라이딩
	
	public Sawon() {
		//super(); // 자동호출, 생략
		System.out.println("Sawon() Call...");
		this.name = "박문수";
		this.sex = "남자";
	}
	public void display() {
		System.out.println("이름(Super) : " + super.name);
		System.out.println("성별(Super) : " + super.sex);
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.sex);
	}
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student st = new Student("홍길동", "남자");
		//st.display();
		Sawon s = new Sawon();
		s.display();
		
	}

}
