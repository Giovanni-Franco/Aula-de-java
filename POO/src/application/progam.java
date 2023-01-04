package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangulo;

public class progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		triangulo x, y;
		x = new triangulo();
		y = new triangulo();

		System.out.println("entre com os lados do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("entre com os lados do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();
		double areay = y.area();
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle Y area: %.4f%n", areay);
		if (areax > areay) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();

	}
}