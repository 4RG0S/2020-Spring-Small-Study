package kr.ac.cnu.computer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class BrowserReceiveServer {
	private static final Logger logger = Logger.getLogger(BrowserReceiveServer.class.getName());
	
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		try {
			// TODO: Server Socket 생성 및 Client 통한 통신
			int port_num = 712; // TODO: port 번호
			server = new ServerSocket(port_num);
			logger.info("Server Start : " + port_num + " Port");
			client = server.accept();
			logger.info("Browser Connected : " + client.getInetAddress());

			// TODO: Client의 InputStream 값을 읽음
			InputStream input = client.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(reader);
			// TODO: 한 줄 씩 받은 값 한줄씩 반복하여 출력
			String string = br.readLine();
			while(!string.isEmpty()) {
				logger.info(string);
			}
			
			logger.info("Server Shutdown");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: 서버 종료
			try {
				if(client != null)
					client.close();
				if(server != null)
					server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
