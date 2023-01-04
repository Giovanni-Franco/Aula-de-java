package utilities;

public class Contabancaria {
	private int number;
	private String nome;
	private double saldo;

	public Contabancaria(int number, String nome, double saldoinicial) {
		this.number = number;
		this.nome = nome;
		deposito(saldoinicial);
	}

	public Contabancaria(int number, String nome) {
		this.number = number;
		this.nome = nome;
	}

	public int getNumber() {
		return number;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double amount) {
		saldo += amount;
	}

	public void saque(double amount) {
		saldo -= amount + 5;
	}

	public String toString() {
		return "Conta " + number + ", Nome: " + nome + ", Saldo: $" + String.format("%.2f", saldo);
	}

}
