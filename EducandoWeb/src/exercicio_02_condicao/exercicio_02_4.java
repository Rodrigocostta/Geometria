package exercicio_02_condicao;

import java.util.Scanner;

public class exercicio_02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicial,termino,duracao;
		
		System.out.println("inio do jogo");
		inicial = sc.nextInt();
		
		System.out.println("termino do jogo");
		termino = sc.nextInt();
		if (inicial < termino) {
			 duracao = termino -inicial;
		}
		else {
			duracao = 24 - inicial + termino;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		
		sc.close();

	}

}
