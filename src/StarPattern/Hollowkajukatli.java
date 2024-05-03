package StarPattern;

public class Hollowkajukatli {
	public static void main(String[] args) {
		for (int line = 1; line <= 4; line++) {
			for (int space = 3; space >= line; space--) {
				System.out.print(" ");
			}
			for (int ast = line; ast <=4; ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
