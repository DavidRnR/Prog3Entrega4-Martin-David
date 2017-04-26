import java.util.*;

public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mochila mochila = new Mochila(8);

		Elemento el1 = new Elemento("botella",4,6); // Nombre, valor, peso
		Elemento el2 = new Elemento("lapiz",2,1);
		Elemento el3 = new Elemento("celular",6,3);
		Elemento el4 = new Elemento("mate",2,2);

		List<Elemento> elementos = new ArrayList<Elemento>();

		elementos.add(el1);
		elementos.add(el2);
		elementos.add(el3);
		elementos.add(el4);

		List<Elemento> elmEnMochila = AlgoritmoGreedy.getMaxElementos(mochila, elementos);


		for (Elemento el : elmEnMochila) {
			System.out.println("Elemento: "+el.getNombre()+" Peso: "+el.getPeso());			
		}

	}

}
