/*
 *  달력 제작
 *    -입력된 년도/월 ==> 1일자의 요일 필요
 *    1. 1년 1월 1일 -> 월요일
 *    2. 1년1월1일~전년도(입력한 년도의 전년도)까지의 일수 합 필요 ===> 윤년 포함 여부!!
 *    3. 입력한 달의 전달까지 합
 *    4. +1
 *       => 총날수%7 ==> 요일
 * 
 * 
 * 
 */
import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 설정
		Scanner scan = new Scanner(System.in);
		// 반복문에서 설정하면 안된다(new => 반복문마다 메모리 추가/낭비)
		// new : 동적 메모리 할당 => malloc() => 승격(연산자)
		// new => 새로운 메모리에 저장 => new 남용 시 오류 : OutOfMemoryException => 이클립스 종료
		int year = 0, month = 0, day = 0;
		System.out.print("년도를 입력하세요 : ");
		year = scan.nextInt();
		System.out.print("달을 입력하세요 : ");
		month = scan.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = scan.nextInt();
		
		System.out.println("\n\t\t\t" + year + "년도 " + month + "월\n");
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		for(String s : strWeek) {
			System.out.print(s + "\t");
		}
		
		// 요일 구하기
		int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;  // 총 날수  (year-1)*365 아님!
		
		// 전 달까지의 합 구하기
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			lastday[1] = 29;
		}
		else {
			lastday[1] = 28;
		}
		
		for(int i=0; i<month-1; i++) {
			total+=lastday[i];
		}
		
		total++; // 입력한 달의 1일
		
		//요일 구하기
		int week = total%7; // 0은 일요일
		
		//System.out.println("요일 : " + strWeek[week]);
		System.out.println();
		for(int i=1; i<=lastday[month-1]; i++) {
			if(i==1) {
				for(int j=1; j<=week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t", i);
			week++;
			if(week>6) {
				week = 0;
				System.out.println();
			}
		}
		System.out.println("");
		
	}

}
