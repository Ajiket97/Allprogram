package ArrayProgram;

import java.util.Iterator;
import java.util.TreeSet;

public class SmallestNumber {
	public static <E> void main(String[] args) {
		int[] x = { 55, 85, 41, 36, -5, 25, -33 };
		TreeSet ts = new TreeSet<>();
		for (int num : x) {
			ts.add(num);
			System.out.println(num);

		}
		System.out.println(ts.headSet(ts.last()));
	}
}
