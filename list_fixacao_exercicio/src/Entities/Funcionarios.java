package Entities;

public class Funcionarios {
	private int id;
	private String name;
	private double salary;

	public Funcionarios(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void aumenteDeSalario(double x) {
		salary += salary * x/100;
	}
	
	public String toString() {
		return id + "," + name + ", " + String.format("%.2f", salary);
	}
}
