package util;

public class CurrencyConverter {
	public static double iof = 0.06;
	
	public static double conversao(double quantidade, double precodolar) {
		double total = quantidade * precodolar * (1+iof);
		return total;
	}
}
