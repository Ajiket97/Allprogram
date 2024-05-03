package StarPattern;

public class SandglassPattern {
	public static void main(String[] args) {
		for (int line = 1; line <= 10; line++) {
			if (line<=5) {
				for (int space = 1; space <= line; space++) {
					System.out.print(" ");
				}
				for (int ast = line; ast <= 5; ast++) {
					System.out.print("*"+" ");
				}
				System.out.println();

			} else {
				for (int space = line; space <=10; space++) {
					System.out.print(" ");
			}
				for (int ast = 6; ast<=line; ast++) {
					System.out.print("*"+" ");
				}
				
				System.out.println();

			}
		}
	}

}
