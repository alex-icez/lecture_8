package lecture_8;

public class Sample3 {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = s1 + s2;
		System.out.println(s3.charAt(2));
		for(int i = 0; i < s3.length(); i++)
			System.out.print(s3.charAt(i) + " ");
	}
}
