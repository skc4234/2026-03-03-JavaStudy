/*
 * 문자열 분리
 *  String[] split(String regex)
 *  
 * 
 * 
 * 
 * 
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red, green, black, blue, yellow, magenta, pink";
		String[] colors = color.split(", ");
		for(String s : colors) {
			System.out.println(s);
		}
		System.out.println();
		color = "red|green|black|blue|yellow|magenta|pink";
		// 정규식 기호 : | . ? *  + => \\
		String[] colors2 = color.split("\\|"); //이미 있는 기호 | => \\로 문자변환
		for(String s : colors2) {
			System.out.println(s);
		}
		
	}

}
