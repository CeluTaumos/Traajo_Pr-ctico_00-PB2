package ar.edu.unlam.pb2.interfazReproductor;
import java.util.Scanner;
public class ReproductorDeMusicaMenu {
static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		mostrarMensaje("Welcome");
		int opcion = teclado.nextInt();
		
		switch(opcion) {
		case 1:
			mostrarMensaje("Ingrese datos");
//			guardarDatos();
		
		}
		
		
		
	}
	
	
	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
		
	}

}
