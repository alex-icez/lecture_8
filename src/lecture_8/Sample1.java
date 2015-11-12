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
		} catch(NullPointerException | NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Eeeee!!!");
		} catch(Exception e) {
			System.out.println("exc");
		}
		System.out.println("exit");
	}

}
