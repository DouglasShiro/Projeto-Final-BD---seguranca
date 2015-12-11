/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler       10/0113681          
 */
package modelo;

/**
 * CREATE TABLE delegacia
	(
        id_delegacia		integer unsigned not null auto_increment,
        nome				varchar(100) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        categoria			integer unsigned,
        PRIMARY KEY (id_delegacia),
        FOREIGN KEY (categoria) REFERENCES categoria_delegacia(id_categoria) ON DELETE SET NULL
        );
*/
public class Delegacia {
    //Lista de atributos
    private int id_delegacia;
    private String nome;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;
    private int categoria;
    
    //Metodos get/set

    public int getId_delegacia() {
        return id_delegacia;
    }

    public void setId_delegacia(int id_delegacia) {
        this.id_delegacia = id_delegacia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
        
}
