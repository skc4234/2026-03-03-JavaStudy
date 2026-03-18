/*
 * 관련된 데이터를 모아서 관리 => 클래스
 * ----------> 데이터형이 서로 다름
 * 사용자 정의 데이터형 => 일반 변수와 동일
 * 					  -------------- 형변환 / 대입
 * 1. 정적 변수
 * 	  [접근지정어] static 데이터형 변수명
 * 2. 인스턴스 변수
 * 	  [접근지정어] 데이터형 변수명
 * 3. 정적 변수 / 인스턴스 변수는 반드시 클래스 블록안에 설정
 *    메소드 블록 : 지역변수
 * 4. 정적변수 / MethodArea
 *             ---------- 모든 객체가 데이터를 공유할 수 있게 만든다
 *             => 단 한개의 메모리가 생성되는 공간
 *             => 객체와 독립적인 생명주기
 *             		=> 객체가 소멸
 * 5. 인스턴스변수 / Heap
 *               ----- 실제 데이터가 저장
 *               ----- new를 이용한 경우에 저장공간을 생성 => 데이터 저장
 *                     ---- 객체는 자신의 영역만 접근이 가능
 * 6. 지역변수 / Stack
 * 			  -------> 메모리 자체 관리 => {} 종료되면 자동으로 해제 => return 으로 값을 넘겨줌
 * 	1) 변수 설정 => 데이터가 없는 프로그램은 없다
 * 	   ------- 가공(연산자/제어문)
 * 	   ㄴ데이터베이스
 * 
 * 데이터 저장 -> 데이터 가공 -> 데이터 출력
 * 배열/클래스
 * File
 * 오라클 => static
 * -----------------------------------> JSP => 클래스 / getter/setter
 *                                              ㄴ bean
 * 7. 인스턴스 변수 / 정적 변수의 차이점
 * -------------------------------------------------
 *          인스턴스 변수             정적 변수
 * -------------------------------------------------
 * 선언방식    클래스 블록       클래스 블록 => static 붙이기 
 * -------------------------------------------------
 * 저장시점  new 연산자 이용        컴파일 시 자동 저장
 * 			=>메모리 공간 확보
 * -------------------------------------------------
 * 저장위치     Heap                MethodArea
 * 		 개발자가 정하는 메모리 공간    => 메모리공간 1개 생성
 * 	  => 개발자는 new/delete로
 * -------------------------------------------------
 * 공유여부
 * -------------------------------------------------
 * 접근방법  객체.변수명             클래스명.변수명
 * ------------------------------------------------
 * 생명주기  객체가 메모리에 있는 동안 프로그램 종료시까지 사용가능
 * --------------------------------------------------
 */
import java.util.*;

class Diary {
	int year, month, week, lastday;
	// => 멤버변수는 클래스 안 모든 영역에서 사용 가능
	void 사용자입력() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.println();
	}
	
	void 요일_마지막날_구하기() {
		Calendar cal = Calendar.getInstance(); // 추상클래스는 new를 사용할 수 없음
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일
		lastday = cal.getActualMaximum(Calendar.DATE); // 달의 마지막 날수 
		week-=1;
	}
	
	void print() {
		System.out.println(year + "년도 " + month + "월\n");
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		for(String s : strWeek) {
			System.out.print(s + "\t");
		}
		System.out.println();
		/*
		 * Calendar => month는 0부터, week는 1부터 시작
		 */
		for(int i=1; i<=lastday; i++) {
			if(i==1) {
				for(int j=0; j<week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%02d\t", i);
			week++;
			if(week>6) {
				week = 0;
				System.out.println();
			}
		}
	}
} 

public class 클래스_멤버변수_정리 {
	int a = 10;
	void increment() {
		System.out.print("a = " + a);
		a--;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diary d = new Diary();
		d.사용자입력();
		d.요일_마지막날_구하기();
		d.print();
	}

}
