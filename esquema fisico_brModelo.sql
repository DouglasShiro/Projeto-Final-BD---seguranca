-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE categoria item (
id_categoria Numero PRIMARY KEY,
nome Texto(1)
)

CREATE TABLE historico deposito+deposito (
id_historico Numero,
Status Texto(1),
id_deposito Numero,
data Data,
PRIMARY KEY(id_historico,id_deposito,data)
)

CREATE TABLE policia+delegacia (
id_policial Numero,
nome Texto(1),
titulo Texto(1),
id_departamento Numero,
-- Erro: nome do campo duplicado nesta tabela!
nome Texto(1),
id_categoria Numero,
PRIMARY KEY(id_policial,id_departamento)
)

CREATE TABLE categoria_delegacia (
nome Texto(1),
id_categoria Numero PRIMARY KEY
)

CREATE TABLE cidadao (
id_cidadao Numero PRIMARY KEY,
cpf Numero,
nome Texto(1)
)

CREATE TABLE categoria ocorrencia (
id_categoria Numero PRIMARY KEY,
nome Texto(1)
)

CREATE TABLE historico ocorrencia+ocorrencia (
id_historico Numero,
observacao Texto(1),
id_ocorrencia Numero,
-- Erro: nome do campo duplicado nesta tabela!
Observacao Texto(1),
id_policial Numero,
id_departamento Numero,
id_bairro Numero,
data Data,
id_categoria Numero,
PRIMARY KEY(id_historico,id_ocorrencia,data),
FOREIGN KEY(id_departamento,,) REFERENCES policia+delegacia (id_policial,id_departamento),
FOREIGN KEY(id_categoria) REFERENCES categoria ocorrencia (id_categoria)
)

CREATE TABLE Item (
id_item Numero PRIMARY KEY,
nome Texto(1),
id_historico Numero,
id_categoria Numero,
FOREIGN KEY(/*erro: ??*/) REFERENCES historico deposito+deposito (id_historico,id_deposito,data),
FOREIGN KEY(id_categoria) REFERENCES categoria item (id_categoria)
)

CREATE TABLE categoria (
id_categoria Numero PRIMARY KEY,
nome Texto(1)
)

CREATE TABLE categoria seguranca (
nivel Texto(1),
id_categoria Numero PRIMARY KEY
)

CREATE TABLE bairro (
id_bairro Numero PRIMARY KEY,
bairro Texto(1),
id_categoria Numero,
FOREIGN KEY(id_categoria) REFERENCES categoria seguranca (id_categoria)
)

CREATE TABLE imagem (
foto Blob,
id_imagem Numero PRIMARY KEY,
descricao Texto(1),
id_bairro Numero,
id_pertence Numero,
id_categoria Numero,
FOREIGN KEY(id_bairro) REFERENCES bairro (id_bairro)
)

CREATE TABLE objeto pessoal (
id_pertence Numero PRIMARY KEY,
descricao Texto(1),
nome Texto(1),
id_categoria Numero,
FOREIGN KEY(id_categoria) REFERENCES categoria (id_categoria)
)

CREATE TABLE categoria imagem (
id_categoria Numero PRIMARY KEY,
descricao Texto(1)
)

CREATE TABLE telefone (
telefone numero(20)
)

CREATE TABLE endereco (
cep Numero,
numero Numero,
cidade Texto(1),
bairro Texto(1),
estado Texto(1)
)

-- Erro: Nome de tabela duplicado (este erro compromete a integridade referencial)!
CREATE TABLE endereco (
cidade Texto(1),
bairro Texto(1),
estado Texto(1),
cep Numero
)

-- Erro: Nome de tabela duplicado (este erro compromete a integridade referencial)!
CREATE TABLE telefone (
telefone Numero
)

-- Erro: Nome de tabela duplicado (este erro compromete a integridade referencial)!
CREATE TABLE telefone (
telefone Numero
)

CREATE TABLE endereço (
cidade Texto(1),
cep Numero,
bairro Texto(1),
numero Texto(1),
estado Texto(1)
)

-- Erro: Nome de tabela duplicado (este erro compromete a integridade referencial)!
CREATE TABLE endereço (
cidade Texto(1),
estado Texto(1),
cep Numero,
bairro Texto(1),
numero Texto(1)
)

CREATE TABLE possui (
id_deposito Numero,
id_policial Numero,
id_departamento Numero,
FOREIGN KEY(/*erro: ??*/) REFERENCES historico deposito+deposito (id_historico,id_deposito,data),
FOREIGN KEY(id_departamento,,) REFERENCES policia+delegacia (id_policial,id_departamento)
)

-- Erro: Nome de tabela duplicado (este erro compromete a integridade referencial)!
CREATE TABLE possui (
id_item Numero,
id_deposito Numero,
FOREIGN KEY(id_item) REFERENCES Item (id_item),
FOREIGN KEY(/*erro: ??*/) REFERENCES historico deposito+deposito (id_historico,id_deposito,data)
)

CREATE TABLE infrator (
id_cidadao Numero,
id_ocorrencia Numero,
FOREIGN KEY(id_cidadao) REFERENCES cidadao (id_cidadao),
FOREIGN KEY(/*erro: ??*/) REFERENCES historico ocorrencia+ocorrencia (id_historico,id_ocorrencia,data)
)

CREATE TABLE furtado (
id_ocorrencia Numero,
id_pertence Numero,
FOREIGN KEY(/*erro: ??*/) REFERENCES historico ocorrencia+ocorrencia (id_historico,id_ocorrencia,data),
FOREIGN KEY(id_pertence) REFERENCES objeto pessoal (id_pertence)
)

CREATE TABLE vitima (
id_cidadao Numero,
id_ocorrencia Numero,
FOREIGN KEY(id_cidadao) REFERENCES cidadao (id_cidadao),
FOREIGN KEY(/*erro: ??*/) REFERENCES historico ocorrencia+ocorrencia (id_historico,id_ocorrencia,data)
)

ALTER TABLE policia+delegacia ADD FOREIGN KEY(id_categoria) REFERENCES categoria_delegacia (id_categoria)
ALTER TABLE historico ocorrencia+ocorrencia ADD FOREIGN KEY(id_bairro) REFERENCES bairro (id_bairro)
ALTER TABLE imagem ADD FOREIGN KEY(id_pertence) REFERENCES objeto pessoal (id_pertence)
ALTER TABLE imagem ADD FOREIGN KEY(id_categoria) REFERENCES categoria imagem (id_categoria)
