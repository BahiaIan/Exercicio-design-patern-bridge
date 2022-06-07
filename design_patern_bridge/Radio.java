package design_patern_bridge;

public class Radio implements Dispositivo {
	private Boolean ligado = false;
	private Integer volume = 30;
	private Integer canal = 1;

	@Override
	public Boolean estaLigado() {
		return ligado;
	}

	@Override
	public void ligar() {
		ligado = true;
	}

	@Override
	public void desligar() {
		ligado = false;
	}

	@Override
	public Integer getVolume() {
		return volume;
	}

	@Override
	public void setVolume(Integer porcentagem) {
		volume += porcentagem;

		if (volume > 100) {
			volume = 100;
		} else if (volume < 0) {
			volume = 0;
		}
	}

	@Override
	public Integer getCanal() {
		return canal;
	}

	@Override
	public void setCanal(Integer canal) {
		this.canal += canal;
	}

	@Override
	public void imprimirStatus() {
		System.out.println("------------------------------------");
		System.out.println("| Eu sou o aparelho de Radio.");
		System.out.println("| Eu estou " + (ligado ? "enabled" : "disabled"));
		System.out.println("| O volume atual eh: " + volume + "%");
		System.out.println("| O canal atual eh: " + canal);
		System.out.println("------------------------------------\n");
	}

}
