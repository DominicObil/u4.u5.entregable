package u4.u5.entregable;

public class Agrupacion {
	public enum AGRUPACIONES{CORO,ROMANCERO,COMPARSA,CUARTETO,CHIRINGOTA}

	public String nombre;
	public String autor;
	public String autorM;
	public String autorL;
	public int nBandurritas;
	public int puntosObtenidos;
	public enum DISFRAZ{BLANCO, ROJO,AZUL,NEGRO};
	public int nGuitarras;
	public int empresa;
	public int nCuples;
	int nMiembros;
	String tematica;
	
	
	// me faltan mas metodos, debi aber creado clases en lugar de enum
	Agrupacion(String Nombre, String autor, String autorM, String autorL, int nBandurrias, int puntosObtenidos)
	
	{
		this.nombre= Nombre;
		this.autor=autor;
		this.autorL= autorL;
		this.autorM= autorM;
		this.puntosObtenidos= puntosObtenidos;
		this.nBandurritas= nBandurrias;
		
		
		
	}
	
	public void cantar_la_presentacionr() {
		
		System.out.println("Cantando la presentacion de la Chiringota :" +AGRUPACIONES.ROMANCERO + " con nombre : "+nombre);
		
		
	}
	
public void cantar_la_presentacioncom() {
		
		System.out.println("Cantando la presentacion de la Chiringota :" +AGRUPACIONES.COMPARSA + " con nombre : "+nombre);
		
		
	}
public void cantar_la_presentacioncoro() {
	
	System.out.println("Cantando la presentacion de la Chiringota :" +AGRUPACIONES.CORO + " con nombre : "+nombre);
	
	
}
public void cantar_la_presentacioncuar() {
	
	System.out.println("Cantando la presentacion de la Chiringota :" +AGRUPACIONES.CUARTETO + " con nombre : "+nombre);
	
	
}
public void cantar_la_presentacionchi() {
	
	System.out.println("Cantando la presentacion de la Chiringota :" +AGRUPACIONES.CHIRINGOTA + " con nombre : "+nombre);
	
	
}
	public void mostrar_tipoCOR() {
		
		
		System.out.print(" La Chiringota/" + AGRUPACIONES.CORO+"/con nombre/"+nombre+ "va de"+AGRUPACIONES.values());
		
	}	public void mostrar_tipoCHI() {
		
		
		System.out.print(" La Chiringota/" + AGRUPACIONES.CHIRINGOTA+"/con nombre/"+nombre+ "va de"+AGRUPACIONES.values());
		
	}
	public void mostrar_tipoCOM() {
		
		
		System.out.print(" La Chiringota/" + AGRUPACIONES.COMPARSA+"/con nombre/"+nombre+ "va de"+AGRUPACIONES.values());
		
	}
	public void mostrar_tipoCUART() {
		
		
		System.out.print(" La Chiringota/" + AGRUPACIONES.CUARTETO+"/con nombre/"+nombre+ "va de"+AGRUPACIONES.values());
		
	}
	public void mostrar_tipoROM() {
		
		
		System.out.print(" La Chiringota/" + AGRUPACIONES.ROMANCERO+"/con nombre/"+nombre+ "va de"+AGRUPACIONES.values());
		
	}
	
	
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor()  {

		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Agrupacion nombre =" + nombre + ", autor =" + autor + ", Puntos =" + puntosObtenidos +"]" ;
	}

	public int getPuntos() {

		return puntosObtenidos;
	}
	
	
	public void setEdad(int puntos) {
		this.puntosObtenidos = puntos;
	

	

	


	}}
	
	





  




/* (mostrar por pantalla un mensaje que sea "Cantando la presentación de la Chirigota/Coro/... con nombre XXXXX") y
 *  tienen que mostrar_tipo() (mostrar pon pantalla un mensaje que sea "La Chirigota/Coro/....XXXXX va de YYYYY"), siendo XXXXX 
 *  el nombre de la agrupación e YYYYY el tipo (disfraz) de la agrupación. */


















