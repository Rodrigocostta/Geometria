package exercicio_04_classe_metodo;

public class ConverteMoeda {

	public final double REAIS = 3.10;
	public final double IOF = 6.0 / 100.0;
	public double dolar,iof;
 public double vf;
	public double conversor() {
		 
 vf = dolar*REAIS;
		return vf +(vf*IOF);
	}

}
