import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
	private String email;
	private String pass;
	
	public Login(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Usuario ingresar() throws SQLException {
		
		Usuario user = null; 
		Conexion conexion = new Conexion();
		
		String consulta = "select * from usuario where email_usuario="+"'"+this.email+"'"+
				" and contraseña_usuario ="+"'"+this.pass+"'";
		ResultSet rs = conexion.devuelveConsulta(consulta);
		
		while(rs.next()) {
			System.out.println("Ingreso exitoso!");
			
			int id_user = rs.getInt("id_usuario");
			String nombre = rs.getString("nombre_usuario");
			String apellido = rs.getString("apellido_usuario"); 
			String email = rs.getString("email_usuario");
			String pass = rs.getString("contraseña_usuario");
			int tipo = rs.getInt("id_tipo_usuario");
			boolean tieneDesc = rs.getBoolean("tiene_descuento");
			user = new Usuario(id_user,nombre,apellido,email,pass,tipo,tieneDesc);
		}
		
		return user;
		
	}

}
