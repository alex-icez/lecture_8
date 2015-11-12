package lecture_8;

import java.util.Arrays;

public class Sample3 {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = s1 + s2;
		System.out.println(s3.charAt(2));
		for(int i = 0; i < s3.length(); i++)
			System.out.print(s3.charAt(i) + " ");
		char arr[] = s3.toCharArray();
		
		for(char ch : arr)
			System.out.print(ch + " ");
		System.out.println();
		byte ab[] = (s3 + "саша").getBytes();
		System.out.println(Arrays.toString(ab));
		
		System.out.println(s1.startsWith("ab"));
		System.out.println(s1.endsWith("bc"));
		System.out.println("ab".compareTo("ab"));
		
		System.out.println("ababbbb bbbb bbb".indexOf(" bbb", 8));
		
		
		System.out.println("sashaaa"
				.substring(2, 4)
				.concat("csdf"));
		
		System.out.println(Arrays.toString("ab ac cc abc bb".split(" ")));
		
		
		String s = "  Алгоритм Ахо — и А   Ко расик — алгоритм  23 поиска   подстроки  ";
		System.out.println(s.replaceAll("—", "#"));
		System.out.println(s.replaceAll("[а-яА-Я]{2,}", "#"));
		System.out.println(s.replaceAll("[а-яА-Я]*", "#"));
		
		
		System.out.println("abbb bbb".replaceAll("\\B\\w", "Z"));
		
		
		
		
		
	}
}
