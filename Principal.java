package ccuenta;

public class Principal {

	public static void main(String[] args) {
		// Depuració. S'atura sempre
		CCuenta miCuenta = new CCuenta(); 
		System.out.println("Saldo inicial: " + miCuenta.obtenirSaldo() + " euros.");

		// Depuració. Provoca aturada per ingrés amb quantitat inferior a 0
		miCuenta.ingressar(-100);
		System.out.println("Saldo inicial: " + miCuenta.obtenirSaldo() + " euros.");
		miCuenta.ingressar(100);
		System.out.println("Saldo després de l'ingrés: " + miCuenta.obtenirSaldo() + " euros.");
		miCuenta.ingressar(200);
		System.out.println("Saldo després de l'ingrés: " + miCuenta.obtenirSaldo() + " euros.");

		// Depuració. Provoca aturada per condició de tercer ingrés
		miCuenta.ingressar(300);
		System.out.println("Saldo després de l'ingrés: " + miCuenta.obtenirSaldo() + " euros.");
		miCuenta.retirar(50);
		System.out.println("Saldo després de la retirada: " + miCuenta.obtenirSaldo() + " euros.");
	
		miCuenta.ingressar(300);
		System.out.println("Saldo després de l'ingrés: " + miCuenta.obtenirSaldo() + " euros.");
		miCuenta.ingressar(300);
		System.out.println("Saldo després de l'ingrés: " + miCuenta.obtenirSaldo() + " euros.");
		miCuenta.ingressar(300);
		System.out.println("Saldo després de l'ingrés: " + miCuenta.obtenirSaldo() + " euros.");
				

	}  

}
