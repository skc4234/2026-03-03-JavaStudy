/*
 * 1. 조건문 : if, else if, else
 * 2. 선택문 : switch~case : break, -> {}
 * 			간결한 코딩 - 가독성, 간결성(중복 코딩을 어떻게 처리), 최적화 => 클래스
 * 							   ㄴ반복문, 메소드, 클래스(라이브러리), 모아서 저장(공통 모듈) => Spring : AOP
 * 
 * 3. 반복문
 * 		for : 화면 UI 출력, 알고리즘 => 배열/컬렉션 처리
 * 			  반복횟수 지정
 * 		while : Back-End
 * 				파일읽기/쓰기, 데이터베이스, 네트워크, 간단한 게임
 * 				반복횟수 지정 안된 경우
 * 				=> 시작 => 조건검색
 * 		do-while : 시작화면 출력
 * 				한번이상 반드시 출력 할때
 * 				=> 시작 => 문장 => 조건검색
 * 		-------------------------------
 * 		제어
 * 			break : 반복문 종료
 * 			continue : 특정부분에서 제외 => 반복문 처음으로 이동
 * 		1) 형식
 * 			1. 시작값    int i=1  (start)
 * 			2. 끝값      i<=10   (end)
 * 			3. 실행문장
 * 			4. 몇번 수행  i++     (step)
 * 
 * 			
 * 			for(시작값; 끝값; 증가값) { 실행문장 }
 * 				  1    2     4        3
 * 
 * 
 * 			시작값           1
 * 			while(끝값) {   2  => 반드시 true/false가 나오는 연산자 사용 => 부정연산자/논리연산자/비교연산자
 * 				실행문장     3
 * 				증가값       4
 * 			}
 * 
 * 
 * 			시작값         1
 * 			do {
 * 				실행문장   2
 * 				증가값     3
 * 			while(끝값);  4
 * 
 * 			선호도(개발자)
 * 			=> 반복횟수 지정 : for
 * 			=> 없는 경우 : while
 * 			=> 게임화면 : do-while
 * 
 * 
 * 
 * */
//import java.io.*;
public class 제어문_반복문_while {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file = new File("C:\\javadv\\movie.txt");
//		FileReader fr = new FileReader(file);
//		//String movie = ""; //메모리를 계속 바꿈 -> 느림
//		StringBuffer db = new StringBuffer(); //최적화 클래스 -> 임시공간에 계속 데이터만 추가
//		int i = 0;
//		while((i=fr.read())!=-1) {
//			//movie+=(char)i;
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString());
		
		System.out.println("------for문-----");
		for(char c='A'; c<='Z'; c++) {
			System.out.print(c+ " ");
		}
		
		
		System.out.println("\n\n=======while문======");
		char c = 'A';
		while(c<='Z') {
			System.out.print(c + " ");
			c++;
		}
		
		System.out.println("\n\n========do~while문========");
		c='A';
		do {
			System.out.print(c + " ");
			c++;
		} while(c<='Z');
	}

}
