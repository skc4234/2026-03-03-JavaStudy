/*
 * 배열 : 여러개의 같은 데이터형을 모아서 쉽게 관리
 * 		 => 관리가 쉽다 / 고정적이다 => 한번 선언하면 변경이 불가능
 *  1. 배열 선언
 *  	=>데이터형[] 배열명;
 *  	  ------
 *  	  기본 데이터형, String, 사용자 정의 클래스형
 *  2. 배열 초기화
 *  	=> 선언과 동시에 초기화
 *  		데이터형[] 배열명 = {...}; // 값을 알고 있는 경우 => 명시적 초기화
 *  	=> 데이터형[] 배열명 = new 데이터형[배열크기]; 
 *  	=> 값을 모르는 경우 => 파일 읽기, *데이터베이스 읽기, *크롤링, 임의로 추출(random), 입력값
 *  3. 배열 출력
 *  	=> 일반 for문(인덱스번호 이용) / for-each(배열 실제 데이터) / Array.toString()
 *  4. 배열 데이터 변경
 *  	=> 반드시 인덱스 번호 이용
 *  5. 배열 특징
 *  	=> 변수 : 한 개의 데이터만 저장
 *  	=> 변수를 여러개 묶어서 한번에 저장하는 공간 설정 => 배열
 *  	=> 데이터 관리는 쉽지만(인덱스 번호 이용) 고정적이다(변경불가능), 같은 데이터형만 가능하다
 *  									   ㄴ컬렉션             ㄴ클래스
 *  	=> 프로그램은 익숙한 경우 => 반복/숙달
 *  ------------------------------------
 * => 선언하면 연속적으로 메모리 공간 생성 => 인덱스 번호로 접근 가능 => 공간의 크기가 동일 => 같은 데이터형만 가능
 *  배열명은 stack, 실제 데이터는 heap에 저장
 *  int[] arr = {10, 20, 30};
 *  stack                  heap
 *  ------           ---------------
 *  arr              0x100 0x104 0x108
 *  0x100 			  10    20     30
 *  ------          ------------------
 *                   arr[0] arr[1] arr[2]
 * ------------------------------------------
 * 
 *  
 *  
 *  제니퍼소프트
 *  한국IBM
 *  
 * 
 * 
 */

import java.util.Arrays;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong = "홍길동";
		String shim = "심청이";
		String kim = "김두한";
		String kang = "강감찬";
		
		// 1. 반복문 사용이 안된다 => 반복문은 변수명이 1개일때 사용가능
		System.out.println(hong + shim + kim + kang);
		
		System.out.println();
		// 2. 묶어서 사용
		String[] names = {hong, shim, kim, kang}; // 제어하기 쉬움
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		// 3. 실제 데이터 읽기
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		// 4. 라이브러리 사용
		System.out.println(Arrays.toString(names));

		System.out.println();
		//5. 변경 => 인덱스 이용
		names[0] = "박문수";
		System.out.println(Arrays.toString(names));
		
		// main => 분업 => 나눠서 작업 => 메소드
		
	}

}
