/*
 * 1. 프로그램의 순서
 * 		데이터 저장 ====================> 데이터 가공 =====> 화면 출력
 * 		ㄴ변수 : 데이터 1개 저장            ㄴ연산자/제어문     ㄴSystem.out.println() .print() .printf("%d",a)
 * 		  배열 : 같은 데이터 여러개 저장                        브라우저 : HTML
 * 		  클래스 : 다른 데이터 여러개 저장                       윈도우 / 모바일
 * 				=>사용자 정의 데이터
 * 
 * 		변수 => 메모리 크기 결정
 * 			   기본형(데이터형, 자료형)
 * 					1byte = 8bit              4byte                       8byte
 * 			   정수 : byte(8bit, -128~127), int(32bit, -21억4천~21억4천), long(64bit, 빅데이터)
 * 					 ㄴ파일 업로드/다운로드     ㄴ일반 정수                    ㄴ통계, 회계
 * 					   네트워크 전송
 * 					컴퓨터는 모든 정수를 int로 인식
 * 					ex) 10000000000L
 * 			   실수 : double
 * 					숫자 중에 가장 큰 데이터형(8byte)
 * 					소수점이 필요시에 사용 -> 소수점 이하 15자리까지
 * 			   논리 : boolean
 * 					true/false만 저장
 * 			   문자 : char
 * 					2byte => 0~65535 => 멀티바이트(유니코드)
 * 							=>UTF-8 (브라우저는 1byte라서 유니코드로 바꿔야함)
 * 							=> 각국의 언어 사용이 가능
 * 							=> 모든 운영체제에 호환
 * 			   문자열 : String
 * 					ㄴ char여러개를 묶어서 사용
 * 					ㄴ char[] => 기능을 가지고 있다
 * 						데이터형 + 클래스형
 * 					*웹/네트워크는 모든 데이터가 문자열이다 --- valueOf()
 * 		변수명 설정(식별자) => 메소드, 클래스, 인터페이스 적용
 * 		1) 알파벳/한글로 시작(대소문자 구분) 웹/네트워크/데이터베이스와의 호환 => 한글 자제
 * 		2) 숫자 사용이 가능(첫번째는 불가)
 * 		3) 키워드는 사용할 수 없다(자바에서 사용되는 단어)
 * 		4) 공백을 포함할 수 없다
 * 		5) 특수문자 사용가능(_, $)
 * 		----------------------------
 * 		가독성(리팩토링)
 * 		ㄴ클래스/인터페이스는 대문자로 시작
 * 		  메소드/변수는 소문자로 시작
 * 		  상수는 모두 대문자로
 * 		  단어가 2개 이상일때 시작단어 대문자 ex)MainClass, FileName
 * 
 * 		데이터 가공 : 연산자/제어문
 * 		단항연산자
 * 			1. 증감연산자 ++, --
 * 			2. 형변환연산자 (int)a
 * 				ㄴ규칙 1) 가장 큰 데이터형으로 변환 int + double = double
 * 					2) int 이하 연산자 byte, char, short =>  연산결과는 int
 * 					3) 자동형변환 : 작은데이터 => 큰데이터형으로 변환
 * 					   강제형변환 : 큰데이터형 => 작은데이터형으로
 * 						byte<char<int<long<double   *boolean 제외
 * 					   **클래스 형변환
 * 			3. 부정연산자 => 조건문
 * 		이항연산자
 * 			1. 산술연산자(+, -, *, /, %)
 * 				+ : "7"+7 => "77"
 * 				/ : 0으로 나눌수 없다
 * 				% : 결과값은 왼쪽부호와 동일
 * 					%0 => NaN
 * 			2. 비교연산자(==, !=, >=, <=, <, >)
 * 						오라클 : = , 자바스크립트 : ===, JSP : eq/ne
 * 			3. 논리연산자( &&, || )
 * 						직렬 병렬
 * 						둘다 true / 한쪽만 true
 * 					(조건1) && (조건2) => 조건1이 false면 처리하지 않음 => false
 * 					(조건1) || (조건2) => 조건1이 true면 처리하지 않음 => true
 * 			4. 대입연산자(=, +=, -=)
 * 		삼항연산자
 * 			(조건) ? 값1 : 값2 => 조건이 true면 값1, false면 값2 반환 => if~else
 * 			복잡한 프로그램/언어가 섞였을때   ex)HTML + Java
 * 
 * 		제어문
 * 			조건문
 * 				단일조건문 if
 * 				선택조건문 if~else => 웹에서 많이 쓰임
 * 						true/false
 * 						일반 프로그램은 건너뛴다
 * 						웹 => 화면 => 값을 전송
 * 						=> HTML은 UI => 기능 첨부(자바로 처리) => JSP(자바를 HTML로 변환) => ThymeLeaf
 * 						=>  *React 변환, VueJs => HTML 기반
 * 				다중조건문 if, else if, else => 한 개의 조건만 수행
 * 			선택문
 * 				switch~case : break / case -> {} 
 * 			반복문
 * 				1. for(초기값; 조건식; 증가값) { 실행문장 }
 * 				2. 초기값;
 * 					while(조건식) {
 * 						실행문장
 * 						증가값
 * 					}
 * 				3. 초기값;
 * 					 do {
 * 						실행문장
 * 						증가값
 * 					} while(조건식);
 * 			반복제어문
 * 				break => switch~case / 반복문 -> 제어문 종료
 * 				continue => 반복문 안에서만 사용, for-특정 부분을 제외하고 처리, while-반복문 처음으로
 * 
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class 정리1_4 extends JFrame implements KeyListener {
	GameView gv = new GameView();
	public 정리1_4() {
		add("Center", gv);
		setSize(800, 600);
		setVisible(true);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 정리1_4();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		if(e.getSource()==this) {
			//System.out.println(e.getKeyCode());
			switch(e.getKeyCode()) {
			case KeyEvent.VK_RIGHT :
				gv.x += 5;
				if(gv.x>580) gv.x=580;
				gv.repaint();
				break;
			case KeyEvent.VK_LEFT :
				gv.x -= 5;
				if(gv.x<0) gv.x=0;
				gv.repaint();
				break;
			case KeyEvent.VK_UP :
				//gv.y += 5;
				while(true) {
					gv.y++;
					if(gv.y>500) {
						System.out.println(gv.y);
						gv.y=310;
						gv.repaint();
						break;
					}
					
					gv.repaint();
				}
				break;
			}
			

			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
