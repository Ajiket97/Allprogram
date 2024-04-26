package ArrayProgram;

public class PrintAllEvenNumber {
	public static void main(String[] args) {
		int [] x = {78,455,24,878,24,75,65,4,8,5,52,45,25};
		for (int i = 0; i < x.length; i++) {
			if (x[i]%2==0) {
				System.out.println("even number is"+x[i]);
			}else {
				System.out.println("is odd"+x[i]);
			}
		}
	}

}
