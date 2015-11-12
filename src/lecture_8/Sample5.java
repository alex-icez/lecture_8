package lecture_8;

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
		
	}
}
