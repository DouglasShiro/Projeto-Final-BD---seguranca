/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler       10/0113681          
 */
package modelo;
/**
 * CREATE TABLE ocorrencia
	(
        id_ocorrencia		integer unsigned not null auto_increment,
        num_ocorrencia		integer(10) not null,
        observacao			varchar(100) not null,
        policial			integer unsigned not null,
        categoria			integer unsigned not null,
        bairro				integer unsigned not null,
        obj_pessoal			integer unsigned,
        PRIMARY KEY (id_ocorrencia),
        FOREIGN KEY (policial) REFERENCES policial(id_policial) ON DELETE RESTRICT,
        FOREIGN KEY (categoria) REFERENCES categoria_ocorrencia(id_categoria) ON DELETE RESTRICT,
        FOREIGN KEY (bairro) REFERENCES bairro(id_bairro) ON DELETE RESTRICT,
        FOREIGN KEY (obj_pessoal) REFERENCES objeto_pessoal(id_obj_pessoal) ON DELETE RESTRICT
        );
 */
public class Ocorrencia {
    //Lista de atributos
    private int id_ocorrencia;
    private int num_ocorrencia;
    private String observacao;
    private int policial;
    private int categoria;
    private int bairro;
    
    //Metodos get/set

    public int getId_ocorrencia() {
        return id_ocorrencia;
    }

    public void setId_ocorrencia(int id_ocorrencia) {
        this.id_ocorrencia = id_ocorrencia;
    }

    public int getNum_ocorrencia() {
        return num_ocorrencia;
    }

    public void setNum_ocorrencia(int num_ocorrencia) {
        this.num_ocorrencia = num_ocorrencia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getPolicial() {
        return policial;
    }

    public void setPolicial(int policial) {
        this.policial = policial;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getBairro() {
        return bairro;
    }

    public void setBairro(int bairro) {
        this.bairro = bairro;
    }

}
