package naipe;
/**
 * 
 * @author GildoAlejandro
 *
 *@build 1.0
 */

	/*clase abstracta que "emula"
	 * un naipe de cualquier baraja (española, inglesa)
	 */
public abstract class clsNaipe {
	/*
	 * atributos
	 */
	private String nombre,palo;
	private int numero, valor;
	
	public clsNaipe(int numero, String palo){
		setNumero(numero);
		setPalo(palo);
		asignaNombre();
	}
	
	/**
	 * Setters
	 */
	private void setNumero(int numero) {
		this.numero = numero;
	}

	private void setPalo(String palo) {
		this.palo = palo;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected abstract void asignaNombre();
	
}
