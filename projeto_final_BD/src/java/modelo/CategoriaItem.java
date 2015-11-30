/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
 CREATE TABLE categoria_item
	(
	id_categoria		integer(10) not null,
        nome				varchar(20) not null,
        PRIMARY KEY (id_categoria)
        );

 */
public class CategoriaItem {
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
