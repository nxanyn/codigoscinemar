import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

      public class IniciarUsuario {
      private Usuario user;
      private int opcion;
      private Conexion conexion;
      
      public IniciarUsuario (Usuario user) {
	         this.user=user;
	         this.opcion=0;
	         this.conexion=new Conexion();
 }
      
      public void visibilizar() throws SQLException {
    	  System.out.println("Bienvenido/a "+this.user.getNombre()
  		+" "+this.user.getApellido());
  		
  		System.out.println("1 - Crear una reserva.\r\n"
  				+ "2 - Observar mis reservas.\r\n"
  				+ "3 - Ver el historial de mis entradas.\r\n");
  		System.out.println("Elige una opcion");
  		Scanner teclado = new Scanner(System.in);
  		this.opcion=teclado.nextInt();
  		
  		switch (this.opcion) {
  		case 1 : 
  			
  			System.out.println("Qu? pelicula deseas reservar para hoy?");
  			String sql = "select titulo_pelicula, resumen_pelicula from pelicula";
  			ResultSet rs = conexion.devuelveConsulta(sql);
  			
  			while(rs.next()) {
  	            
  				String nombre= rs.getString("titulo_pelicula");
  				String resumen= rs.getString("resumen_pelicula");
  				System.out.println("pelicula:"+ " " +nombre);
  				System.out.println("sinopsis:"+ " " +resumen);
  				System.out.println();
  			}
  			
  			//implementacion
  			break;
  		case 2 : 
  			//implementacion
  			break;
  		case 3 : 
  			//implementacion
  			break;
  		default:
  			System.out.println("algo salio mal");
  		}
  	}
     
 
}
