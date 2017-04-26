import java.util.*;

public class Mochila {
	private int capacidad;
	private List<Elemento> elementos;
	
	public Mochila (int cap) {
		capacidad = cap;
		elementos = new ArrayList<Elemento>();
	}
	
	/**
	 * Recibe una lista de elementos preselecionados 
	 * @param el
	 */
	public void llenarMochila (List<Elemento> el) {
		elementos = el;
	}

	//*****Getters & Setters******************
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	//****************************************
}
