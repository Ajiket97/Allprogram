package ArrayProgram;

public class AverageArray {
	public static void main(String[] args) {
		int[] x = { 45, 65, 35, 78, 214, 569, 225, 33, 5, 4, 5, 52, 25, 55, 166, 94, 287 };
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
			avg = sum / x.length;
		}
		System.out.println(avg);
		System.out.println(sum);
	}

}
