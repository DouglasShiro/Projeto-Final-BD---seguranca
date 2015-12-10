/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
CREATE TABLE categoria_ocorrencia
	(
		id_categoria		integer unsigned not null auto_increment,
        nome				varchar(30) not null,
        PRIMARY KEY (id_categoria)
        );
*/
public class CategoriaOcorrencia {
    //Lista de atributos
    private int id_categoria;
    private String nome;
    
    //Metodos get/set

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
