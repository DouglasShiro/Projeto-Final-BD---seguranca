/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package persistencia;

import java.sql.*;
import java.util.logging.*;
import java.util.*;

import modelo.TelefoneDelegacia;

public class TelefoneDelegaciaDAO {

    private Connection con;
    public TelefoneDelegaciaDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(TelefoneDelegaciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserir(TelefoneDelegacia telefoneDelegacia){
        String sql = "insert into telefone_delegacia(telefone, id_delegacia) values(?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, telefoneDelegacia.getTelefone());
            ps.setInt(2, telefoneDelegacia.getId_delegacia());
            
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void alterar(TelefoneDelegacia telefoneDelegacia){
        String sql = "update telefone_delegacia set telefone=? where id_delegacia=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, telefoneDelegacia.getTelefone());
            ps.setInt(2, telefoneDelegacia.getId_delegacia());
            
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void excluir(TelefoneDelegacia telefoneDelegacia){
        String sql = "delete from telefone_delegacia where telefone=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, telefoneDelegacia.getTelefone());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<TelefoneDelegacia> getLista(){
        String sql = "select * from telefone_delegacia";
        List<TelefoneDelegacia> telefonesDelegacia = new ArrayList<TelefoneDelegacia>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                TelefoneDelegacia td = new TelefoneDelegacia();
                td.setTelefone(rs.getInt(1));
                td.setId_delegacia(rs.getInt(2));
                telefonesDelegacia.add(td);
            }
            return telefonesDelegacia;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

