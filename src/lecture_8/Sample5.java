package lecture_8;

import java.util.Arrays;
import java.util.Comparator;

interface Aa {
	void print();
}

public class Sample5 {
	public static void main(String[] args) {
		Aa a = new Aa() {{
				System.out.println("no name construct");
		}};
		
		Aa b = new Aa() {
			public void print() {
				System.out.println("Dia!!");
			}
		};
		Integer arr[] = {5,1,2,31,32,4,2};
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return (o1 % 4) - (o2 % 4);
			}
		};
		
		
		
		
		Arrays.sort(arr, comp);
		
		
	}
}
