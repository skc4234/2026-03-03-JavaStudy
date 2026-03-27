package com.sist.exception;
// finally => return  사용 => 오류?
public class 예외처리_4 {

	public static int test() {
		try {
			int a = 10/0;
			return 1;
		} catch(Exception e) { // catch(Throwable e)
			return 2;
		}
		finally { // finally 에서는 return 금지  
			return 3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test());
	}

}
