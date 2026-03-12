/*
 *  char 배열
 *  배열 => 여러개의 변수를 하나의 이름으로 관리
 *      => 순차적으로 인덱스 번호를 가지고 있음 => 반복문 수행
 *      => 고정적이다(배열 크기 변경 불가)
 *      
 *  복사
 *    -얕은 복사(Call By Reference)
 *    -깊은 복사
 * 
 * -------라이브러리 이용---------
 */
import java.util.Arrays;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,200,300,400,500};
		int[] copy = arr; // 얕은 복사(주소를 복사), 같은 메모리 주소 사용, Call By Reference : 주소 참조
		
		//복사한 배열이 변경되면 원본도 변경됨
		copy[0] = 1000;
		System.out.println(arr[0]);
		System.out.println("arr = " + arr);
		System.out.println("copy = " + copy);
		
		int[] copy2 = arr.clone(); // 깊은 복사, 값을 복사해서 새로운 메모리에 저장


		copy2[0] = 3000;
		System.out.println("copy2 = " + copy2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(copy2));
		
	}

}
