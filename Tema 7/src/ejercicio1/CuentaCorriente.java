package ejercicio1;
/**
 * Clase con las funciones de Cuenta Corriente
 * @author Jaime Sevilla
 *
 */
public class CuentaCorriente {
	/**
	 * DNI del cliente
	 */
	private String DNI;
	/**
	 * Nombre del cliente
	 */
	private String nombre;
	/**
	 * Saldo disponible en la cuenta del cliente
	 */
	private double saldo;
	
	/**
	 * Constructor con DNI y Saldo
	 * @param dNI DNI dado por el usuario
	 * @param saldo Saldo dado por el usuario
	 */
	public CuentaCorriente(String dNI, double saldo) {
		super();
		DNI = dNI;
		this.saldo = saldo;
	}
	/**
	 * Constructor con todos los parametros
	 * @param dNI DNI dado por el usuario
	 * @param nombre Nombre dado por el usuario
	 * @param saldo Saldo dado por el usuario
	 */
	public CuentaCorriente(String dNI, String nombre, double saldo) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	/**
	 * Saca una cantidad de dinero del saldo
	 * @param cantidad Cantidad de dinero a sacar
	 */
	void sacarDinero(double cantidad) {
		if(cantidad>saldo || cantidad<0) {
			System.out.println("ERROR: No tiene suficiente saldo en la cuenta");
		}
		else {
			System.out.println("Sacando saldo......");
			saldo -= cantidad;
		}
	}
	/**
	 * Ingresa dienro en el saldo
	 * @param cantidad Cantidad de dinero a ingresar
	 */
	void ingresarDinero(double cantidad) {
		if(cantidad<0) {
			System.out.println("ERROR: No puede introducir valores negativos");
		}
		else {
			System.out.println("Ingresando saldo......");
			saldo += cantidad;
		}
	}
	/**
	 * Muestra el dinero en el banco
	 */
	void mostrarDinero() {
		System.out.println("Sr./Sra. " + nombre +  " con DNI " + DNI + " tiene un saldo de: " + saldo + "€");
	}
	
	
}
