package aula20200615;

import java.util.Calendar;

public class App {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 20);
		calendar.set(Calendar.YEAR, 20001);
		calendar.set(Calendar.MONTH, 8);
		
		Endereco endereco = new Endereco("Rua ETC", 0000, "Colégio", "Instituto de Educação Estadual de Maringá", "Maringá", "Paraná");
		
		Aluno matheus = new Aluno("Victor ", "Henrique", calendar, endereco, "19468562");
		Contrato contrato = new Contrato(matheus, Situacao.REGULAR);
		
		Avalista maeMaAvalista = new Avalista("Rosana", "Pereira", calendar, endereco);
		contrato.adicionarAvalista(maeMaAvalista);
		
		matheus.setContrato(contrato);
		
		Coordenador marcelo = new Coordenador("Davi", "Dechamps", calendar, endereco);
		
		Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", 00001);
		curso.setCoordenador(marcelo);
		
		Turma turma = new Turma("ADSIS", 00001);
		curso.adicionarTurmas(turma);
		
		turma.adicionarAluno(matheus);
		turma.adicionarLider(matheus);
		
		System.out.println(curso);
		System.out.println(turma);
		
		
	}

}