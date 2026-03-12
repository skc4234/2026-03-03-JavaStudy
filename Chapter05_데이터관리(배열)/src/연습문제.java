/*
 * 
 * 배열 : 같은 유형 데이터를 여러개 모아서 관리
 * 		- 가변형 / 필요 데이터 저장이 가능 => 컬렉션(ArrayList, LinkedList, Vector, Map, Set)
 * 	1)특징
 * 	  - 연속적인 메모리 할당 => 인덱스를 이용한 접근
 *    - 고정된 크기 => 선언 시에 크기 정함 => 변경 불가
 *    	1) int[] arr = new int[크기];
 *    				 = {...} => 선언과 동시에 초기화
 *    		int[] arr = {'A', 'B', ...} 가능 
 * 	2)장점
 * 	  - 빠른 접근 속도 => 인덱스 번호 이용
 * 	  - 원래는 데이터를 캐시에 저장 후 사용
 * 	  - 간단한 구현 : 배열의 데이터 저장구조 단순
 *    - 고정된 크기 : 메모리의 사용량 예측 -> 관리가 쉽다 => 단점?
 * 	3)단점
 * 	  - 고정된 크기 : 추가, 삭제 불가능(메모리를 지웠다가 다시선언 => 비용이 든다)
 * 	  - 메모리 낭비 : 크게 만들면 메모리의 낭비
 * 				    작게 만들면 추가 등이 어렵다
 * 	  - 같은 데이터형 => 유연성이 떨어짐
 * 	4)배열선언
 * 		데이터형[] 배열명
 *  5)초기화
 *  	데이터형[] 배열명 = {...} // 명시적 초기화
 *  				  = new 데이터형[배열의 크기];
 *  						int    => 0
 *  						double => 0.0
 *  						long   => 0L
 *  						char   => '\0'
 *  						String => null
 *  						boolean => false
 *  6)반복문을 이용한 출력방법
 *    => for-each(향상된 for) => 화면 UI
 *    -> for(변수선언 : 배열명)
 *    	=> 인덱스를 이용하지 않고 실제 저장된 값 이용
 *    	=> 자동으로 종료
 *    	=> 배열범위 초과시 오류 
 *    
 *  7)저장 위치가 다르다
 *  	int[] arr = {10,20,30}
 *     ------       ----------
 *      0x100 ----> 10  20  30
 *     ------       ----------
 *       arr       100 104 108 => int는 4byte라서 주소도 4만큼 차이난다
 *     실제 저장된 메모리의 주소를 이용한 데이터형 => 참조 데이터형
 */




import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)
		char[] c = new char[10];
		
		//2)
		int[] n = new int[6];
		for(int i=0; i<n.length; i++) {
			n[i] = i;
		}
		System.out.println(Arrays.toString(n));
		
		//3)
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		char[] day1 = {'일', '월', '화', '수', '목', '금', '토'};
		System.out.println(Arrays.toString(day1));
		
		//4)
		boolean[] bool = {true, false, false, true};
		
		char[] alpha = {'a', 'b', 'c', 'd'};
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]);
		}
		
		System.out.println();
		
		//
		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i=0; i<10; i++) {
//			System.out.print("양의 정수를 입력하시오(" + (i+1) + ") : ");
//			int num = scan.nextInt();
//			if(num<=0) {
//				i--;
//				System.out.println("양의 정수가 아닙니다. 다시 입력하시오...");
//				continue;
//			}
//			arr[i] = num;
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.print("3의 배수 : ");
//		for(int i : arr) {
//			if(i%3==0) System.out.print(i + " ");
//		}
		System.out.println();
		
		//
		int[] arr2 = new int[10];
		int sum=0;
		double avg;
		Random r = new Random();
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = r.nextInt(10)+1; // (int)(Math.random()*10)+1
			sum += arr2[i];
		}
		avg = sum/(double)arr2.length;
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println("\n평균 : " + avg);
		
		System.out.println();
		
		
		
//		int[] arr3 = new int[5];
//		for(int i=0; i<arr.length(); i++) {
//			System.out.print("정수를 입력하시오 : ");
//			int num = scan.nextInt();
//			arr3[i] = num;
//		}
//		for(int i : arr3) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\n");
		
		
		//
		String[] arr4 = new String[10];
		for(int i=0; i<arr4.length; i++) {
			System.out.print("문자를 입력하시오 : ");
			String s = scan.next();
			arr4[i] = s;
		}
		for(String i : arr4) {
			System.out.print(i);
		}
		
		System.out.println("\n\n");
		
		
		
		//
		int[] arr5 = new int[10];
		for(int i=0; i<arr5.length; i++) {
			//System.out.print("정수를 입력하시오 : ");
			//int num = scan.nextInt();
			int num = r.nextInt(100)+1;
			arr5[i] = num;
		}
		System.out.println(Arrays.toString(arr5));
		System.out.printf("%d %d %d\n\n",arr5[2], arr5[4], arr5[arr5.length-1]);
		
		//
		int[] arr6 = new int[10];
		int max = arr6[0];
		for(int i=0; i<arr6.length; i++) {
			arr6[i] = r.nextInt(100)+1;
		}

		for(int i : arr6) {
			if(i > max) max = i;
		}
		System.out.println(Arrays.toString(arr6));
		System.out.println("최대값 : " + max);
		
		System.out.println("\n");
		
		
		//
		int[] arr7 = new int[10];
		for(int i=0; i<arr6.length; i++) {
			arr7[i] = r.nextInt(100)+1;
		}
		int sum1 = 0;
		for(int i : arr6) {
			sum1 += i;
		}
		double avg1 = sum1/(double)arr6.length;
		System.out.println("총점 : " + sum1 + ", 평균 : " + avg1);
		
		
		
		System.out.println("\n\n");
		
		//
		//int[] arr8 = {95,75,85,100,50};
		int[] arr8 = new int[10];
		for(int i=0; i<arr8.length; i++) {
			arr8[i] = r.nextInt(1000)+1;
		}
		//int min = arr8[0];
		int d = 0;
		for(int i=1; i<arr8.length; i++) {
			if(arr8[i-1] > arr8[i]) {
				d=arr8[i];
				arr8[i] = arr8[i-1];
				arr8[i-1] = d;
				i=0;
			}
		}
		System.out.println(Arrays.toString(arr8));
	}

}
