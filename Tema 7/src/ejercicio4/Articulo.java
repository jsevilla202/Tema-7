package ejercicio4;

public class Articulo {
	String nombre;
	double precio;
	final int iva = 21;
	int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	void imprime() {
		System.out.println("El producto " + nombre + " tiene un precio de " + (precio+(precio*(iva/100))) + " y quedan " + cuantosQuedan + " en el almacen");
	}
	
	double getPVP() {
		double precioiva;
		
		precioiva = precio+ precio*iva/100;
		
		return precioiva;
	}
	
	double getPVPDescuento(double descuento) {
		double precioiva;
		double preciodescuento;
		
		precioiva = precio+(precio*(iva/100));
		
		preciodescuento = precioiva - precioiva*(descuento/100);
		
		return preciodescuento;
	}
	
	boolean vender(int cantidad) {
		boolean vender = false;
		if(cuantosQuedan-cantidad>=0) {
			vender = true;
			cuantosQuedan-=cantidad;
		}
		return vender;
	}
	
	void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
		System.out.println("Se han añadido " + cantidad + " unidades");
	}
	
	
	
}
