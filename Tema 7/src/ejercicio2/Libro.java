package ejercicio2;

public class Libro {
	String titulo[];
	String autor[];
	int ejemplares[];
	int prestados[];
	
	public Libro() {
		super();
	}

	public Libro(String[] titulo, String[] autor, int[]ejemplares, int[]prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	boolean prestamo(String titulo, String autor) {
		boolean prestamo = false;
		int i = 0;
		
		while(i<this.titulo.length || (this.titulo[i] == titulo && this.autor[i] == autor)) {
			i++;
		}
		
		if((this.titulo[i] == titulo && this.autor[i] == autor) && ejemplares[i]>0) {
			prestamo = true;
			ejemplares[i]--;
			prestados[i]++;
		}
		
		return prestamo;
	}
	
	boolean devolucion(String titulo, String autor) {
		boolean devolucion = false;
		int i = 0;
		
		while(i<this.titulo.length || (this.titulo[i] == titulo && this.autor[i] == autor)) {
			i++;
		}
		
		if((this.titulo[i] == titulo && this.autor[i] == autor) && prestados[i]>0) {
			devolucion = true;
			ejemplares[i]++;
			prestados[i]--;
		}
		
		return devolucion;
	}
	
}
