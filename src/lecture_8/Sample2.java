package lecture_8;

import java.util.Scanner;

class MyException extends Exception {
}



public class Sample2 {

	static int read() throws MyException {
		Scanner s = new Scanner(System.in);
		int res = s.nextInt();
		if (res == 10) 
			throw new MyException();
		return res;
	}
	
	public static void main(String[] args) {
		try {
			read();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
