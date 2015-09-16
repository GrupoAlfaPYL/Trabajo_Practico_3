package revisaTruco;

import java.util.Random;

	/**
	 * 
	 * usa la clase clsNaipeEspañol para realizar operaciones sobre las cartas
	 * 
	 * @author GildoAlejandro
	 *
	 * @version 1.0
	 */
	

public class clsRevisaTruco {
	
	/*
	 * constructor de clase
	 * 
	 */
	public clsRevisaTruco (){
		
	}
	
	/**
	 * @param 
	 * @return clsNaipeEspañol carta con valores al azahar
	 */
	public clsNaipeEspañolTruco generaCartaRandom(){
		int numero,aux;
		String palo="";
		do{
			numero = generaRandom(1,12);
		}while (numero == 8 || numero == 9 );
		aux= generaRandom(1,4);
		switch (aux){
		case 1: palo = "ORO"; break;
		case 2: palo = "ESPADAS"; break;
		case 3: palo = "BASTOS"	; break;
		case 4: palo = "COPAS" ; break;
		}
		
		return new clsNaipeEspañolTruco(numero,palo);
	}
	
	/**
	 * @param int valor inicial , valor final
	 * 
	 * @return int numeroRandom entre  [VI,VF]
	 */
	public int generaRandom(int valorInicial,int valorFinal){
		return new Random().nextInt(valorFinal) + valorInicial;
	}
	
	/**
	 *  calcula el valor del envido
	 * @param A carta
	 * @param B	carta
	 * @param C carta
	 * @return int valor del envido
	 */
	public int valorEnvido(clsNaipeEspañol A, clsNaipeEspañol B, clsNaipeEspañol C){
		int envido=0;
		if(determinaFlor(A,B,C)){
			envido = sumaEnvido(A.getNumero(), B.getNumero(), C.getNumero());
		}else{
			if(A.igualPalo(B)) envido = sumaEnvido(A.getNumero(),B.getNumero(),0);
			else {
				if(A.igualPalo(C)) envido = sumaEnvido(A.getNumero(),0,C.getNumero());
				else if(B.igualPalo(C)) envido = sumaEnvido(0,B.getNumero(),C.getNumero());
					else envido = (A.devuelveMayor(B.devuelveMayor(C))).getNumero();
			}
			
		}
	
		return envido;
	}
	/**
	 * 
	 * @param A
	 * @param B
	 * @param C
	 * @return envido (la suma del envido)
	 */
	private int sumaEnvido(int A, int B, int C){
		int envido=0;
		if(A > 7) A=0;
		if(B > 7) B=0;
		if(C > 7) C=0;
		if(A > B ){
			if(B > C) envido = A + B;
			else envido = A + C;
		}
		else{
			if(A > C) envido= A + B;
			else envido = B + C;
		}
		if(envido < 13) return envido + 20;
		else return 33;
	}
	/**
	 * 
	 * @param A
	 * @param B
	 * @param C
	 * @return true si es flor
	 * 		false si es no lo es
	 */
	public boolean determinaFlor(clsNaipeEspañol A,clsNaipeEspañol B,clsNaipeEspañol C){
		if(A.igualPalo(B)&& B.igualPalo(C)) return true;
		else return false;
	}
}
