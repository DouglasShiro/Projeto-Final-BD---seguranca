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

import modelo.Ocorrencia;

public class OcorrenciaDAO {
    private Connection con;
    public OcorrenciaDAO(){
        
        this.con = new ConnectionFactory().getConnection();
        
    }
    
    public void inserir(Ocorrencia ocorrencia){
        String sql = "insert into ocorrencia (num_ocorrencia, observacao, policial, categoria, bairro) "
                   + "values(?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, ocorrencia.getNum_ocorrencia());
            ps.setString(2, ocorrencia.getObservacao());
            ps.setInt(3, ocorrencia.getPolicial());
            ps.setInt(4, ocorrencia.getCategoria());
            ps.setInt(5, ocorrencia.getBairro());
            
            ps.execute();

            con.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Ocorrencia Gravada!");
    }
    
    public void alterar(Ocorrencia ocorrencia){
        String sql = "update ocorrencia set num_ocorrencia=?, observacao=?, policial=?, categoria=?, bairro=?"
                    + "where id_ocorrencia=?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, ocorrencia.getNum_ocorrencia());
            ps.setString(2, ocorrencia.getObservacao());
            ps.setInt(3, ocorrencia.getPolicial());
            ps.setInt(4, ocorrencia.getCategoria());
            ps.setInt(5, ocorrencia.getBairro());
            ps.setInt(6, ocorrencia.getId_ocorrencia());

            ps.execute();

            con.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        System.out.println("Ocorrencia Alterada!");
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
        System.out.println("Ocorrencia Excluida!");
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
                
                Ocorrencia o = new Ocorrencia();
                o.setId_ocorrencia(rs.getInt(1));
                o.setNum_ocorrencia(rs.getInt(2));
                o.setObservacao(rs.getString(3));
                o.setPolicial(rs.getInt(4));
                o.setCategoria(rs.getInt(5));
                o.setBairro(rs.getInt(6));
                
                ocorrencias.add(o);
            }
            return ocorrencias;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
