/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.DelegaciaDAO;

public class ServletInserirDelegacia {

    public void executar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //Cria um objeto da classe Delegacia para setar os atributos
        Delegacia delegacia = new Delegacia();

        //Atribui os valores para para os atributos de delegacia
        delegacia.setId_delegacia(Integer.parseInt(req.getParameter("id_delegacia")));
        delegacia.setNome(req.getParameter("nome"));
        delegacia.setCep(req.getParameter("cep"));
        delegacia.setCidade(req.getParameter("cidade"));
        delegacia.setBairro(req.getParameter("bairro"));
        delegacia.setEstado(req.getParameter("estado"));
   
        //Cria um objeto da classe DelegaciaDAO para executar a operação de inclusão
        DelegaciaDAO dao = new DelegaciaDAO();

        //Efetua a operação de inclusão
        dao.inserir(delegacia);

        RequestDispatcher rd = req.getRequestDispatcher("/inserido.jsp");
        rd.forward(req, resp);
    }
}
