package exercicio_03_while;

import java.util.Scanner;

public class exercicio_03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;

		System.out.println("digite o valor de x  e o valor de Y");
		x = sc.nextInt();
		y = sc.nextInt();

		while (true) {
			if (x >= 1 && y >= 1) {

				System.out.print("primeiro quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}

			else if (x <= -1 && y >= 1) {

				System.out.print("segundo quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}

			else if (x <= -1 && y <= -1) {
				System.out.print("terceiro quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}

			else if (x >= 1 && y <= -1) {
				System.out.print("Quarto quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}

			else if (x == 0 || y == 0) {

				System.out.print("Posição de quadrante NULA");

				break;
			}

		}

		sc.close();
	}

}
