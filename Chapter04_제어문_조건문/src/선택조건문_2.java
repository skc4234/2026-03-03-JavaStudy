// 연도 입력 => 윤년 확인
// 윤년 => 1. 4년마다 2. 100년마다 제외
//  year%4==0 && year %100 != 0 || year%400== 0
import java.util.Scanner;

public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// System.in => 입력한 키보드값 => 저장 시점은 엔터
		System.out.print("년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.println("입력된 년도 : " + year);
		if((year%4==0) && (year%100 !=0) || (year%400==0)) {
			System.out.println(year + "년은 윤년입니다.");
		}
		else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}