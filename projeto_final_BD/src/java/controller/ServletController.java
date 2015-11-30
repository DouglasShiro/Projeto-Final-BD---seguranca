/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Execucao;


public class ServletController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String param = (req.getParameter("execucao")!=null)?req.getParameter("execucao"):"";
        String nomeDaClasse = "modelo."+param;

        try {
            Class classe = Class.forName(nomeDaClasse);
            Execucao execucao = (Execucao)classe.newInstance();
            execucao.executar(req, resp);

        } catch (Exception e) {
            throw new ServletException("Erro de execução ",e);
        }
    }
}

