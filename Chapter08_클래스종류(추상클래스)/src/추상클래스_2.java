/* 
 * 추상클래스
 *  1) 형식 / 구성요소
 *   		 추상적인(공통적인)
 *   public abstract class ClassName {
 *   	--------------------------
 *   	변수 : static / instance
 *   	--------------------------
 *   	생성자 => 초기화
 *   	--------------------------
 *   	메소드
 *       -구현된 메소드
 *         => 같은 기능이 있는 경우
 *       -구현안된 메소드
 *         => 경우의 수가 많은 경우 => 프로그램에 맞게 구현
 *         public abstract 리턴형 메소드명(); => 선언만
 *   	--------------------------
 *   }
 *   공통으로 사용되는 메소드 선언 => 미완성 클래스
 *    => 상속을 내려서 상속받은 클래스에서 구현
 *    => 객체 생성 불가(메모리 할당x)
 *    => 여러개의 클래스를 묶어서 한개의 이름으로 제어 가능
 *        - 변수가 10개 => 배열로 묶음
 *        - 클래스가 여러개면 추상클래스/인터페이스
 *        - 서로 다른 클래스를 연결해서 사용
 *        * 데이터베이스 : MySQL / Oracle / MongoDB 등을 연결
 *           드라이버 등록 -> 연결 -> SQL문장 전송 -> 결과값 받기 -> 닫기
 *     => 같은 클래스를 묶어서 사용하려면 공통된 데이터 / 메소드 찾기 => 추상 클래스 가능
 *          서울 여행  /  부산 여행   /  제주 여행
 *          목록, 상세보기, 예약, 교통편, 결제, 찜하기, 좋아요
 *     => 유지보수가 어려운 경우 => 기능 설정 => 필요마다 따로 구현
 *         실제(요구사항) => 추상클래스/인터페이스
 * 
 * 
 * 
 */

import java.util.Calendar;

abstract class 도형 {
	 public abstract void draw();
}
class 사각형 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다.");
	}
	
}
class 삼각형 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다.");
	}
	
}

class  원 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다.");
	}

}
/*   oracle    mysql
 *  number / int, double => int
 *  varchar2 / varchar  => String
 *  clob  = text        => String
 *  data / datatime     => Date
 * 
 * 
 */
abstract class DBDriver {
	public void preparedStatement() { // SQL 문장
		System.out.println("SELECT 문장 전송 => 데이터 검색");
	}
	public void getResultSet() { // 결과값
		System.out.println("읽은 데이터를 저장 : 브라우저 전송");
	}

	public abstract void connection(); // 연결
	public abstract void disConnection(); // 닫기
}
class Oracle extends DBDriver {

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("오라클 연결...");
	}

	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("오라클 닫기");
	}
	
}
class MySQL extends DBDriver {
	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 연결...");
	}

	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 닫기");
	}
	
}
class MariaDB {
	
}
class MSSQL {
	
	
}
class DB2 {
	// 라이브러리 => 추상/일반
	// 객체 생성 => new-일반, 아니면 추상
	Calendar cal = Calendar.getInstance();
}
public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		도형 a = new 사각형();
//		a.draw();
//		a = new 삼각형();
//		a.draw();
//		a = new 원();
//		a.draw();
		DBDriver db = new Oracle();
		db.connection();
		db.preparedStatement();
		db.getResultSet();
		db.disConnection();
		 
		db = new MySQL();
		db.connection();
		db.preparedStatement();
		db.getResultSet();
		db.disConnection();
		
		
	}
		

}
