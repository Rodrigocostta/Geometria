package exercicio_01;

import java.util.Scanner;

public class exercicio_1_4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double nfunc , horas , vhora , salario;
		
		System.out.println("Olá.Digite sua matricula");
		nfunc = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou?");
		 horas = sc.nextDouble();
		 
		 System.out.println("Qual o valor de sua hora trabalhada?");
		 vhora = sc.nextDouble();
		 
		 salario = horas*vhora;
		 
		 System.out.printf(" o funcionario de matricula %.0f recebe %.2f  mensais",nfunc,salario);
		 
		  
		 
		 sc.close();
	}

}
