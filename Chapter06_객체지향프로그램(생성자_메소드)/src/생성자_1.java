/*
 *  1. 저장 => 메모리 저장 구조
 *  	1) MethodArea / StaticArea
 *  		=> 정적 변수, 메소드 정보
 *  		=> 생성 시점 : 컴파일 시 자동 생성
 *  		=> new 없이도 사용 가능 / 프로그램 종료시까지 유지
 *  		=> 접근 : 클래스명.변수명 / 클래스명.메소드명
 *  	2) Stack
 *  		=> 지역변수 / 매개변수
 *  		=> 생성 시점 : 메소드 호출 시, 소멸 시점 : 메소드 종료 시 메모리에 의해 자동 해제
 *  		=> 사용자가 직접 초기화
 *  		=> {} 안에서만 사용 가능하다
 *  3) Heap
 *  		=> 객체의 실제 데이터가 저장되는 위치 / 배열 등
 *  		=> 생성 : new 사용할 때마다 새로운 메모리 생성 / 소멸 : 사용하지 않거나 null값인 경우(Gabage Collection에 의해 해제)
 *  		=> 프로그래머가 직접 메모리 크기를 할당해서 저장 공간 크기를 생성
 *  			=> 자동 초기화(기본값)
 *  --------------------------------------------------------------
 *                MethodArea         Stack          ap
 *  ---------------------------------------------------------------
 *  저장변수   정적변수                지역/매개변수   인스턴스변수           
 *           => 한개의 메모리에 저장    => new 사용때마다 따로저장 => 새로운 메모리 생성
 *           => 공유변수
 *  --------------------------------------------------------------
 *  저장시점   컴파일시(자동)          메소드 호출 시
 *  ------------------------------------------------------------------		
 *  초기화      자동 초기화           직접 초기화        자동 초기화
 *  ---------------------------------------------------------------------------
 *  
 *  ---------------------------------------------------------------
 *    1) 초기값 => static{} => {} => 생성자
 *    2) 클래스 블록 안에는 선언가능(구현 x)
 *  
 *  2. 멤버변수
 *  	- 정적 변수 : static => 공유변수 => 메모리 공간 1개
 *  	- 인스턴스 변수 : new 사용시마다 => 메모리가 따로 생성
 *  3. 4대 특성(권장사항) (면접용)
 *  	- 캡슐화(보안) => 데이터 보호 / 포함(재사용) / 수정(오버라이딩)
 *  	  ㄴ변수 : private, 읽기/쓰기 : getter, setter
 *  	- 다형성
 *  		ㄴ 오버라이딩 : 상속받아서 메소드의 기능을 변경(modify) / c추가
 *
 *  4. 상속 / 클래스의 종류(추상 클래스, 인터페이스)
 *  5. 예외처리 : 견고하지 못함 -> 사전에 에러를 방지
 *  	조립 => 사용자 정의 + 인터페이스      
 *  ------------------------1권(기초문법)
 *;  
 *  6. 라이브러리
 *  	=> java.lang.* : Object, String, StringBuffer, Wrapper, Math
 *  	   java.util.* : StringToken, Collection(ArrayListm, Map, Set), Scanner
 * 		   java.io.* : 메모리 / 파일 / 네트워크 관련
 * 		   java.net.* : 네트워크
 * 		   java.sql.* : 데이터베이스
 * 		=> 콘솔 / 웹(자바 동일)
 * 
 * 
 *   1. 변수 ==> 초기값 : 프로그램에서 처음부터 필요한 데이터가 뭔지
 *   2. 명시적 초기값
 *   3. static 블록 => 인스턴스 변수는 사용x
 *   	static {
 *   		구현
 *   	}
 *   4. 인스턴스 블록
 *      { 
 *      	구현 => 인스턴스 변수의 초기화 / static 변수도 가능 
 *      }
 *   5) 생성자 : 인스턴스 변수의 초기화 / static  변수 가능
 * 
 */
//초기화 블록
/*
 * Sawon s1 = new Sawon();
 * 			  -------------> Sawon 크기의 메모리 생성 => 메모리 주소를 s1에 대입
 * 							4byte*5 = 20byte / 모든 클래스는 메모리 크기가 4byte
 * 						    - new와 생성자는 단독으로 사용할 수 없다 => 반드시 new 생성자;
 * ---s1----
 * 메모리 주소
 * 0x100          0x100
 * ---------  ----sabun----- s.sabun
 *                  0
 *            ----name----- s.name
 *                 null
 *            ----dept------ s.dept
 *                  null
 *            ----job----  s.job
 *                null
 *            ----loc----  s.loc
 *                null
 *            ------------
  	- 초기화블록 : 1번만 수행 가능 // 연산 처리, 파일 읽어올때
  	- 생성자 : 사용자의 값을 받아서 초기화
  	 => 시작과 동시에 처리하는 기능  ex) DB 드라이브 등록 / 자동 로그인 /
 
 
 */
import java.io.*;

class Sawon {
	// 명시적 초기화
	int sabun = 100;
	String name="홍길동", dept="개발부", job="사원", loc="서울";
	// 정적 변수는 MethodArea
	static String compony = "SIST";
	
	// 초기화블록 => 파일
	{
//		sabun = 200;
//		name = "심청이";
//		dept = "총무";
//		job = "대리";
//		loc = "부산";
		
		try {
			FileReader in = new FileReader("c:\\javadv\\sawon.txt");
			int i = 0;
			String result = "";
			while((i=in.read())!=-1) {
				result += (char)i;
			}
			in.close();
			
			String[] info = result.split("\\|");
		    /*
		     * 문자열을 다른 데이터형으로 변경
		     * 1. String -> int
		     *    => Integer.parseInt("10")
		     * 2. String -> double
		     *    => Double.parseDouble("10.5")
		     * 3. String -> boolean
		     *    => Boolean.parseBoolean("true")
		     *  67page
		     *  웹 / 윈도우 => 모든 데이터가 String => 필요한 데이터형으로 바꿔야함
		     */
			sabun = Integer.parseInt(info[0]);        
			name = info[1];
			dept = info[2];
			job = info[3];
			loc =  info[4];
			
			
			// throws => 간접 처리 / 에러 선언 => 다음 사용시에 예외처리
			// 자바 : 예외처리를 반드시 한다 / 생략이 가능
			//        컴파일               실행시
		} catch (Exception e) {
			// TODO: handle exception
		}

		compony = "쌍용 강북"; // 인스턴스 블록 => 인스턴스 변수, 정적 변수 사용 가능
	}
	
	// static 영역은 static 변수만 사용 가능(인스턴수 변수x)
	static {
		//sabun = 300;
		compony = "SIST 쌍용";
		
	}
	
	
	// 동작) 1. 기본값 => 명시적 초기화 => static 블록 => 인스턴스 블록 => 생성자
	// static 변수 초기화 => static 블록, 인스턴스 변수 초기화 => 생성자
	// 원칙은 명시적 초기화 가능하면 명시적 초기화 우선
	/*
	 * 생성자 / 소멸자 
	 *   class className {
	 *   	멤버 변수 => 프로그램 종료시까지 사용
	 *   	생성자 => 변수의 초기화 담당
	 *   	메소드 => 기능 수행
	 *   }
	 *   
	 *   생성자
	 *    역할 : 멤버변수의 초기화 담당(static 변수, 인스턴스 변수 모두)
	 *    		프로그램 시작과 동시에 처리하는 기능
	 *    		웹 : 자동로그인 / 데이터베이스 연결
	 *    		=> 생략이 가능 : 자동으로 컴파일러에 의해 생성 => 기본 생성자만 생성(매개변수 없는)
	 *          => 무조건 생성자는 필요(1개 이상)
	 *    특징 : 리턴형이 없다
	 *    	    호출시에는 반드시 new 동반
	 *    		생성자를 여러개 만들 수 있다(오버로딩)			
	 *    		상속 제외
	 *    **오버로딩 : 같은 이름으로 여러개 기능을 수행(새로운 메소드)
	 *    			 1) 메소드 동일
	 *    			 2) 리턴형 관계없음
	 *    			 3) 매개변수의 개수 or 데이터형이 다른 경우에 사용
	 *    		인스턴스 변수 / 인스턴스 메소드 저장 시 필수 호출
	 *   소멸자 : finalize() => 바로 호출이 안됨 => System.gc()
	 *   		 멀티미디어 : 화상 채팅 / 동영상 스트림
	 */
	
}
public class 생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1 = new Sawon();
		// 다른 영역에는 침범 불가 => 지정된 주소에 있는 데이터만 사용 가능
		System.out.println("데이터 저장된 위치 : " + s1);
		System.out.println("sabun : " + s1.sabun);
		System.out.println("name : " + s1.name);
		System.out.println("dept : " + s1.dept);
		System.out.println("job : " + s1.job);
		System.out.println("loc : " + s1.loc);
		System.out.println("회사명 : " + Sawon.compony);
		
		
		Sawon s2 = new Sawon();
		System.out.println("데이터 저장된 위치 : " + s2);
		System.out.println("sabun : " + s2.sabun);
		System.out.println("name : " + s2.name);
		System.out.println("dept : " + s2.dept);
		System.out.println("job : " + s2.job);
		System.out.println("loc : " + s2.loc);
		System.out.println("회사명 : " + Sawon.compony);
	}

}
 