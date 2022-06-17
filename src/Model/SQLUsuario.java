
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLUsuario {
    
    public boolean registrar(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        try{
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("insert into usuario (nombre,contraseña,correo,tarjeta) values (?,?,?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getTarjeta());
            ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            return false;
        }
    } 
    
    // Here we verify data duplication
    public int verificarNombre(String nombre){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select count(id) from usuario where nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        }catch(SQLException ex){
            return 1;
        }
    } 
    
     public int verificarPassword(String passwd){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select count(id) from usuario where contraseña = ?");
            ps.setString(1, passwd);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        }catch(SQLException ex){
            return 1;
        }
    } 
    
    public int verificarCorreo(String email){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select count(id) from usuario where correo = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        }catch(SQLException ex){
            return 1;
        }
    } 
    
    
    public boolean iniciarSesion(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select id,nombre,contraseña,correo,tarjeta from usuario where nombre = ?");
            ps.setString(1, usuario.getNombre());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(usuario.getContraseña().equals(rs.getString("contraseña"))){
                    ps = conexion.prepareStatement("update usuario set ultima_sesion = ? where nombre = ?");
                    ps.setString(1, usuario.getUltima_sesion());
                    ps.setString(2, rs.getString("nombre"));
                    ps.executeUpdate();
                    
                    usuario.setId(rs.getInt("id"));
                    usuario.setNombre(rs.getString("nombre"));
                    return true;
                }
                else {
                    return false;
                }
            }
            return false;
        }catch(SQLException ex){
            return false;
        }
    } 
}
