package fixacao_exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * int A = sc.nextInt();
		 * 
		 * if (A<0) { System.out.println("NEGATIVO"); } else {
		 * System.out.println("NÃO NEGATIVO"); }
		 */
		/*
		 * int a = sc.nextInt();
		 * 
		 * if (a % 2 == 0) { System.out.println("par"); } else {
		 * System.out.println("impar"); }
		 */
		/*
		 * int A, B; A = sc.nextInt(); B= sc.nextInt();
		 * 
		 * if (A % B == 0 || B % A == 0) { System.out.println("SÃO MÚLTIPLOS"); } else{
		 * System.out.println("nao sao multiplos"); }
		 */
		/*
		int HI, HF;
		HI = sc.nextInt();
		HF = sc.nextInt();

		if (HI < HF) {
			int tempototal = HF - HI  ;
			System.out.printf("O JOGO DUROU %d", tempototal);
		} else {
			int tempototal = 24 - HI + HF;
			System.out.printf("O JOGO DUROU %d", tempototal);
		}*/
		/*
		int code = sc.nextInt(), number = sc.nextInt();
		
		if (code ==1) {
			double valor = number * 4.00;
			System.out.printf("Total: R$ %.2f\n", valor);
		}
		else if (code ==2) {
			double valor = number * 4.50;
			System.out.printf("Total: R$ %.2f\n", valor);
		}
		else if (code ==3) {
			double valor = number * 5.00;
			System.out.printf("Total: R$ %.2f\n", valor);
		}
		else if (code ==4) {
			double valor = number * 2.00;
			System.out.printf("Total: R$ %.2f\n", valor);
		}
		else {
			double valor = number * 1.50;
			System.out.printf("Total: R$ %.2f\n", valor);
		}*/
		/*
		double A = sc.nextDouble();
		
		if(A >=0 & A <= 25) {
			System.out.println("Intervalo[0,25]");
		}
		else if(A >  25 & A <= 50) {
			System.out.println("Intervalo[25,50]");
		}
		else if(A >  50 & A <= 75) {
			System.out.println("Intervalo[50,75]");
		}
		else if(A >  75 & A <= 100) {
			System.out.println("Intervalo[75,100]");
		}
		else {
			System.out.println("fora de intervalo");
		}*/
		/*
		double x,y;
		
		x = sc.nextDouble();
		y= sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
		System.out.println("origem");
		}
		if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
			}
		else if(x < 0.0 && y > 0.0){
			System.out.println("Q2");
			}
		else if (x == 0.0) {
			System.out.println("eixo Y");
			}
		else if(y == 0.0) {
			System.out.println("eixo X");
			}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
			}
		else {
			System.out.println("Q4");
			}*/
		
		Locale.setDefault(Locale.US);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
	}


