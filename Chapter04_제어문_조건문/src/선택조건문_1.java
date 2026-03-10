// main => 프로그램 시작점 => 프로그램 안에는 반드시 main이 1개 이상


public class 선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "admin";
		String pwd = "1234";
		
		// id와 pwd가 맞으면
		// hover
		if(id.equals("admin")&&pwd.equals("1234")) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		
	}

}