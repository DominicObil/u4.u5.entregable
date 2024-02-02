package u4.u5.entregable;

public class COAC extends AgrupacionOficia{
	private Agrupacion[] Agrupaciones;
	private int numAgrup = 0;

	COAC(String Nombre, String autor, String autorM, String autorL, int nBandurrias, int puntosObtenidos) {
		super(Nombre, autor, autorM, autorL, nBandurrias, puntosObtenidos);
	
	}
	public void inscribir_agrupacion(AgrupacionOficia agrupacion) {
		
		
			int i=0;
			while ((this.Agrupaciones[i]!=null)&&(i<this.Agrupaciones.length)) {
				i++;
	
			
			this.Agrupaciones[i]=agrupacion;
			this.numAgrup =i+1;}

		
	}
	public boolean eliminar_agrupacion(AgrupacionOficia agrupacion) {
		return false;
		
	}
	public void ordenar_por_puntos() {}
	public void ordenar_por_nombre() {}
	public void ordenar_por_autor() {}
	
	
	
	
	
}














