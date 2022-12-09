package q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);

		int cnt = 0, c1 = N;
		while (true) {
			cnt++;
			int c2 = (c1 / 10) + (c1 % 10);
			c2 = (c1 % 10) * 10 + (c2 % 10);
			if (c2 == N)
				break;
			c1 = c2;
		}
		System.out.println(cnt);
	}
}
