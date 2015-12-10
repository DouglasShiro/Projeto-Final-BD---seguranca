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

import modelo.Policial;

public class PolicialDAO {
    private Connection con;
    public PolicialDAO(){
        try {
            this.con = new ConnectionFactory().getConnection();
        }catch (Exception ex){
            Logger.getLogger(PolicialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(Policial policial){
        String sql = "insert into policial (id_policial, nome, titulo, cep, cidade, bairro, estado) values(?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, policial.getId_policial());
            ps.setString(2, policial.getNome());
            ps.setString(3, policial.getTitulo());
            ps.setString(4, policial.getCep());
            ps.setString(5, policial.getCidade());
            ps.setString(6, policial.getBairro());
            ps.setString(7, policial.getEstado());

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
    
    public void excluir(Policial policial){
        String sql = "delete from policial where matricula=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, policial.getId_policial());

            ps.execute();

            ps.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
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
                p.setNome(rs.getString(2));
                p.setTitulo(rs.getString(3));
                p.setCep(rs.getString(4));
                p.setCidade(rs.getString(5));
                p.setBairro(rs.getString(6));
                p.setEstado(rs.getString(7));
                policiais.add(p);
            }
            return policiais;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
