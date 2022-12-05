package q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);

		int r = 1, m = 1;
		while (true) {
			if (N <= r) {
				break;
			}
			r = r + 6 * m++;
		}
		System.out.println(m);
	}
}
