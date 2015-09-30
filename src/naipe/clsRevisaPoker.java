package naipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * 
 * @param mano
 * @return
 */
	public boolean determinaEscalera(ArrayList<clsNaipeIngles> mano){
			//mostrarMano(mano);
			ordenarBaraja(mano);
			//mostrarMano(mano);
			boolean resp = true;
			int i=2;
		while(i < mano.size()){
			if(((clsNaipeIngles) mano.get(i)).getNumero() - ((clsNaipeIngles) mano.get(i-1)).getNumero() != 1 )resp = false;
			i++;
		}
		return resp;
	}
	/**
	 * 
	 * @param mano
	 * @return
	 */
	public boolean determinaEscaleraReal(ArrayList<clsNaipeIngles> mano){
		boolean resp= false;
		if(determinaEscalera(mano)){
			if(determinaPalo(mano)) resp= true;
		}
		return resp;
	}
	/**
	 * 
	 * @param list
	 * @return
	 */
	public boolean mismoValor(ArrayList<clsNaipeIngles> list){
		boolean resp=true;
		int i = list.size()-1;
		while(i >= 1){
			if(!list.get(i).igualValor(list.get(i-1))) resp = false;
			i--;
		}
		return resp;
	}
	/**
	 * 
	 * @param mano
	 * @return
	 */
	public boolean determinaFull(ArrayList<clsNaipeIngles> mano){
		ordenarBaraja(mano);
		boolean resp = false;
		if(mismoValor(new ArrayList<clsNaipeIngles>(mano.subList(1, 4)) ) || mismoValor(new ArrayList<clsNaipeIngles>(mano.subList(3, 5)) )){
			if(mismoValor(new ArrayList<clsNaipeIngles>(mano.subList(1, 2))) || mismoValor(new ArrayList<clsNaipeIngles>(mano.subList(4, 5)))) resp= true;
		}
		return resp;
	}
	/**
	 * 
	 * @param mano
	 * @return
	 */
	public boolean determinaPoker(ArrayList<clsNaipeIngles> mano){
		return mismoValor(new ArrayList<clsNaipeIngles>(mano.subList(1, 5))) ||  mismoValor(new ArrayList<clsNaipeIngles>(mano.subList(2, 6)));
	}
	/**
	 * 
	 * @param mano
	 * @return
	 */
	public boolean determinaPalo(ArrayList<clsNaipeIngles> mano){
		boolean resp= true; int i=mano.size()-1;
		while(i >= 1){
			if(!mano.get(i).igualPalo(mano.get(i-1))) resp= false;
			i--;
		}
		return resp;
	}
	/**
	 * 
	 * @param mano
	 */
	public void ordenarBaraja(ArrayList<clsNaipeIngles> mano){
		int jota;
			for(int index=1;index < mano.size();index++){
				jota=index;
				//System.out.println("hi "+jota);

				while(jota >0 && mano.get(jota-1).esMayor(mano.get(jota)) ){
					//mostrarMano();
					mano.set(0,mano.get(jota));
					mano.set(jota, mano.get(jota-1));
					mano.set(jota-1,mano.get(0));
					jota--;
				}
			}
	}
	public void mostrarMano(ArrayList<clsNaipeIngles> mano){
		for (int i = 1; i < mano.size(); i++)
			System.out.println(" " + mano.get(i));
		System.out.println("-----------------------");
	}
	
	
	

}
