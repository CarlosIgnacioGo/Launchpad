
package launchpadcontroller;

import java.sql.*;

public class ConexionBD {
    Connection cn;
    Statement st;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:8080/launchpad", "root", "");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No Soportada");
    }
}
