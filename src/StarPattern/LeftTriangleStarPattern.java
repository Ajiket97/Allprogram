package StarPattern;

public class LeftTriangleStarPattern {
	public static void main(String[] args) {
		for (int line = 1; line <=5; line++) {
			for (int space = 5; space >=1; space--) {
			//System.out.print(" ");
			}
		  for (int ast = 1; ast <=line; ast++) {
			System.out.print("*"+" ");
		}
			System.out.println();

		}

	}

}
