package kr.ac.cnu.computer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class BrowserReceiveServer {
	private static final Logger logger = Logger.getLogger(BrowserReceiveServer.class.getName());

	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			// TODO: Server Socket 생성 및 Client 통한 통신
			int port_num = 712 ; // TODO: port 번호
			server = new ServerSocket(port_num);
			logger.info("Server Start : " + port_num + " Port");
			
			Socket client = server.accept();
			logger.info("Browser Connected : " + client.getInetAddress());

			// TODO: Client의 InputStream 값을 읽음
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			// TODO: 한 줄 씩 받은 값 한줄씩 반복하여 출력
			}
			logger.info("Server Shutdown");
		} catch (Exception e) {
			e.printStackTrace();
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
