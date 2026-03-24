package com.sist.vo;
// 사용자 정의 클래스(데이터) => 한개의 Music에 대한 정보 묶음
// 데이터를 모아서 한번에 전송 목적
// 데이터 보호 => 필요시 사용 가능 => getter/setter
// 반드시 데이터베이스의 column 명과 일치해야함 => DB에서 가져와야하기 때문
public class Music {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	private String state;
	private int increment;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
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
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}
