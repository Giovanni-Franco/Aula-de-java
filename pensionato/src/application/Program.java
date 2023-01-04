package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluguel dados;

		int n;

		System.out.print("quantos quartos sera, alugados?");

		n = sc.nextInt();
		Aluguel[] vetor = new Aluguel[10];
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vetor[room] = new Aluguel(name, email);
			}
			System.out.println();
			System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
			if (vetor[i] != null) {
			System.out.println(i + ": " + vetor[i]);
			}
			}
		
		sc.close();

	}

}
