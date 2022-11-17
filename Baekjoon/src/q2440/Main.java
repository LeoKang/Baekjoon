package q2440;

import java.util.Scanner;

/*    R    i     j
***** 5    1    N-i+1=N+1-i
****  4    2    N-i+1=N
***   3    3    N-i+1=N
**    2    4    N-i+1=N
*     1    5    N-i+1=N

*/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		System.out.println(N);

		for (int i = 0; i < N; i++) {
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
