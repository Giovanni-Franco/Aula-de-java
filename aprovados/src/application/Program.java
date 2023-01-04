package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Dadosdosalunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Dadosdosalunos dados;

		int n;

		System.out.printf("quantos alunos serao digitados?");
		n = sc.nextInt();
		Dadosdosalunos[] vetor = new Dadosdosalunos[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite o nome, primeira nota, segunda nota do " + (i+1) + "° aluno");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vetor[i] = new Dadosdosalunos(nome, nota1, nota2);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if((vetor[i].getNota1()+vetor[i].getNota2())/2 >=6) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		sc.close();
	}

}
