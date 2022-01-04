package Q1;

import java.util.Vector;

public class VectorOBJ {

	public static void main(String[] args) {
		int N = 10;

		for (int i = 1; i <= N; i++) {

			generatePrimes(i);
		}

	}

	public static void generatePrimes(int no) {
		Vector<Integer> v = new Vector<Integer>();
		if (checkPrimes(no)) {
			v.add(no);
		}
		showPrimes(v);
	}

	public static boolean checkPrimes(int n) {
		if (n == 1 || n == 0)
			return false;

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void showPrimes(Vector<Integer> vector) {
		for (int i = 0; i < vector.size(); i++)

			System.out.print(vector.get(i) + " ");
	}
}
