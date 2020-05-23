package aula20200522.turmas;

public class AppTurmas {

	public static void main(String[] args) {

		// imprimirValorNoConsole(2);
		// imprimirValorNoConsole(1+1);

		Turma adsis3s2020 = new Turma("ADSIS3S-N-A");
		Turma engsoft3s2020 = new Turma("ESOFT3S-N-A");

		Aluno leonardo = new Aluno("Leonardo", "19868-4");
		Aluno hector = new Aluno("Hector", "19432-4");
		Aluno victor = new Aluno("Victor", "19468-4");
		Aluno matias = new Aluno("Matiasr", "18954-4");
		Aluno matheus = new Aluno("Matheus", "19415-4");
		Aluno ana = new Aluno("Ana", "19029-4");

		adsis3s2020.adicionarAluno(leonardo);
		adsis3s2020.adicionarAluno(hector);
		adsis3s2020.adicionarAluno(victor);
		adsis3s2020.adicionarAluno(matias);
		adsis3s2020.adicionarAluno(matheus);
		adsis3s2020.adicionarAluno(ana);
		adsis3s2020.adicionarAluno(new Aluno("Guilherme", "18554-4"));

		adsis3s2020.setLíder(hector);

		Aluno vinicius = new Aluno("Vinicius", "18029-7");

		engsoft3s2020.adicionarAluno(vinicius);
		engsoft3s2020.adicionarAluno(new Aluno("Rogério", "18554-7"));
		engsoft3s2020.adicionarAluno(new Aluno("Marcos", "18954-7"));
		engsoft3s2020.adicionarAluno(new Aluno("Astolfo", "18940-7"));
		engsoft3s2020.adicionarAluno(new Aluno("Michael", "19125-7"));
		engsoft3s2020.adicionarAluno(new Aluno("Maria", "18865-7"));

		engsoft3s2020.setLíder(vinicius);

		listarTurmaNoConsole(adsis3s2020);
		listarTurma2NoConsole(engsoft3s2020);
	}

	/*
	 * private static void imprimirValorNoConsole(int valor) {
	 * System.out.println("************"); System.out.println("Valor = " + valor);
	 * System.out.println("************"); }
	 */

	private static void listarTurmaNoConsole(Turma t) {
		System.out.println("----------------------------------------");
		System.out.println("Turma: " + t.getCódigo());
		System.out.println("Líder: " + t.getLíder().getNome());
		System.out.println("----------------------------------------");
		System.out.println("Alunos: ");
		for (Aluno a : t.getAlunos()) {
			System.out.println(a.getRa() + "  " + a.getNome());
		}

	}

	private static void listarTurma2NoConsole(Turma t) {
		System.out.println("----------------------------------------");
		System.out.println("Turma: " + t.getCódigo());
		System.out.println("Líder: " + t.getLíder().getNome());
		System.out.println("----------------------------------------");
		System.out.println("Alunos: ");
		for (Aluno a : t.getAlunos()) {
			System.out.println(a.getRa() + "  " + a.getNome());
		}
	}
}