/*
 *  예외처리의 종류
 *   1. ***직접 처리(80%)
 *       => 에러 복구 => try-catch
 *   2. **간접 처리(19%)
 *       => 에러 회피/떠넘기기 => throws Exception
 *   3. 임의 발생
 *       => 테스트 / 견고한 프로그램 => throw
 *   4. 사용자 정의(1%)
 *   	 => 지원하지 않는 예외
 *   		class MyException extends Exception {}
 * 
 * 1) 에러 복구(try-catch)
 *     - 형식)
 *     	  try {
 *     	 		정상 수행이 가능한 문장
 *     	  } catch (예상되는 예외처리 클래스) {  => 여러개 사용이 가능(순서 중요)
 *     			에러 발생 시 복구나 처리할 문장
 *     	  } finally { // 생략 가능
 *     			try/catch절 상관없이 무조건 수행하는 문장
 *               => 파일 닫기 / 오라클 연결 해제 / 서버 닫기 => 반드시 수행해야 하는 문장
 *     	  }
 * 
 * 
 * 
 * 
 */
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		try {
			System.out.println("1");
			System.out.println("2");
			int a = 10/0;
			System.out.println("3");
			System.out.println("4"); 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("5");
			e.printStackTrace();
		} finally {

			System.out.println("6");
		}
		System.out.println("종료");
	}

}
