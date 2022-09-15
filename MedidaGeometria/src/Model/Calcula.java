package Model;

public class Calcula {
	
	private double areaTriangulo ;
	private double areaQuadrado;
	private double areaRetangulo;
	private double areaCirculo;
	
	/*=====================================================================================================================*/
	 private DadosCalculo cal = new DadosCalculo();
   public void setCal(DadosCalculo cal) {
	this.cal = cal;
}
   
   public DadosCalculo getCal() {
	return cal;
}
   /*=========================================================================================================================*/
	
	
	public double AreaTriangulo() { 
		return areaTriangulo = cal.getBaseT() * (cal.getL1() + cal.getL2()) / 2 ;       /*  area = base*(l1+l2)/2  */
	}
	
	public double AreaQuadrado() {
		return areaQuadrado = cal.getBaseQ() * cal.getAlturaQ();                    /* area = base*altura  */
	}
	
	public double AreaRtangulo() {
		return areaRetangulo = cal.getBaseR() * cal.getAlturaR();                   /* area = base*altura  */
	}
	
	public double AreaCirculo() {                         /* (A = π r²).*/
		return areaCirculo =  cal.getPi()*(cal.getAreaC()*2);
	}
	 

/*================================================================GET end SET===============================================================================================*/
	
	
	
	public void setAreaTriangulo(double areaTriangulo) {
		this.areaTriangulo = areaTriangulo;
	}

	public double getAreaTriangulo() {
		return areaTriangulo;
	}

	public double getAreaQuadrado() {
		return areaQuadrado;
	}

	public void setAreaQuadrado(double areaQuadrado) {
		this.areaQuadrado = areaQuadrado;
	}

	public double getAreaRetangulo() {
		return areaRetangulo;
	}

	public void setAreaRetangulo(double areaRetangulo) {
		this.areaRetangulo = areaRetangulo;
	}

	public double getAreaCirculo() {
		return areaCirculo;
	}

	public void setAreaCirculo(double areaCirculo) {
		this.areaCirculo = areaCirculo;
	}
	
	

	
}
	 
