package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("quanto esta o dolar?");
		double precodolar = sc.nextDouble();
		System.out.println("quanto dolares quer comprar?");
		double quantidade = sc.nextDouble();

		double result = CurrencyConverter.conversao(quantidade, precodolar);
		System.out.printf("voce comprará com reais %.2f", result);
	}

}
