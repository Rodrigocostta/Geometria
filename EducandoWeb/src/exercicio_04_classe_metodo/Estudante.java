package exercicio_04_classe_metodo;

public class Estudante {

	public String nome;
	public double n1, n2, n3, media;

	public double media() {

		return n1 + n2 + n3;
	}

	public double devendo() {

		return 60.0 - media();
	}

}
