package lecture_8;

import java.util.Scanner;

public class Sample1 {

	public static void f2() {
		
	}
	
	public static void f1() {
		f2();
	}
 	
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			String str = s.next();
			int a = Integer.parseInt(str);
		} catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Eeeee!!!");
		}
		System.out.println("exit");
	}

}
