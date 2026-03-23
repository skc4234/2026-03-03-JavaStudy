package com.sist.main;
/*
 *  상속 => 다른 클래스의 변수/메소드 사용 가능
 *  		-메소드가 프로그램에 맞지 않음
 *  		 => 변경해서 사용 => 오버라이딩
 *  오버라이딩 : 변경해서 덮어쓴다
 *   1. *상속이 있어야한다
 *   2. 메소드명이 동일해야 한다
 *   3. 매개변수가 동일해야 한다
 *   4. 리턴형이 동일해야 한다
 *   5. 접근지정어 확대가 가능하다 => 축소는 불가능
 *        <=== 확대                 축소 ===>
 *      public > protected > default > private
 *     void aa()
 *        |
 *     private aa() => 접근지정어 축소 오류!
 *     
 *     void aaa()
 *     	  |
 *     protected aaa() => 접근지정어 확대
 * 
 *  -----------------------------------------------------------------
 *                    오버로딩                      오버라이딩
 *  -----------------------------------------------------------------
 *  메소드명             동일                          동일
 *  -----------------------------------------------------------------
 *  상태            같은 클래스 내                   상속이 된 상태
 *  -----------------------------------------------------------------
 *  매개변수     매개변수 갯수, 데이터형이 다르다            동일
 *  -----------------------------------------------------------------
 *  리턴형             관계없음                         동일
 *  -----------------------------------------------------------------
 *  접근지정어          관계없다                  확대/동일만 가능(축소불가)
 *  -----------------------------------------------------------------
 
 *  오버로딩 => 같은 메소드를 이용해서 새로운 기능 생성
 *  오버라이딩 => 상속해서 받은 기능을 변경해서 사용
 *  상속 => 오버라이딩(변경해서 이용 가능)
 *  
 *  상속을 내리면 복사(메소드, 변수) => X
 *  따로 메모리에 저장 후 사용이 가능하게 연결시킴
 *  ----> super / this
 *  
 *  class A {
 *  	int a, b;
 *  }
 *  
 *  class B extends A {
 *  	int c;
 *  }
 *  
 *  B b = new B();
 *  
 *  ----super-----
 *      a, b      <----
 *    100  200         |
 *  --------------     |
 *                     | 연결이 가능하게 만들어준다
 *  ----this----- -----
 *       c        
 *   super.a = 100;
 *   super.b = 200;
 *   this.a == super.a
 *   // a,b => 변수의 오버라이딩 => super.a와 this.a는 다르다
 *  -------------
 *  
 *
 */
//class A {
//	void disp() {
//		
//	}
//}
//
//class B extends A {
//	 void disp() {
//		
//	}
//}
class Animal {
	public void run() {
		System.out.println("두발로 걷는다...");
	}
	
	// 오버로딩 => 기능 추가
	public void run(int a) {
		System.out.println("두발로 걷는다...");
	}
	
	public void eat() {
		System.out.println("수저로 먹는다...");
	}
}
class Dog extends Animal {

	// 오버라이딩 => 기능 변경
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개밥을 먹는다...");
	}
	
}
class Pig extends Animal {

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("먹는다...");
	}
	
}
class Super {
	int a, b; // super
	public void display() {
		System.out.println("a = " + this.a);
		System.out.println("b = " + this.b);
	}
}
class Sub extends Super {
	int c;
	int a,b; // this  => 변수 오버라이딩 => this/super를 따로 제어할때
	public Sub() {
		super.a=100;
		super.b=200;
		this.a = 1000;
		this.b = 2000;
	}
	public void print() {
		super.display();
		//System.out.println("a(super) = " + super.a);
		//System.out.println("b(super) = " + super.b);
		System.out.println("a = " + this.a);
		System.out.println("b = " + this.b);
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog dog = new Dog();
//		dog.run();
//		dog.eat();
//		Pig pig = new Pig();
//		pig.run();
//		pig.eat();
		Sub s = new Sub();
		s.print();
	}

}
