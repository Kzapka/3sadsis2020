package aula20200414.emprego;

public class Empregado {
	private String nome;
	private String funcao;
	private int setor;
	private int anoIngresso;
	private double salario;
	private int idade;

	public String toString() {
		return "Empregado[" + "Nome: " + getNome() + ", Função: " + getFuncao() + ", Setor: " + getSetor()
				+ ", Ano de ingresso: " + getAnoIngresso() + ", Salário: " + getSalario() + ", idade: " + getIdade()
				+ "]";
	}

	// ------------------------------ 2.1
	public Empregado() {

	}

	// ------------------------------ 2.2
	public Empregado(String nome, String funcao, int setor, int anoIngresso, double salario, int idade) {
		setNome(nome);
		setFuncao(funcao);
		setSetor(setor);
		setAnoIngresso(anoIngresso);
		setSalario(salario);
		setIdade(idade);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	// ------------------------------ 2.3
	public void setSetor(int setor) {
		if (setor < 1) {
			throw new RuntimeException("Não existe setor abaixo de 1");
		}
		this.setor = setor;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public void setSalario(double salario) {
		if (salario < 400) {
			throw new RuntimeException("O salariod eve ser maior que 400");
		}
		this.salario = salario;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// ------------------------------ 2.4
	public String getNome() {
		return nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public int getSetor() {
		return setor;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public double getSalario() {
		return salario;
	}

	public int getIdade() {
		return idade;
	}

	// ------------------------------ 2.5
	public void fimDeAno() {
		salario = salario + decimoTerceiro();
	}

	// ------------------------------ 2.6
	private double decimoTerceiro() {
		double decimoT = 0.00;
		decimoT = salario;
		return decimoT;
	}

}