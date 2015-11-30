/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
 CREATE TABLE delegacia
	(
	id_delegacia		integer(10) not null,
        nome				varchar(20) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        categoria		integer(10) not null,
        delegado			integer(10) not null,
        PRIMARY KEY (id_delegacia),
        FOREIGN KEY (categoria) REFERENCES categoria_delegacia(id_categoria) ON DELETE CASCADE,
        FOREIGN KEY (delegado) REFERENCES policial(id_policial) ON DELETE CASCADE
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
    private int delegado;
    
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

    public int getDelegado() {
        return delegado;
    }

    public void setDelegado(int delegado) {
        this.delegado = delegado;
    }
    
}
