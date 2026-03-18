// 액션클래스 => 기능 수행(메소드)
// MovieDAO / MovieManager / MovieService=>SpringAI
//  DB연동      크롤링           브라우저 전송

import java.io.FileReader;

public class MovieSystem {
	// 여러명이 동시에 접속했을 때 같은 데이터를 보여줘야함 => 공유변수(static)
	static Movie[] movies = new Movie[1938];
	
	// 초기화 => 파일을 읽어서 데이터 저장
	static { // 자동으로 인식
		// 파일 예외처리
		try {
			// 파일 전체의 문자 저장, 단순 +보다 훨씬 빠름
			StringBuffer sb = new StringBuffer();
			FileReader in = new FileReader("c:\\javadv\\movie.txt");
			int i = 0; // 한글자씩 읽음, return형이 int => char로 변환
			while((i=in.read())!=-1) { // -1이면 EOF(End Of File)
				sb.append((char)i);
			}
			in.close();
			String strMovie = sb.toString(); // 문자열로 변환
			
			i = 0;
			// 1938개로 자르기
			String[] datas = strMovie.split("\n");
			for(String data : datas) {
				// |로 나누기
				String[] m = data.split("\\|");
				movies[i] = new Movie();
				movies[i].mno = Integer.parseInt(m[0]);
				//               => 문자열을 정수로 변경
				movies[i].title = m[1];
				movies[i].genre = m[2];
				movies[i].poster = m[3];
				movies[i].actor = m[4];
				movies[i].regdate = m[5];
				movies[i].grade = m[6];
				movies[i].director = m[7];
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
