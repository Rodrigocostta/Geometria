package mediaAluno;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MediaAluno {

	public static void main(String[] args) {
		String n1, n2, n3, n4;
		double media, resp;
		while (true) {

			resp = JOptionPane.showConfirmDialog(null, "Você deseja fazer o caluculo de Sua Media escolar ?");

			if (resp == 0) {
				n1 = JOptionPane.showInputDialog("Otimo vamos as notas.\n nota 1 ");
				n2 = JOptionPane.showInputDialog("   nota 2");
				n3 = JOptionPane.showInputDialog("   nota 3 ");
				n4 = JOptionPane.showInputDialog("   nota 4 ");

				double nota1 = Double.parseDouble(n1);
				double nota2 = Double.parseDouble(n2);
				double nota3 = Double.parseDouble(n3);
				double nota4 = Double.parseDouble(n4);

				media = (nota1 + nota2 + nota3 + nota4) / 4;
				if (media >= 60 && media < 100) {
					JOptionPane.showMessageDialog(null, " SUA NOTA FOI " + media + "\nPARABENS VOCÊ FOI APROVADO!!!");

				} else if (media == 100) {
					JOptionPane.showMessageDialog(null,
							"UAU PARABENS SUA NOTA FOI " + media + "\n VOCÊ FOI APROVADO COM NOTA MAXIMA");

				} else if (media < 60) {
					JOptionPane.showMessageDialog(null, " SUA NOTA FOI " + media + "\n MAIS SORTE DA PROXIMA VEZ");
				}

			} else {
				
				System.out.println("O usuario optou por não fazer a media!!!");
			break;
			}
		}

	}
}
