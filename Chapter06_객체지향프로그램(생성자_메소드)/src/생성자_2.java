/*
 *  객체의 생명주기
 *   설계 =======> 변수의 초기화 =========> 메모리 저장 ====> 활용 ========> 소멸
 * 변수/메소드     생성자 / static {}       new 생성자()    객체.메소드     객체 = null
 * 													   객체.변수      System.gc();
 *  변수의 초기화
 *   => 다른 값을 설정 => 생성자
 *   
 *  생성자의 특징은 클래스명과 동일 / 리턴형은 없는 경우
 *  
 *  1) 생성자
 *     class A {
 *     		A() {} => 기본 생성자
 *          A(int a) {}
 *          ---------> 여러개의 생성자를 만들 수 있다(오버로딩)
 *     }
 */
// 가급적이면 클래스 한개당 파일 1개
class Member implements Cloneable {
	int a;
	public Member() {
		// TODO Auto-generated constructor stub
		a=100;
		System.out.println("Member의 생성자 호출 = a" + a);
	}
	void display() {
		System.out.println("객체 활용");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸...");
	}
	
}

public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		m.display();
		// 소멸
		m = null;
		System.gc();
	}

}
