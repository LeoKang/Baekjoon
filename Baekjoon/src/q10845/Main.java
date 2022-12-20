package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Queue {
	private int[] ar;
	private int front, back;

	public Queue(int size) {
		ar = new int[size];
		front = -1;
		back = -1;
	}

	public int pop() {
		if (size() == 0) {
			return -1;
		} else
			return ar[++back];
	}

	public void enqueue(int p) {
		ar[++front] = p;
	}

	public void empty() {
		if (front == back) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void front() {
		if (size() == 0) {
			System.out.println("-1");
		} else
			System.out.println(ar[back + 1]);
	}

	public void back() {
		if (size() == 0) {
			System.out.println("-1");
		} else
			System.out.println(ar[front]);
	}

	public int size() {
		if (front == back) {
			return 0;
		} else {
			if (back == -1) {
				return front + 1;
			} else {
				return front - back;
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue q = new Queue(10000);

		int N = 0;
		try {
			N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String token = st.nextToken();
				switch (token) {
				case "push":
					String t = st.nextToken();
					q.enqueue(Integer.parseInt(t));
					break;
				case "pop":
					System.out.println(q.pop());
					break;
				case "front":
					q.front();
					break;
				case "back":
					q.back();
					break;
				case "size":
					System.out.println(q.size());
					break;
				case "empty":
					q.empty();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
