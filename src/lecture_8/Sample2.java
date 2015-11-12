package lecture_8;

import java.util.Scanner;

class MyException extends Throwable {
	int res;
	public MyException(int res) {
		this.res = res;
	}
}

public class Sample2 {

	static int read() throws MyException {
		Scanner s = new Scanner(System.in);
		int res = s.nextInt();
		if (res == 10) 
			throw new MyException(res);
		return res;
	}
	
	public static void main(String[] args) {
		int r;
		try {
			read();
		} catch (MyException e) {
			e.printStackTrace();
			r = e.res;
		}
	}

}
