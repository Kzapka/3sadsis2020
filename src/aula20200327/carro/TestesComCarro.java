package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCarro {

	@Test
	void testarConsumo() {
		Carro palioABC3333 = new Carro();
		Carro golAGJ1234 = new Carro();

		assertTrue(palioABC3333.isDesligado());
		assertTrue(golAGJ1234.isDesligado());

		palioABC3333.abastecer(10.00);
		golAGJ1234.abastecer(25.00);

		palioABC3333.ligar();
		assertEquals(9.75, palioABC3333.getCombustivelNoTanqueEmLitros());

		golAGJ1234.ligar();
		assertEquals(24.75, golAGJ1234.getCombustivelNoTanqueEmLitros());

		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		assertEquals(9.00, palioABC3333.getCombustivelNoTanqueEmLitros());

		golAGJ1234.acelerar();
		assertEquals(24.50, golAGJ1234.getCombustivelNoTanqueEmLitros());

	}

	@Test
	void desligarSemCombustivel() {
		Carro paratiWAS9876 = new Carro();
		
		paratiWAS9876.abastecer(1.00);
		
		paratiWAS9876.ligar();
		
		paratiWAS9876.acelerar();
		paratiWAS9876.acelerar();
		paratiWAS9876.acelerar();
		
		assertEquals(false, paratiWAS9876.isLigado());
	}
	
	@Test
	void reabastecer() {
		Carro paratiWAS9876 = new Carro();
		
		paratiWAS9876.abastecer(20.00);
		
		paratiWAS9876.ligar();
		
		paratiWAS9876.acelerar();
		paratiWAS9876.acelerar();
		paratiWAS9876.acelerar();
		
		paratiWAS9876.abastecer(5.00);
		
		assertEquals(24.00, paratiWAS9876.getCombustivelNoTanqueEmLitros());
		
	}
	
	@Test
	void esvaziarCarro() {
		Carro paratiWAS9876 = new Carro();
		
		paratiWAS9876.abastecer(20.00);
		
		paratiWAS9876.ligar();
		
		paratiWAS9876.acelerar();
		paratiWAS9876.acelerar();
		paratiWAS9876.acelerar();
		
		paratiWAS9876.esvaziarCarro();
		
		
		assertEquals(0, paratiWAS9876.getCombustivelNoTanqueEmLitros());
	}

}
