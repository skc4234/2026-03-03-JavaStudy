/*
 * 문자열 잘라내기
 *  => substring(int start)
 *     substring(int start, int end) => end는 end-1까지
 *   
 *   Hello Java
 *   0123456789 
 *    1. 원하는 위치부터 뒤에 전체까지 => substring(인덱스번호) => substring(6) => Java
 *    2. 부분적으로 자르기 => substring(인덱스번호1, 인덱스번호2)
 *    					  => substring(2,7) => 2~6까지 => llo J
 *    
 * 웹에서 사용 => **equals
 *               substring
 *               indexOf, lastIndexOf
 *               trim(), split()
 *               valueOf
 *    
 *    
 */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "0123456789";
		
		//3부터 전체를 가져와라
		System.out.println(msg.substring(3));
		
		//1~5까지
		System.out.println(msg.substring(1, 6));
		
		String post = "100-1001";
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		
		String title = "Hello Java, Oracle!";
		String temp = title.substring(0, 10) + "...";
		System.out.println(temp);
		// 화면 UI => HTML의 단점은 있는 그대로 출력 => ...으로 뒷내용 줄임
	}

}
