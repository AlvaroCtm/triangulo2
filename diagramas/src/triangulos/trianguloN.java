package triangulos;

import java.util.Scanner;

public class trianguloN {

	public static void main(String[] args) {
		Scanner pr = new Scanner(System.in);
		System.out.println("ingrese un numero numero");
		int N = pr.nextInt();

		for (int i = 1; i < N; i++) {
			System.out.println("*");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("*");

	}

}
