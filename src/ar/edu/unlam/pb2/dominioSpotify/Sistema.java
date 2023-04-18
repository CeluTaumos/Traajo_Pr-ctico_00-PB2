package ar.edu.unlam.pb2.dominioSpotify;

public class Sistema {

	// ATRIBUTOS
	private String nombre = "";
	private int cantidad_usuarios_max;
	private int cantidad_canciones_max;
	private Usuarios[] usuariosGuardados;

	// CONSTRUCTOR
	public Sistema(String nombre, int cantidad_usuarios_max, int cantidad_canciones_max) {

		this.nombre = nombre;
		this.cantidad_usuarios_max = cantidad_usuarios_max;
		this.cantidad_canciones_max = cantidad_canciones_max;
		usuariosGuardados = new Usuarios[cantidad_usuarios_max];
	}

	public boolean guardarDatos(String nombreDelUsuario, String correo, String contra) {

		// GUARDAR NUEVO USER Y VERIFICAR QUE NO EXISTA
		Usuarios nuevo = new Usuarios(nombreDelUsuario, correo, contra);

		boolean sePudoAgregar = true;
		for (int i = 0; i < usuariosGuardados.length; i++) {
			if (usuariosGuardados[i] != null
					&& usuariosGuardados[i].getNombreDelUsuario() != nuevo.getNombreDelUsuario()
					&& usuariosGuardados[i].getCorreo() != nuevo.getCorreo()) {
				usuariosGuardados[i] = nuevo;
				
			} else {
				sePudoAgregar = false;
			}
            
		}

		return sePudoAgregar;
	}

	public boolean loggin(String nombre2, String contra) {

		Usuarios usuarioLogueado = null;
		boolean existe = false;
		for (int i = 0; i < usuariosGuardados.length; i++) {
			if (nombre2.equals(usuariosGuardados[i].getNombreDelUsuario())
					&& contra.equals(usuariosGuardados[i].getContra())) {
				usuariosGuardados[i] = usuarioLogueado;
				existe = true;

			} else {
				existe = false;
			}

		}
		return existe;
	}
}
