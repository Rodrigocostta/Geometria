package exercicio_01;

import java.util.Scanner;

public class exercicio_1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = a/c;
		circulo = c*3.14159;
		trapezio = ( a+b)/c;
		quadrado = b*4;
		retangulo =a+b;
		
	System.out.printf("TRIANGULO:%.3f\n",triangulo);	
	System.out.printf("CIRCULO:%.3f\n",circulo);
	System.out.printf("TRAPEZIO:%.3f\n",trapezio);
	System.out.printf("QUADRADO:%.3f\n",quadrado);
	System.out.printf("RETANGULO:%.3f\n",retangulo);
		sc.close();
	}

}
