package design_patern_bridge;

public class ControleAvancado extends ControleSimples {
	public ControleAvancado(Dispositivo dispositivo) {
		super.dispositivo = dispositivo;
	}

	public void mutar() {
		if (dispositivo.estaLigado()) {
			System.out.println("Remote: mutando dispositivo");
			dispositivo.setVolume(-100);
		} else {
			System.out.println("Dispositivo desligado");
		}
	}
}
