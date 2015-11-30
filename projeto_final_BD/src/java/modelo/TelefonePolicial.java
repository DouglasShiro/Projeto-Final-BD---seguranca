/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
CREATE TABLE telefone_policial
	(
	telefone			integer(10) not null,
        id_policial			integer(10) not null,
        PRIMARY KEY (telefone, id_policial),
        FOREIGN KEY (id_policial) REFERENCES policial(id_policial) ON DELETE CASCADE
        );

 */
public class TelefonePolicial {
    //Lista de atributos
    private int telefone;
    private int id_policial;

    //Metodos get/set
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getId_policial() {
        return id_policial;
    }

    public void setId_policial(int id_policial) {
        this.id_policial = id_policial;
    }
    
}
