package Model;

public class DadosCalculo {

	private double baseT, L1, L2; /* variaveis para triangulo */ /* A = b*h/2 */
	private double baseQ, alturaQ; /* variaveis para quadrado */ /* Lx2 */
	private double baseR, alturaR; /* variaveis para retangulo */ /* A=b⋅h */
	private double area, AreaC;
	private final double pi = 3.14; /* variaveis para circulo */ /*
																	 * A área de um círculo é pi vezes o raio elevado ao
																	 * quadrado (A = π r²).
																	 */

	/*
	 * =============================================================================
	 * ===========================================================================
	 */

	public double getBaseT() {
		return baseT;
	}

	public void setBaseT(double baseT) {
		this.baseT = baseT;
	}

	public double getL1() {
		return L1;
	}

	public void setL1(double l1) {
		L1 = l1;
	}

	public double getL2() {
		return L2;
	}

	public void setL2(double l2) {
		L2 = l2;
	}

	public double getBaseQ() {
		return baseQ;
	}

	public void setBaseQ(double baseQ) {
		this.baseQ = baseQ;
	}

	public double getAlturaQ() {
		return alturaQ;
	}

	public void setAlturaQ(double alturaQ) {
		this.alturaQ = alturaQ;
	}

	public double getBaseR() {
		return baseR;
	}

	public void setBaseR(double baseR) {
		this.baseR = baseR;
	}

	public double getAlturaR() {
		return alturaR;
	}

	public void setAlturaR(double alturaR) {
		this.alturaR = alturaR;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAreaC() {
		return AreaC;
	}

	public void setAreaC(double areaC) {
		AreaC = areaC;
	}

	public double getPi() {
		return pi;
	}

}
