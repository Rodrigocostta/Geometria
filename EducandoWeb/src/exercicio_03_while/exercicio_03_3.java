package exercicio_03_while;

import java.util.Scanner;

public class exercicio_03_3 {

	public static void main(String[] args) {

		int alcool = 0, gasolina = 0, diesel = 0, cont;

		Scanner sc = new Scanner(System.in);

		System.out.println("        DIGITE:\nAlcool: 1\nGaslonia: 2\nDiesel: 3");
		cont = sc.nextInt();

		while (true) {

			if (cont == 1) {
				alcool = alcool + cont;

			} else if (cont == 2) {
				gasolina = gasolina + cont;

			} else if (cont == 3) {
				diesel = diesel + cont;

			} else if (cont == 4) {
				System.out.printf(" alcool:  %d\n Gasolina:  %d\nDiesel:  %d\n", alcool, gasolina, diesel);
				break;
			} else if (cont != alcool && cont != gasolina && cont != diesel && cont != 4) {
				System.out.println("INCIRA UM VALOR VALIDO");
			}

		}
		sc.close();
	}

}
