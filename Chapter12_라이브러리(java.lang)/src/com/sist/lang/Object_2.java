package com.sist.lang;
// 복제 => clone()
/*
 *  - 얇은 복사(Call by Reference)
 *     => 같은 메모리 주소를 사용 => 수정 시 복사한 객체도 바뀜
 *         ex) class A
 *             A a = new A();
 *             A b = a;
 *             a가 변경되면 b도 변경된다
 *             
 *  - 깊은 복사(Call by Value)
 *     => 새로운 메모리 생성
 * 
 */
class Member implements Cloneable {
	String name = "홍길동";
	public void display() {
		System.out.println("이름 : " + name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

class CallByReference {
	public void change(Member m) {
		m.name = "박문수";
	}
}
public class Object_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 객체 생성
//		Member m1 = new Member();
//		m1.display();
//		
//		// 객체 주소 복사
//		Member m2 = m1; // Call by Reference
//		m2.name = "심청이";
//		m2.display();
//		m1.display();
//		System.out.println("m1의 주소 : " + m1);
//		System.out.println("m2의 주소 : " + m2);
//		
//		CallByReference c = new CallByReference();
//		c.change(m1);
//		m1.display();
//		m2.display();
		
		// 객체 전체 복사(깊은 복사) => Adapter 패턴
		// 기존에 있는 모든 데이터를 복사해서 새로운 메모리에 저장
		// git clone
		Member m1 = new Member();
		m1.name = "이순신";
		// 리턴형 Object => 강제 형변환 / 예외처리
		Member m2 = (Member)m1.clone(); // Call by Value

		System.out.println("m1의 주소 : " + m1);
		System.out.println("m2의 주소 : " + m2);

		System.out.println("m1의 name : " + m1.name);
		System.out.println("m2의 name : " + m2.name);
		
	}

}
