package design_patern_bridge;

public interface Dispositivo {

	Boolean estaLigado();

	void ligar();

	void desligar();

	Integer getVolume();

	void setVolume(Integer porcentagem);

	Integer getCanal();

	void setCanal(Integer canal);

	void imprimirStatus();

}
