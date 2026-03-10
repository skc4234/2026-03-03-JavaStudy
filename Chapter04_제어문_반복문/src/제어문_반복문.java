/*
 * 자바 반복문
 * 1. for문 => 화면출력(UI) => 반복횟수가 정해져 있을때
 * 2. while문 => 데이터베이스 / 네트워크 => 반복 횟수가 없는 경우
 * 3. do~while문 => 게임 => 반복 횟수가 없고 반드시 한번 이상 수행해야 하는 경우
 * -----------------------------
 * 반복제어
 * 1. break => 반복 중단
 * 2. continue => 특정 부분 제외
 * for-each : 웹이서 주로 사용, 변경불가, only 출력 => 배열, 컬렉션
 * 
 * 
 * */
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력 => 반복횟수 지정
		/*
		 * 반복문
		 * 	1. 형식
		 * 		for(초기값; 조건식; 증가식;) { 반복실행문장 }
		 * 	2. 실행순서
		 * 		1) 초기값 인식
		 * 		2) 조건식 => true => 반복문장 실행 => 증가식 => 반복 / false => 종료
		 * 
		 * */
//		for(int i = 1; i<=10; i+=2) {
//			System.out.println(i);
//		}
//		for(;;) { //for문의 무한루프
//			System.out.println("Hello Java");
//		}
		char c;
		for(c='A'; c<'Z'; c++) {
			System.out.print(c + ", ");
		}
		System.out.print(c  );
	}

}
