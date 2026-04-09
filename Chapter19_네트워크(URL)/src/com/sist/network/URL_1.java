package com.sist.network;
/*
 * -java.net.*
 *  - URL / URI(검증된 주소)
 *    ----------> 웹 연결 => 데이터 수집
 *  - **URLEncorder(인코딩)
 *    => byte[] 형식
 *  - Socket : 연결 기기 => 다른 사람과 통신 => Client => (IP:전화번호, Port:연결선)
 *                                                    고정         변동 
 *  - ServerSocket : 서버 연결기기 => 기지국 => 접속자 받기
 *    => 핸드폰
 * 
 * https://www.10000recipe.com/index.html
 * https://www.10000recipe.com/recipe/list.html?q=%EC%86%8C%EA%B8%88
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class URL_1 {
	// 데이터 수집용
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = scan.next();
		String u = "https://www.10000recipe.com/recipe/list.html?q="+URLEncoder.encode(fd, "UTF-8");
		try {
			// == Jsoup.connect()
			URL url //= new URL("https://www.10000recipe.com/index.html");
			        //= URI.create("https://www.10000recipe.com/index.html").toURL();
					= URI.create(u).toURL();
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn!=null) { // 사이트에 연결되었다면
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true) {
					String line = in.readLine();
					if(line==null) break;
					else {
						System.out.println(line);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
