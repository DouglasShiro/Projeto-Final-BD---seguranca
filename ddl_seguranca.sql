DROP DATABASE seguranca;

CREATE DATABASE seguranca;

USE segurança;

CREATE TABLE categoria_delegacia
	(
		id_categoria		integer unsigned not null auto_increment,
        nome				varchar(100) not null,
        PRIMARY KEY (id_categoria)
        );
        
CREATE TABLE delegacia
	(
        id_delegacia		integer unsigned not null auto_increment,
        nome				varchar(100) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        categoria			integer unsigned not null,
        PRIMARY KEY (id_delegacia),
        FOREIGN KEY (categoria) REFERENCES categoria_delegacia(id_categoria) ON DELETE CASCADE
        );
        
CREATE TABLE policial
	(
		id_policial			integer unsigned not null auto_increment,
		num_id				integer(10) not null,
        nome				varchar(20) not null,
        titulo				varchar(20) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        delegacia			integer unsigned not null,
		PRIMARY KEY (id_policial),
        FOREIGN KEY (delegacia) REFERENCES delegacia (id_delegacia) ON DELETE CASCADE
		);

CREATE TABLE telefone_policial
	(
		telefone			integer(10) not null,
        id_policial			integer unsigned not null,
        PRIMARY KEY (telefone, id_policial),
        FOREIGN KEY (id_policial) REFERENCES policial(id_policial) ON DELETE CASCADE
        );
        
CREATE TABLE telefone_delegacia
	(
		telefone			integer(10) not null,
        id_delegacia		integer unsigned not null,
        PRIMARY KEY (telefone, id_delegacia),
        FOREIGN KEY (id_delegacia) REFERENCES delegacia(id_delegacia) ON DELETE CASCADE
        );
        
CREATE TABLE deposito
	(
		id_deposito			integer unsigned not null auto_increment,
        nome				varchar(100) not null,
        chefe				integer unsigned not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        PRIMARY KEY (id_deposito),
        FOREIGN KEY (chefe) REFERENCES policial (id_policial)
        );
        
CREATE TABLE categoria_item
	(
		id_categoria		integer unsigned not null auto_increment,
        nome				varchar(50) not null,
        PRIMARY KEY (id_categoria)
        );

CREATE TABLE item
	(
		id_item				integer unsigned not null auto_increment,
		nome				varchar(50) not null,
        categoria			integer unsigned not null,
        PRIMARY KEY (id_item),
        FOREIGN KEY (categoria) REFERENCES categoria_item(id_categoria) ON DELETE CASCADE
        );

CREATE TABLE historico_deposito
	(
		id_historico		integer unsigned not null auto_increment,
        status_historico	varchar(30) not null,
        deposito			integer unsigned not null,
        item				integer unsigned not null,
        quantidade			varchar(20) not null,
        data_hora			datetime not null,
        PRIMARY KEY (id_historico),
        FOREIGN KEY (item) REFERENCES item(id_item) ON DELETE CASCADE,
        FOREIGN KEY (deposito) REFERENCES deposito(id_deposito) ON DELETE CASCADE
        );

CREATE TABLE cidadao
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

CREATE TABLE telefone_cidadao
	(
		telefone			integer(10) not null,
        id_cidadao			integer unsigned not null,
        PRIMARY KEY (telefone, id_cidadao),
        FOREIGN KEY (id_cidadao) REFERENCES cidadao(id_cidadao) ON DELETE CASCADE
        );

CREATE TABLE categoria_objeto_pessoal
	(
		id_categoria		integer unsigned not null auto_increment,
        nome				varchar(20) not null,
		PRIMARY KEY (id_categoria)
        );

CREATE TABLE objeto_pessoal
	(
		id_obj_pessoal		integer unsigned not null auto_increment,
        nome				varchar(20) not null,
        descricao			varchar(100) not null,
        categoria			integer unsigned not null,
        PRIMARY KEY (id_obj_pessoal)
        );
        
CREATE TABLE categoria_imagem
	(
		id_categoria		integer unsigned not null auto_increment,
        categoria			varchar(30) not null,
        PRIMARY KEY (id_categoria)
        );

CREATE TABLE imagem
	(
		id_imagem			integer unsigned not null auto_increment,
        foto				longblob not null,
        descricao			varchar(100) not null,
        categoria			integer unsigned not null,
        PRIMARY KEY (id_imagem),
        FOREIGN KEY (categoria) REFERENCES categoria_imagem(id_categoria)
        );
        
CREATE TABLE categoria_seguranca
	(
		id_categoria		integer unsigned not null auto_increment,
        nivel				varchar(30) not null,
        PRIMARY KEY (id_categoria)
        );

CREATE TABLE bairro
	(
		id_bairro			integer unsigned not null auto_increment,
        nome				varchar(20) not null,
        categoria_seg		integer unsigned not null,
        imagem				integer unsigned not null,
        PRIMARY KEY (id_bairro),
        FOREIGN KEY (categoria_seg) REFERENCES categoria_seguranca(id_categoria),
        FOREIGN KEY (imagem) REFERENCES imagem(id_imagem)
        );
        
CREATE TABLE categoria_ocorrencia
	(
		id_categoria		integer unsigned not null auto_increment,
        nome				varchar(30) not null,
        PRIMARY KEY (id_categoria)
        );

CREATE TABLE ocorrencia
	(
		id_ocorrencia		integer unsigned not null auto_increment,
        num_ocorrencia		integer(10) not null,
        observacao			varchar(100) not null,
        policial			integer unsigned not null,
        categoria			integer unsigned not null,
        bairro				integer unsigned not null,
        obj_pessoal			integer unsigned,
        PRIMARY KEY (id_ocorrencia),
        FOREIGN KEY (policial) REFERENCES policial(id_policial),
        FOREIGN KEY (categoria) REFERENCES categoria_ocorrencia(id_categoria),
        FOREIGN KEY (bairro) REFERENCES bairro(id_bairro),
        FOREIGN KEY (obj_pessoal) REFERENCES objeto_pessoal(id_obj_pessoal)
        );
        
CREATE TABLE infrator
	(
		infrator			integer unsigned not null,
        ocorrencia			integer unsigned not null,
        PRIMARY KEY (infrator, ocorrencia),
        FOREIGN KEY (infrator) REFERENCES cidadao(id_cidadao) ON DELETE CASCADE,
        FOREIGN KEY (ocorrencia) REFERENCES ocorrencia(id_ocorrencia) ON DELETE CASCADE
        );

CREATE TABLE vitima
	(
		vitima				integer unsigned not null,
        ocorrencia			integer unsigned not null,
        PRIMARY KEY (vitima, ocorrencia),
        FOREIGN KEY (vitima) REFERENCES cidadao(id_cidadao) ON DELETE CASCADE,
        FOREIGN KEY (ocorrencia) REFERENCES ocorrencia(id_ocorrencia) ON DELETE CASCADE
        );

CREATE TABLE objeto_furtado
	(
		objeto				integer unsigned not null,
        ocorrencia			integer unsigned not null,
        PRIMARY KEY (objeto, ocorrencia), 
        FOREIGN KEY (objeto) REFERENCES objeto_pessoal(id_obj_pessoal) ON DELETE CASCADE,
        FOREIGN KEY (ocorrencia) REFERENCES ocorrencia(id_ocorrencia) ON DELETE CASCADE
        );
        
CREATE TABLE historico_ocorrencia
	(
		id_historico		integer unsigned not null auto_increment,
        observacao			varchar(100) not null,
        data_hora			datetime not null,
        ocorrencia			integer unsigned not null,
        PRIMARY KEY (id_historico),
        FOREIGN KEY (ocorrencia) REFERENCES ocorrencia(id_ocorrencia)
        );
        
		
		
        
        