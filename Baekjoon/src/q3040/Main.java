package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp[] = new int[9];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}

		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}

		int a = 0, b = 0;
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) {
//				System.out.println(i + " " + j);
				if (sum - inp[i] - inp[j] == 100) {
					a = i;
					b = j;
				}
			}
		}
		System.out.println("\n[" + a + ", " + b + "]");
		
		for (int i = 0; i < inp.length; i++) {
			if(i != a && i != b)
				System.out.println(inp[i] + " ");
		}
	}
}
