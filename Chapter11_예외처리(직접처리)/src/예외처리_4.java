/*
 * 1~10까지 for문 => 난수발생 : 0~2사이 => /
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			try {
				int no = (int)(Math.random()*3);
				System.out.println(i + ". " + i + "/" + no + " = " + (i/no));	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				// i++로 올라감
			}
		}	
	}

}
