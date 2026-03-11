/*
 * 메뉴 주문
 * =>입력
 * 
 * 
 * 
 * */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 제어문_반복문_while4 {

	public static void main(String[] args) throws Exception { //파일 입출력, 네트워크 연결, 데이터베이스 연결 실패시 예외처리
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("🎧🎧🎧🎧🎧🎧🎧🎧지니뮤직🎧🎧🎧🎧🎧🎧🎧🎧");
		while(true) {
			//무한루프
			System.out.println("========메뉴=======");
			System.out.println("1. 가요");
			System.out.println("2. 트로트");
			System.out.println("3. OST");
			System.out.println("4. POP");
			System.out.println("5. ZAZZ");
			System.out.println("6. CLASSIC");
			System.out.println("7. 종료");
			System.out.println("===================");
			System.out.print("여기에 입력 : ");
			int menu = scan.nextInt();
			// 다중조건문, 선택문
			//에러 처리(입력이 잘못된 경우)
			if(menu>7 || menu<1) {
				System.out.println("없는 메뉴입니다!! 다시 선택하세요.\n");
				continue; // while문 => 반복문으로 이동
						  // for문 => 증가식으로 이동
			}
			if(menu == 7) { //종료
				//종료 System.exit(0) => 프로그램 종료
				//    break => while문 종료
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) { //가요
				System.out.println("========가요========");
				Document doc = Jsoup.connect("https://genie.co.kr/chart/genre?ditc=W&ymd=&genrecode=M0100").get();
				Elements title = doc.select(".title");
				Elements artist = doc.select(".artist");
				//System.out.println("사이즈 : " + title.size());
				//System.out.println("사이즈 : " + artist.size());
				for(int i=0; i<title.size(); i++) {
					String s = title.get(i).text();
					String a = artist.get(i).text();
					
					System.out.println((i+1) + "." + s + " - " + a);
				}
			}
			else if(menu==2) { //트로트
				System.out.println("========트로트========");
				Document doc = Jsoup.connect("https://genie.co.kr/chart/genre?ditc=W&ymd=&genrecode=M0107").get();
				Elements title = doc.select(".title");
				Elements artist = doc.select(".artist");
				for(int i=0; i<title.size(); i++) {
					String s = title.get(i).text();
					String a = artist.get(i).text();
					
					System.out.println((i+1) + "." + s + " - " + a);
				}
				
			}
			else if(menu==3) { //OST
				System.out.println("========OST========");
				Document doc = Jsoup.connect("https://genie.co.kr/chart/genre?ditc=W&ymd=&genrecode=M0300").get();
				Elements title = doc.select(".title");
				Elements artist = doc.select(".artist");
				for(int i=0; i<title.size(); i++) {
					String s = title.get(i).text();
					String a = artist.get(i).text();
					
					System.out.println((i+1) + "." + s + " - " + a);
				}
				
			}
			else if(menu==4) { //POP
				System.out.println("========POP========");
				Document doc = Jsoup.connect("https://genie.co.kr/chart/genre?ditc=W&ymd=&genrecode=M0200").get();
				Elements title = doc.select(".title");
				Elements artist = doc.select(".artist");
				for(int i=0; i<title.size(); i++) {
					String s = title.get(i).text();
					String a = artist.get(i).text();
					
					System.out.println((i+1) + "." + s + " - " + a);
				}
				
			}
			else if(menu==5) { //ZAZZ
				System.out.println("========ZAZZ========");
				Document doc = Jsoup.connect("https://genie.co.kr/chart/genre?ditc=W&ymd=&genrecode=M0500").get();
				Elements title = doc.select(".title");
				Elements artist = doc.select(".artist");
				for(int i=0; i<title.size(); i++) {
					String s = title.get(i).text();
					String a = artist.get(i).text();
					
					System.out.println((i+1) + "." + s + " - " + a);
				}
				
			}
			else if(menu==6) { //CLASSIC
				System.out.println("========CLASSIC========");
				Document doc = Jsoup.connect("https://genie.co.kr/chart/genre?ditc=W&ymd=&genrecode=M0600").get();
				Elements title = doc.select(".title");
				Elements artist = doc.select(".artist");
				for(int i=0; i<title.size(); i++) {
					String s = title.get(i).text();
					String a = artist.get(i).text();
					
					System.out.println((i+1) + "." + s + " - " + a);
				}
				
			}
		}
	}

}
