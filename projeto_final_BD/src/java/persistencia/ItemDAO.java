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

import modelo.Item;

public class ItemDAO {

    private Connection con;
    public ItemDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserir(Item item){
        String sql = "insert into item(id_item, nome, categoria) values(?,?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, item.getId_item());
            ps.setString(2, item.getNome());
            ps.setInt(3, item.getCategoria());
            
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void alterar(Item item){
        String sql = "update item set nome=?,categoria=? where id_item=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, item.getNome());
            ps.setInt(2, item.getCategoria());
            ps.setInt(3, item.getId_item());
            
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void excluir(Item item){
        String sql = "delete from item where id_item=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, item.getId_item());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Item> getLista(){
        String sql = "select * from item";
        List<Item> itens = new ArrayList<Item>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                Item i = new Item();
                i.setId_item(rs.getInt(1));
                i.setNome(rs.getString(2));
                i.setCategoria(rs.getInt(3));
                itens.add(i);
            }
            return itens;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
