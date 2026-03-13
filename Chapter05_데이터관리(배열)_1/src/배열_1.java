/*
 * 1. 데이터 저장(관리)
 * 	=> 변수(1개 저장) / 클래스(같은 데이터형 여러개) / 컬렉션(다른 데이터형 여러개)
 * 		=> 메모리에 저장
 * 	-영구적인 저장
 * 	  => 파일
 * 	  => 오라클/*MySQL/DB2 => RDBMS 
 * 	  => XML/JSON
 * 2. 데이터 가공
 *  => 연산자/제어문 => 메소드
 * 3. 출력
 * ------------------------
 * => *클래스
 * 	    1) 데이터 보호 : 캡슐화
 * 		2) 재사용 : 상속,포함클래스
 * 		3) 수정/추가 : 오버라이딩, 오버로딩
 * 					 =>가용성
 * 		4) 공통 => 추상화
 * 클래스 여러개를 한번에 제어 => 한개의 변수로 제어 => *인터페이스
 * ---------------------------------------
 * - 비정상 종료 방지 / 에러 처리
 * - 라이브러리 : 개발한 클래스 + 라이브러리 => 프로그램 완성
 * 
 * 자바 ==> 오라클 ==> HTML/CSS/JS
 *  |       |         JQuery
 *  ---------            |
 *     연결               |
 *      ------------------
 *            연결=>JSP
 * ------------------------
 * Spring => 단순화 => SpringBoot
 *   
 *   Git => CI/CD(git에서 수정하면 브라우저로 바로 출력)
 *   		=>문제 : 운영체제마다 다름 => 세팅값을 한번에 => Docker
 *   												 ㄴdocker 저장시에 dockerhub
 *   												 ㄴ여러개 동시에 => Docker-Compose(무료) / 쿠바네티스(AWS 사용 불가)
 * --------------------------------------------------------------------------------------------------
 *  React / TypeScript / NodeJS / MySQL
 *  Spring AI
 *  => 개인
 *  
 *  
 *  기본문법
 *  => 변수 / 배열
 *  => 연산자 / 제어문
 * 
 * 배열(1차원 정도)
 * 	1) 같은 데이터형을 여러개 저장
 *  2) 선언
 *  	데이터형[] 배열명
 *  3) 초기화
 *  	데이터형[] 배열명 = {...} => 명시적
 *  				  = new 데이터형[배열 크기]
 *  					int : 0 / double : 0.0 / long : 0L / String : null / boolean : false / char : '\0' 
 *  4) 값 변경
 *  	전체 변경 => 일반 for문을 이용한다(인덱스)
 *  	일부 변경 => 배열명[인덱스] = 값;
 *  5) 화면 출력
 *  	for-each(향상된 for문)
 *  	for(데이터형 변수명 : 배열명) { ... }
 *  	=> 데이터가 없을 때까지 자동으로 출력
 *  	=> 인덱스가 아니라 실제 값
 * 
 * 
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 * 
 * class Movie {
 * 		String rank, title, genre, poster, actor, regdate, grade, director;
 * }
 * 
 * Movie[] movies = new Movie[1938];
 *  
 *  
 * 게시판 만들기
 * JDBC => 300줄
 * MyBatis => 120줄
 * JPA => 7줄 
 *
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rank = new String[1938];
		String[] title = new String[1938];
		String[] genre = new String[1938];
		String[] poster = new String[1938];
		String[] actor = new String[1938];
		String[] regdate = new String[1938];
		String[] grade = new String[1938];
		String[] director = new String[1938];
	}

}
