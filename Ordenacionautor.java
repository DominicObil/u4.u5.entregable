package u4.u5.entregable;

import java.util.Comparator;

public class Ordenacionautor implements Comparator<Agrupacion>{
	
	 @Override
		public int compare(Agrupacion a1, Agrupacion a2) {
			
		 return a1.getAutor().compareTo(a2.getAutor());
				
		}

	
}
