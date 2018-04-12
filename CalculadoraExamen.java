package JUnitNumMesGran;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraExamen {
	private int num1, num2;

	public CalculadoraExamen(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int divideix() {
		int resul = num1 / num2;
		return resul;
	}

	public int potencia() {
		int potencia = (int) Math.pow(num1, num2);

		return potencia;
	}

	public boolean residu() {
		int residu;

		residu = num1 % 2;

		if (residu == 0) {
			return true;
		} else {
			return false;
		}
	}

}
