package exercicio_02_condicao;

import java.util.Scanner;

public class exercicio_02_2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("digite um numero");
	
	double n = sc.nextDouble();
	
	if  ((n % 2) == 0)
	{
		System.out.println(" numero PAR");
	} else {
		System.out.println("numero IMPAR");
	}
	
	
sc.close();
	}

}
