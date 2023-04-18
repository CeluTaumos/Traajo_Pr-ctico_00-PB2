package ar.edu.unlam.pb2.interfazSpotify;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominioSpotify.Sistema;
import ar.edu.unlam.pb2.dominioSpotify.Usuarios;

public class ReproductorDeMusicaMenuTest {

	@Test
	public void queSeHayaCreadoElObjetoTipoSistema() {
//		fail("Not yet implemented");

		// datos de entrada
		Sistema spotyPirata;

		// ejecucion
		spotyPirata = new Sistema("spotyPirata", 5, 10);

		// verificacion

		assertNotNull(spotyPirata);

	}

	@Test
	public void queSeHayanGuardadoLosDatosCorrectamente() {
		// datos de entrada
		String nombre = "pepito";
		String contra = "contrasenia";
		String correo = "hola@estoesunaprueba.com";
		Sistema spotyPirata;

		// ejecucion
		spotyPirata = new Sistema("spotyPirata", 5, 10);
		assertTrue(spotyPirata.guardarDatos(nombre, correo, contra));

		// verificacion

		assertNotNull(spotyPirata);

	}

	@Test
	public void queElNombreDelUsuarioSeHayaGuardadoCorrectamente() {
		// datos de entrada
		Sistema spotyPirata;
		Usuarios user;
		String nombre = "pepito";
		String contra = "contrasenia";
		String correo = "hola@estoesunaprueba.com";

		// ejecucion
		spotyPirata = new Sistema("spotyPirata", 5, 10);
		user = new Usuarios(nombre, contra, correo);

		assertEquals(user.getNombreDelUsuario(), nombre);

	}

	@Test
	public void queElNombreDelUsuarioSeHayaGuardadoIncorrectamente() {
		// datos de entrada
		Sistema spotyPirata;
		Usuarios user;
		String nombre = "pepito";
		String contra = "contrasenia";
		String correo = "hola@estoesunaprueba.com";
		String nombreMalo = "mica";

		// ejecucion
		spotyPirata = new Sistema("spotyPirata", 5, 10);
		user = new Usuarios(nombre, contra, correo);

		assertEquals(user.getNombreDelUsuario(), nombreMalo);

	}
}
