/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
CREATE TABLE deposito
	(
	id_deposito			integer(10) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        PRIMARY KEY (id_deposito)
        );
 */
public class Deposito {
    //Lista de atributos
    private int id_deposito;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;
    
    //Metodos get/set

    public int getId_deposito() {
        return id_deposito;
    }

    public void setId_deposito(int id_deposito) {
        this.id_deposito = id_deposito;
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
    
}
