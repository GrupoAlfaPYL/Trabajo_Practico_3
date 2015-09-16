package revisaTruco;

/**
 * Naipe representa a un naipe de cualquier baraja
 * 
 * @author GildoAlejandro
 * 
 * @version 1.0
 * 
 * @date 10/09/2015
 * 
 */

/*
 * Atributos nombre de la carta palo de la carta valor de la carta
 */
public  class clsNaipeEspañol {

	private String nombre, palo;
	private int numero;

	/**
	 * Construcctor de la clase
	 */

	public clsNaipeEspañol(int numero, String palo) {
		setNumero(numero);
		setPalo(palo);
		asignaNombre();
	}
	
	public clsNaipeEspañol(){
		setNumero(0);
		setPalo("");
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

	/**
	 * Asigna el nombre de la carta correspondiente a su valor
	 */

	private void asignaNombre() {

		switch (this.getNumero()) {

		case 1:
			this.setNombre("As de " + this.getPalo());
			break;
		case 2:
			this.setNombre("Dos de " + this.getPalo());
			break;
		case 3:
			this.setNombre("Tres de " + this.getPalo());
			break;
		case 4:
			this.setNombre("Cuatro de " + this.getPalo());
			break;
		case 5:
			this.setNombre("Cinco de " + this.getPalo());
			break;
		case 6:
			this.setNombre("Seis de " + this.getPalo());
			break;
		case 7:
			this.setNombre("Siete de " + this.getPalo());
			break;
		case 10:
			this.setNombre("Diez de " + this.getPalo());
			break;
		case 11:
			this.setNombre("Once de " + this.getPalo());
			break;
		case 12:
			this.setNombre("Doce de " + this.getPalo());
			break;
		}
	}

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
	 * 
	 * @param clNaipeEspañol
	 *            B
	 * @return true si son del mismo palo false si es todo lo contrario
	 * 
	 */
	public boolean igualPalo(clsNaipeEspañol B) {
		if (this.getPalo().compareTo(B.getPalo()) == 0)
			return true;
		else
			return false;
	}

	/**
	 * @param clsNaipeEspañol
	 *            B
	 * @return true si tienen el mismo valor false si sucede todo lo contrario
	 * 
	 */
	public boolean igualValor(clsNaipeEspañol B) {
		if (this.getNumero() == B.getNumero())
			return true;
		else
			return false;
	}

	/**
	 * @param clsNaipeEspañol
	 *            B
	 * 
	 * @return el objeto que sea mayor
	 * 
	 */
	public clsNaipeEspañol devuelveMayor(clsNaipeEspañol B) {

		if (this.getNumero() > B.getNumero())
			return this;
		else
			return B;

	}

	/**
	 * @param
	 * @return String con el nombre de la carta
	 * 
	 */
	public String toString() {
		return this.getNombre();
	}

}
