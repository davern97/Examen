package JUnitNumMesGran;

import JUnitNumMesGran.CalculadoraExamen;

public class CalculadoraExamTest {

	public static void main(String[] args) {
		int potencia;
		boolean residu;

		potencia = testpotencia();

		System.out.println(potencia);

		residu = testresidu();

		System.out.println(residu);

	}

	public static int testpotencia() {
		int resultat_potencia;

		CalculadoraExamen CE = new CalculadoraExamen(3, 2);

		resultat_potencia = CE.potencia();

		return resultat_potencia;
	}

	public static boolean testresidu() {
		boolean resultat_residu;
		CalculadoraExamen CE = new CalculadoraExamen(2, 2);
		resultat_residu = CE.residu();

		return resultat_residu;

	}

}
