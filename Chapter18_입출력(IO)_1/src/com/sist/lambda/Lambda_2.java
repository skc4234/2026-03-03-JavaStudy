package com.sist.lambda;
/*
 *  - null 대신 사용 => Optional
 *  - orElse("이미지없음.jpg")
 *  - ifPresent
 *  - Optional + stream(데이터가 여러개인 경우)
 * 
 */

import java.util.*;
import javax.swing.*;
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("이름 입력");
		System.out.println(input); // 확인 : "", 취소 : null
//		String result = Optional.ofNullable(input)
//				.filter(s->s.length()>=3) // if 3글자 이상
//				.map(String::toUpperCase) // 대문자로 변경
//				.orElse("입력값 없음");     // 값이 없는 경우면
//		System.out.println(result);
		if(input!=null) { // null값 비교시 == 사용
			if(input.length()>=3) {
				input = input.toUpperCase();
				System.out.println(input);
			}
		}
		else {
			System.out.println("입력값 없음");
		}
	
	}

}
