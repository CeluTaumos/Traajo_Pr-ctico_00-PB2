package ar.edu.unlam.pb2.interfazSpotify;

import java.util.Scanner;

import ar.edu.unlam.pb2.dominioSpotify.Sistema;

public class ReproductorDeMusicaMenu {

	//a ver si funca esto
	//CONSTANTES DE MENU
	private static final int CREAR_NUEVO_USER = 1;
	private static final int LOGUEARSE = 2;
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// CLASES: USUARIOS/PLAYLIST/-SPOTYPIRATA

		// CREO EL SISTEMA QUE VA A CONTENER LAS PLAYLIST Y LOS USERS
		Sistema spotyPirata = new Sistema("spotyPirata", 5, 10);

//		El programa debe contar con el siguiente menú de opciones : 
//	
//			b. Crear una lista de reproducción 
//			c. c. Agregar canciones a la lista 
//			d. Reproducir una lista de reproducción. 
//			e. Del tratamiento del sonido debemos olvidarnos porque eso lo resolverá 
//			un equipo específico, pero a nosotros nos toca garantizar que se visualice 
//			por pantalla la información de la lista: 
//			i. El listado de las canciones 
//			ii. La cantidad de canciones 
//			iii. La duración de la lista (Se debe mostrar en el formato mm:ss

		// MENU
		mostrarMensaje("Welcome : ");
		mostrarMensaje("Ingrese (1) para registrarse" + "n/Ingrese (2) para loguearse");

		int opcion = teclado.nextInt();

		switch (opcion) {

		case CREAR_NUEVO_USER:
			mostrarMensaje("Complete los datos");
			guardarDatos(spotyPirata);
	   break;
	   
		case LOGUEARSE:
			mostrarMensaje("Bienvenido :)");
			loggin(spotyPirata);
		break;

		}

	}

	private static boolean loggin(Sistema spotyPirata) {
		mostrarMensaje("Ingrese su nombre");
		String nombre=teclado.next();
		mostrarMensaje("Ingrese su contraseña");
		String contra = teclado.next();

		spotyPirata.loggin(nombre,contra);
		return false;
		
	}

	private static void guardarDatos(Sistema spotyPirata) {
		
		mostrarMensaje("Bienvenido,ingrese nombre");
		String nombre = teclado.next();
		mostrarMensaje("Ingrese un correo");
		String correo = teclado.next();
		mostrarMensaje("Ingrese una contraseña");
		String contra = teclado.next();

	  boolean sePudoGuardar= spotyPirata.guardarDatos(nombre, correo, contra);
	if (sePudoGuardar) {
		mostrarMensaje("Datos Guardados Correctamente");
		
	}else {
		mostrarMensaje("Datos no se pudieron guardar");
	}

	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);

	}

}
