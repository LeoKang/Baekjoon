package q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int cnt = 0, c = 1, n = 0;
		boolean b = false, cont = true;
		while (cont) {			
			n = c;
			if (b) { // even line
				for (int i = 1, j = n; i <= n; i++, j--) {
					cnt++;
					if (cnt == X) {
						System.out.print(i + "/" + j + " ");
						cont = false;
					}
				}
			} else { // odd line
				for (int i = 1, j = n; i <= n; i++, j--) {
					cnt++;
					if (cnt == X) {
						System.out.print(j + "/" + i + " ");
						cont = false;
					}
				}
			}
			b = !b;
			c++;
		}
	}
}
