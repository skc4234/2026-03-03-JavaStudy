package com.sist.back;

import com.sist.vo.Music;

// 추상 클래스
/*
 *  1. Genie
 *  	1) 데이터 50개
 *  	2) 기능
 *          -*크롤링
 *          -목록출력
 *          -상세보기
 *          -검색(가수명, 곡명, 앨범명)
 *          -동영상 보기
 *  2. Melon
 *  	1) 데이터 50개
 *  	2) 기능
 *          -*크롤링
 *          -목록출력
 *          -상세보기
 *          -검색(가수명, 곡명, 앨범명)
 *          -동영상 보기
 * 
 * 
 * 
 */
public abstract class CommonsMusic {
	public static Music[] musics = new Music[50];
	
	// 데이터 수집
	public abstract void init();
	
	// 목록 출력
	public Music[] musicAllData() {
		return musics;
	}
	
	// 상세보기
	public Music musicData(int mno) {
		Music m = new Music();
		for(Music s : musics) {
			if(s.getMno()==mno) {
				m = s;
				break;
			}
		}
		return m;
	}
	
	
	
	// 검색
	// 동영상 보기
}
