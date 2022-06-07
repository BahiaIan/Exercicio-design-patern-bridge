package design_patern_bridge;

public class Main {
	public static void main(String args[]) {
		testDevice(new HomeTheater());
		testDevice(new Radio());
	}

	public static void testDevice(Dispositivo dispositivo) {
		System.out.println("Testando com controle simples.");
		ControleSimples controleSimples = new ControleSimples(dispositivo);
		dispositivo.imprimirStatus();
		controleSimples.power();
		dispositivo.imprimirStatus();
		controleSimples.abaixarVolume();
		controleSimples.aumentarCanal();
		dispositivo.imprimirStatus();

		System.out.println("Testando com controle avancado.");
		ControleAvancado advancedRemote = new ControleAvancado(dispositivo);
		dispositivo.imprimirStatus();
		advancedRemote.power();
		advancedRemote.mutar();
		dispositivo.imprimirStatus();
		advancedRemote.power();
		advancedRemote.mutar();
		dispositivo.imprimirStatus();
		controleSimples.aumentarVolume();
		controleSimples.diminuirCanal();
		dispositivo.imprimirStatus();

	}
}
