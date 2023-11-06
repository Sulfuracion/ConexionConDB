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
//import static BasedeDatos.conexion.con;
import com.mysql.cj.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class conexion {
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
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error" + e.toString());
            
        }/* catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    
    return con;
    
    } 
    
    
}
