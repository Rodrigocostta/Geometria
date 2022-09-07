package exercicio_02_condicao;

import java.util.Scanner;

public class exercicio_02_3 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int A,B;
	
	System.out.println("digite um valor");
	 A = sc.nextInt();
	 
	 System.out.println("digiteoutro valor");
	 B = sc.nextInt();
	 
	 if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
