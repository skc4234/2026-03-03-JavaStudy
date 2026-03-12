/*
 * 10개의 정수를 임의로 추출 => 배열
 * => 최대값, 최소값 구하기
 * => 인덱스 위치 => 검색
 * 
 * 
 */
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random r = new Random();
		// 임의로 추출
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		//출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		// 요청 구현
		System.out.println("\n==========결과값==========");
		int max = arr[0];
		int min = arr[0];
		for(int i : arr) {
			if(max < i) max = i;
			if(min > i) min = i;
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		System.out.println();
		// 최대값, 최소값이 몇번째에 있는지 출력
		for(int i=0; i<arr.length; i++) {
			// 중복처리 안됨
			if(arr[i] == max) System.out.println("최대값은 " + (i+1) + "번째 자리");
			if(arr[i] == min) System.out.println("최소값은 " + (i+1) + "번째 자리");
		}
	}

}
