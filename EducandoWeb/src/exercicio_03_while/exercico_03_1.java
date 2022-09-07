package exercicio_03_while;

import java.util.Scanner;

public class exercico_03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while (true) {
			System.out.println("Digite sua senha");
			int senha = sc.nextInt();

			if (senha != 2002) {
				System.out.println("SEHNA INVALIDA");
			} else {
				System.out.println("ACESSO LIBERADO");
				break;
			}
		}
		sc.close();

	}
}