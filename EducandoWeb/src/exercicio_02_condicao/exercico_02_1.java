package exercicio_02_condicao;

import java.util.Scanner;

public class exercico_02_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		
		int num = sc.nextInt();
		
		if (num >=0) {
			System.out.println("NUMERO POSITIVO");
		}else {
			System.out.println("NUMERO NEGATIVO");
		}
	 sc.close();
	}
   
}
