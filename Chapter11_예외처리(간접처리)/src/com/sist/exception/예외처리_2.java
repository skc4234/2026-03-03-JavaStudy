package com.sist.exception;
// 멀티 catch => 다중 예외 처리

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String n1 = "10";
			String n2 = "0 ";
			int[] arr = {
					Integer.parseInt(n1), Integer.parseInt(n2) // 1. 정수형변환 에러
			};
			int res = arr[0]/arr[2]; // 2. 인덱스 번호 실수  3. 0으로 나눌수 있는 가능성
			System.out.println(res); 
		}
		// 멀티 catch 
		catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
		// 기본은 catch(Exception e) {}
		
		
		
//		// catch 절 == else if 처럼 하나만 처리
//		catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
//		// 상위클래스는 제일 아래로 => else
//		catch (Exception e) { // 예측 불가능 에러
//			e.printStackTrace();
//		}
	}

}
