package revisaTruco;

public class clsTestNaipeEspañol {

	public static void main(String[] args) {
		clsNaipeEspañolTruco A = new clsNaipeEspañolTruco(1,"OROS");
		clsNaipeEspañolTruco B = new clsNaipeEspañolTruco(1,"OROS");
		clsNaipeEspañolTruco C = new clsNaipeEspañolTruco(1,"OROS");
		clsRevisaTruco aux = new clsRevisaTruco();
		System.out.println(A.toString());
		System.out.println(B.toString());
		System.out.println(C.toString());
		System.out.println(aux.determinaFlor(A, B, C));
		System.out.println(aux.valorEnvido(A, B, C));
	}

}
