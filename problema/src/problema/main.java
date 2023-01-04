package problema;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		/*
		 * int senhaCorreta = 2002;
		 * 
		 * int senhaInserida = 0;
		 * 
		 * while (senhaInserida != senhaCorreta) { senhaInserida = sc.nextInt(); if
		 * (senhaInserida != senhaCorreta) { System.out.println("Senha Invalida"); }
		 * else { System.out.println("acesso permitido"); } }
		 */
		/*
		 * int x, y;
		 * 
		 * x = sc.nextInt(); y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) { if (x > 0 && y > 0) {
		 * System.out.println("primeiro"); } else if (x < 0 && y > 0) {
		 * System.out.println("segundo"); } else if (x < 0 && y < 0) {
		 * System.out.println("terceiro"); } else { System.out.println("quarto"); } x =
		 * sc.nextInt(); y = sc.nextInt(); }
		 */

		/*
		 * int code,alcool, gasolina, diesel;
		 * 
		 * code = sc.nextInt(); alcool = 0; gasolina =0; diesel = 0;
		 * 
		 * 
		 * while(code !=4) { if (code == 1) { alcool = alcool + 1; } else if (code ==
		 * 2){ gasolina = gasolina+1; } else if (code ==3){ diesel +=diesel + 1; }
		 * 
		 * else { System.out.println("codigo invalido, insira algum de 1 a 4	"); }
		 * 
		 * System.out.println("insira o codigo"); code = sc.nextInt(); }
		 * 
		 * System.out.println("muito obrigado"); System.out.printf("Alcool: %d\n",
		 * alcool); System.out.printf("gasolina:%d\n", gasolina);
		 * System.out.printf("diesel: %d\n", diesel);
		 */
		/*
		 * int x; x = sc.nextInt(); for (int i = 1; i <= x; i++) { if (i % 2 != 0) {
		 * System.out.println(i); } }
		 */
		/*
		 * int n,x,in,out; n = sc.nextInt(); in=0; out=0;
		 * 
		 * for (int i = 0; i<n; i++) { x= sc.nextInt(); if (x>=10 && x<=20) { in +=1; }
		 * else { out +=1; } } System.out.println(in + " in"); System.out.println(out +
		 * " out");
		 */
		/*
		 * int n; double notas1 = 0, notas2 = 0, notas3 = 0; n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) { notas1 = sc.nextDouble(); notas2 =
		 * sc.nextDouble(); notas3 = sc.nextDouble(); double mp = ((notas1 * 2) +
		 * (notas2 * 3) + (notas3 * 5)) / 10; System.out.printf("%.1f", mp); }
		 */

		int n;

		n = sc.nextInt();

		for (int i = 1; i <= n ; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d\n", i, quadrado, cubo);
		}
		sc.close();
	}

}
