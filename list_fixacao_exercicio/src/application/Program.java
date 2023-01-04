package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionarios dados;

		List<Funcionarios> list = new ArrayList<>();

		System.out.print("quantos funcionarios vao ser regitrados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("funcionario #" + (i + 1));
			System.out.print("id: ");
			int id = sc.nextInt();
			while (temId(list, id)) {
				System.out.println("esse ID ja existe, tente outro!");
				System.out.print("id: ");
				id = sc.nextInt();
			}
			System.out.print("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("salário: ");
			double salario = sc.nextDouble();
			Funcionarios func = new Funcionarios(nome, id, salario);

			list.add(func);
		}

		System.out.println();
		System.out.println("entre com ID do funcionario que terá o salário aumentado");
		int idPosicao = sc.nextInt();
		Integer pos = Position(list, idPosicao);
		if (pos == null) {
			System.out.println("esse ID não existe");
		} else {
			System.out.println("qual a porcetagem do aumento?");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumenteDeSalario(porcentagem);
		}

		System.out.println();
		System.out.println("lista dos funcionarios");
		for (Funcionarios func : list) {
			System.out.println(func);
		}

		sc.close();
	}

	public static Integer Position(List<Funcionarios> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean temId(List<Funcionarios> list, int id) {
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
