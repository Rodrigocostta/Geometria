package exercicio_04_classe_metodo;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConverteMoeda con = new ConverteMoeda();

		System.out.printf("Valor do Dolar é %.2f\n ", con.REAIS);
		System.out.println("entre com o valor em dolares\n");
		con.dolar = sc.nextDouble();

		System.out.printf("Valor do Dolar\n ", con.REAIS);
		System.out.printf(" %.2f $ em dolares equivalem a %.2f Reais", con.dolar, con.conversor());
		sc.close();
		sc.close();

	}

}
