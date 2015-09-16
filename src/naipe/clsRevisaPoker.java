package naipe;

import java.util.Random;

/**
 * 
 * @author GildoAlejandro
 *
 */
public class clsRevisaPoker {
public clsRevisaPoker (){
		
	}
	
	/**
	 * @param 
	 * @return clsNaipeEspañol carta con valores al azahar
	 */
	public clsNaipeIngles generaCartaRandom(){
		int numero,aux;
		String palo="";
		numero = generaRandom(1,12);
		aux= generaRandom(1,4);
		switch (aux){
		case 1: palo = "CORAZONES"; break;
		case 2: palo = "PICAS"; break;
		case 3: palo = "DIAMANTES"	; break;
		case 4: palo = "TREBOLES" ; break;
		}
		return new clsNaipeIngles(numero,palo);
	}
	
	/**
	 * @param int valor inicial , valor final
	 * 
	 * @return int numeroRandom entre  [VI,VF]
	 */
	public int generaRandom(int valorInicial,int valorFinal){
		return new Random().nextInt(valorFinal) + valorInicial;
	}

}
