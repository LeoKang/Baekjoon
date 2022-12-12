package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int num[] = new int[N];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(N + " " + X);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < num.length; i++) {
			if (num[i] < X) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
