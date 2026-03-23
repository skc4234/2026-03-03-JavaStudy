package com.sist.commons;
import java.awt.*;
import javax.swing.*;
/*
 *  1. class 멤버변수 사용
 *  	=> 기본형
 *  	--------- 데이터형
 *  	=> 클래스
 *  	=> 배열
 *  	--------> 참조 데이터형
 *  2. class
 *  	=> 데이터형으로 사용 : 필요한 변수를 모아서 저장(*VO : Spring / DTO : MyBatis / Bean : JSP / Entity : JPA)
 *  	    => 캡슐화 : private + getter/setter
 *  	=> 액션클래스 : 메소드만 모아서 저장(DAO : DB연동 / Manager : 크롤링, 외부파일 / Service : 웹/윈도우에 값을 보낼때)
 *    --------------------------------
 *     공통으로 사용 => static
 *  
 */
public class ImageChange {
	// 축소 / 확대
	// 리턴형이 클래스
	public static Image getImage(ImageIcon icon, int w, int h) {
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
