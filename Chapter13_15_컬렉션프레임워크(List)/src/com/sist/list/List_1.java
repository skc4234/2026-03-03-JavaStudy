package com.sist.list;
/*
 *                List => 인터페이스
 *                 |
 *      ------------------------  구현
 *      |           |          |
 *  ArrayList   LinkedList   Vector
 * 
 *  - *ArrayList
 *     => 비동기적
 *     => 데이터베이스에서 값을 가지고 저장할 때 사용
 *     
 *  - LinkedList
 *     => 파일 관리
 *     
 *  - Vector
 *     => 네트워크 유저 관리
 * 
 *  => ArrayList / Vector => 구조가 비슷
 *      => 접근 속도, 검색이 빠르다
 *  
 *  => LinkedList
 *      => 수정/삭제가 빠르다 
 *      
 * ------------------------------------------
 *  List list = new ArrayList();
 *            = new LinkedList();
 *            = new Vector();
 *   => 유지보수가 쉽다
 *   => 뒤에 있는 데이터베이스의 리턴형이 List 
 *            
 *  
 *  => 데이터를 인덱스로 관리
 *  => 데이터 중복 허용
 *  => 저장 순서 유지
 * 
 * 
 * 
 */
import java.util.*;
public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for(String s : list) {
			System.out.println(s);
		}
	}

	
}
