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

import modelo.CategoriaDelegacia;
import modelo.Deposito;

public class CategoriaDelegaciaDAO {
    private Connection con;
    public CategoriaDelegaciaDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        }catch (Exception ex){
            Logger.getLogger(CategoriaDelegaciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(CategoriaDelegacia categoriaDelegacia){
        String sql = "insert into categoria_delegacia (id_categoria, nome) values(?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, categoriaDelegacia.getId_categoria());
            ps.setString(2, categoriaDelegacia.getNome());
            
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
    
    public void excluir(CategoriaDelegacia categoriaDelegacia){
        String sql = "delete from categoria_delegacia where id_categoria=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, categoriaDelegacia.getId_categoria());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<CategoriaDelegacia> getLista(){
        String sql = "select * from categoria_delegacia";
        List<CategoriaDelegacia> categoriasDelegacia = new ArrayList<CategoriaDelegacia>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                CategoriaDelegacia cd = new CategoriaDelegacia();
                cd.setId_categoria(rs.getInt(1));
                categoriasDelegacia.add(cd);
            }
            return categoriasDelegacia;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
