package ejercicio4;
/**
 * Clase con las funciones de Articulo
 * @author Jaime Sevilla
 *
 */
public class Articulo {
	/**
	 * Nombre del articulo
	 */
	private String nombre;
	/**
	 * Precio del Articulo
	 */
	private double precio;
	/**
	 * IVA
	 */
	public static final int IVA = 21;
	/***
	 * Cantidades restantes del articulo
	 */
	private int cuantosQuedan;
	
	/**
	 * Constructor con todos los parametros
	 * @param nombre Nombre dado por el usuario
	 * @param precio Precio dado por el usuario
	 * @param cuantosQuedan Cantidades restantes dadas por el usurio
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	/**
	 * Imprime los datos del producto
	 */
	void imprime() {
		System.out.println("El producto " + nombre + " tiene un precio de " + (precio+(precio*(IVA/100))) + " y quedan " + cuantosQuedan + " en el almacen");
	}
	/**
	 * Calcula el precio del producto con el IVA incluido
	 * @return Devuelve el precio con IVA
	 */
	double getPVP() {
		double precioiva;
		
		precioiva = precio+ precio*IVA/100;
		
		return precioiva;
	}
	/**
	 * Calcula el precio del prudcto con IVA y descuento
	 * @param descuento Descuento dado por el usuario
	 * @return Devuelve el Precio del producto con el descuento dado por el usuario
	 */
	double getPVPDescuento(double descuento) {
		double precioiva;
		double preciodescuento;
		
		precioiva = precio+(precio*(IVA/100));
		
		preciodescuento = precioiva - precioiva*(descuento/100);
		
		return preciodescuento;
	}
	/**
	 * Comprueba si se puede vender el producto
	 * @param cantidad Cantidad que se desea comprar
	 * @return Devuelve truo o false dependiendo si es posible la compra
	 */
	boolean vender(int cantidad) {
		boolean vender = false;
		if(cuantosQuedan-cantidad>=0) {
			vender = true;
			cuantosQuedan-=cantidad;
		}
		return vender;
	}
	/**
	 * Añade unidades del producto
	 * @param cantidad Cantidad a añadir dada por el usuario
	 */
	void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
		System.out.println("Se han añadido " + cantidad + " unidades");
	}
	
	
	
}
