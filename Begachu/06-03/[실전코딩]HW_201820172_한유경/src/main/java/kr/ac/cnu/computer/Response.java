package kr.ac.cnu.computer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Paths;

public class Response extends Thread {
	private Socket client;

	public Response(Socket client) {
		// TODO: client 지정
		this.client = client;
	}

	@Override
	public void run() {
		BufferedReader bufferedReader = null;
		PrintWriter printWriter = null;

		try {
			// TODO:
			bufferedReader = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			String line = bufferedReader.readLine();

			String url = getUrl(line);
			String uri = getUri(url);
			String staticResource = getStaticResource(uri);
			String responseHeaders = getResponseHeaders(staticResource.getBytes().length);

			printWriter = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
			printWriter.write(responseHeaders);
			printWriter.write("\r\n");
			printWriter.write(staticResource);
			printWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (printWriter != null) {
					printWriter.close();
				}

				if (bufferedReader != null) {
					bufferedReader.close();
				}

				if (this.client != null) {
					client.close();
				}
			} catch (Exception e) {
			}
		}
	}

	private static final String WEB_ROOT = "C:\\project";

	public String getResponseHeaders(int size) {
		StringBuffer headers = new StringBuffer("");
		// TODO: 과제 문서에 나온 양식대로 응답 생성
		headers.append("HTTP/1.1 200 OK\r\n");
		headers.append("Host: localhost\r\n");
		headers.append("Content-Length: " + size + "\r\n");
		headers.append("Content-Type: text/html;charset=UTF-8\r\n\r\n");
		return headers.toString();
	}

	public String getUrl(String line) {
		return line.split("[ ]")[1];
	}

	public String getUri(String url) {
		System.out.println("---->" + url);
		return url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("?"));
	}

	public String getStaticResource(String uri) throws IOException {
		StringBuffer html = new StringBuffer("");

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(Paths.get(WEB_ROOT, uri).toFile()))) {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				html.append(line).append("\r\n");
			}
		}

		return html.toString();
	}
}
