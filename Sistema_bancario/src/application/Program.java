package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Contabancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contabancaria conta;
		
		
		System.out.print("entre com sua conta: ");
		int number = sc.nextInt();
		System.out.print("coloque seu nome: ");
		String nome = sc.next();
		System.out.println("voce ira fazer um deposito inicial? (S/N)");
		char fazerdeposito = sc.next().charAt(0);
		
		if(fazerdeposito == 's' || fazerdeposito == 'S') {
			System.out.println("qual seria seu deposito inicial: ");
			double depositoinicial = sc.nextDouble();
			conta = new Contabancaria(number, nome, depositoinicial);
		}
		else {
			conta = new Contabancaria(number, nome);
		}
		
		System.out.println();
		System.out.println("dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.saque(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}

}
