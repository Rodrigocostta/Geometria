package exercicio_04_classe_metodo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangle retangle = new Retangle();

		retangle = new Retangle();
		retangle = new Retangle();

		System.out.println("entre com o valor da altura e largura de um Retangulo");
		retangle.altura = sc.nextDouble();
		retangle.largura = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangle.area());
		System.out.printf("PERIMETER = %.2f%n",  retangle.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());
		sc.close();

	}

}
