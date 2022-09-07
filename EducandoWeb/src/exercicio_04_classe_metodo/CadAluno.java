package exercicio_04_classe_metodo;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante aluno = new Estudante();

		System.out.printf("Nome do aluno:\n");
		aluno.nome = sc.nextLine();

		System.out.printf("nota 1\n");
		aluno.n1 = sc.nextDouble();

		System.out.printf("Nota 2\n");
		aluno.n2 = sc.nextDouble();

		System.out.printf("Nota 3\n");
		aluno.n3 = sc.nextDouble();

		if (aluno.media() >= 60.0) {

			System.out.printf("  %s SUA NOTA FOI = %.2f\n\n VOCÊ FOI APROVADO", aluno.nome, aluno.media());

		} else {
			System.out.printf(" %s SUA NOTA FOI = %.2f\n VOCÊ FOI REPROVADO\n\n VOCÊ PRECISA DE = %.2f PONTOS ", aluno.nome,
					aluno.media(), aluno.devendo());
		}

		sc.close();

	}

}
