package lecture_8;

class Aa {
	void print() {
		System.out.println("Hello!!");
	}
}

public class Sample5 {
	public static void main(String[] args) {
		Aa a = new Aa() {
			void print() {
				System.out.println("Dia!!");
			}
		};
	}
}
