/*
 *  부분적 처리
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		System.out.println("Start...");
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println(s.trim()); // NullPointerException
			int[] arr = new int[2];
			arr[2] = 100;
			System.out.println(3/0);
			System.out.println(Integer.parseInt("100 "));  // NumberFormatException
			System.out.println("5");	
		}
//		catch(RuntimeException e) {   // 상속 순서 에러 => 상위 클래스는 아래로
//			System.out.println("6. 문자열 처리 에러");
//		}
		catch (ArithmeticException e) { //  /0일때 발생
			// TODO: handle exception

			System.out.println("6. 에러 발생 : 에러 복구");
		} catch(NumberFormatException e) {

			System.out.println("7. 에러 발생 : 에러 복구");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("8. 에러 발생 : 에러 복구");
		}
		catch(RuntimeException e) {   //상위 클래스는 아래로
			System.out.println("6. 문자열 처리 에러");
		}
		
		finally {
			System.out.println("9. 무조건 수행하는 문장");	
		}
		
		System.out.println("End.");
	}

}
