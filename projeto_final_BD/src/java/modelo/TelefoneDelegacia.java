/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
CREATE TABLE telefone_delegacia
	(
		telefone			integer(10) not null,
        id_delegacia		integer(10) not null,
        PRIMARY KEY (telefone, id_delegacia),
        FOREIGN KEY (id_delegacia) REFERENCES delegacia(id_delegacia) ON DELETE CASCADE
        );
*/
public class TelefoneDelegacia {
    //Lista de atributos
    private int telefone;
    private int id_delegacia;
    
    //Metodos get/set

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getId_delegacia() {
        return id_delegacia;
    }

    public void setId_delegacia(int id_delegacia) {
        this.id_delegacia = id_delegacia;
    }
    
    
}
