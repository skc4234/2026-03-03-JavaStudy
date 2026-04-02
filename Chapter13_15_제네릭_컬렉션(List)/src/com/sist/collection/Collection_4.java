package com.sist.collection;
/*
 *  제네릭(13장)
 *   1. 정의
 *       => 클래스나 메소드를 정의할 때 사용할 데이터형을 표준화해서 사용
 *       => 데이터형의 안정성, 가독성이 좋다
 *        ArrayList list = new ArrayList();
 *        list.add("홍길동");
 *        list.add(30);
 *        list.add('A');
 *         => for문 사용불가
 *       => ArrayList<String> list = new ArrayList<String>();
 *           => String만 들어갈 수 있음
 *       => 재사용성이 좋다
 *       => 소스가 간결해진다 => 형변환이 없기때문
 *   2. 사용법
 *       <클래스만 사용 가능>
 *       - int, double,... X
 *       - Integer, Double, String => 일반 데이터형 => Wrapper 클래스로 가능
 *   3. 메소드(매개변수, 리턴형), 변수
 *       => 한번에 변경 
 *       
 *       
 */
class Box<T> {
	T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
}
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		Box<String> box1 = new Box<>();
		/*
		 *  T : Type (클래스형)
		 *  E : Element
		 *  
		 * - Map<K,V>
		 *  K : Key
		 *  V : Value
		 * 
		 *  Object => 프로그램에 필요한 데이터형으로 변환 
		 *  
		 *   
		 * 
		 */
	}

}
