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

import modelo.Deposito;

public class DepositoDAO {
    private Connection con;
    public DepositoDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        }catch (Exception ex){
            Logger.getLogger(DepositoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(Deposito deposito){
        String sql = "insert into deposito (id_deposito, cep, cidade, bairro, estado) values(?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, deposito.getId_deposito());
            ps.setString(2, deposito.getCep());
            ps.setString(3, deposito.getCidade());
            ps.setString(4, deposito.getBairro());
            ps.setString(5, deposito.getEstado());

            ps.execute();

            ps.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void alterar(Deposito deposito){
    String sql = "update deposito set telefone=? where id_deposito=?";
    try{
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, deposito.getChefe());
        ps.setInt(2, deposito.getId_deposito());

        ps.execute();

        ps.close();

    }catch(SQLException e){
        throw new RuntimeException(e);
    }
}

    public void excluir(Deposito deposito){
        String sql = "delete from deposito where id_deposito=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, deposito.getId_deposito());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Deposito> getLista(){
        String sql = "select * from deposito";
        List<Deposito> depositos = new ArrayList<Deposito>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                Deposito d = new Deposito();
                d.setId_deposito(rs.getInt(1));
                d.setCep(rs.getString(2));
                d.setCidade(rs.getString(3));
                d.setBairro(rs.getString(4));
                d.setEstado(rs.getString(5));
                depositos.add(d);
            }
            return depositos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
