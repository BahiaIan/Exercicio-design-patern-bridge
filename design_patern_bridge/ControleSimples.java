package design_patern_bridge;

public class ControleSimples implements ControleRemoto {
	protected Dispositivo dispositivo;

	public ControleSimples() {
	}

	public ControleSimples(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public void power() {
		System.out.println("Remote: " + (!dispositivo.estaLigado() ? "ligando" : "deligando"));
		if (dispositivo.estaLigado()) {
			dispositivo.desligar();
		} else {
			dispositivo.ligar();
		}
	}

	@Override
	public void abaixarVolume() {
		if (dispositivo.estaLigado()) {
			System.out.println("Remote: diminuindo volume");
			dispositivo.setVolume(-10);
		} else {
			System.out.println("Dispositivo desligado");
		}
	}

	@Override
	public void aumentarVolume() {
		if (dispositivo.estaLigado()) {
			System.out.println("Remote: aumentando volume");
			dispositivo.setVolume(10);
		} else {
			System.out.println("Dispositivo desligado");
		}
	}

	@Override
	public void diminuirCanal() {
		if (dispositivo.estaLigado()) {
			System.out.println("Remote: voltando canal");
			dispositivo.setCanal(-1);
		} else {
			System.out.println("Dispositivo desligado");
		}
	}

	@Override
	public void aumentarCanal() {
		if (dispositivo.estaLigado()) {
			System.out.println("Remote: avancando canal");
			dispositivo.setCanal(1);
		} else {
			System.out.println("Dispositivo desligado");
		}
	}
}
