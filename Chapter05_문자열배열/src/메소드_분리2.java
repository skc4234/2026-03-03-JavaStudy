/*
 * 메소드
 * 	1. 메뉴
 * 		Top200 목록 출력
 * 		Youtube 연결 => 동영상 => 실행 => 상세보기
 * 		검색
 * 		종료
 *  2. 데이터 읽기
 *  
 *  객체지향
 *  ------- Actor(사용자, 관리자 등) 찾기 => 사용자 중심 웹 개발
 * 
 * 
 * 
 */
import java.util.*;
public class 메소드_분리2 {
	
	static void menu() throws Exception {
		//Scanner scan = new Scanner(System.in);
		//while()
		String date = GenieMusic.getDate();
		System.out.println(date + " Top 200");
		
		System.out.println("======== 메뉴 =======");
		System.out.println("1. 지니뮤직 노래명");
		System.out.println("2. 지니뮤직 가수명");
		System.out.println("3. 지니뮤직 앨범");
		System.out.println("4. 지니뮤직 상세보기");
		System.out.println("5. 종료");
		System.out.println("====================");
	}
	
	//클래스와 클래스 연결 => 메소드
	static void process() throws Exception {
		Scanner scan = new Scanner(System.in);
		while(true) {
			menu();
			System.out.print("메뉴를 선택하시오 : ");
			int m = scan.nextInt();
			
			System.out.println();
			
			if(m==5) {
				System.out.println("프로그램 종료....");
				break;
			}
			else if(m==1) {
				String[] title = GenieMusic.getTitle();
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + ". " + title[i]);
				}
			}
			
			else if(m==2) {
				String[] title = GenieMusic.getSinger();
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + ". " + title[i]);
				}
			}
			
			else if(m==3) {
				String[] title = GenieMusic.getAlbum();
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + ". " + title[i]);
				}
			}
			
			else if(m==4) {
				System.out.print("검색어를 입력하시오 : ");
				String fd = scan.next();
				String[] title = GenieMusic.getFind(fd);
				System.out.println("검색 결과 : " + title.length + "건");
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + ". " + title[i]);
					// 동영상 => youtube 키
				}
			}
			
			
			System.out.println();
			
//			switch(m) {
//			
//			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		process();
	}

}
