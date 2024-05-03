package StarPattern;

public class StarPyramid {
	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int space = line; space <= 5; space++) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <= line; ast++) {
				System.out.print("*"+" ");
			}
			System.out.println();

		}

	}

}
