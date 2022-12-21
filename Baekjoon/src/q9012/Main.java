package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String inp = sc.next();
//			System.out.println(inp);
			stk.clear();
			boolean b = true;
			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
					stk.push('(');
				} else {
					if (stk.isEmpty()) {
						b = false;
					} else {
						stk.pop();
					}
				}
			}
			if (b == true && stk.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
