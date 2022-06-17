
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    // Todo esto es predeterminado, se pone local host y el puerto, luego el nombre de la base de datos
    public static final String URL = "jdbc:mysql://localhost:3306/usuario?autoReconnet=true&useSSL=false&serverTimezone=UTC";
    public static final String username = "root"; // Este es el usuario de la base de datos
    public static final String password = "mantoara2310"; // Esta es la password de la base de datos
   
    
    // This is the method to do the database connection
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(URL,username,password);
            //JOptionPane.showMessageDialog(null, "Succesfull Connection","Connected Database",JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"MySQL JDBC driver no encontrado","ClassNotFoundException",JOptionPane.ERROR_MESSAGE);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error, SQLException encontrada","Conexión Erronea",JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
    
}
