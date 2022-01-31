
package conexion_bd;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Juan Nicolas Morales
 */
public class Conexion {
       Connection con =null;
       
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root","");

        }catch (Exception e) {
            System.out.println("Error...");
        }
           return con;
    }
    
    
     
}
