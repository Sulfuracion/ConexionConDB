/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basededatos;

/**
 *
 * @author 2dam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static basededatos.Conexion.con;
import com.mysql.cj.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;  

/**
 *
 * @author 2dam
 */
    public class Conexion {
    PreparedStatement pr;
    //declara la conexion
    public static Connection con;
    //datos de conexion DB
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="1234";
    private static final String url="jdbc:mysql://localhost:3306/agenda?characterEncoding=utf8";

    //conectarse a la DB
   
    public Connection conectar() throws ClassNotFoundException{
        con= null;
        try{
            //Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                //System.out.print("No se conecta");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error" + e.toString());
            
        }/* catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    
    return con;
    
    } 
    
    public int Add(String nombre, String apellidos, String tlfo, String mial, String direccion){
        int res=0;
        try {
            pr=con.prepareStatement("insert into Personas(Nombre, Apellidos, Tlf1, Email, Dirección) values (?,?,?,?,?)");
            pr.setString(1, nombre);
            pr.setString(2, apellidos);
            pr.setString(3, tlfo);
            pr.setString(4, mial);
            pr.setString(5, direccion);
            res=pr.executeUpdate();
            System.out.print(" Persona registrada correctamente");
        } catch (SQLException ex) {
            System.out.print("no registra");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return res;
      
    }
    

    
    public int delete(String codigo){
        int res=0;
        try{
            pr=con.prepareStatement("delete from Personas where Código ='" + codigo + "'");
            res=pr.executeUpdate();
             System.out.print(" Persona eliminada correctamente");
        } catch (SQLException ex) {
            System.out.print(" no se pudo elimiar");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return res;
    }
    
    
}
