
public class Elemento {
	private int valor;
	private int peso;
	private String nombre;
	
	public Elemento (String nomb, int val, int p) {
		valor = val;
		peso = p;
		nombre = nomb;
	}
	
	public float getPromedio () {
		return valor/peso;
	}
	//*******Getters & Setters**************************
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//*********************************************//
}
