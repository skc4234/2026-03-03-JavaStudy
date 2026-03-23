package com.sist.manager;

public class GenieMusicManager {
	public static Music[] musics = new Music[100];
	// static 블록 / 생성자 => 상속이 안됨 => 오버라이딩을 위해 init() 메소드 사용
	public void init() { // 크롤링 후 배열에 저장
		
	}
	
	// 목록 출력
	public Music[] musicAllData() {
		return musics;
	}
	
	// 상세보기
	public Music musicDetail(int mno) {
		Music m = new Music();
		for(Music mm :musics) {
			if(mm.getMno()==mno) {
				m = mm;
				break;
			}
		}
	
		return m;
	}
	
	
	
	
	// 미완성
	
	// 검색하기
	//                       가수/곡/앨범
	public Music[] musicFind(String type, String fd) {
		
		return musics;
	}
	
	// 동영상 출력
	public String musicKey(String title) {
		String key = "";
		return key;
	}
	
}
