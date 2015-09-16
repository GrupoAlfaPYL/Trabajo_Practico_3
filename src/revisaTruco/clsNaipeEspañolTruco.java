package revisaTruco;
/**
 * 
 * @author GildoAlejandro
 *
 */

public class clsNaipeEspañolTruco extends clsNaipeEspañol {

	/*
	 * atributos
	 */
	private int valor;

	/**
	 * 
	 * @param numero
	 * @param palo
	 * @param valor
	 */
	public clsNaipeEspañolTruco(int numero,String palo){
		super(numero,palo);
		asignaValor();
	}
	/*
	 * setters
	 */
	private void setValor(int valor){
		this.valor = valor;
	}
	/*
	 * getters
	 */
	public int getValor(){
		return this.valor;
	}
	/*
	 * metodos
	 */
	private void asignaValor(){
		switch(this.getNumero()){
		case 1: {
			if(this.getPalo() == "ESPADAS"){
				this.setValor(1);
			}
			else if(this.getPalo() == "BASTOS"){
				this.setValor(2);
			}
			else this.setValor(7);
		}break;
		case 2: this.setValor(6);break;
		case 3: this.setValor(5);break;
		case 4: this.setValor(14);break;
		case 5: this.setValor(13);break;
		case 6: this.setValor(12);break;
		case 7: {
			if(this.getPalo() == "ESPADAS"){
				this.setValor(3);
			}
			else if(this.getPalo() == "OROS"){
				this.setValor(4);
			}
			else this.setValor(11);
		}break;
		case 10: this.setValor(10);break;
		case 11: this.setValor(9);break;
		case 12: this.setValor(8);
		}
	}
}
