package com.sist.music;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//데이터를 모아서 관리 => 데이터형 클래스 => 캡슐화
// MusicVO / MusicDTO / MusicEntity
// Data Transform
// => 데이터 보호 / 한번에 모아서 전달하는 목적 => 윈도우 / 브라우저
// 사용자 정의 데이터형 => Music 클래스
//@Getter // 읽기 => 값 읽기
//@Setter // 쓰기 => 메모리에 저장
@Data
public class Music {
	private int no;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
	//private String poster;
}
