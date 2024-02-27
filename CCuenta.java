package ccuenta;

public class CCuenta {

	private double saldo = 0;
	private int contadorActualitzacionsSaldo = 0;

	public CCuenta() {
	}

	public double obtenirSaldo() {
		return saldo; 
	}

	public int ingressar(double quantitat) {
		int ingressarCodiError;
		if (quantitat < 0) {
			System.out.println("No es pot ingressar una quantitat inferior a 0");
			ingressarCodiError = 1;
		} else {
			if (quantitat == -3) {
				System.out.println("Error detectable en proves de caixa blanca");
				ingressarCodiError = 2;
			} else {
				// Depuració. Punt d'aturada només al 3r ingrés.
				saldo = saldo + quantitat;
				contadorActualitzacionsSaldo ++;
				ingressarCodiError = 0;
			} 
		}
		// Depuració. Punt d'aturada quan la quantitat és menor que 0
		return ingressarCodiError;
	}

	public void retirar(double quantitat) {
		if (quantitat <= 0) {
			System.out.println("No es pot retirar una quantitat menor que 0");
		} else {
			if (saldo < quantitat) {
				System.out.println("No hi ha suficient saldo");
			} else {
				saldo = saldo - quantitat;
			}
		}
	}

}
