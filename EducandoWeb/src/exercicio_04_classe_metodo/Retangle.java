package exercicio_04_classe_metodo;

public class Retangle {
	
	
	public double largura, altura;

	public double area() {

		return largura * altura;

	}

	public double diagonal() {
		return  Math.sqrt(largura * largura + altura * altura);
	}

	public double perimetro() {
		return (altura * 2) + (largura * 2);
	}

	/*public String toString() {

		return " ESSAS SÃO AS ÁREAS DO RETANGULO\nAREA = " + String.format("%.2f", Area()) + "\nPERIMETRO = "
				+ String.format("%2.f", Perimetro()) + "\nDIAGONAL = " + String.format("%.2f", Diagonal());
	}*/
}
