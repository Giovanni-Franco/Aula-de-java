package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dadosdepessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Dadosdepessoas dados;

		int n;
		System.out.print("quantas pessoas teram seus dados inseridos? ");
		n = sc.nextInt();
		Dadosdepessoas[] vetor = new Dadosdepessoas[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("dados da " + (i+1) + "ª pessoa:");
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vetor[i] = new Dadosdepessoas(nome, idade, altura);
		}

		double somaAltura = 0;
		double mediaAltura = 0;

		for (int i = 0; i < vetor.length; i++) {
			somaAltura += vetor[i].getAltura();
		}

		mediaAltura = somaAltura / vetor.length;
		System.out.printf("altura media: %.2f ", mediaAltura);
		System.out.println();
		
		double quantidaMenores = 0;
		double porcentagemMenor = 100;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				quantidaMenores += 1;
			}
		}
		
		porcentagemMenor *= (quantidaMenores/vetor.length);
		
		System.out.printf("pessoas com menos de 16 anos: %.2f", porcentagemMenor);
		System.out.print("%");
		System.out.println();
		String menores;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				menores = vetor[i].getNome();
				System.out.println(menores);
			}
		}
		
		
		
		sc.close();
	}

}