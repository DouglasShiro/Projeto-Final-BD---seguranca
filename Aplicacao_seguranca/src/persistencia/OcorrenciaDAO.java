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

import modelo.Ocorrencia;

public class OcorrenciaDAO {
    private Connection con;
    public OcorrenciaDAO(){
        
        this.con = new ConnectionFactory().getConnection();
        
    }
    
    public void inserir(Ocorrencia ocorrencia){
        String sql = "insert into ocorrencia (cpf, nome, sexo, estado_civil, data_nascimento, cep, cidade, bairro, estado) "
                   + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            
            p.setString(1, ocorrencia.getCpf());
            p.setString(2, ocorrencia.getNome());
            p.setString(3, ocorrencia.getSexo());
            p.setString(4, ocorrencia.getEstado_civil());
            p.setString(5, ocorrencia.getData_nascimento());
            p.setString(6, ocorrencia.getCep());
            p.setString(7, ocorrencia.getCidade());
            p.setString(8, ocorrencia.getBairro());
            p.setString(9, ocorrencia.getEstado());
            
            p.execute();

            con.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Ocorrencia Gravado!");
    }
    
    public void alterar(Ocorrencia ocorrencia){
    String sql = "update ocorrencia set cpf=?, nome=?, sexo=?, estado_civil=?, data_nascimento=?, cep=?, cidade=?, bairro=?, estado=?, delegacia=? where id_ocorrencia=?";
    try{
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, ocorrencia.getCpf());
        ps.setString(2, ocorrencia.getNome());
        ps.setString(3, ocorrencia.getSexo());
        ps.setString(4, ocorrencia.getEstado_civil());
        ps.setString(5, ocorrencia.getData_nascimento());
        ps.setString(6, ocorrencia.getCep());
        ps.setString(7, ocorrencia.getCidade());
        ps.setString(8, ocorrencia.getBairro());
        ps.setString(9, ocorrencia.getEstado());
        ps.setInt(10, ocorrencia.getId_ocorrencia());
        
        ps.execute();

        con.close();

    }catch(SQLException e){
        throw new RuntimeException(e);
    }
    System.out.println("Ocorrencia Alterado!");
    }
    
    public void excluir(Ocorrencia ocorrencia){
        String sql = "delete from ocorrencia where id_ocorrencia=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, ocorrencia.getId_ocorrencia());

            ps.execute();

            con.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Excluido!");
    }

    public List<Ocorrencia> getLista(){
        String sql = "select * from ocorrencia";
        List<Ocorrencia> ocorrencias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

                
            if(rs == null){
                return null;
            }

            while(rs.next()){
                
                Ocorrencia c = new Ocorrencia();
                c.setId_ocorrencia(rs.getInt(1));
                c.setCpf(rs.getString(2));
                c.setNome(rs.getString(3));
                c.setSexo(rs.getString(4));
                c.setEstado_civil(rs.getString(5));
                c.setData_nascimento(rs.getString(6));
                c.setCep(rs.getString(7));
                c.setCidade(rs.getString(8));
                c.setBairro(rs.getString(9));
                c.setEstado(rs.getString(10));
                
                ocorrencias.add(c);
            }
            return ocorrencias;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
