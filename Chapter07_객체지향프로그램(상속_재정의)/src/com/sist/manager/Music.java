package com.sist.manager;
// 데이터 설정 => 캡슐화(private + getter/setter)
public class Music {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int increment;
	// 데이터 은닉화 => 데이터 변경/손실 방지
	// 필요한 경우에 사용 => getter/setter
	// 변수+메소드 => 하나로 묶어서 처리(캡슐화)
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	  //ㄴ인스턴스 변수  ㄴ매개변수
		// 지역변수, 매개변수 > 인스턴스 변수
		// this는 지역변수 / 인스턴스 변수 구별
	}
	public String getTitle() {
		return title; // this. 생략
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	
}
