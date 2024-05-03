package StarPattern;

public class NumberPattern {
	public static void main(String[] args) {
		for (int num = 5; num >= 1; num--) {
			
			for (int line = 1; line <= num; line++) {
				System.out.print(" "+ line*num);
			}
			System.out.println();

		}

	}

}
