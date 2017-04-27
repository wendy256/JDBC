/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapplication;

import java.sql.*;

/**
 *
 * @author yazmin
 */
public class JDBCAPPLICATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println ("Carga Exitosa");

            String url = "jdbc:postgresql://localhost/practica?user=Itse&password=rosanegra256";
            Connection conn = DriverManager.getConnection(url);
            System.out.println ("Conexión Exitosa");
            Statement st = conn.createStatement(); 
            st.execute("insert into " + " registro(Nombre,Paterno,Materno, Edad)" + "values ('Wendy del Carmen','Puc','Tun','20')");
            
            conn.close();
            
        }catch (ClassNotFoundException ex) {
            System.out.println ("Error: controlador!");
            System.exit(1);        
        } catch (SQLException ex) {
            System.out.println("Error: Conexion");
            ex.printStackTrace();
        }
        // TODO code application logic here
    }
    
}

