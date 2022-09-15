package Model;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Calcula calcula = new Calcula();

		int resp;
		
		
		while (true) {
		String aceita = JOptionPane.showInputDialog(null,
				"O QUE VOCÊ DESEJA FAZER?\n 1 - Triangulo.\n 2 - RETANGULO.\n 3 - QUADRADO.\n 4 - CIRCULO.\n 5 - NENHUMA DAS OPÇÕES.\n");
		resp = Integer.parseInt(aceita);
		
		
			if (resp != 1 && resp != 2 && resp != 3 && resp != 4 &&  resp != 5 ) {
				JOptionPane.showMessageDialog(null, " OPÇÃO INVALIDA !!! \n escolha uma opcção valida.");
			}
                             /*area do triangulo*/
		else if (resp == 1) {

			String inputbase = JOptionPane.showInputDialog(null, "entre com a area do triângulo\nDigite a : Base");
			String inputL1 = JOptionPane.showInputDialog(null, "entre com a area do triângulo\nDigite o : Lado 1");
			String inputL2 = JOptionPane.showInputDialog(null, "entre com a area do triângulo\nDigite o : Lado 2");
			calcula.getCal().setBaseT(Double.parseDouble(inputbase));
			calcula.getCal().setL1(Double.parseDouble(inputL1));
			calcula.getCal().setL2(Double.parseDouble(inputL2));
			
			JOptionPane.showMessageDialog(null,"A  ARÉA DO TRIÂNGULO É DE:  "+ calcula.AreaTriangulo());
			
			                 /* Area do triangulo*/
		}  else if(resp == 2) { 
			String altR = JOptionPane.showInputDialog( null," Altura  do retangulo\n"); 
		String  baseR =JOptionPane.showInputDialog(null,"Base do retangulo\n");
		calcula.getCal().setAlturaR(Double.parseDouble(altR));
		calcula.getCal().setBaseR(Double.parseDouble(baseR));
		
		JOptionPane.showMessageDialog(null,"A  ARÉA DO RETANGULO É DE:  "+ calcula.AreaRtangulo());
		
		                     /*Area  quadrado*/
			  } else if (resp == 3 ) {
				  String altQ= JOptionPane.showInputDialog(null,"Altura do Quadrado\n");
				  String baseQ= JOptionPane.showInputDialog(null,"Altura do Quadrado\n");
				  calcula.getCal().setAlturaQ(Double.parseDouble(altQ));
				  calcula.getCal().setBaseQ(Double.parseDouble(baseQ));
				  
				  JOptionPane.showMessageDialog(null,"A  ARÉA DO QUADRADO É DE:  "+ calcula.AreaQuadrado()) ;
			  }
		
		
		                   /*Area do Circulo*/
			  else if (resp == 4) {
				  
				  String raio= JOptionPane.showInputDialog(null,"Qual o Valor do Raio\n");
				  
				 calcula.getCal().setAreaC(Double.parseDouble(raio));
				 
				  JOptionPane.showMessageDialog(null,"A  ARÉA DO CIRCULO É DE:  "+calcula.AreaCirculo()) ;
			  }  else if ( resp == 5 ) {
				  
				  break;
			  }
	}
			  }
		
			 

	}


