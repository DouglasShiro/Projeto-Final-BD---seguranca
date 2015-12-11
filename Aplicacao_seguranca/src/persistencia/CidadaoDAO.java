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

import modelo.Cidadao;

public class CidadaoDAO {
    private Connection con;
    public CidadaoDAO(){
        
        this.con = new ConnectionFactory().getConnection();
        
    }
    
    public void inserir(Cidadao cidadao){
        String sql = "insert into cidadao (cpf, nome, sexo, estado_civil, data_nascimento, cep, cidade, bairro, estado) "
                   + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            
            p.setString(1, cidadao.getCpf());
            p.setString(2, cidadao.getNome());
            p.setString(3, cidadao.getSexo());
            p.setString(4, cidadao.getEstado_civil());
            p.setString(5, cidadao.getData_nascimento());
            p.setString(6, cidadao.getCep());
            p.setString(7, cidadao.getCidade());
            p.setString(8, cidadao.getBairro());
            p.setString(9, cidadao.getEstado());
            
            p.execute();

            con.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Cidadao Gravado!");
    }
    
    public void alterar(Cidadao cidadao){
    String sql = "update cidadao set cpf=?, nome=?, sexo=?, estado_civil=?, data_nascimento=?, cep=?, cidade=?, bairro=?, estado=?, delegacia=? where id_cidadao=?";
    try{
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, cidadao.getCpf());
        ps.setString(2, cidadao.getNome());
        ps.setString(3, cidadao.getSexo());
        ps.setString(4, cidadao.getEstado_civil());
        ps.setString(5, cidadao.getData_nascimento());
        ps.setString(6, cidadao.getCep());
        ps.setString(7, cidadao.getCidade());
        ps.setString(8, cidadao.getBairro());
        ps.setString(9, cidadao.getEstado());
        ps.setInt(10, cidadao.getId_cidadao());
        
        ps.execute();

        con.close();

    }catch(SQLException e){
        throw new RuntimeException(e);
    }
    System.out.println("Cidadao Alterado!");
    }
    
    public void excluir(Cidadao cidadao){
        String sql = "delete from cidadao where id_cidadao=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, cidadao.getId_cidadao());

            ps.execute();

            con.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Excluido!");
    }

    public List<Cidadao> getLista(){
        String sql = "select * from cidadao";
        List<Cidadao> cidadaos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

                
            if(rs == null){
                return null;
            }

            while(rs.next()){
                
                Cidadao c = new Cidadao();
                c.setId_cidadao(rs.getInt(1));
                c.setCpf(rs.getString(2));
                c.setNome(rs.getString(3));
                c.setSexo(rs.getString(4));
                c.setEstado_civil(rs.getString(5));
                c.setData_nascimento(rs.getString(6));
                c.setCep(rs.getString(7));
                c.setCidade(rs.getString(8));
                c.setBairro(rs.getString(9));
                c.setEstado(rs.getString(10));
                
                cidadaos.add(c);
            }
            return cidadaos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
