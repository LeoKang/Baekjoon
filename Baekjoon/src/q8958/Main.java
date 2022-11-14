package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String str = sc.next();
//			System.out.println(str);
			// 점수 계산 logic
			int sum = 0;
			int cur = 1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					sum += cur++;
				} else {
					cur = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
