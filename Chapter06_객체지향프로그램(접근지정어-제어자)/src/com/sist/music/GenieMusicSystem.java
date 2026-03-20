package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 * <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('113791695','1');return false;">
 BANG BANG</a>
                                              
 *  <a href="#" class="artist ellipsis" onclick="fnViewArtist('81271496');return false;">IVE (아이브)</a>
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('87233225');return false;">REVIVE＋</a>
 * 
 */
/*
 *  자바 코딩 순서
 *  	package
 *  	import
 *  	public class ClassName {
 *  		1. 변수 설정
 *  			=> static 변수 / instance 변수
 *  		2. 생성자 / 초기화 블록
 *  			=> 변수의 초기화 => 프로그램이 시작하자 마자 데이터가 있어야 할때
 *  			초기화 하지 않으면 자동으로 기본값 대입 - ex) int a; => a = 0
 *  			*클래스 안에서는 구현 불가(선언만 가능)
 *  			1) 명시적 초기화 - ex) String s = "홍길동";
 *  			2) 초기화블록 - 파일 읽기 / 크롤링
 *                   => *static 블록 => static만 초기화 가능
 *                   	instance 블록 => innstance / static 모두 가능
 *              3) 생성자
 *              	=> static은 static블록 사용해서 초기화 => MyBatis
 *              	=> instance는 생성자를 사용해서 초기화
 *              	*변수에 대한 초기화는 많이 없다
 *              	=> 화면 설정 / 쿠키 설정 / 오라클 드라이버 설정 등 환경 설정에 이용
 *  		3. 메소드
 *  			=> 사용자가 데이터를 사용할 수 있게 기능 부여
 *  			=> 모든 메소드는 public => 다른 클래스와 연결해야 하기 위함
 *  									 => 요청(매개변수) / 결과값(리턴값)
 *  	}
 *  
 *  1. 패키지 만드는 방법 : 보관
 *  	=> 관련된 클래스를 모음
 *  	=> 폴더
 *      => com(org).업체명.요약
 *      	=> 한글x, 키워드x
 *      ex) com.sist.server
 *      	com.sist.client
 *      => 라이브러리 : java.util / java.io / java.net  / java.awt  => jdk1.0
 *                   사용이 많은    입출력 관련  네트워크 관련  윈도우 관련
 *                   클래스 모음
 *  				 javax.swing / javax.xml                      => jdk1.2
 *  				 jakarata.                                    => jdk17
 *  				 => apache(오픈소스 그룹)
 *  	=> 찾기(유지보수 등)에 용이
 *  
 *  2. 패키지에 있는 클래스 가지고 오기
 *  	=> 다른 패키지의 클래스는 인식 못함 => import 패키지.클래스명(권장) / import 패키지.*
 *                                       지정된 클래스 하나만           패키지 안에 있는 클래스 모두
 *  3. 접근지정어
 *  -----------------------------------------------------------------------
 *  1. private : 데이터 은닉화 => 변수(노출이 안되는 데이터가 있는 경우)
 *  			=> 자신의 클래스에서만 사용 가능
 *  			=> 제한 허용 => Getter / Setter : 캡슐화 코딩
 *  -----------------------------------------------------------------------
 *  2. default : 같은 패키지까지 접근
 *  			=> Window 프로그램 개발 / Button, TextField 등
 *  -----------------------------------------------------------------------
 *  3. protected : 같은 패키지까지 접근 / 다른 클래스여도 상속 받는 경우 접근 가능
 *  				=> 사용 빈도가 거의 없다
 *  -----------------------------------------------------------------------
 *  4. public : 모든 클래스에서 접근 가능 => 공개
 *  -----------------------------------------------------------------------
 *  
 *  	1) 인스턴스 변수 => 대부분 private => 데이터값을 노출하지 않기 위해
 *  									=> 웹 - GET => login.jsp?id=hong&pw=1234 => 노출
 *  										 - POST => login.jsp => 내부에서 처리
 *  	2) 클래스 : default / public 만 사용 가능
 *  	3) 메소드 : 가급적 public => 다른 클래스와 연결하기 위해
 *  				=> 상속받은 메소드는 오버라이딩 시에 축소된 접근지정어를 쓸 수 없다
 *  	4) 생성자 : public => 다른 클래스에서 사용하기 위해
 *  
 *  4. 제어어
 *  	- static : 공통의 - 공용
 *  	- final : 마지막의 - 상수(변하지 않는)
 *  	- abstract : 추상적인 - 존재하지 않는 => 메소드가 선언만 되어있음(구현x)
 *  		=> 윈도우 Button / TextField
 *  		=> 추상클래스 / *인터페이스(Spring 및 실무)
 * 
 * 
 */
// 사용자 요청 => 기능 => 메소드
public class GenieMusicSystem {
	// 공개 => 공유 => static
	public static Music[] music = new Music[50];
	
	// 초기화 => 객체 생성 없이 => static 블록
	static { // 자동호출 => 상속 예외
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			//System.out.println(title.toString());
			Elements etc = doc.select("table.list-wrap span.rank");
			for(int i=0; i<title.size(); i++) {
				Music m = new Music();
				m.setNo(i+1);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
//				System.out.println(i+1);
//				System.out.println(title.get(i).text());
//				System.out.println(singer.get(i).text());
//				System.out.println(album.get(i).text());
				//System.out.println(etc.get(i).text());
				String temp = etc.get(i).text();
				String state = "";
				String id = "";
				if(temp.equals("유지")) {
					state = "유지";
					id = "0";
					//System.out.println(temp);
				}
				else {
					state = temp.replaceAll("[^가-힣]", "");
					id = temp.replaceAll("[^0-9]", "");
					
				}
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				music[i] = m;
//				System.out.println("상태 : " + state);
//				System.out.println("등폭 : " + id);
//				System.out.println("=================================");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 기능 => 메소드
	// 0. 메뉴 출력
	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("========== 메뉴 ==========");
		System.out.println("1. 뮤직 목록");
		System.out.println("2. 상세보기");
		System.out.println("3. 곡명 검색");
		System.out.println("4. 가수 검색");
		System.out.println("5. 종료");
		System.out.println("========================");
		System.out.print("메뉴 선택 : ");
		int m = scan.nextInt();
		return m;
		
	}
	// 1. 목록 출력
	public void musicList() {
		System.out.println();
		for(Music m : music) {
			System.out.print(m.getNo() + ". " + m.getTitle());
			String s = m.getState();
			if(s.equals("유지")) {
				System.out.println(" (-)");
			}
			else if(s.equals("상승")) {
				System.out.println(" (↑" + m.getIdcrement() + ")");
			}
			else if(s.equals("하강")) {
				System.out.println(" (↓" + m.getIdcrement() + ")");
			}
		}
		System.out.println();
	}
	
	
	// 2. 상세 보기
	public void musicDetail(int no) {
		for(Music m : music) {
			if(m.getNo()==no) {
				System.out.println("\n=========================");
				System.out.println("순위 : " + m.getNo());
				System.out.println("곡명 : " + m.getTitle());
				System.out.println("가수명 : " + m.getSinger());
				System.out.println("앨범 : " + m.getAlbum());
				System.out.print("상태 : " + m.getState());
				String s = m.getState();
				if(s.equals("유지")) {
					System.out.println("(-)");
				}
				else if(s.equals("상승")) {
					System.out.println("(↑" + m.getIdcrement() + ")");
				}
				else if(s.equals("하강")) {
					System.out.println("(↓" + m.getIdcrement() + ")");
				}
				System.out.println("=========================\n");
			}
		}
	}
	
	// 3. 검색 => 가수 / 노래명
	public void titleFind(String fd) {
		System.out.println();
		for(Music m : music) {
			if(m.getTitle().contains(fd)) {
				System.out.println(m.getNo() + ". " + m.getTitle());
				
			}
		}
		System.out.println();
	}
	
	public void singerFind(String fd) {
		System.out.println();
		for(Music m : music) {
			if(m.getSinger().contains(fd)) {
				System.out.println(m.getNo() + ". " + m.getTitle() + " - " + m.getSinger());
			}
		}
		System.out.println();
	}
	
	
	// 4. 동영상 실행
	// 아직 구현x
}
