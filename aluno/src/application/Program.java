package application;

import java.util.Locale;
import java.util.Scanner;

import entities.estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		estudante aluno = new estudante();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("final grade = %.2f", aluno.notafinal() );
		System.out.println();
		
		if (aluno.notafinal() >=60) {
		System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f", aluno.aprovacao());
		}
		sc.close();	
	}

}
