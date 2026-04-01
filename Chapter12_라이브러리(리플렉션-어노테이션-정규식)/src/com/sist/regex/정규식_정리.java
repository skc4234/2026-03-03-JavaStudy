package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
 *  - 정규식
 *     => 문자의 형태(패턴)를 만드는 과정
 *     => replaceAll(regex, s) / split(regex) 등
 *     => 기호 정리
 *         1) [] => 한개의 문자
 *             - [a] 
 *             - [abc]=>a|b|c
 *             - [a-z]=>소문자
 *             - [A-Za-z]=>알파벳 전체(contains)
 *             - [가-힣]=>한글 전체
 *             - [0-9]=>숫자 전체
 *             - ^[A-Za-z] : startsWith(알파벳)
 *             - [A-Za-z]$ : endsWith(알파벳)
 *          2) ^ : 시작 / $ : 끝
 *          3) + => 1개 이상 반복
 *              abc+ => abcccc
 *              (abc)+ => abcabcabc
 *          4) * => 0개 이상 반복
 *              <table>
 *              <caption>? => 무조건 한개
 *              	<tr>*  => 있을수도 있고 없을수도 있다 
 *              	</tr>
 *              </table>
 *           5) . => 임의의 한글자
 *               - 오라클에서는 _
 *           6) ? => 없거나 단 한개
 *           7) | => or
 *           8) {n}   => n번 반복(글자수)
 *              {n,}  => 최소 n번 반복
 *              {n,m} => n이상 m이하 반복
 *           9) () => 그룹
 *               (abc)+ => abcabcabc
 *           10) ^[가-힣] => 한글 제외
 *         ============================== matchers(regex) => true/false
 * 
 * 
 * 
 * 
 */
public class 정규식_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg = "내 전화번호는 010-1123-2354이고" +
//		             "회사전화는 02-424-5241 입니다";
//		// 전화번호만 추출
//		String regex = "\\d{2,3}-\\d{3,4}-\\d{4}";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		while(m.find()) {
//			System.out.println("전화번호 : " + m.group());
//			System.out.println(m.start() + " " + m.end());
//		}
		
//		String msg = "비밀번호 : 1234, 또 다른 비밀번호 : 56787";
//		String regex = "\\d+";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		while(m.find()) {
//			System.out.println("비밀번호는 " + m.group());
//		}
		
//		String email = "test@example.com";
//		String regex = "^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}"; 
//		boolean result = Pattern.matches(regex, email);
//		if(result) {
//			System.out.println("이메일 형식이 맞습니다.");
//		}
//		else {
//			System.out.println("잘못입력되었습니다.");
//		}
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		//System.out.println(today);
		
		String regex = "(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(today);
		while(m.find()) {
			System.out.println(m.group());
			System.out.println("년도 : " + m.group(1));
			System.out.println("월 : " + m.group(2));
			System.out.println("일 : " + m.group(3));
		}
		/*
		 *  Pattern.matchers() => equals() => 전체문장
		 *  Matcher.find() => contains() => 포함
		 *   => 찾은 문자열 : group
		 *   => replaceAll()
		 *   => () 하나당 그룹 하나씩
		 *   ----------------------------------
		 *   데이터셋 => 데이터 사전
		 *   
		 *   크롤링 : HTML / JavsScript
		 *       class 이름 / 정규식
		 *    => Youtube : 유료(해킹)
		 *    => 무료 API key 사용
		 * 
		 */
		
		
		/*
		 *  Matcher
		 *   - matchers() : 패턴과 전체 문자열의 일치여부 확인 => boolean
		 *   - find() : 패턴과 부분 문자열의 일치여부 확인
		 *   - group() : 찾는 문자열 출력 => ()수에 따라 출력
		 *   - start() : 찾는 문자열의 첫번째 위치 인덱스 번호 반환
		 *   - end() : 찾는 문자열의 마지막 위치 인덱스 번호 반환
		 *   - replaceAll() : 바꿀 문자열로 대체
		 *   
		 * 
		 * 
		 */
	}

}
