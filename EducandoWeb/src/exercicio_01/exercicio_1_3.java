package exercicio_01;

import java.util.Scanner;

public class exercicio_1_3 {

	public static void main(String[] args) {
	
		Scanner  sc = new Scanner(System.in);
		
		int a,b,c,d, diferenca;
		
		System.out.println( "Entre com valor de A" );
		a = sc.nextInt();
		System.out.println( "Entre com valor de B " );
		b = sc.nextInt();
		System.out.println( "Entre com valor de C" );
		c = sc.nextInt();
		System.out.println( "Entre com valor de D" );
		d = sc.nextInt();
		
		diferenca = (a*b-c*d);
		System.out.println( "DIFERENÇA = "+diferenca );
		
	sc.close();
		
	}
}
