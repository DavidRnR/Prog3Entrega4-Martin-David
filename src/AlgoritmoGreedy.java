import java.util.*;

public class AlgoritmoGreedy {
	
	
	public static List<Elemento> getMaxElementos (Mochila mochila, List<Elemento> elementos) {
		List<Elemento> elementosMochila = new ArrayList<Elemento>();
		int capacidad = mochila.getCapacidad();
		int index = 0;
		
		while(elementos != null && elementos.size() > 0) {
			
			index = getElementoMaxPromedio(elementos);
			
			if(elementos.get(index).getPeso() <= capacidad) {				
				elementosMochila.add(elementos.get(index));
				capacidad -= elementos.get(index).getPeso();
				elementos.remove(index);
			}
			else {
				elementos.remove(index);
			}
		}
		return elementosMochila;
	}
	
	/**
	 * Obtener el elemento con mejor Promedio
	 * @param elementos
	 * @return
	 */
	private static int getElementoMaxPromedio(List<Elemento> elementos) {
		int index = 0;
		
		for (int i = 0; i < elementos.size(); i++) {
			
			if(elementos.get(i).getPromedio() > elementos.get(index).getPromedio() ) {
				index = i;
			}
			
		}
		
		return index;
	}

}
