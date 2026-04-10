package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.io.*; // 클라이언트와 통신
import java.net.*; // ServerSocket : 고정 포트,대기소켓 => 접속을 받는 경우
// Socket : 클라이언트와 통신 => IP/Port => 유동
// 서버 구동
// 접속자의 정보 저장(ip, port) => Vector(동기화)
// 데이터 송신 ======= 데이터 수신
// OutputStream      BufferedReader(1byte->2byte)
// 1byte             InputStreamReader
/*
 *  1. 서버 구동
 *  2. 접속자 받기 => Vector에 저장
 *  3. 접속자마자 통신을 따로 할 수 있게 연결 => Thread
 *     => 멀티쓰레드
 *  4. 통신이 종료되면(나가기 버튼) => 쓰레드 종료
 * 
 */
public class Server implements Runnable {
	/*
	 *  네트워크에 필요한 클래스 선언
	 *  
	 */
	private Vector<Client> waitVc = new Vector<Client>(); // 접속자 정보 저장
	private ServerSocket ss;
	private final int PORT = 3000;
	
	public Server() {
		try {
			// 서버소켓 default 인원은 50개
			ss = new ServerSocket(PORT); // IP 자동 인식
			/*
			 *  1. bind
			 *     => 핸드폰 개통
			 *     => 전화번호(IP, 자동설정) + 전화선(PORT) => USIM
			 *  2. listen
			 *     => 접속자를 기다리는 상태(루프)
			 */
			System.out.println("Server Start!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server(); // 서버 구동
		new Thread(server).start(); // run() 호출
	}

	// 접속자를 받아서 저장 => 쓰레드 배정(new Thread) => 교환소켓
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				Socket s = ss.accept(); // 접속 시에만 호출(특수메소드)
				             // 접속이 되었다면 => 전화가 걸렸다면
				             // 발신정보(IP,Port) => Socket에 저장
				System.out.println("접속자의 연결번호(PORT) : " + s.getPort());
				System.out.println("접속자의 IP : " + s.getInetAddress().getHostAddress());
				// 통신할 쓰레드 배정
				Client client = new Client(s); // 각자 배정
				// socket 주인과 통신할 수 있게 연결
				//waitVc.add(client);
				client.start(); // 통신 시작
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 통신만 담당(사용자 요청 ==== 결과값 응답)
	class Client extends Thread {
		String id, name, sex;
		Socket s; // 클라이언트 정보
		// 통신 => 읽기/쓰기
		BufferedReader in; // 요청받기
		OutputStream out; // 응답하기
		
		public Client(Socket s) {
			this.s = s;
			try {
				// 위치 확인
				out = s.getOutputStream(); // 클라이언트가 읽어가는 위치
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 클라이언트가 요청보낸 값을 가지고 온다
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		// 실제 통신하는 부분
		public void run() {
			try {
				while(true) {
					// 접속자 요청 받기
					String msg = in.readLine();
					System.out.println("client 요청 : " + msg);
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());
					// 100|id|name|sex\n
					switch(protocol) {
					case Function.LOGIN->{
						// 로그인 처리
						// 사용자가 보내준 데이터 받기
						id=st.nextToken();
						name=st.nextToken();
						sex=st.nextToken();
						// 접속자들에게 메시지를 보낸다
						messageAll(Function.CHAT+"|[📣알림] "+ name + " 님이 입장하셨습니다.");
						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
						
						// 로그인 된 사람 처리
						messageTo(Function.MYLOG+"|"+name);
						// => Mylog => 로그인창 종료, 대기실 창 true
						waitVc.add(this); // 접속자 명단에 저장
						// 이미 접속된 사람의 정보를 한번에 전송
						for(Client c : waitVc) {
							messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.sex);
						}
						
					}
					case Function.MYLOG->{
						
					}
					case Function.CHAT->{
						String message = st.nextToken();
						messageAll(Function.CHAT+"|["+name+"]"+message);
					}
					case Function.MYEXIT->{
						messageAll((Function.EXIT+"|"+id));
						for(int i=0; i<waitVc.size(); i++) {
							Client c = waitVc.get(i);
							if(c.id.equals(id)) {
								messageTo(Function.MYEXIT + "|");
								waitVc.remove(i);
								try {
									in.close();
									out.close();
									// 전화끊기
								} catch (Exception e) {
									// TODO: handle exception
								}
							}
						}
					}
					case Function.EXIT->{
						
					}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		// 공통 사용 부분
		// synchronized => 쓰레드는 비동기 => 동기화로 변경
		// 개인적으로 보내는 메소드
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 전체 메시지
		public synchronized void messageAll(String msg) {
			try {
				for(Client c : waitVc) {
					c.messageTo(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
