package naipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class clsTestNaipe {

	
	public static void main(String[] args) {
		clsRevisaPoker aux = new clsRevisaPoker();
		clsNaipeIngles a = new clsNaipeIngles(4, "PICAS");
		clsNaipeIngles b = new clsNaipeIngles(5, "PICAS");
		clsNaipeIngles c = new clsNaipeIngles(1, "PICAS");
		clsNaipeIngles d = new clsNaipeIngles(2, "PICAS");
		clsNaipeIngles e = new clsNaipeIngles(3, "PICAS");
		ArrayList<clsNaipeIngles> mano = new ArrayList<clsNaipeIngles>();
		mano.add(0,new clsNaipeIngles(0,""));
		mano.add(1,a);
		mano.add(2,b);
		mano.add(3,c);
		mano.add(4,d);
		mano.add(5,e);
		//clsManoPoker aux2 = new clsManoPoker(mano);
		//mano.add(a.generaCartaRandom());
		//mano.add(a.generaCartaRandom());
		//mano.add(a.generaCartaRandom());
		//mano.add(a.generaCartaRandom());
		//mano.add(a.generaCartaRandom());
		// System.out.println(""+a.toString());
		//aux2.mostrarMano();
		//aux2.ordenarBaraja();
		//aux2.mostrarMano();
		//System.out.println(mano.subList(1,3).size());
		System.out.println(aux.determinaEscalera(mano));
		System.out.println(aux.determinaEscaleraReal(mano));
		System.out.println(aux.determinaFull(mano));
		System.out.println(aux.determinaPoker(mano));
		mano.subList(1, 4);

		
		
	

	}

	}