package StringProgram;

public class Evenlengthwords {
	public static void main(String[] args) {
		String name = "i am ajit shingnare from testing Shastra";
		String[] aj = name.split(" ");
		for (int i = 0; i < aj.length; i++) {
			if (i%2==0) {
				System.out.print( aj[i]);

			} else {
				//System.out.print("Oddwords"+aj[i]);

			}
			System.out.println();

		}
		}
}
