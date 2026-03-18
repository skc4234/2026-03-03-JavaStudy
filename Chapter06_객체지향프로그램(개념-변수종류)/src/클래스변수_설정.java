/*
 * 
 * 
 * 
 */
class Member {
	int mno;
	String name;
	static String compony = "Daum";
	// 클래스는 한명의 대한 정보만 저장
}
public class 클래스변수_설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		m1.mno = 100;
		m1.name = "홍길동";
		m2.mno = 200;
		m2.name = "심청이";
		m3.mno = 300;
		m3.name = "박문수";
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
		System.out.println("m3 = " + m3);
		/*
		 * Stack          Heap             MethodArea
		 *                                     compony
		 *                                     "Daum" => m1,m2,m3이 접근 가능
		 *                                  		=> 공통으로 사용하는 메모리 공간
		 *                                  		=> static
		 * 
		 */
		System.out.println("회원 1 회원번호 : " + m1.mno);
		System.out.println("회원 1 이름 : " + m1.name);
		System.out.println("회원 2 회원번호 : " + m2.mno);
		System.out.println("회원 2 이름 : " + m2.name);
		System.out.println("회원 3 회원번호 : " + m3.mno);
		System.out.println("회원 3 이름 : " + m3.name);
		
		// 변경
		m1.name = "홍길수";
		System.out.println("회원 1 회원번호 : " + m1.mno);
		System.out.println("회원 1 이름 : " + m1.name);
		System.out.println("회원 2 회원번호 : " + m2.mno);
		System.out.println("회원 2 이름 : " + m2.name);
		System.out.println("회원 3 회원번호 : " + m3.mno);
		System.out.println("회원 3 이름 : " + m3.name);
		
		m1.compony = "kakao"; // 공유변수(static)
		System.out.println("회원 1 회사명 : " + m1.compony);
		System.out.println("회원 2 회사명 : " + m2.compony);
		System.out.println("회원 3 회사명 : " + m3.compony);

		Member.compony = "Naver";
		System.out.println("회원 1 회사명 : " + m1.compony);
		System.out.println("회원 2 회사명 : " + m2.compony);
		System.out.println("회원 3 회사명 : " + m3.compony);
		
		/*
		 * 인스턴스 변수
		 *  => 객체.변수명
		 * 정적 변수
		 *  => 객체.변수명 / 클래스명.변수명 => 클래스 변수
		 */
		
	}

}
