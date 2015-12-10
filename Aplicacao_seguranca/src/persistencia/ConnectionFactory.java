/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package persistencia;

import java.sql.*;

public class ConnectionFactory {   

    public Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguranca","root","DS1108");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        //} catch (ClassNotFoundException e) {
          //  System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Conexão aberta.");
        
        return con;
    }
}