package ejercicio2;

public class Main {

	public static void main(String[] args) {
		String titulo[] = {"titulo", "Las increibles aventuras de Juan Perez", "titulo2"};
		String autor[] = {"autor", "Juan de las Cabezas de San Juan Dominguez de la Huerta Perez", "autor2"};
		int ejemplares[] = {2, 4, 7};
		int prestados[] = {5, 3, 0};
		
		//Libro libro1 = new Libro();
		Libro libro2 = new Libro(titulo, autor, ejemplares, prestados);
		
		//System.out.println(libro1.prestamo("titulo", "autor") ? "Recoga su libro por favor" : "No puede realizar ese prestamo ahora mismo");
		//System.out.println(libro1.devolucion("titulo", "autor")  ? "Gracias por devolverlo" : "No puede realizar esa devolucion");
		
		System.out.println();
		System.out.println(libro2.prestamo("titulo", "autor") ? "Recoga su libro por favor" : "No puede realizar ese prestamo ahora mismo");
		System.out.println(libro2.devolucion("titulo", "autor")  ? "Gracias por devolverlo" : "No puede realizar esa devolucion");

	}

}
