package StarPattern;

public class KajukatliPattern {
	public static void main(String[] args) {
		for (int line = 1; line <= 10; line++) {
			if (line <=5) {
				for (int space = line; space <= 5; space++) {
					System.out.print(" ");
				}
				for (int ast = 1; ast <= line; ast++) {
					System.out.print("*"+" ");
				}
				System.out.println();

			} else {
				for (int space = 6; space <=line; space++) {
					System.out.print(" ");
			}
				for (int ast = line; ast<= 10; ast++) {
					System.out.print("*"+" ");
				}
				
				System.out.println();

			}
		}
	}
}
