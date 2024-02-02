package u4.u5.entregable;

import java.util.Comparator;

public class Ordenacionpuntos implements Comparator<Agrupacion>{

	

	 @Override
    public int compare(Agrupacion a1,Agrupacion a2) {
        if (a1.getPuntos() < a2.getPuntos()) {
            return -1;
        } else if (a1.getPuntos() > a2.getPuntos()) { 
            return 1;
        } else {
            return 0;
        }
    }

}

