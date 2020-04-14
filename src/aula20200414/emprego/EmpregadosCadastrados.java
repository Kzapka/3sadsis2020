package aula20200414.emprego;

public class EmpregadosCadastrados {
	
	public static void main(String[] args) {
		
		// ------------------------------ 2.2
		Empregado caio = new Empregado("Caio Vinicius", "Administrador", 3, 2001, 5300.00, 32);
	
		// ------------------------------ 2.1
		Empregado jonas = new Empregado();
		
		jonas.setNome("Jonas Matias");
		jonas.setFuncao("Estagiário");
		jonas.setSetor(2);
		jonas.setAnoIngresso(2020);
		jonas.setSalario(600.00);
		jonas.setIdade(21);
	
	
		System.out.println(caio.toString());
		System.out.println(jonas.toString());
	}
}
