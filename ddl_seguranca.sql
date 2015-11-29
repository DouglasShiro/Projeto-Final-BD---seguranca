DROP DATABASE segurança;

CREATE DATABASE segurança;

USE segurança;

CREATE TABLE policial
	(
		id_policial			integer(10) not null,
		nome				varchar(20) not null,
        titulo				varchar(20) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
		PRIMARY KEY (id_policial)
		);

CREATE TABLE telefone_policial
	(
		telefone			integer(10) not null,
        id_policial			integer(10) not null,
        PRIMARY KEY (telefone, id_policial),
        FOREIGN KEY (id_policial) REFERENCES policial(id_policial) ON DELETE CASCADE
        );
        
CREATE TABLE categoria_delegacia
	(
		id_categoria		integer(10) not null,
        nome				varchar(20) not null,
        PRIMARY KEY (id_categoria)
        );
        
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

CREATE TABLE telefone_delegacia
	(
		telefone			integer(10) not null,
        id_delegacia		integer(10) not null,
        PRIMARY KEY (telefone, id_delegacia),
        FOREIGN KEY (id_delegacia) REFERENCES delegacia(id_delegacia) ON DELETE CASCADE
        );
        
CREATE TABLE deposito
	(
		id_deposito			integer(10) not null,
        cep					varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
        PRIMARY KEY (id_deposito)
        );
        
CREATE TABLE categoria_item
	(
		id_categoria		integer(10) not null,
        nome				varchar(20) not null,
        PRIMARY KEY (id_categoria)
        );

CREATE TABLE item
	(
		id_item				integer(10) not null,
		nome				varchar(20) not null,
        categoria			integer(10) not null,
        PRIMARY KEY (id_item),
        FOREIGN KEY (categoria) REFERENCES categoria_item(id_categoria) ON DELETE CASCADE
        );
        
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

        
        
        

        
        