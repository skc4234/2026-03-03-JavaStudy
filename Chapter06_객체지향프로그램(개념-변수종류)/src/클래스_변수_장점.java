/*
 * 클래스
 *   학생 => 한명에 대한 설명
 *   맛집 => 맛집 한개에 대한 저장
 *   레시피 => 레시피 한개에 대한 설계
 *   
 *   설계 : 사이트의 상세보기
 *   ex) 영화 => CGV / 메가박스 / 롯데시네마
 *              => 공통으로 사용되는 변수 -> 추상화
 *       학생 => 국어/영어/수학/총점/평균/학점/이름
 *       class Student {
 *       		int kor, eng, math, total;
 *       		double avg;
 *       		char score;
 *       		String name;
 *       }
 * 
 */
import java.util.*;

class Student { 
	int kor, eng, math, total;
	double avg;
	char score;
	String name;
}

/*
 * 한 명에 대한 모든 정보를 통합된 메모리에 저장
 * 여러명 => 인스턴스
 * 한개 => 정적변수 => 한번에 변경 (정적 변수는 거의 없음)
 * 
 * class ClassName {
 * 		class 내에 선언되는 변수 => 멤버변수
 * 		객체 초기화 => 생성자(클래스명과 동일) => 단독 호출 불가능(new 사용)
 * 						=> 생략이 되면 자동으로 컴파일 시에 추가
 * 		기능 설정 => 메소드
 * 		변수를 마지막에 선언? => 오류는 아니지만 가독성 떨어짐  
 * }
 * 
 */


public class 클래스_변수_장점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[3];
		
		for(int i=0; i<stu.length; i++) {
			Student s = new Student();
			System.out.print("이름을 입력하시오 : ");
			s.name = scan.next();
			System.out.print((i+1) + "번째 국어 점수 : ");
			s.kor = scan.nextInt();
			System.out.print((i+1) + "번째 영어 점수 : ");
			s.eng = scan.nextInt();
			System.out.print((i+1) + "번째 수학 점수 : ");
			s.math = scan.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
			stu[i] = s;
		}
		
		for(Student s : stu) {
			System.out.printf("\n%s%5d%5d%5d%7d%7.2f\n", s.name, s.kor, s.eng, s.math, s.total, s.avg);
		}
	}

}
