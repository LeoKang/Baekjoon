package q2438_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0, c = 1;; i++) {
			if (i == c) {
				System.out.println();
				c = 1;
				i = 0;
			} else {
				System.out.print("*");
			}
		}
	}

}
