package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void estadoDoCofre() {

		Cofre cofreFechado = new Cofre();

		assertEquals(false, cofreFechado.isAberto());
		cofreFechado.abrir();

		assertEquals(true, cofreFechado.isAberto());
		cofreFechado.fechar();

		assertEquals(false, cofreFechado.isAberto());

		Cofre cofre = new Cofre();
		cofre.abrir();

		assertEquals(true, cofre.isAberto());
	}

	@Test
	void estadoDoCofreComSenha() {
		CofreSeguro cofreSeguro = new CofreSeguro("102030");

		assertEquals(false, cofreSeguro.isAberto());

		cofreSeguro.abrir("102030");

		assertEquals(true, cofreSeguro.isAberto());

		CofreSeguro incorreto = new CofreSeguro("102030");
		incorreto.abrir("0");

		assertEquals(false, incorreto.isAberto());
	}

}