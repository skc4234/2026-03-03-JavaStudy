/*
 * ㅇ
 * 
 * 
 * 
 */
import java.util.Scanner;

public class 배열_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = scan.nextInt();
		
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		System.out.print("일을 입력하세요 : ");
		int day = scan.nextInt();
		
		System.out.println(year + "년 " + month + "월 " + day + "일입니다.");
		
		// 1년 1월 1일 ~ 전년도 12월 31일까지
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		 
		// 입력된 년도의 전달까지
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		if((year%4==0) && (year%100!=0) || (year%400==0)) //윤년 {
			lastday[1] = 29;
		else
			lastday[1] = 28;
		
		for(int i=0; i<month-1; i++) {
			total += lastday[i];
		}
		total += day;
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		int week = total%7;
		System.out.println("입력된 날의 요일 : " + strWeek[week]);
		
		//Calendar 클래스
	}

}
