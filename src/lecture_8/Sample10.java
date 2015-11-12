package lecture_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sample10 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String str = "авпвапва";
		byte b[] = str.getBytes("utf-8");
		System.out.println(new String(b, "cp1251"));
		
		Socket s = new Socket("8.8.8.8", 80);
		s.getInputStream();
		s.getOutputStream();
		InputStreamReader in = new InputStreamReader(new FileInputStream("gfd"), "utf8");

		
		
	}

}
