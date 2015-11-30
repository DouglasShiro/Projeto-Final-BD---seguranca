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
            String url = "";
            url += "jdbc:mysql://127.0.0.1/seguranca?";
            url += "user=root&password=DS1108";
            con = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Conexão aberta.");
        return con;
    }
}