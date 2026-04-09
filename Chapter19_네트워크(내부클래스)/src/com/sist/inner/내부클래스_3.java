package com.sist.inner;
/*
 * 
 * 
 * 
 * 
 */
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
// => 데이터형 => 메모리에 읽기/쓰기
class Movie {
	private String name;
	private String director;
	private String genre;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
// 박스오피스
//searchMainDailyBoxOffice.do
// 실시간 예매율
//searchMainRealTicket.do
// 좌석 점유율 순위
//searchMainDailySeatTicket.do
/*
 * {"startYearDate":"2026.04.08",
 * "endYearDate":"2026.04.08",
 * "startDate":"2026년 04월 08일(수)",
 * "endDate":"2026년 04월 08일(수)",
 * "movieCd":"20254121",
 * "showDt":"20260408",
 * "thumbUrl":"/common/mast/movie/2026/02/thumb/thn_0cead0eb683341f5810aecbaa2d0dded.jpg",
 * "movieNm":"살목지",
 * "movieNmEn":"Salmokji : Whispering Water",
 * "synop":"기이한 소문이 끊이지 않는 저수지 살목지의 로드뷰 화면에\r\n촬영한 적 없는 정체불명의 형체가 포착된다.\r\n오늘 안에 반드시 재촬영을 끝내야 하는 상황 속에\r\n살목지로 향한 PD ‘수인’(김혜윤)과 촬영팀. \r\n\r\n촬영이 시작되자 행방이 묘연했던 선배 ‘교식’(김준한)이 등장하고,\r\n설명되지 않는 일들이 연달아 벌어지며 촬영팀은 점점 아비규환에 빠진다.\r\n\r\n휘몰아치는 공포 속 ‘기태’(이종원)는 ‘수인’을 향해 내달리지만\r\n빠져나오려 할수록 이들은 점점 더 깊은 곳으로 끌려 들어가게 되는데…\r\n\r\n거긴, 절대 살아서는 못 나와\r\n",
 * "prdtYear":"2025",
 * "indieYn":null,
 * "artmovieYn":null,
 * "multmovieYn":null,
 * "showTm":"95",
 * "showTs":"14",
 * "director":"이상민",
 * "prNm":"더램프(주)",
 * "dtNm":"(주)쇼박스",
 * "repNationCd":"한국",
 * "movieType":"장편",
 * "moviePrdtStat":"개봉",
 * "genre":"공포(호러),스릴러",
 * "watchGradeNm":"15세이상관람가",
 * "openDt":"20260408",
 * "salesAmt":902613320,
 * "audiCnt":89913,
 * "totalSalesAmt":1205184520,
 * "totalAudiCnt":116826,
 * "scrCnt":1191,
 * "showCnt":3873,
 * "rank":1,
 * "rankInten":26,
 * "rankOldAndNew":"OLD",
 * "rownum":1}
 */
class DataCollection {
	private static List<Movie> mList = new ArrayList<Movie>();
	static { // 초기화
		try {
			Document doc = Jsoup.connect("https://kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
			//System.out.println(doc.toString());
			String data = doc.toString();
			data=data.substring(data.indexOf("["), data.lastIndexOf("]")+1);
			//System.out.println(data);
			// json 다루는 클래스
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp.parse(data);
			//System.out.println(arr.toString());
			//System.out.println(arr.size());
			for(int i=0; i<arr.size(); i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				Movie m = new Movie();
				m.setName((String)obj.get("movieNm"));
				m.setDirector((String)obj.get("director"));
				m.setGenre((String)obj.get("genre"));
				m.setGrade((String)obj.get("watchGradeNm"));
				mList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	class DataManager {
		// 기능 수행
		// 1. 영화 정보
		public void movieList() {
			mList.stream().forEach(m->System.out.println(m.getName() + " " + m.getDirector() + " " + m.getGenre() + " " + m.getGrade()));
		}
		// 2.  
	}
	public void movieList() {
		DataManager dm = new DataManager();
		dm.movieList();
	}
}


public class 내부클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataCollection dc = new DataCollection();
		dc.movieList();
	}

}
