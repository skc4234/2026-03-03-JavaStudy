/*
 *  매개변수 => 리턴값 전송
 *  전송법
 *   - Call by Value
 *   	=> 값을 복사
 *      => 일반적
 *   - Call by Reference
 * 		=> 원본을 넘겨줌
 * 		=> 가끔
 * 
 * int[] arr = {1,2};
 * int[] copy = arr;
 * copy[0] = 2; => arr도 바뀜
 * int[] copy = arr.clone() => 복사
 * 
 * 
 */
class Value {
	int a;
	int b;
}

// 같은 메모리 주소를 이용하면 값을 같이 제어
// 배열 / 클래스(String => Call By Value)
class CallByValue { // 값을 보내면 메소드에서 새로운 메모리를 만들어서 값을 저장 후 제어
	void swap(int a, int b) {
		System.out.println("변경 전 a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("변경 후 a = " + a + ", b = " + b);
		
	}
	void swap2(String s1, String s2) {
		System.out.println("변경 전 s1 = " + s1 + ", s2 = " + s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("변경 후 s1 = " + s1 + ", s2 = " + s2);
	}
}

class CallByReference {
	void swap(int[] arr) {
		System.out.println("수행 전 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("수행 후 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		
		/*
		 * int[] rand(int[] arr) {
		 * 		return arr;
		 * }
		 * 
		 * void rand(int[] arr) {
		 * 		변경
		 * }
		 * 
		 */
	}
	
	void swap2(Value v) {
		System.out.println("변경 전 v = " + v);
		System.out.println("수행 전 v.a = " + v.a + ", v.b = " + v.b);
		int temp = v.a;
		v.a = v.b;
		v.b = temp;
		System.out.println("수행 후 v.a = " + v.a + ", v.b = " + v.b);
		
	}
}

class Test {
	int a = 10;
	void display() {
		System.out.println("Test:display Call...");
		System.out.println("a = " + a);
		a++;
	}
} 


public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		String s1 = "홍길동", s2 = "강감찬";
		CallByValue call = new CallByValue();
		call.swap(a, b); // a와 b는 안바뀜
		System.out.println("수행후 원본 a = " + a + " b = " + b);
		
		//모든 클래스와 배열 => call by reference
		//String은 call by value
		call.swap2(s1, s2);
		System.out.println("수행후 원본 s1 = " + s1 + " s2 = " + s2);
		
		CallByReference cr = new CallByReference();
		int[] arr = {10,20};
		cr.swap(arr);
		System.out.println("수행 후 원본 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		// 원본 변경
		
		int[] copy = arr;
		System.out.println("copy = " + copy);
		System.out.println("arr = " + arr);
		copy[0] = 30;
		System.out.println("수행 후 원본 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		
		int[] copy2 = arr.clone();
		System.out.println("copy2 = " + copy2);
		copy2[0] = 300;
		System.out.println("수행 후 원본 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		
		// Call By Reference
		Value v = new Value();
		System.out.println("main의 v : " + v);
		v.a = 100;
		v.b = 200;
		cr.swap2(v);
		System.out.println("수행 후 원본 v.a = " + v.a + ", v.b = " + v.b);
		
		// 호출만 한다면 - Thread / Window창
		new Test().display();
		new Test().display();
		new Test().display();
		
		// 연속해서 사용 => 객체 주소 저장
		Test t = new Test();
		t.display();
		t.display();
		t.display();
		
		// 생성자는 반드시 new 동반
		String s = "Hello";
		System.out.println(s.length());
		System.out.println("Hello".length());
	}

}
