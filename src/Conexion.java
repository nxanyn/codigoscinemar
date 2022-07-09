import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Conexion<stmt> {
	
	  Connection conn=null;
	  Statement stmt=null;
	  
	public Conexion() {
		   final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		   final String DB_URL="jdbc:mysql://localhost:3306/NOMBREDELSCHEMA";
	       final String USER="root";
		   final String PASS="CONTRASEÑA DEL MYSQL";	
		   
    try {
    	Class.forName(JDBC_DRIVER);
    	System.out.println("Conectando a la base de datos");
    	conn=DriverManager.getConnection(DB_URL,USER,PASS);
    	
        }catch(Exception e) {
             System.out.println("Error de conexión");	
        }
    
	}
	
    public ResultSet devuelveConsulta(String sql) throws SQLException {
	 System.out.println("Creando Consulta");
		stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		return rs;
 }
 
       public void Consulta(String sql) throws SQLException {
		
		System.out.println("Creando Consulta");
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);	
		
	}
}