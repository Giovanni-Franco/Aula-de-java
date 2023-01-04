package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		rectangle retangulo = new rectangle();
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();

		double area = retangulo.area();
		System.out.println("AREA = " + area);

		double perimetro = retangulo.perimeter();
		System.out.println("PERIMETER = " + perimetro);

		double diagonal = retangulo.diagonal();
		System.out.println("DIAGONAL = " + diagonal);
		sc.close();
	}

}
