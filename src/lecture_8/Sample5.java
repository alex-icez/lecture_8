package lecture_8;

import java.util.Arrays;

interface Aa {
	void print();
}

public class Sample5 {
	public static void main(String[] args) {
		Aa a = new Aa() {
			public void print() {
				System.out.println("Dia!!");
			}
		};
		
		Aa b = new Aa() {
			public void print() {
				System.out.println("Dia!!");
			}
		};
		Integer arr[] = {5,1,2,31,32,4,2};
		Arrays.sort(arr);
		
		
	}
}
