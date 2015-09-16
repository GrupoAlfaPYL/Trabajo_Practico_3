package naipe;

import revisaTruco.clsNaipeEspañol;

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
		asignaValor();
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

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected void setValor(int valor){
		this.valor = valor;
	}
	protected abstract void asignaNombre();
	protected abstract void asignaValor();
	
	/**
	 * Getters
	 */

	public int getNumero() {
		return this.numero;
	}

	public String getPalo() {
		// TODO Auto-generated method stub
		return this.palo;
	}

	public String getNombre() {
		return this.nombre;
	}
	/**
	 * Metodos
	 */
	/**
	 * 
	 * @param B
	 * @return
	 */
	public boolean igualPalo(clsNaipe B) {
		if (this.getPalo().compareTo(B.getPalo()) == 0)
			return true;
		else
			return false;
	}
	/**
	 * 
	 * @param B
	 * @return
	 */
	public boolean igualValor(clsNaipeEspañol B) {
		if (this.getNumero() == B.getNumero())
			return true;
		else
			return false;
	}
	/**
	 * 
	 * @param B
	 * @return
	 */
	public clsNaipe devuelveMayor(clsNaipe B) {

		if (this.getNumero() > B.getNumero())
			return this;
		else
			return B;

	}	
}
