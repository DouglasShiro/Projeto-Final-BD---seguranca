insert into policial 	(num_id, nome, titulo, cep,  
						cidade, bairro, estado)
values	(1111111, 'Paulo Pimenta', 'Capitao', '70321-010', 
		'Brasilia', 'Asa Norte', 'DF'),
        (2222222, 'Arthur Silva', 'Major', '70451-020',
        'Brasilia', 'Asa Sul', 'DF'),
        (3333333, 'Carlos Oliveira', 'Coronel', '70555-020',
        'Brasilia', 'Taguatinga', 'DF'),
        (4444444, 'Tiago Souza', 'Soldado', '70921-040',
        'Brasilia', 'Ceilandia', 'DF'),
        (5555555, 'Rodrigo Medeiros', 'Cabo', '70888-010',
        'Brasilia', 'Guara', 'DF'),
        (6666666, 'Gustavo Nascimento', 'Capitao', '70123-040',
        'Brasilia', 'Lago Sul', 'DF'),
        (7777777, 'Pedro SantAnna', 'Cabo', '70333-020',
        'Brasilia', 'Asa Norte', 'DF'),
        (8888888, 'Yago Quirino', 'Soldado', '70122-010',
        'Brasilia', 'Lago Sul', 'DF'),
        (9999999, 'Lucas Texeira', 'Sargento', '70534-060',
        'Brasilia', 'Taguatinga', 'DF'),
        (1010101, 'Matheus Alexandre', 'Major', '70665-040',
        'Brasilia', 'Planaltina', 'DF');
        
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
        
insert into delegacia (nome, cep, cidade, bairro, estado, categoria
						delegado)
values

        
select * from policial;
select * from telefone_policial;
select * from categoria_delegacia;