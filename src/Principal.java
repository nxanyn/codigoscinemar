import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
           
	       public static void main(String[] args) throws SQLException {
	    	   Scanner teclado= new Scanner (System.in);
	    	   System.out.println("Cinemar");
	    	   System.out.println("Ingrese una opci�n:");
	    	   System.out.println("1- Ingresar\n2- Registrarse");
	    	   int opcion=teclado.nextInt();
	       
	       if(opcion==1) {
				System.out.println("Ingrese email: ");
				String email = teclado.next();
				
				System.out.println("Ingrese contrase�a: ");
				String contra = teclado.next();
				
				Login login = new Login(email,contra);
				Usuario user = login.ingresar();
				
				if(user != null) {
					IniciarUsuario ini = new IniciarUsuario(user);
					ini.visibilizar();
				}
				else {
					System.out.println("Ingreso no exitoso!!");
				}	
			}
			else {
				System.out.println("Registro");
				Registro registro1 = new Registro();
				registro1.validaDatos();
			}
}
}
