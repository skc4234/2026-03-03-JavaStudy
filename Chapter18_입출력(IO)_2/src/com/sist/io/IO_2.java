package com.sist.io;
/*
 *      ---------- X ---------- 자바 없이 연동 불가
 *      |                     |
 *   브라우저 ===== 자바 ===== 오라클
 *  HTML/XML      연동        SQL
 *  정적 => 처리 : 자바스크립트 VueJS
 *   
 *   통합 개발 환경 : Spring
 *   
 *   1. CRUD
 *      - 회원정보
 *        회원가입 / 로그인 / 회원수정 / 회원탈퇴 / 고객, 관리자
 *      - 게시판
 *        검색 / 상세보기 / 수정 / 삭제
 *   2. 네트워크 : 채팅 
 *   
 * 
 */
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. 파일 목록
			File dir = new File("c:\\javadv");
			System.out.println("폴더 여부 : " + dir.isDirectory());
			File[] list = dir.listFiles();
			for(File f : list) {
				// 파일/폴더 구분
				if(f.isFile()) { // 파일
					String len = f.length()/1024 > 0 ? (f.length()/1024)+"KB" : f.length()+"Bytes";
					System.out.println(f.getName()+" "+len);
				}
				else { // 폴더
					System.out.println(f.getName() + " DIR");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
