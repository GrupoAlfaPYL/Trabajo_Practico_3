package naipe;
	/**
	 * 
	 * @author GildoAlejandro
	 *
	 */
public class clsNaipeIngles extends clsNaipe {
	
	public clsNaipeIngles(int numero, String palo){
		super(numero,palo);
	}
	

	@Override
	protected void asignaNombre() {
		
		switch(this.getNumero()){
		case 0: this.setNombre("COMODIN");break;
		case 1: this.setNombre("AS DE"+this.getPalo());break;
		case 2: this.setNombre("DOS DE"+this.getPalo());break;
		case 3: this.setNombre("TRES DE"+this.getPalo());break;
		case 4: this.setNombre("CUATRO DE"+this.getPalo());break;
		case 5: this.setNombre("CINCO DE"+this.getPalo());break;
		case 6: this.setNombre("SEIS DE"+this.getPalo());break;
		case 7: this.setNombre("SIETE DE"+this.getPalo());break;
		case 8: this.setNombre("OCHO DE"+this.getPalo());break;
		case 9: this.setNombre("NUEVE DE"+this.getPalo());break;
		case 10: this.setNombre("JACK DE"+this.getPalo());break;
		case 11: this.setNombre("REINA DE"+this.getPalo());break;
		case 12: this.setNombre("REY DE"+this.getPalo());break;
		}
		
	}

	@Override
	protected void asignaValor() {
		setValor(this.getNumero());
	}

}
