insert into categoria_delegacia(nome)
values	('Atendimento a Mulher'),
		('Atendimento a Terceira Idade'),
        ('Policia Fazendaria'),
        ('Protecao ao Meio Ambiente'),
        ('Homicidios'),
        ('Repressao aos Crimes de Informatica'),
        ('Crimes Contra a Saude Publica'),
        ('Repressao aos Crimes Contra a Propriedade Imaterial'),
        ('Roubos e Furtos de Automoveis'),
        ('Protecao a Infancia e Adolescencia');

insert into delegacia (nome, cep, cidade, bairro, estado, categoria)
values	('06 DP - Taguatinga', '70531-010', 'Brasilia',
		'Taguatinga', 'DF', 9),
        ('02 DP - Asa Norte', '70344-010', 'Brasilia',
		'Asa Norte', 'DF', 1),
        ('16 DP - Planaltina', '70620-010', 'Brasilia',
		'Planaltina', 'DF', 5),
        ('15 DP - Ceilandia Centro', '70911-010', 'Brasilia',
		'Ceilandia', 'DF', 6),
        ('01 DP - Asa Sul', '70422-010', 'Brasilia',
		'Asa Sul', 'DF', 2),
        ('10 DP - Lago Sul', '70102-010', 'Brasilia',
		'Lago Sul', 'DF', 6),
        ('DPCA - Delegacia de Protecao a Crianca e ao Adolescente',
        '70829-010', 'Brasilia', 'Guara', 'DF', 10);
        
insert into policial 	(num_id, nome, titulo, cep,  
						cidade, bairro, estado, delegacia)
values	(1111111, 'Patricia Pimenta', 'Capitao', '70321-010', 
		'Brasilia', 'Asa Norte', 'DF', 2),
        (2222222, 'Arthur Silva', 'Major', '70451-020',
        'Brasilia', 'Asa Sul', 'DF', 5),
        (3333333, 'Paula Oliveira', 'Coronel', '70555-020',
        'Brasilia', 'Taguatinga', 'DF', 1),
        (4444444, 'Tiago Souza', 'Soldado', '70921-040',
        'Brasilia', 'Ceilandia', 'DF', 4),
        (5555555, 'Rodrigo Medeiros', 'Cabo', '70888-010',
        'Brasilia', 'Guara', 'DF', 7),
        (6666666, 'Gustavo Nascimento', 'Capitao', '70123-040',
        'Brasilia', 'Lago Sul', 'DF', 6),
        (7777777, 'Julia SantAnna', 'Cabo', '70333-020',
        'Brasilia', 'Asa Norte', 'DF', 2),
        (8888888, 'Yago Quirino', 'Soldado', '70122-010',
        'Brasilia', 'Lago Sul', 'DF', 6),
        (9999999, 'Lucas Texeira', 'Sargento', '70534-060',
        'Brasilia', 'Taguatinga', 'DF', 1),
        (1010101, 'Matheus Alexandre', 'Major', '70665-040',
        'Brasilia', 'Planaltina', 'DF', 3);
        
insert into telefone_policial (telefone, id_policial)
values	(99816654, 1),
		(84225890, 2),
        (83219019, 3),
        (92319391, 4),
        (88947184, 5),
        (82745618, 6),
        (89571833, 7),
        (90489912, 8),
        (99448188, 9),
        (88929019, 10);

insert into telefone_delegacia (telefone, id_delegacia)
values	(32991828, 1),
		(38481772, 2),
        (31884718, 3),
        (32818491, 4),
        (38177617, 5),
        (39887637, 6),
        (32818588, 7);
        
insert into deposito (nome, chefe, cep, cidade, bairro, estado)
values	('Deposito de Evidencias', 3,'70521-010', 'Brasilia',
		'Taguatinga', 'DF'),
		('Deposito Militar de Armas e Municoes', 1,'70392-010', 
        'Brasilia', 'Asa Norte', 'DF'),
        ('Deposito Geral da Policia Civil', 2, '70443-010', 
		'Brasilia', 'Asa Sul', 'DF'),
        ('Deposito Policial Lago Sul', 6, '70109-010', 'Brasilia',
        'Lago Sul', 'DF'),
        ('Deposito de Carros de Planaltina', 10, '70671-010', 
        'Brasilia', 'Planaltina', 'DF');

insert into categoria_item (nome)
values	('Veiculo'),
		('Substancia Entorpecente'),
        ('Dinheiro'),
        ('Arma de Fogo'),
        ('Explosivo'),
        ('Arma Branca'),
        ('Dispositivo Movel'),
        ('Objetos Pessoais');
        
insert into item (nome, categoria)
values	('Fiat Palio Weekend', 1),
		('Reais', 3),
        ('Pistola Calibre .45', 4),
        ('Maconha', 2),
        ('IPhone 6s', 7),
        ('Granada', 5),
        ('Katana Japonesa', 6),
        ('Dolar', 3),
        ('Laptop Dell', 7);

insert into historico_deposito (status_historico, deposito, item, quantidade, data_hora)
values	('Entrada', 1, 1, '2 unidades', '2006/06/14 20:20:10'),
		('Entrada', 2, 3, '10 unidades', '2006/06/15 12:49:00'),
		('Entrada', 3, 2, '500.000', '2005/04/09 10:12:11'),
        ('Saida', 3, 2, '500.000,00', '2010/11/01 09:00:00'),
        ('Entrada', 4, 4, '20 kilos', '2002/08/22 23:30:15'),
        ('Saida', 5, 5, '10 unidades', '2001/01/19 10:51:40'),
        ('Entrada', 5, 8, '300.000,00', '2005/08/14 20:20:10'),
        ('Saida', 5, 6, '21 unidades', '2005/08/14 20:20:10'),
        ('Entrada', 2, 9, '7 unidades', '2003/03/03 23:23:13');

insert into cidadao (cpf, nome, sexo, estado_civil, data_nascimento,
cep, cidade, bairro, estado)
values	('039467971-32', 'Maria de Paula Fernandes', 'F', 'Casada', 
		'1978/04/04', '70553-040', 'Brasilia', 'Taguatinga', 'DF'),
        ('053732133-76', 'Igor Dantes Cardoso', 'M', 'Solteiro', 
		'1977/07/22', '70322-050', 'Brasilia', 'Asa Norte', 'DF'),
        ('095268138-95', 'Pamela dos Santos Orrico', 'F', 'Solteiro', 
		'1989/02/14', '70341-010', 'Brasilia', 'Asa Norte', 'DF'),
		('026966242-21', 'Marina Gasparini', 'F', 'Casada', 
		'1973/05/11', '70498-030', 'Brasilia', 'Asa Sul', 'DF'),
        ('012451134-58', 'Rafael Marques de Paula', 'M', 'Casado', 
		'1975/11/29', '70498-030', 'Brasilia', 'Asa Sul', 'DF');

insert into telefone_cidadao (telefone, id_cidadao)
values	(92557898, 01),
		(94823478, 02),
        (83471738, 03),
        (88472728, 04),
        (81223458, 05);

insert into categoria_objeto_pessoal (nome)
values	('Carteira'),
		('Vestuário'),
        ('Veículo'),
        ('Documento');
        
insert into objeto_pessoal (nome, descricao, categoria)
values	('Camiseta polo', 'Camiseta vermelha com logo azul de marca', 2),
		('Palio Uno', 'Carro branco, placa: TES 5050 e de ano 2012', 3),
        ('Carteira', 'Carteira italiana de cor preta', 1);


insert into categoria_imagem (categoria)
values	('JPEG de alta definição'),
		('Bitmap de definição média'),
        ('Bitmap de baixa definição');

-- É necessário alterar a permissão de acesso ao arquivo
-- Para toda imagem inserida foi necessário alter sua permissão utilizando chmod 777
insert into imagem (foto, descricao, categoria)
values	(LOAD_FILE('/home/marcelo/Pictures/BD/asaNorte'),"Mapa indicando principais vias da asa norte", 1),
		(LOAD_FILE('/home/marcelo/Pictures/BD/asaSul'),"Mapa indicando principais vias da asa sul", 1),
		(LOAD_FILE('/home/marcelo/Pictures/BD/lagoSul'),"Mapa indicando principais vias da lago sul", 1);

select * from imagem;

insert into categoria_seguranca (nivel)
values	('Seguro'),
		('Pouco seguro'),
		('Nada seguro');

insert into bairro (nome, categoria_seg, imagem)
values	('Asa Sul', 2, 1),
		('Asa Norte', 1, 1),
        ('Lago Sul', 3, 1);

insert into categoria_ocorrencia (nome)
values	('Acidente'),
		('Furto'),
        ('Sequestro');

insert into ocorrencia (num_ocorrencia, observacao, policial, categoria, bairro)
values	(1111111, 'Ocorrencia sobre furto de veículos às 20h', 1, 2, 2),
		(2222222, 'Ocorrencia sobre acidente às 23h', 2, 1, 1),
        (3333333, 'Ocorrencia sobre sequestro às 10h', 3, 3, 3),
        (4444444, 'Ocorrencia sobre furto de carteira às 14h', 4, 2, 2),
		(5555555, 'Ocorrencia sobre furto de camiseta às 15h', 5, 2, 1);
        
insert into infrator (infrator, ocorrencia)
values	(1,1),
		(2,2),
        (3,3),
        (2,4),
        (3,5);

insert into vitima (vitima, ocorrencia)
values (4, 1),
	   (5, 2),
       (1, 3);
       
insert into objeto_furtado (objeto, ocorrencia)
values	(2, 1),
		(3, 4),
        (1, 5);
        
insert into historico_ocorrencia (observacao, data_hora, ocorrencia)
values	('Primeiro registro da noite', '2005/04/09 10:12:11', 1),
		('Vitima abalada e inconsolável', '2006/09/11 15:22:10', 2),
        ('Infrator foi solto logo em seguida', '2005/04/09 10:12:11', 3);


-- Cria uma tabela virtual mostrando todos os chefes de deposito, assim como seus titulos e o nome do deposito
CREATE VIEW v_deposito
AS SELECT policial.nome as 'Chefe do deposito', policial.titulo as 'Titulo', deposito.nome as 'Deposito'
FROM policial inner join deposito on policial.id_policial = deposito.chefe;

select * from v_deposito;

delimiter //
CREATE PROCEDURE inserir_policial 
	(
		in v_num_id				integer(10),
        in v_nome				varchar(20),
        in v_titulo				varchar(20),
        in v_cep					varchar(15),
        in v_cidade				varchar(30),
        in v_bairro				varchar(30),
        in v_estado				varchar(2),
        in v_delegacia			integer unsigned,
		out msg					varchar(100))
BEGIN
	if(v_estado != 'DF') THEN
		set msg = 'Somente policiais locais podem ser inscritos!';
	else
        insert into policial (num_id, nome, titulo, cep, cidade, bairro, estado, delegacia)
		values (v_num_id, v_nome, v_titulo, v_cep, v_cidade, v_bairro, v_estado, v_delegacia);
        set msg = 'Bem vindo à Força!';
	end if;
END//

Delimiter ;


call inserir_policial(1111,'Marcelo', 'Coronel', '70854-020', 'Brasilia', 'Asa Norte', 'GO', 1, @msg);
select @msg;


-- Mostra o nome, titulo e o telefone do chefe do primeiro deposito
select policial.nome as 'Chefe do deposito', policial.titulo as 'Titulo', telefone_policial.telefone as 'Telefone'
from deposito inner join policial inner join telefone_policial
on deposito.chefe = policial.id_policial 
and deposito.id_deposito = 1
and policial.id_policial = telefone_policial.id_policial;

-- Mostra os nomes dos depositos e dos itens do histórico por ordem de data 
select deposito.nome as 'Deposito',
item.nome as 'Item', 
historico_deposito.quantidade as 'Quantidade', 
historico_deposito.data_hora as 'Horario',
historico_deposito.status_historico as 'Status'
from historico_deposito inner join deposito inner join item 
on historico_deposito.item = item.id_item 
and historico_deposito.deposito = deposito.id_deposito 
order by historico_deposito.data_hora;

-- Mostra o nome do bairro, as fotos daquele bairro e seu nível de segurança em ordem decrescente de nível de segurança
select bairro.nome as 'Bairro', categoria_seguranca.nivel as 'Segurança', imagem.foto as 'Foto'
from bairro inner join categoria_seguranca inner join imagem
on bairro.categoria_seg = categoria_seguranca.id_categoria
and bairro.imagem = imagem.id_imagem
order by categoria_seguranca.nivel DESC;

-- Mostra todas as mulheres vitimas de algum crime e a data em que aconteceu o crime
select cidadao.nome as 'Vitima', categoria_ocorrencia.nome as 'Tipo de crime sofrido', 
historico_ocorrencia.data_hora as 'Data'
from cidadao inner join vitima inner join ocorrencia inner join historico_ocorrencia inner join categoria_ocorrencia
on cidadao.id_cidadao = vitima.vitima and ocorrencia.id_ocorrencia = vitima.ocorrencia
and ocorrencia.id_ocorrencia = historico_ocorrencia.ocorrencia and ocorrencia.categoria = categoria_ocorrencia.id_categoria
where cidadao.sexo = 'F'
order by historico_ocorrencia.data_hora;


-- Mostra todos os nomes e tipos de objetos furtados e o nome dos ladrões
select objeto_pessoal.nome as 'Objeto', categoria_objeto_pessoal.nome as 'Categoria', cidadao.nome as 'Ladrão'
from objeto_pessoal inner join objeto_furtado inner join categoria_objeto_pessoal inner join cidadao inner join infrator inner join ocorrencia
inner join categoria_ocorrencia
on objeto_pessoal.categoria = categoria_objeto_pessoal.id_categoria 
and objeto_furtado.objeto = objeto_pessoal.id_obj_pessoal
and objeto_furtado.ocorrencia = ocorrencia.id_ocorrencia 
and infrator.infrator = cidadao.id_cidadao 
and infrator.ocorrencia = ocorrencia.id_ocorrencia
and categoria_ocorrencia.id_categoria = ocorrencia.categoria
where categoria_ocorrencia.nome = 'Furto';
