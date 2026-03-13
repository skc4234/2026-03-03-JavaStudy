import java.util.*;
public class 달력만들기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		System.out.printf("\n\t\t %d년 %02d월\n", year, month); //%02d => 자릿수가 한자리일때 앞에 0붙임
		
		// 요일 구하기
		Calendar cal = Calendar.getInstance();
		
		// 저장
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + strWeek[week-1] + "요일입니다.");
		//System.out.println("이번달 말일은 " + lastday + "입니다.");
		
		week-=1;
		
		for(int i=0; i<strWeek.length; i++) {
			if(i==0) {
				System.out.print(strWeek[i] + "\t");
				continue;
			}
			System.out.print(strWeek[i] + "\t");
		}
		System.out.println();
		
		//System.out.println(week);
		// 실제 달력 출력
		for(int i=1; i<=lastday; i++) {
			if(i==1) { //1일 공백 처리
				for(int j=0; j<week; j++) {
					System.out.println("\t");
				}
			}
			if(week==0)
				System.out.printf("%2d\t", i);
			else
				System.out.printf("%2d\t", i);
			week++;
			if(week>6) { // week=7이면 일요일
				week=0;
				System.out.println();
			}
		}
	}

}
