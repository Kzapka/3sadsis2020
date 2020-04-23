package AEP2;

public class Ventilador {
	private int velocidade;
	private boolean ligado;
	private boolean girando;
	
	public Ventilador() {
		this.velocidade = 1;
		this.girando    = false;
		this.ligado     = false;
		
	}
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado  = false;
		this.girando = false;
	}
	
	public String girar() {
		if(ligado == true) {
			this.girando = true;
			return "Ventilador girando!";
		}else {
			throw new RuntimeException("O ventilador está desligado!");
		}
	}
	
	public void parado() {
		this.girando = false;
	}
	
	public int setVelocidade(int numero) {
		if(ligado == true) {
			if(numero <= 5) {
				this.velocidade = numero;
				return numero;
			}else {
				throw new RuntimeException("Só há 5 velocidades!");
			}
		}else {
			throw new RuntimeException("Ventilador desligado!");
		}
	}
}

