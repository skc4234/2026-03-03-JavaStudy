/*
 *   예외 처리
 *    1. 목적
 *    	  => 비정상종료를 방지하고 정상 수행이 가능하게 만듦
 *    2. 정의
 *    	  => 사전에 에러를 방지하는 프로그램
 *     - 에러가 발생하면 에러난 부분 제외하고 수행 => 건너뛴다(에러 처리 x)
 *     - 에러의 일종(예외)
 *        사용자 : 잘못된 입력을 했을 경우
 *         ex) ID 중복체크를 안하고 회원가입 할 경우
 *        개발자 : 코딩실수
 *         ex) 배열의 인덱스 번호 오류 / 형변환(웹/윈도우 는 문자열로 처리 => 코딩에서 Integer로 변환)
 *   --------------------------------------------------------
 *   - 에러
 *   	=> 수정이 불가능
 *   - 예외
 *   	=> 소스상에서 수정이 가능한 에러
 *  
 *   *상속 과정 : 코딩 순서
 *         Object
 *            |
 *        Throwable : 에러 처리의 최상위 클래스
 *            |
 *     ---------------
 *     |             |
 *   Error        Exception
 *                   |
 *           ---------------------------
 *           |                         |
 *      CheckExeption            UnCheckException
 * 컴파일 시(Compile Error)      실행 시(Runtime Error)
 *    => 반드시 예외처리           => 상황에 따라 선택
 *   IOException : File
 *    => java.io
 *   SQLException : Oracle
 *    => java.sql
 *   MalformedURLException : 네트워크
 *    => java.net
 *    => URL
 *   ClassNotFoundException : 메모리 할당 오류
 *    => java.lang
 *   InterruptedException : 쓰레드
 *    => java.lang
 *        ...
 *        ...
 *   
 * - UnCheckException
 *         |
 *   RuntimeException
 *         |
 *   *NumberFormatException : 정수 변환
 *      => Integer.parseInt("10 ") => 문자열을 정수 변환하지 못하는 경우 예외 발생
 *         Integer.parseInt("A")                  
 *   	- 웹에서 다른 파일로 데이터 전송
 *         list.jsp => detail.jsp?no=8000
 *                               ?no = 8000  => 에러
 *   ArrayIndexOutOfBoundsException
 *    => 배열의 인덱스 초과
 *   *NullPointerException
 *     => 주소값이 없는 경우
 *   ClassCastExeption
 *        ...
 *        ...
 *   => 1. 처리할 수 있는 메소드  2. if문  3. try-catch
 *   
 *   - 에러 확인
 *      => catch 절에서 주로 사용
 *      => getMessage() / **printStackTrace()
 *   
 * 
 */
class A {
	
}

class B extends A {
	
}
public class 예외처리_1 {
	String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A(); => (B)a 불가능  =>  ClassCastException
		try {
			A a = new A();
			B b = (B)a;
		} catch (ClassCastException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		//예외처리_1 a = new 예외처리_1();
		//예외처리_1 a = null;
		//a.msg.substring(2);
		
		
		
		
		
		
		
		
		
		
//		Integer.parseInt("100 ".trim());
//		String[] arr = new String[3];
//		
//		try {
//			arr[0] = "hello";
//			arr[4]="asdf";	
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		System.out.println(arr[0]);	
		
		
		
		
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("run...");
//			}
//		};
//		new Thread(r).start();
		
		//람다->Spring 보안
		//         run 메소드
//		Runnable r = () -> {
//			System.out.println("running...");
//		};
//		new Thread(r).start();
	}

}
