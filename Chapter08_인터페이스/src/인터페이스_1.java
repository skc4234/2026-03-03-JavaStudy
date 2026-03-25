/*
 * 
 *  인터페이스
 *   1. 기능(메소드)을 정해둔다
 *   	 => 모든 개발자가 동일한 메소드를 구현 => 표준화
 *   	               -----------> 분석하기 편함
 *   2. 사용하는 이유
 *   	 1) 무엇을 구현해야 하는지 알 수 있음(규격화)
 *   	 2) 여러 개발자가 동시에 개발
 *   		 => 이 기능은 반드시 개발해야한다
 *   			------
 *              ex) 웹 - 메인 페이지, 게시판, 공지사항 : 관리자모드, 회원가입/로그인
 *               => 매뉴얼 => 인터페이스
 *   3. 내부 구현이 변경되어도 메소드는 유지
 *   4. 유지보수가 편하다
 *   -------------------------
 *    인터페이스   =>   클래스
 *   -------------------------
 *     기능 설정        구현
 *   -------------------------
 *    메소드 선언     메소드 구현
 *   -------------------------
 *     다중 상속      단일 상속
 *   -------------------------
 * 	  class => class  = extends
 *    interface => class   = implements
 *    class => interface  = X
 *   -------------------------
 *   class A   class B
 *   class C extends A, B  = X
 *   
 *   interface A     interface B
 *   interface C extends A, B   = O
 *   
 *   인터페이스는 추상클래스의 일종
 *    => 추상 클래스의 단점을 보완 => 다중 상속
 *    - 장점
 *       1) 기능 설계(메소드 선언만)
 *           => 개발 기간 단축
 *       2) 개발자가 같은 메소드를 구현하기 때문에 표준화가 가능 => 라이브러리
 *           => 프로그램은 정답이 없다 => 요구사항에 의한 결과물 산출 목표
 *              가독성 / *유지보수
 *       3) 결합도가 낮다 => 수정 시에 다른 클래스에 영향을 미치지 않는다
 *           => Spring : 결합성이 낮은 프로그램으로 만들어져 있다
 *       4) 소스의 통일화 => 분석이 가능
 *       5) 서로 다른 클래스를 연결해서 사용 가능 => 리모콘
 *       6) 관련된 클래스를 모아서 한개의 이름으로 제어
 *       7) 독립적으로 사용 가능하다
 *       
 *       라이브러리 List(인터페이스)
 *       		   |
 *         ------------------ 구현된 클래스
 *         |       |        |
 *     ArrayList  Vector  LinkedList
 *         |        |          |
 *        최근     예전에 사용    C언어
 *     (Vector보완)
 *  ----------------------------------------
 *  
 *  인터페이스의 구성요소
 *      public, default 만 가능
 *   => public interface InterfaceName {
 *   	                 -------------  변수 식별자와 동일 => 첫번째 대문자
 *      	=========================
 *      	변수
 *      	 => 상수형 변수만 저장
 *      	 ex) private int a;
 *      		 -------     --
 *            public만 가능    선언과 동시에 초기화 되어야함(반드시 값을 지정)
 *      	=========================
 *      	선언된 메소드
 *      	 => 추상 메소드
 *      	 public abstract void display(); // public abstract 생략 
 *      	----------------
 *      	  => 자동 추가
 *          공통으로 구현해야 하는 부분을 설정
 *           ex) 회원가입
 *                - 아이디 중복체크
 *                - 비밀번호 규칙
 *                - 우편번호 검색
 *                - 이메일 충돌방지
 *                - 전화번호 동일x
 *      	=========================
 *      	구현된 메소드
 *      	 - default 메소드
 *      	    => jdk1.8부터 추가
 *      	   public default 리턴형 메소드(매개변수) { // public 생략
 *               	
 *      	   }
 *      
 *      	 - static 메소드
 *      		public static 리턴형 메소드(매개변수) { // public 생략
 *      
 *      		}
 *       		
 *      	=========================
 *      	=> 모든 변수/메소드는 public
 *      }
 *      
 *      클래스는 접근지정어가 선택적
 *      인터페이스는 접근지정어가 필수(public)
 *     
 *      - 추상클래스
 *         기본은 만들어줌 / 나머지는 개발자에게 맡긴다 => 반쪽 미완성 클래스
 *      	- 기본 레시피 / 매장 독자적 개발
 *      - 인터페이스
 *         무엇을 해야하는지 알려준다(구현x) => 완전한 미완성 클래스
 *        => 공통점 : 객체 생성이 안됨
 *             => 상속 => 구현해서 사용이 가능
 *             
 *    요구사항 - 사이트 벤치마킹
 *    		   ============ => 어떤 기능이 필요한지 설계
 *    			자바 => 인터페이스
 *   ----------------------------------------------
 *   
 *   면접 98%
 *              인터페이스          추상클래스
 *   --------------------------------------------
 *    개념        설계중심          기본+규칙
 *    			  규칙            재사용 중심
 *   ----------------------------------------------
 *    구현코드     거의없음          구현+미구현
 *    		  경우의 수 많을 경우
 *   --------------------------------------------
 *    상속        다중상속           단일상속
 *   ---------------------------------------------
 *   사용 목적    강제로 구현       공통 기능을 재사용
 *   			수정 유연성
 *   ---------------------------------------------
 *  => 인터페이스는 기능 설정을 정해놨기 때문에 개발시간이 단축된다
 *  	같은 메소드를 이용
 *  => 상속      implements        extends
 *  
 *  **인터페이스도 구현된 메소드 가능 => default / static 메소드
 *  **인터페이스는 모든 요소가 public이다
 *  **변수는 상수형만 사용 가능 => 반드시 초기화 사용
 *  ** 왜 public인가 
 *    1) 다른 클래스와 통신
 *    2) 어떤 위치든 접근이 가능해야함
 *    	  => public이 없는 경우에는 public 자동 설정\
 *    
 *  ** 인터페이스 사용처
 *    1) 윈도우의 이벤트 처리
 *    	  - JButton / JTextField / MouseClick ...
 *    2) 결합성이 낮은 프로그램 : Spring
 *    3) 비슷한 목적의 프로그램이 여러개 있는 경우
 *    	  - 데이터베이스 / 파일 / 네트워크
 *    
 *    
 */
import java.util.*;
interface I {
	int a = 100; // public static final 생략 => default 아님!!
	void display(); // public abstract 생략
	default void aaa() { // public 생략
		
	}
}

interface II {
	void display();
	default void aaa() { // 선택적 오바라이딩
		
	}
}

class A implements II {

	@Override
	public void display() { // 반드시 구현
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aaa() { // 필요시에 오버라이딩
		// TODO Auto-generated method stub
		II.super.aaa();
	}
	
	
}
class B implements II {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
class C implements II {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 메소드 add 오버라이딩
		//List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		
		list.add("홍길동");
		list.add("심청이");
		list.add("이순신");
		for(String name : list) {
			System.out.println(name);
		}
	}

}
