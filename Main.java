package u4.u5.entregable;

import java.util.Arrays;

public class Main {
	 public static void main(String[] args) {
		 
		 
		 Agrupacion[] Agrupaciones = new Agrupacion[5];
		 Agrupacion a1 = new Agrupacion("NaMBRE1", "JUAN","CARLOS", "JAVIER", 5, 9);
		 Agrupacion a2 = new Agrupacion("NOMBRE2", "CARLOS","pedro", "JAVIER", 5, 9);
		 Agrupacion a3 = new Agrupacion("NOMBRE3", "Damian","CARLOS", "JAVIER", 5, 9);
		 Agrupacion a4 = new Agrupacion("NOMBRE4", "MARIO","CARLOS", "JAVIER", 5, 9);
	
		 
		Agrupaciones[0]=a1;
		Agrupaciones[1]=a2;
		Agrupaciones[2]=a3;
		Agrupaciones[3]=a4;
		



	a1.cantar_la_presentacionchi();
	a2.cantar_la_presentacioncom();
	a3.cantar_la_presentacionr();
	a3.cantar_la_presentacioncoro();
	
	
	Ordenacionnombre ordnadorNombre = new Ordenacionnombre();
    System.out.println("\nOrdenado por Nombre:");
    Arrays.sort(Agrupaciones, ordnadorNombre);
    System.out.println(Arrays.toString(Agrupaciones));
    
    
    
    Ordenacionautor ordnadorAutor = new Ordenacionautor();
    System.out.println("\nOrdenado por Autor:");
    Arrays.sort(Agrupaciones, ordnadorAutor);
    System.out.println(Arrays.toString(Agrupaciones));
    
    Ordenacionpuntos ordenadorPuntos = new Ordenacionpuntos();
    System.out.println("\nOrdenado por Puntos :");
    Arrays.sort(Agrupaciones, ordenadorPuntos);
    System.out.println(Arrays.toString(Agrupaciones));
    
    
    
    
    
    
	
	
	

	

	
	
	
	


}}
