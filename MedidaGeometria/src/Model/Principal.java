package Model;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Calcula calcula = new Calcula();

		int resp;
		String aceita = JOptionPane.showInputDialog(null,
				"O QUE VOCÊ DESEJA FAZER?\n 1 - Triangulo\n 2 - RETANGULO\n 3 - CIRCULO");
		resp = Integer.parseInt(aceita);

		if (resp == 1) {

			String inputbase = JOptionPane.showInputDialog(null, "entre com a area do traingulo\nDigite a : Base");
			String inputL1 = JOptionPane.showInputDialog(null, "entre com a area do traingulo\nDigite o : Lado 1");
			String inputL2 = JOptionPane.showInputDialog(null, "entre com a area do traingulo\nDigite o : Lado 2");
			calcula.getCal().setBaseT(Double.parseDouble(inputbase));
			calcula.getCal().setL1(Double.parseDouble(inputL1));
			calcula.getCal().setL2(Double.parseDouble(inputL2));
			
			JOptionPane.showMessageDialog(null,"A  AREA DO TRIANGULO É DE:  "+calcula.AreaTriangulo());
		} /*
			 * else if(resp == 2) { String bR = JOptionPane.showInputDialog(
			 * null,"Entre com o valor de um lado do retangulo\n"); String altR =
			 * JOptionPane.showInputDialog(null,"Altura do retangulo\n"); double baseR =
			 * Double.parseDouble(bR); double alturaR =Double.parseDouble(altR);
			 * 
			 * }
			 */

	}

}
