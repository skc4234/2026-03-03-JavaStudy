package com.sist.back;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
// 사용자 정의 클래스 => 패키지가 다르면 import
/*
 *    CheckException    /    UnCheckException
 * 컴파일 시에 예외처리 확인     예외처리를 확인하지 않음
 *  => IO(파일명)              실행 시 예외처리
 *  => URL / Network / DB
 * 
 */
public class GenieMusic extends CommonsMusic {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			// 예외 처리 : 사전에 에러를 감지 => 처리
			// 비정상 종료 방지 => 정상적으로 종료시킴 
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements poster = doc.select("table.list-wrap a.cover img");
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i=0; i<title.size(); i++) {
				Music m = new Music();
				m.setMno(i+1);
				// <a>aaa</a> => text()
				// <img src="..."> => attr()
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				m.setPoster(poster.get(i).attr("src"));
				String temp = etc.get(i).text();
				String state = "";
				String id = "";
				if(temp.equals("유지")) {
					state = "유지";
					id = "0";
				}
				else {
					state = temp.replaceAll("[^가-힣]", "");
					id = temp.replaceAll("[^0-9]", "");
				}
				m.setState(state);
				m.setIncrement(Integer.parseInt(id));
				musics[i] = m;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
