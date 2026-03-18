/*
 * 
 * 1|
 * 쇼생크 탈출
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 * 
 */
// 영화 1개에 대한 정보를 데이터형으로 만듦
// MovieDTO / MovieVO / MovieBean / MovieEntity  => 변수 모아놓는 방식 => 데이터형 클래스(변수만 가지고 있는 클래스)
//  Web        Spring    JSP          JPA

public class Movie {
	int mno;
	String title, genre, poster, actor, regdate, grade, director;
}
