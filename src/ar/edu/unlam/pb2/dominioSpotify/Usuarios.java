package ar.edu.unlam.pb2.dominioSpotify;

public class Usuarios {
	
	//ATRIBUTOS
	private String nombreDelUsuario;
	private String correo;
	private String contra;
	public Usuarios(String nombreDelUsuario, String correo, String contra) {
		super();
		this.nombreDelUsuario = nombreDelUsuario;
		this.correo = correo;
		this.contra = contra;
	}
	public String getNombreDelUsuario() {
		return nombreDelUsuario;
	}
	public void setNombreDelUsuario(String nombreDelUsuario) {
		this.nombreDelUsuario = nombreDelUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}

	

}
