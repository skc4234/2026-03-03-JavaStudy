
public class FrontEnd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 영화목록 출력
		MovieSystem ms = new MovieSystem();
		int i=1;
		System.out.println("============= Naver 영화 목록 =============");
		for(Movie m : ms.movies) {
			System.out.printf("\n=============== %04d ===============\n",i);
			System.out.println("영화명 : " + m.title);
			System.out.println("출연 : " + m.actor);
			System.out.println("장르 : " + m.genre);
			System.out.println("등급 : " + m.grade);
			System.out.println("감독 : " + m.director);
			System.out.println("====================================");
			i++;
			Thread.sleep(1 );
		}
		
	}

}
