/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
CREATE TABLE historico_deposito
	(
	id_historico		integer(10) not null,
        status_historico	varchar(30) not null,
        deposito			integer(10) not null,
        item				integer(10) not null,
        data_hora			datetime not null,
        PRIMARY KEY (id_historico),
        FOREIGN KEY (item) REFERENCES item(id_item) ON DELETE CASCADE,
        FOREIGN KEY (deposito) REFERENCES deposito(id_deposito) ON DELETE CASCADE
        );
 */
public class HistoricoDeposito {
    //Lista de atributos
    private int id_historico;
    private String status_historico;
    private int deposito;
    private int item;
    private String data_hora;
    
    //Metodos get/set

    public int getId_historico() {
        return id_historico;
    }

    public void setId_historico(int id_historico) {
        this.id_historico = id_historico;
    }

    public String getStatus_historico() {
        return status_historico;
    }

    public void setStatus_historico(String status_historico) {
        this.status_historico = status_historico;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }    
}
