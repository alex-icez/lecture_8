package lecture_8;

import java.io.UnsupportedEncodingException;

public class Sample10 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "авпвапва";
		byte b[] = str.getBytes("utf-8");
		System.out.println(new String(b, "utf-8"));
		

	}

}
