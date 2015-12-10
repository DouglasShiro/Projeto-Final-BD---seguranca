/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
 * CREATE TABLE policial
	(
	id_policial			integer unsigned not null auto_increment,
	num_id				integer(10) not null,
        nome				varchar(20) not null,
        titulo				varchar(20) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        delegacia			integer unsigned,
		PRIMARY KEY (id_policial),
        FOREIGN KEY (delegacia) REFERENCES delegacia (id_delegacia) ON DELETE CASCADE
		);
 */
public class Policial {
    //Lista de atributos
    private int id_policial;
    private int num_id;
    private String nome;
    private String titulo;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;
    private int delegacia;
    
    //Metodos get/set

    public int getId_policial() {
        return id_policial;
    }

    public void setId_policial(int id_policial) {
        this.id_policial = id_policial;
    }

    public int getNum_id() {
        return num_id;
    }

    public void setNum_id(int num_id) {
        this.num_id = num_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getDelegacia() {
        return delegacia;
    }

    public void setDelegacia(int delegacia) {
        this.delegacia = delegacia;
    }
    
}
