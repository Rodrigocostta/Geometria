package exercicio_04_classe_metodo;

public class Empregados {

	public String nome;
	public double salarioBruto, imposto, novoSalario;

	public double salartio() {

		return salarioBruto - imposto;
	}

	public double almento(double porcentagem) {
		novoSalario = salarioBruto += salarioBruto * porcentagem / 100;
		return novoSalario;
	}

}
