package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {

		List<String> list = new ArrayList();

		list.add("gio");
		list.add("ric");
		list.add("franco");
		list.add("mylady");
		list.add(2, "ramaral");
		
		System.out.println(list.size());
		
		
		for (String x: list) {
			System.out.println(x );
		}
		
		System.out.println("-----------------");
		list.removeIf(x -> x.charAt(0) == 'a');
		System.out.println("Index of gio " + list.indexOf("gio"));
		
		System.out.println("-----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'r').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x );
		}
		System.out.println("-----------------");
		String name = list.stream().filter(x->x.charAt(0) =='ç').findFirst().orElse(null);
		System.out.println(name);
	}
}
