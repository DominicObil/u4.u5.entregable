package u4.u5.entregable;

public class AgrupacionOficia extends Agrupacion {
	private Integrante[] Integrantes;
	private int numInt=0;
	int numero_final = 0;

	
	
	
	
	
	AgrupacionOficia(String Nombre, String autor, String autorM, String autorL, int nBandurrias, int puntosObtenidos) {
		super(Nombre, autor, autorM, autorL, nBandurrias, puntosObtenidos);
	// faltan los this
	
	}
	public void insertar_integrante(Integrante integrante) {
		int i=0;
		while ((this.Integrantes[i]!=null)&&(i<this.Integrantes.length)) {
			i++;

		
		this.Integrantes[i]=integrante;
		this.numInt =i+1;}

		this.numInt = numero_final;
		
		
	}
	public boolean eliminar_integrante(Integrante integrante) {
		return false;
		
		
	}
		
		
		
		
	
	
	
	public void caminito_del_falla() {
		
		
		
	}
}
