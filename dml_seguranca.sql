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
values	('Entrada', 1, 1, '2 unidades', '2006/06/14 20:20:10');

select * from policial;
select * from telefone_policial;
select * from categoria_delegacia;
select * from deposito;
select policial.nome as 'Chefe do deposito', policial.titulo as 'Titulo' 
from deposito inner join policial 
on deposito.chefe = policial.id_policial 
and deposito.id_deposito = 1;
select deposito.nome as 'Deposito',
item.nome as 'Item', 
historico_deposito.quantidade as 'Quantidade', 
historico_deposito.data_hora as 'Horario',
historico_deposito.status_historico as 'Status'
from historico_deposito inner join deposito inner join item 
on historico_deposito.item = item.id_item 
and historico_deposito.deposito = deposito.id_deposito;
