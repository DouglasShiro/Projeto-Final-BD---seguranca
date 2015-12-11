/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler       10/0113681          
 */
package modelo;
/**
 * CREATE TABLE cidadao
	(
	id_cidadao			integer unsigned not null auto_increment,
        cpf					varchar(12) not null,
        nome				varchar(50) not null,
        sexo				varchar(1) not null,
        estado_civil		varchar(30) not null,
        data_nascimento		date not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
		PRIMARY KEY (id_cidadao)
        );
 */
public class Cidadao {
    //Lista de atributos
    private int id_cidadao;
    private String cpf;
    private String nome;
    private String sexo;
    private String estado_civil;
    private String data_nascimento;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;
    
    //Metodos get/set

    public int getId_cidadao() {
        return id_cidadao;
    }

    public void setId_cidadao(int id_cidadao) {
        this.id_cidadao = id_cidadao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
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
