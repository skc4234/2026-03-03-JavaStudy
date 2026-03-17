/*
 * 변환
 *  toUpperCase => 대문자변환
 *  => String toUpperCase()
 *  
 *  toLowerCase => 소문자변환
 *  => String toLowerCase()
 *  
 *  replace     => 지정된 단어(문자/문자열) 변환
 *  => String replace(char c1, char c2)
 *     String replace(String c1, String c2)
 *                    --------  ---------
 *                    찾는 문자   변경할 문자
 *  
 *  replaceAll  => 정규식을 이용하여 변환 -> 크롤링 / 어려운 문자가 있을때 사용
 *  => replaceAll(regex, "변경할 문자")
 *  			  -----
 *                정규식([A-Z], [a-z], [0-9], ^[A-Z]   , [^A-Z]   , [가-힣]  , .)
 *                                           대문자 시작  대문자 제외   한글 전체   임의의 한글자
 * 
 * 
 */
public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오라클 => 대소문자 구분이 없다 / 실제 저장된 데이터는 구분
		String msg = "Hello Java Javb Javc Javd";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.print("실제 데이터(불변) = " + msg);
		
		//replace
		String s = msg.replace('a', 'k');
		System.out.println("\n" + s);
		s = msg.replace("Java", "Oracle");
		System.out.println(s);
		
		//replaceAll
		s = msg.replaceAll("Jav*", "int ");
		System.out.println(s);
		// 여러개를 한번에 변경할 때 사용
	}

}
