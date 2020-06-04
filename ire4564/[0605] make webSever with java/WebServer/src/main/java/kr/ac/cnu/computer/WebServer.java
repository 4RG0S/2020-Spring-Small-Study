package kr.ac.cnu.computer;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class WebServer {
	private static final Logger logger = Logger.getLogger(BrowserReceiveServer.class.getName());
	
	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			int portNum = 712; // TODO: 포트 번호 지정
			// TODO: Server Socket 지정된 포트로 생성
			server = new ServerSocket(portNum);
			logger.info("Server Start : "+ portNum +" Port");

			while (true) {
				// TODO: Client 지정
				Socket client = server.accept();
				logger.info("Browser Connected : " + client.getInetAddress());

				new Response(client).start();
				// TODO: Response의 start 함수 실행
			}
		} catch (Exception e) {

		} finally {
			// TODO: 서버 종료
			try {
				if (server != null) {
					server.close();
				}
			} catch (Exception e) {
			}
		}
	}
}
