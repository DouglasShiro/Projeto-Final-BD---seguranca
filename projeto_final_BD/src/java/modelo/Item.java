/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
CREATE TABLE item
	(
	id_item				integer(10) not null,
	nome				varchar(20) not null,
        categoria			integer(10) not null,
        PRIMARY KEY (id_item),
        FOREIGN KEY (categoria) REFERENCES categoria_item(id_categoria) ON DELETE CASCADE
        );
 */
public class Item {
    //Lista de atributos
    private int id_item;
    private String nome;
    private int categoria;
    
    //Metodos get/set

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
}
