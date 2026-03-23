package com.sist.main;
/*
 *  상속 / this / super / this() / super()
 *   this : 자신의 객체 => 모든 클래스는 this를 가지고 있다
 *  	   this는 객체 생성 시에 주소값 저장
 *  	   this => static으로 되어 있다
 *  	   A a = new A();
 *  	   this = a // JVM에서 자동화
 *   class A {
 *   	1. this 사용처 => 클래스에서만 사용 가능
 *         생성자
 *         인스턴스 메소드
 *         static 메소드/static 블록에서는 사용 불가
 *      2. 매개변수 / 인스턴스 변수가 중복인 경우 => 구분을 위해 this 사용
 *      private int a;
 *      public void display(int a) {
 *      	//a=a; // 매개변수 a
 *      	this.a = a;
 *      }
 *      ==> 윈도우 : 자신의 윈도우창(this)
 *      
 *  접근지정어
 *  
 *   =>   public    >     protected     >     default     >     private
 *       모든 접근          같은 패키지           같은 패키지          같은 클래스
 * 		  		     다른 패키지 상속 클래스
     클래스/생성자/메소드   상속이 많은 경우                          인스턴스 변수
     
     => 제어자
     	 static  /  final  /  abstract
     	 공통 사용    상수       선언만 된(미완성)
     	 		 고정된 메소드   추상클래스/인터페이스
    
    재사용 기법
     1. 상속
         키워드 : extends
         보통 라이브러리를 상속해서 변경한다
         - 단일 상속만 가능하다
         클래스의 크기가 가능하다
         ----------- 포함
         class A 
         class B extends A => A>B
         class A {
         	B b = new B(); => A>B
       	 }
       	 ==> 형변환 : 
       	 	  상속을 내리는 클래스 : double
       	 	  상속을 받는 클래스 : int
        * 모든 클래스는 Object 상속이다 => 최상위 클래스
          => 이미 만들어진 클래스의 변수/메소드를 받아서 처리
              새로운 기능의 확장된 클래스를 만든다
              예외) static / 생성자 / 초기화블록 / private 는 불가능
             => 무조건 상속 => 필요한 경우에만 상속
             ex)
                class A {
                	글쓰기
                	수정
                	상세보기
                	삭제
                	목록
                	추가
                	검색
                }
                class B {
                	글쓰기
                	수정
                	상세보기
                	삭제
                	목록
                	추가
                	검색
                	업로드
                	다운로드
                }
         목적
          => 코드 재사용
          => 유지보수가 편리 : 기능을 미리 알 수 있다
          => 간결, 반복제거
          => 가독성 / 재사용 / 수정 용이
          => 최적화(x) => 메모리 비대 / 상위클래스 => 속도가 느려짐
          => 결합성이 높아진다 => 제약
          => 관련된 클래스를 모아서 한개의 객체명으로 관리
     2. 추상클래스
     3. 인터페이스
    클래스 간에 공통 사용
     1. 내부클래스
         - 멤버 사용 : 공통 사용
         - 익명 사용 : 오버라이딩(상속) => 상속없이 오버라이딩 가능

 */
class Animal {
	String name = "동물";
	public void run() {
		System.out.println("걷는중....");
	}
	public void eat() {
		System.out.println("먹는중....");
	}
}
class Dog extends Animal {
	int age=3;
	/*
	 * 
	 * 		Animal b = new Animal(); => Animal에 있는 변수나 메소드
			Animal a = new Dog();
			// 변수(Animal) / 메소드(Dog) => 변수는 클래스형, 메소드는 생성자 따라감
			// 여러개의 클래스를 하나로 통합
			Dog d = new Dog(); => Dog에 있는 변수나 메소드
	 
	 *
	 */
	public void eat() {
		System.out.println("개가 먹는중....");
	}
}
class Cat extends Animal {
	public void eat() {
		System.out.println("고양이가 먹는중....");
	}
}
class Pig extends Animal {
	public void eat() {
		System.out.println("돼지가 먹는중....");
	}
}
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
		Pig pig = new Pig();
		pig.eat();
		System.out.println("==========================");
		
		// 하나를 가지고 제어 => 클래스를 모아서 관리 
		Animal a = new Dog();
		a.eat();
		a = new Pig();
		a.eat();
		a = new Cat();
		a.eat();
	}

}
