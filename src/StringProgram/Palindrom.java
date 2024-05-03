package StringProgram;

import java.util.Iterator;

public class Palindrom {
	public static void main(String[] args) {
		String s = "nassyan";
		String rev = "";
		char[] a = s.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		if (s.equals(rev)) {
			System.out.println("is palindrom");
		} else {
			System.out.println("is not palindrom");

		}
	}
}
