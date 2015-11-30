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

import modelo.Delegacia;

public class DelegaciaDAO {
    private Connection con;
    public DelegaciaDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        }catch (Exception ex){
            Logger.getLogger(DelegaciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(Delegacia delegacia){
        String sql = "insert into delegacia (id_delegacia, nome, cep, cidade, bairro, estado, categoria, delegado) values(?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, delegacia.getId_delegacia());
            ps.setString(2, delegacia.getNome());
            ps.setString(3, delegacia.getCep());
            ps.setString(4, delegacia.getCidade());
            ps.setString(5, delegacia.getBairro());
            ps.setString(6, delegacia.getEstado());
            ps.setInt(7, delegacia.getCategoria());
            ps.setInt(8, delegacia.getDelegado());
            
            ps.execute();

            ps.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void excluir(Delegacia delegacia){
        String sql = "delete from delegacia where id_delegacia=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, delegacia.getId_delegacia());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Delegacia> getLista(){
        String sql = "select * from delegacia";
        List<Delegacia> delegacias = new ArrayList<Delegacia>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                Delegacia d = new Delegacia();
                d.setId_delegacia(rs.getInt(1));
                d.setNome(rs.getString(2));
                d.setCep(rs.getString(3));
                d.setCidade(rs.getString(4));
                d.setBairro(rs.getString(5));
                d.setEstado(rs.getString(6));
                d.setCategoria(rs.getInt(7));
                d.setDelegado(rs.getInt(8));
                delegacias.add(d);
            }
            return delegacias;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
