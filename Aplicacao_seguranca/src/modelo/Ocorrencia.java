/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
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

 
   
}
