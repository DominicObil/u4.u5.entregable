package u4.u5.entregable;

import java.util.Comparator;

public class Ordenacionnombre implements Comparator<Agrupacion>{
	 
			
    	

		@Override
		public int compare(Agrupacion a1, Agrupacion a2) {
		
			return a1.getNombre().compareTo(a2.getNombre());
		}

	
	
}
