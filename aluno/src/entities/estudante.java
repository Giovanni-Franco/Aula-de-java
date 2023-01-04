package entities;

public class estudante {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notafinal()
	{
		double notafinal = nota1 + nota2 +nota3;
		return notafinal;
	}
	public double aprovacao() {
		if (notafinal() <60 ) {
			double reprovado = 60 - notafinal();
			return reprovado;
		}
		else {
			return 0.0;
		}
	}
}
