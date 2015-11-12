package lecture_8;

import java.util.Scanner;

class MyException extends Exception {
}



public class Sample2 {

	static int read() {
		Scanner s = new Scanner(System.in);
		int res = s.nextInt();
		if (res == 10) {
			MyException ex = new MyException();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
