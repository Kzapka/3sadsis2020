package aula20200323.cofre;

public class CofreSeguro {

	private String chave;
	private boolean aberto;

	public CofreSeguro(String chave) {
		this.chave = chave;
		this.aberto = false;
	}

	public void abrir(String chave) {
		if (this.chave.equals(chave)) {
			this.aberto = true;
			return;
		}

		System.out.println("Senha incorreta");
	}

	public void fechar() {
		this.aberto = false;

	}

	public boolean isAberto() {
		return aberto;
	}

	public void setSenha(String chave) {
		this.chave = chave;
	}
}