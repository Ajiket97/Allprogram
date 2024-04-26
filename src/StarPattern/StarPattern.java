package StarPattern;

import java.util.Iterator;

public class StarPattern {
	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			if (line == 1 || line == 5) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(" "+"*");
				}
			} else {
				for (int space = 1; space <= 5; space++) {
					if (space  == 1 || space  == 5) {
						System.out.print("*");
					}else {
						System.out.print("   ");
					}
				}

			}
			System.out.println();
		}
	}

}
