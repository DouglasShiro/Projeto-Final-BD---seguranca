/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
 * CREATE TABLE deposito
	(
		id_deposito			integer unsigned not null auto_increment,
        nome				varchar(100) not null,
        chefe				integer unsigned,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        delegacia			integer unsigned,
        PRIMARY KEY (id_deposito),
        FOREIGN KEY (delegacia) REFERENCES delegacia (id_delegacia) ON DELETE SET NULL,
        FOREIGN KEY (chefe) REFERENCES policial (id_policial) ON DELETE SET NULL
        );
 */
public class Deposito {
    //Lista de atributos
    private int id_deposito;
    private String nome;
    private int chefe;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;
    private int delegacia;
    
    //Metodos get/set

    public int getId_deposito() {
        return id_deposito;
    }

    public void setId_deposito(int id_deposito) {
        this.id_deposito = id_deposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChefe() {
        return chefe;
    }

    public void setChefe(int chefe) {
        this.chefe = chefe;
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
