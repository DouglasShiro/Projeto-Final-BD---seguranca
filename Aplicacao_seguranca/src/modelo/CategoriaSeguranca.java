/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
CREATE TABLE categoria_seguranca
	(
		id_categoria		integer unsigned not null auto_increment,
        nivel				varchar(30) not null,
        PRIMARY KEY (id_categoria)
        );
*/
public class CategoriaSeguranca {
    //Lista de atributos
    private int id_categoria;
    private String nivel;
    
    //Metodos get/set

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
