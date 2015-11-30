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

import modelo.TelefonePolicial;

public class TelefonePolicialDAO {

    private Connection con;
    public TelefonePolicialDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(TelefonePolicialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserir(TelefonePolicial telefonePolicial){
        String sql = "insert into telefone_policial(telefone, id_policial) values(?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, telefonePolicial.getTelefone());
            ps.setInt(2, telefonePolicial.getId_policial());
            
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void alterar(TelefonePolicial telefonePolicial){
        String sql = "update telefone_policial set telefone=? where id_delegacia=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, telefonePolicial.getTelefone());
            ps.setInt(2, telefonePolicial.getId_policial());
            
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void excluir(TelefonePolicial telefonePolicial){
        String sql = "delete from telefone_policial where telefone=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, telefonePolicial.getTelefone());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<TelefonePolicial> getLista(){
        String sql = "select * from telefone_policial";
        List<TelefonePolicial> telefonesPolicial = new ArrayList<TelefonePolicial>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                TelefonePolicial tp = new TelefonePolicial();
                tp.setTelefone(rs.getInt(1));
                tp.setId_policial(rs.getInt(2));
                telefonesPolicial.add(tp);
            }
            return telefonesPolicial;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

