/*
 *  1차 배열
 *    1) 기능별 나눠서 저장
 *    2) 데이터형 : 같은 데이터형만 저장 -> 작은 데이터형도 저장 가능 =>  int[] arr = {'A'} 가능
 *    														  4byte        2byte
 *    3) 선언
 *        데이터형[] 배열명;
 *    4) 초기화
 *    	  명시적 => 데이터형[] 배열명 = {....}
 *    	  난수, 파일 => 먼저 선언 => 데이터형[] 배열명 = new 데이터형[배열 크기];
 *    5) 변경
 *    	  전체변경 => for()
 *    	  부분변경 => 배열명[인덱스] = 바꿀값
 *    6) 출력
 *    	  for-each => for(데이터형 변수명 : 배열명) => 실제 배열에 저장된 값
 *    7) 배열 참조
 *    	  얕은 복사 => 참조 배열 동시 사용
 *    	  깊은 복사 => 배열을 통째로 복사 => 새로운 메모리에 저장
 *    8) 배열 => 메모리 주소를 이용하는 프로그램
 *              Stack        Heap
 *              =>주소        =>실제 데이터 저장
 *              
 *    int[] arr = {10,20,30,40,50}
 *       
 *       stack                  heap
 *  ---------------------------------------------     
 *       0x100        10    20    30    40    50
 *        arr       0x100 0x104 0x108 0x112 0x116
 *  --------------------------------------------      
 * 
 *  String : 문자열을 저장하는 데이터형+클래스
 *  			=>char[]을 조작하는 클래스 (문자 인덱스->0번부터)
 * 
 * 
 */

import java.util.Scanner;

public class 배열_정리 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영화데이터 읽어오기
		Scanner scan = new Scanner(System.in);
		영화데이터 movie = new 영화데이터();
		while(true) {
			System.out.println("=========== 메뉴 ==========");
			System.out.println("1. 영화 목록");
			System.out.println("2. 영화 상세보기");
			System.out.println("3. 영화명");
			System.out.println("4. 출연진");
			System.out.println("5. 장르");
			System.out.println("6. 종료");
			System.out.println("==========================");
			System.out.print("번호를 선택하세요 : ");
			int menu = scan.nextInt();
			if(menu == 6) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu == 1) {
				for(int i=0; i<영화데이터.title.length; i++) {
					System.out.println((i+1) + ". " + 영화데이터.title[i]);
				}
			}
			else if(menu == 2) {
				System.out.print("영화를 고르시오(1~1938) : ");
				int no = scan.nextInt();
				if(no<1 || no>1938) {
					System.out.println("없는 영화입니다...");
					continue;
				}
				System.out.println("=======영화상세======");
				System.out.println("영화명 : " + movie.title[no-1]);
				System.out.println("장르 : " + movie.genre[no-1]);
				System.out.println("출연진 : " + movie.actor[no-1]);
				System.out.println("감독 : " + movie.director[no-1]);
				System.out.println("개봉일 : " + movie.regdate[no-1]);
				System.out.println("등급 : " + movie.grade[no-1]);
			}
			else if(menu == 3) {
				System.out.print("검색어 입력 : ");
				String fd = scan.next();
//				for(String s : movie.title) {
//					if(s.contains(fd)) {
//						System.out.println(s);
//					}
//				}
				for(int i=0; i<movie.title.length; i++) {
					if(movie.title[i].contains(fd)) {
						System.out.println((i+1) + ". " + movie.title[i]);
					}
				}
			}
			
			else if(menu == 4) {
				System.out.print("배우명 입력 : ");
				String fd = scan.next();
				for(int i=0; i<movie.actor.length; i++) {
					if(movie.actor[i].contains(fd)) {
						System.out.println((i+1) + ". " + movie.title[i] + " - " + movie.actor[i]);
					}
				}
			}
			
			else if(menu == 5) {
				System.out.println("---Top 100에서만 출력됩니다---");
				System.out.print("장르 입력(액션, 코미디 등) : ");
				String fd = scan.next();
				for(int i=0; i<100; i++) {
					if(movie.genre[i].contains(fd)) {
						System.out.println((i+1) + ". " + movie.title[i] + " - " + movie.genre[i]);
					}
				}
			}
		}
		
	}

}
