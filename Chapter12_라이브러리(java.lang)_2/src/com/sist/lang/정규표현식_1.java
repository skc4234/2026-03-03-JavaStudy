package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  정규표현식
 *   => 원하는 패턴을 가지고 있는 문자열을 검색/검사/대체
 *    - 문자열 패턴 검색
 *       => 특정 규칙(정규식)
 *       => JavaScript, 오라클
 *       
 * 
 */
public class 정규표현식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "abc123";
		// 숫자 포함여부 확인
		// 숫자 => \d => \\d   or   [0-9]
		// [abc] : abc 중에 한개
		// [^abc] : abc 외에 다른 한 문자
		// [a-zA-z] : 알파벳 중에 한개
		// \들어간 식은 \\쓸것
		// \s : 공백
		// \w : 한개의 알파벳 또는 숫자 => [a-zA-z_0-9]
		// \. : . => 임의의 한글자
		// ? : 없음 또는 1개
		// * : 없음 또는 1개 이상
		// + : 1개 이상
		// {n} : 정확히 n개
		// {n,m} : n부터 m까지(범위)
		// a|b : a이거나 b인 경우
		// () : 그룹
		// ((238.654.23).53) => group(1) : 238.654.23
		// replaceAll, split 등에 정규식 사용
		
		boolean result = msg.matches(".*\\d+.*");
		System.out.println(result);
		
		String res = "맛있는,맛있고,맛있게,맛있어,맛있네,맛있나,맛없네,맛있난요";
		Pattern p = Pattern.compile("맛있.*"); // 맛있 뒤에 1글자
		Matcher m = p.matcher(res);
		while(m.find()) {
			System.out.println(  m.group());
		}
		
		System.out.println("======== 데이터 추출 =========");
		String won = "가격 : 30000 원";
		String change = won.replaceAll("[^0-9]", "");
		System.out.println(change);
		
		
		/*
		 *  이메일 / 전화번호 / 비밀번호 검증
		 *  로그 분석
		 *  크롤링 / 텍스트마이닝
		 *  문자열 필터링
		 *  
		 *  문자 규칙(패턴) => 다루는 언어
		 * 
		 *  ^ : 시작, $ : 끝
		 *  [^0-9] : 숫자를 제외하고
		 *  ^[0-9] : 숫자로 시작하는 
		 */
	}

}
