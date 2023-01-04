package fixacao_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * exercicio 1 int soma1 = 10 + 30; int soma2 = -30 + 10; int soma3 = 0 + 0;
		 * System.out.printf("SOMA = %d\n", soma1); System.out.printf("SOMA = %d\n",
		 * soma2); System.out.printf("SOMA = %d\n", soma3);
		 */

		/*
		 * exercicio 2 Locale.setDefault(Locale.US); double R, A, pi = 3.14159;
		 * 
		 * R = sc.nextDouble();
		 * 
		 * A= pi * Math.pow(R,2);
		 * 
		 * System.out.printf("A= %.4f", A);
		 * 
		 * sc.close();
		 */

		/*
		 * exercicio 3 int A, B, C, D;
		 * 
		 * A = sc.nextInt(); sc.nextLine(); B = sc.nextInt(); sc.nextLine(); C =
		 * sc.nextInt(); sc.nextLine(); D = sc.nextInt();
		 * 
		 * int DIFERENÇA = (A * B - C * D);
		 * 
		 * System.out.printf("DIFERENÇA = %d", DIFERENÇA);
		 * 
		 * sc.close();
		 */
		Locale.setDefault(Locale.US);
		
		/*exercicio 4
		   int identificacao, horasTrabalhadas;
		double valorPorHora;

		identificacao = sc.nextInt();
		sc.nextLine();
		horasTrabalhadas = sc.nextInt();
		sc.nextLine();
		valorPorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorPorHora;

		System.out.printf("NUMBER = %d\n", identificacao);
		System.out.printf("SALARY = $ %.2f", salario);

		sc.close();*/
		
		int code1, number1, code2, number2;
		double price1, price2;
		
		code1 = sc.nextInt();
		number1 = sc.nextInt();
		price1 = sc.nextDouble();
		sc.nextLine();
		code2 = sc.nextInt();
		number2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		double total = (number1 * price1) + (number2 * price2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		
		/* EXERCICIO 6
		 double A, B, C, AT, AC, ATP, AQ, AR;
		 
		
		A = sc.nextDouble();
		sc.nextLine();
		B =sc.nextDouble();
		sc.nextLine();
		C =sc.nextDouble();
		
		AT = A*C/2;
		AC = 3.14159 * C * C;
		ATP = ((A+B) * C)/2;
		AQ = B * B;
		AR = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", AT);
		System.out.printf("CIRCULO: %.3f\n", AC);
		System.out.printf("TRAPEZIO: %.3f\n", ATP);
		System.out.printf("QUADRADO %.3f\n", AQ);
		System.out.printf("RETANGULO %.3f\n", AR);
		
		sc.close();*/
	}

}
