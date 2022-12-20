package q10828_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
		StringTokenizer st;
		int N = 0;
		try {
			N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String token = st.nextToken();
				switch (token) {
				case "push":
					String token2 = st.nextToken();
					stk.push(Integer.parseInt(token2));
					break;
				case "pop":
					if(stk.isEmpty()) {
						System.out.println("-1");
					}else {
						System.out.println(stk.pop());
					}
					break;
				case "top":
					if(stk.isEmpty()) {
						System.out.println("-1");
					}else {
						System.out.println(stk.peek());	
					}
					break;
				case "size":
					System.out.println(stk.size());
					break;
				case "empty":
					if(stk.isEmpty()) {
						System.out.println("1");
					}else {
						System.out.println("0");
					}
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
