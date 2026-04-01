package com.sist.regex;
// 무조건 한번 이상 반복 => +
//  \\+  \\.  \\* => 기호로 사용하지 않고 그 자체로 사용
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("heeeelo".matches("he+l+o"));
		
		System.out.println("he".matches(".."));
		System.out.println("he".matches("h*."));
		System.out.println("he".matches("he*"));
		System.out.println("he".matches("h?e+"));
		
//		try {
//			Document doc =
//					Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get();
//			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
//			Matcher m = p.matcher(doc.toString());
//			while(m.find()) {
//				String s = m.group();
//				s=s.substring(s.indexOf("=")+1, s.indexOf("\""));
//				System.out.println(s);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}

}
