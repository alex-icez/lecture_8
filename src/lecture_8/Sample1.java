package lecture_8;

import java.util.Scanner;

public class Sample1 {

	public static void f2() {
		Scanner s = null;
		int a = s.nextInt();
	}
	
	public static void f1() {
		f2();
	}
 	
	public static void main(String[] args) {
		
		try {

		} catch(NullPointerException e) {
			System.out.println("Eeeee!!!");
		}
		System.out.println("exit");
	}

}
