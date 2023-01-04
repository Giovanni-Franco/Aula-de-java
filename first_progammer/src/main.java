import java.util.Locale;

public class main {

	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.55311231;
		
		System.out.println("products:");
		System.out.println(product1 + ", which price is $" + price1);
		System.out.printf("%s , which price is $ %.2f\n", product2, price2 );
		System.out.printf("record: %d years old code %d and gender: %s \n",age, code, gender );
		System.out.printf("measue with eight decimal places: %f \n", measure);
		System.out.printf("rouded (three decimal places): %.3f \n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: %.3f \n", measure );
	}

}
