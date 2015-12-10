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
import persistencia.PolicialDAO;

public class ServletInserirPolicial implements Execucao {

    public void executar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //Cria um objeto da classe Policial para setar os atributos
        Policial policial = new Policial();

        //Atribui os valores para para os atributos de policial
        policial.setId_policial(Integer.parseInt(req.getParameter("id_policial")));
        policial.setNome(req.getParameter("nome"));
        policial.setTitulo(req.getParameter("titulo"));
        policial.setCep(req.getParameter("cep"));
        policial.setCidade(req.getParameter("cidade"));
        policial.setBairro(req.getParameter("bairro"));
        policial.setEstado(req.getParameter("estado"));
   
        //Cria um objeto da classe PolicialDAO para executar a operação de inclusão
        PolicialDAO dao = new PolicialDAO();

        //Efetua a operação de inclusão
        dao.inserir(policial);

        RequestDispatcher rd = req.getRequestDispatcher("/inserido.jsp");
        rd.forward(req, resp);
    }
}
