/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler       10/0113681          
 */
package persistencia;

import java.sql.*;
import java.util.*;

import modelo.Bairro;

public class BairroDAO {

    private Connection con;

    public BairroDAO(){
        this.con = new ConnectionFactory().getConnection();
    }

    public void inserir(Bairro bairro){
       
        String sql = "insert into bairro(nome, categoria_seg) "
                    + "values(?,?)";
        
        System.out.println("nome: "+bairro.getNome());
        System.out.println("categoria: "+bairro.getCategoria_seg());
        
        try(PreparedStatement b = con.prepareStatement(sql)) {

            b.setString(1, bairro.getNome());
            b.setInt(2, bairro.getCategoria_seg());
            //b.setString(3, bairro.getImagem());
            
            b.execute();
            con.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Gravado!");
        
    }

    public void alterar(Bairro bairro){
        String sql = "update bairro "
                    + "set nome=?, categoria_seg=?, imagem=?"
                    + "where id_bairro=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, bairro.getNome());
            ps.setInt(1, bairro.getCategoria_seg());
            ps.setString(1, bairro.getImagem());
            ps.setInt(4, bairro.getId_bairro());
            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void excluir(Bairro bairro){
        String sql = "delete from bairro where nome=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, bairro.getNome());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Bairro> getLista(){
        String sql = "select * from bairro";
        List<Bairro> bairros = new ArrayList<Bairro>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                Bairro b = new Bairro();
                b.setId_bairro(rs.getInt(1));
                b.setNome(rs.getString(2));
                b.setCategoria_seg(rs.getInt(3));
                b.setImagem(rs.getString(4));
                bairros.add(b);
            }
            return bairros;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

