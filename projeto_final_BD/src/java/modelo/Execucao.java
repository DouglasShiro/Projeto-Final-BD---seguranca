/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

import javax.servlet.http.*;

public interface Execucao {
    void executar(HttpServletRequest req, HttpServletResponse res) throws Exception;

}
