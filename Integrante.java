package u4.u5.entregable;

public class Integrante {
	
	public int numero_participante;
	public String nombre;
	public int edad;
	public int localidad_particpante;
	
	Integrante(int numero_participante, String nombre, int edad, int localidad_particpante){
		this.numero_participante= numero_participante;
		this.nombre=nombre;
		this.edad= edad;
		this.localidad_particpante= localidad_particpante;
		
		
		
	}
	
	public String toString() {
		return "Integrante nombre =" + nombre + ", numero =" + numero_participante + ", edad =" + edad +"localidad : "+localidad_particpante ;
	}
	
	

}

 