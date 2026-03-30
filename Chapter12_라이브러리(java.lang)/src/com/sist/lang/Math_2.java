package com.sist.lang;
/*
 *  import static => 클래스 이름 안붙여도됨(static 메소드만)
 *  Math는 모든 메소드가 static이므로 효율적
 *  ceil() / random() => 나머지는 오라클에서
 *  toString() / equals() / hashCode() / clone / getClass
 */
import static java.lang.Math.*;
import static java.lang.String.*;
public class Math_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)ceil(10/3));
		System.out.println(random());
		System.out.println(valueOf(10.9));
	}

}
