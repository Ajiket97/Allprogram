package StarPattern;

public class DownPyramid {
public static void main(String[] args) {
	for (int line = 1; line <=5; line++) {
		for (int space = 1; space <=line; space++) {
			System.out.print(" ");
	}
		for (int ast = line; ast<= 5; ast++) {
			System.out.print("*"+" ");
		}
		
		System.out.println();
	}
	
}
}
