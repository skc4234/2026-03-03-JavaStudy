package com.sist.files;
/*
 *  18장
 *  - IO
 *     => 데이터의 흐름 관리(통로)
 *     - 데이터 이동(Stream) => 데이터 이동 공간
 *     - 단방향
 *     - 입출력 동시에 => 쓰레드
 *        - 카톡
 *           1. 서버로 메시지 전송 => Enter(Output)
 *           2. 출력 => Thread(Input)
 *     - 사용처
 *        - 파일 읽기/쓰기, 파일 이동 / 텍스트 변경 / 설정 파일
 *                                -----------> JSON/XML
 *        - 네트워크 통신(주고 받기) : 서버-클라이언트
 *        - 사용자 입력 => 콘솔
 *                    => InputStream  => HttpServletRequest
 *                    => OutputStream => HttpServletResponse
 *                                      ---------------------
 *                                      오라클 : PreparedStatement(Input,Output 내장)
 *     - 핵심
 *        - Stream : 데이터를 보내는 통로(단방향) => 읽기/쓰기
 *        - Buffered : 한번에 여러개의 데이터를 동시에 보낼때 사용 => 성능 향상
 *     - 주요 클래스
 *          InputStream
 *               |
 *       FileInputStream(1byte씩 전송) => 업로드/다운로드
 *       BufferedInputStream => 속도 향상
 *       
 *         OutputStream
 *               |
 *       FileOutputStream(1byte씩 전송) => 파일 쓰기
 *       BufferedOutputStream
 *    
 *    
 *           Reader : 읽기
 *             |
 *       FileReader(2byte씩 전송) => 파일 제어
 *       BufferedReader => 크롤링 => Jsoup
 *       
 *         Writer : 쓰기
 *           |
 *       FileWriter(2byte씩 전송) => 파일 쓰기
 *       BufferedWriter
 *       
 *       ObjectInputStream / ObjectOutputStream => 일반 애플리케이션
 *       파일 => 노출 / 연결성이 거의 없다 / 구분이 없다 : 데이터베이스
 *        => JSON / XML
 *        
 *  
 *  - Files 클래스
 *     - 패키지명 java.nio.file
 *     - 대부분이 static 메소드로 만들어져 있다.
 *        => Files.메소드
 *     - 주요 기능
 *        - exists(경로명) : 파일 존재 여부
 *        - createFile(경로명) : 새 파일 생성
 *        - createDirectory(경로명) : 새 폴더 생성
 *        - delete(경로명) : 파일 삭제
 *        - readAllLines() : 모든 줄을 List<String> 읽음
 *        - write(경로명, content) : 파일에 content 쓰기)
 *        - copy(source, target) : 파일 복사
 *        - move() : 이동
 *        - list() : 파일 목록 출력
 *        
 *      - 경로명 : Paths => Path 객체 생성 후 사용
 *                      => 파일이나 폴더를 찾기 위한 정보를 가지고 있는 클래스
 *      
 *      - 파일과 디렉토리를 제어하는 모든 기능을 가지고 있다
 *         => 이동 / 복사 / 읽기 / 쓰기 + 파일 정보
 *         => 반드시 파일 정보을 얻기 : Path 객체 사용
 *      - CheckedException : 반드시 예외처리 해야함
 *      - 파일 이동/복사 시 StandardCopyOption 사용
 *      - StandardCopyOption.REPLACE_EXISTING
 *         => 파일이 존재하면 덮어쓰기, 없으면 새로 생성
 *      
 *   - Path 객체
 *      - 파일/디렉토리의 위치를 나타내는 객체(파일 정보)
 *      - java.nio.file.*
 *      - 사용법
 *         => Paths.get(경로명)
 *      - 절대경로, 상대경로 둘다 가능 => Paths.get(".\\IO_정리.java")
 *    
 * 
 * 
 */
import java.nio.file.*;
import java.io.*;
import java.util.*;
// 파일 존재 여부 확인
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Path 생성
		 Path filePath = Paths.get("C:\\javadv\\고객2.txt");
		 Path dirPath = Paths.get("C:\\javadv2");
		 try {
			// 1. 파일 생성
			if(!Files.exists(filePath)) {
				// 파일이 없으면
				Files.createFile(filePath);
				System.out.println("파일 생성 완료");
			}
			// 2. 폴더 생성
			if(!Files.exists(dirPath)) {
				Files.createDirectory(dirPath);
				System.out.println("폴더 생성 완료");
			}
			// 3. 파일 쓰기  // FileOutputStream
			String content = "안녕하세요 Files 클래스는 파일관련 제어 클래스입니다";
			Files.write(filePath, content.getBytes());
			System.out.println("파일 쓰기 완료");
			
			// 4. 파일 읽기  // FileInputStream
			Path custFile = Paths.get("c:\\javadv\\고객.txt");
			List<String> data = Files.readAllLines(custFile);
			data.stream().forEach(System.out::println);
			
			// 5. 파일 복사
			Path copyPath = Paths.get("C:\\javadv\\고객2.txt");
			Files.copy(custFile, copyPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("파일 복사 완료");
			
			// 6. 파일 이동 / 이름 변경 => 잘라내기
			Path movePath = Paths.get("C:\\javadv2\\고객3.txt");
			Files.move(copyPath, movePath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("파일 이동 완료 / 파일명 변경");
			
			// 7. 파일 삭제
			Path delDir = Paths.get("c:\\javadv2");
			Files.delete(movePath);
			Files.delete(delDir); // 폴더가 비어있지 않으면 오류
			System.out.println("디렉토리 삭제");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
