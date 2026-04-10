package com.sist.commons;
// 프로토콜(약속) => 구분자 => 웹(파일) => 내부 프로토콜
/*
 *  => 0~65535
 *     FTP(파일전송) - 22
 *     SMTP(메일전송) - 25
 *     Telnet - 23
 *     프록시 - 8080
 *     머드 서버 - 4000
 *     ...
 *     *HTTP - 80
 *     
 *     
 *     
 */
public class Function {
	public static final int LOGIN = 100;
	public static final int MYLOG = 110; // 로그인 : 이미 로그인 된 사람 / 로그인 한 사람
	public static final int CHAT = 200;
	public static final int EXIT = 300;
	public static final int MYEXIT = 310;
	
	
}
