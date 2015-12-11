/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package persistencia;

import java.sql.*;
import java.util.*;

import modelo.Policial;

public class PolicialDAO {
    private Connection con;
    public PolicialDAO(){
        
        this.con = new ConnectionFactory().getConnection();
        
    }
    
    public void inserir(Policial policial){
        String sql = "insert into policial (num_id, nome, titulo, cep, cidade, bairro, estado, delegacia) "
                   + "values(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            
            p.setInt(1, policial.getNum_id());
            p.setString(2, policial.getNome());
            p.setString(3, policial.getTitulo());
            p.setString(4, policial.getCep());
            p.setString(5, policial.getCidade());
            p.setString(6, policial.getBairro());
            p.setString(7, policial.getEstado());
            p.setInt(8, policial.getDelegacia());
            
            p.execute();

            con.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Policial Gravado!");
    }
    
    public void alterar(Policial policial){
    String sql = "update policial set num_id=?, nome=?,titulo=?,cep=?,cidade=?,bairro=?,estado=?,delegacia=? where id_policial=?";
    try{
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, policial.getNum_id());
        ps.setString(2, policial.getNome());
        ps.setString(3, policial.getTitulo());
        ps.setString(4, policial.getCep());
        ps.setString(5, policial.getCidade());
        ps.setString(6, policial.getBairro());
        ps.setString(7, policial.getEstado());
        ps.setInt(8, policial.getDelegacia());
        ps.setInt(9, policial.getId_policial());

        ps.execute();

        con.close();

    }catch(SQLException e){
        throw new RuntimeException(e);
    }
    System.out.println("Policial Alterado!");
    }
    
    public void excluir(Policial policial){
        String sql = "delete from policial where id_policial=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, policial.getId_policial());

            ps.execute();

            con.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Policial Excluido!");
    }

    public List<Policial> getLista(){
        String sql = "select * from policial";
        List<Policial> policiais = new ArrayList<Policial>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs == null){
                return null;
            }

            while(rs.next()){
                Policial p = new Policial();
                p.setId_policial(rs.getInt(1));
                p.setNum_id(rs.getInt(2));
                p.setNome(rs.getString(3));
                p.setTitulo(rs.getString(4));
                p.setCep(rs.getString(5));
                p.setCidade(rs.getString(6));
                p.setBairro(rs.getString(7));
                p.setEstado(rs.getString(8));
                p.setDelegacia(rs.getInt(9));
            
                policiais.add(p);
            }
            return policiais;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
