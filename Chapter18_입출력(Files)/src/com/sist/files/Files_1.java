package com.sist.files;
/*
 * - 주요 메소드
 *   - toAbsolutePath() => 절대경로명으로 변경
 *   - getFileName() => 파일 이름만 추출
 *   - getParent() => 경로명만 추출
 *   - getRoot() => 루트디렉토리
 * - 파일 복사
 *   - 파일이 없는 경우 자동 생성
 *   - 기존 파일이 있는 경우 덮어쓴다
 *   - File(절대경로), 상대경로도 사용 가능
 *   
 *   *웹에서 업로드/다운로드 사용 시 등장
 *   
 *   라이브러리
 *    1. 기능이 뭔지
 *    2. 메소드명 확인
 *    3. 매개변수 확인
 *    4. 리턴형 확인
 *    -------------> 암기 => 표준화
 *                         SQL/리눅스
 * 
 */
import java.nio.file.*;
public class Files_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path file = Paths.get("Files_1.java");
			Path file2 = Paths.get("c:\\javadv\\고객.txt");
			Path abFile = file.toAbsolutePath();
			System.out.println(file.toAbsolutePath());
			System.out.println(file.getFileName());
			System.out.println(abFile.getParent());
			System.out.println(abFile.getRoot());
			long size = Files.size(file2);
			System.out.println(size);
			Path dir = Paths.get("c:\\javadv");
			Files.list(dir).forEach(s->System.out.println(s.getFileName()));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
