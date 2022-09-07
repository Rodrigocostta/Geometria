package exercicio_04_classe_metodo;

import java.util.Scanner;

public class DadosFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregados emp = new Empregados();

		System.out.print("Nome: ");
		emp.nome = sc.nextLine();

		System.out.print("Salario Bruto: ");
		emp.salarioBruto = sc.nextDouble();

		System.out.print("Taxa de imposto: ");
		emp.imposto = sc.nextDouble();

		System.out.printf("empregado: " + emp.nome + ",$ " + emp.salartio());

		System.out.println("Quantoporcento de almento " + emp.nome + " merece? ");
		double porcentagem = sc.nextDouble();
		emp.almento(porcentagem);

		System.out.printf("empregado: " + emp.nome + ",$ "+emp.novoSalario);
		
		sc.close();
		

	}

}
