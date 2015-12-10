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

import modelo.CategoriaItem;
import modelo.Deposito;

public class CategoriaItemDAO {
    private Connection con;
    public CategoriaItemDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        }catch (Exception ex){
            Logger.getLogger(CategoriaItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(CategoriaItem categoriaItem){
        String sql = "insert into categoria_item (id_categoria, nome) values(?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, categoriaItem.getId_categoria());
            ps.setString(2, categoriaItem.getNome());
            
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
    
    public void excluir(CategoriaItem categoriaItem){
        String sql = "delete from categoria_item where id_categoira=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, categoriaItem.getId_categoria());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<CategoriaItem> getLista(){
        String sql = "select * from categoria_item";
        List<CategoriaItem> categoriaItens = new ArrayList<CategoriaItem>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                CategoriaItem ci = new CategoriaItem();
                ci.setId_categoria(rs.getInt(1));
                ci.setNome(rs.getString(2));
                categoriaItens.add(ci);
            }
            return categoriaItens;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }  
}
