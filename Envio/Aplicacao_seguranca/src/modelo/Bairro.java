/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler       10/0113681          
 */
package modelo;

/**
CREATE TABLE bairro
	(
		id_bairro			integer unsigned not null auto_increment,
        nome				varchar(20) not null,
        categoria_seg		integer unsigned,
        imagem				integer unsigned,
        PRIMARY KEY (id_bairro),
        FOREIGN KEY (categoria_seg) REFERENCES categoria_seguranca(id_categoria) ON DELETE SET NULL,
        FOREIGN KEY (imagem) REFERENCES imagem(id_imagem) ON DELETE SET NULL
        );

*/
public class Bairro {
    //Lista de atributos
    private int id_bairro;
    private String nome;
    private int categoria_seg;
    private String imagem;
    
    //Metodos get/set
    public int getId_bairro() {
        return id_bairro;
    }

    public void setId_bairro(int id_bairro) {
        this.id_bairro = id_bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria_seg() {
        return categoria_seg;
    }

    public void setCategoria_seg(int categoria_seg) {
        this.categoria_seg = categoria_seg;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
    
}
