package AEP2;

public class AppVentilador {
	
	public static void main(String[]args) {
		Ventilador Britania = new Ventilador();
		
		try {
			Britania.ligar();
			int velocidade = Britania.setVelocidade(5);
			System.out.println(velocidade);			
		}catch (RuntimeException alertaVelocidade) {
			System.out.println(alertaVelocidade.getMessage());
		}
		
		try {
			Britania.ligar();
			int velocidade = Britania.setVelocidade(6);
			System.out.println(velocidade);
		}catch(RuntimeException alertaVelocidade) {
			System.out.println(alertaVelocidade.getMessage());
		}
		
		try {
			Britania.ligar();
			Britania.girar();
			String velocidade = Britania.girar();
			System.out.println(velocidade);
		} catch (RuntimeException alertaVelocidade) {
			System.out.println(alertaVelocidade.getMessage());
		}
	}

}
