/*
 *  변수 : 초기값이 없는 상태에는 메모리에 저장안됨
 *  	=> 지역변수
 *  		명시적, 입력, 난수 등
 *  	=> 클래스에 선언된 멤버변수는 자동으로 초기화 => 기본값
 *  	=> 프로그램 구동시 초기값이 필요한 경우
 *  		ex) String URL = "오라클주소";
 *  			파일 읽기, 쿠기 읽기
 *   			---------------------------> 명시적 초기화 불가능 => 초기화블록 / 생성자
 *  초기값 => 생성자
 *  		1. 특징 (일반 메소드와 다르다)
 *  		    1) 클래스명과 동일
 *  			2) 리턴형이 없다 
 *  			3) 오버로딩을 지원한다
 *  			  --------
 *  			   같은 이름의 메소드를 여러개 생성
 *                 -------
 *                 ** 오버로딩(226 page)
 *                 	1) 메소드명이 동일
 *                 	2) 리턴형은 관계없다
 *                 		int a()         => a()
 *                 		double a(int b) => a(int a)
 *                 => 매개변수의 개수가 다르다 / 데이터형이 다르다
 *                 => 접근지정어도 관계없다
 *              4) 같은 클래스 안에서 생성
 *           2. 역할
 *           	 - 멤버변수의 초기화 
 *           	 - 시작과 동시에 처리하는 기능 => 네트워크 / 크롤링 / 데이터베이스 / 웹 / SpringAI / 화면 UI
 *           	 - 클래스를 메모리에 저장하는 경우
 *           		new 생성자();
 * 
 */
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
class A {
	int a, b;
}




//class A {
//	int a,b;
//	
//	//A() {
//	//	System.out.println("생성자 호출");
//	//}
//	void A() { // 리턴형이 붙으면 일반 메소드
//		System.out.println("호출");
//	}
//	A(int a) { // 매개변수가 있는 생성자가 있으면 기본 생성자는 자동추가 안됨
//		System.out.println("생성자 호출");
//	}
//}
public class 생성자_정리 {

	public static void main(String[] args) {
		//A a = new A(3);
		A a = new A();
	}

}
