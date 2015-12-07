insert into policial 	(id_policial ,num_id, nome, titulo, cep,  
						cidade, bairro, estado, delegacia)
values	(1, 1111111, 'Patricia Pimenta', 'Capitao', '70321-010', 
		'Brasilia', 'Asa Norte', 'DF', 2),
        (2, 2222222, 'Arthur Silva', 'Major', '70451-020',
        'Brasilia', 'Asa Sul', 'DF', 5),
        (3, 3333333, 'Paula Oliveira', 'Coronel', '70555-020',
        'Brasilia', 'Taguatinga', 'DF', 1),
        (4, 4444444, 'Tiago Souza', 'Soldado', '70921-040',
        'Brasilia', 'Ceilandia', 'DF', 4),
        (5, 5555555, 'Rodrigo Medeiros', 'Cabo', '70888-010',
        'Brasilia', 'Guara', 'DF', 7),
        (6, 6666666, 'Gustavo Nascimento', 'Capitao', '70123-040',
        'Brasilia', 'Lago Sul', 'DF', 6),
        (7, 7777777, 'Julia SantAnna', 'Cabo', '70333-020',
        'Brasilia', 'Asa Norte', 'DF', 2),
        (8, 8888888, 'Yago Quirino', 'Soldado', '70122-010',
        'Brasilia', 'Lago Sul', 'DF', 6),
        (9, 9999999, 'Lucas Texeira', 'Sargento', '70534-060',
        'Brasilia', 'Taguatinga', 'DF', 1),
        (10, 1010101, 'Matheus Alexandre', 'Major', '70665-040',
        'Brasilia', 'Planaltina', 'DF', 3);

insert into cidadao (id_cidadao, cpf, nome, sexo, estado_civil, data_nascimento,
cep, cidade, bairro, estado)
values  (1, '039467971-32', 'Maria de Paula Fernandes', 'F', 'Casada', 
                '1978/04/04', '70553-040', 'Brasilia', 'Taguatinga', 'DF'),
        (2, '053732133-76', 'Igor Dantes Cardoso', 'M', 'Solteiro', 
                '1977/07/22', '70322-050', 'Brasilia', 'Asa Norte', 'DF'),
        (3, '095268138-95', 'Pamela dos Santos Orrico', 'F', 'Solteiro', 
                '1989/02/14', '70341-010', 'Brasilia', 'Asa Norte', 'DF'),
        (4, '026966242-21', 'Marina Gasparini', 'F', 'Casada', 
                '1973/05/11', '70498-030', 'Brasilia', 'Asa Sul', 'DF'),
        (5, '012451134-58', 'Rafael Marques de Paula', 'M', 'Casado', 
                '1975/11/29', '70498-030', 'Brasilia', 'Asa Sul', 'DF');

insert into categoria_delegacia(id_categoria, nome)
values  (1, 'Atendimento a Mulher'),
        (2, 'Atendimento a Terceira Idade'),
        (3, 'Policia Fazendaria'),
        (4, 'Protecao ao Meio Ambiente'),
        (5, 'Homicidios'),
        (6, 'Repressao aos Crimes de Informatica'),
        (7, 'Crimes Contra a Saude Publica'),
        (8, 'Repressao aos Crimes Contra a Propriedade Imaterial'),
        (9, 'Roubos e Furtos de Automoveis'),
        (10, 'Protecao a Infancia e Adolescencia');

insert into delegacia (id_delegacia, nome, cep, cidade, bairro, estado, categoria)
values  (1, '06 DP - Taguatinga', '70531-010', 'Brasilia',
                'Taguatinga', 'DF', 9),
        (2, '02 DP - Asa Norte', '70344-010', 'Brasilia',
                'Asa Norte', 'DF', 1),
        (3, '16 DP - Planaltina', '70620-010', 'Brasilia',
                'Planaltina', 'DF', 5),
        (4, '15 DP - Ceilandia Centro', '70911-010', 'Brasilia',
                'Ceilandia', 'DF', 6),
        (5, '01 DP - Asa Sul', '70422-010', 'Brasilia',
                'Asa Sul', 'DF', 2),
        (6, '10 DP - Lago Sul', '70102-010', 'Brasilia',
                'Lago Sul', 'DF', 6),
        (7, 'DPCA - Delegacia de Protecao a Crianca e ao Adolescente',
        '70829-010', 'Brasilia', 'Guara', 'DF', 10);
        

insert into categoria_item (id_categoria, nome)
values  (1, 'Veiculo'),
        (2, 'Substancia Entorpecente'),
        (3, 'Dinheiro'),
        (4, 'Arma de Fogo'),
        (5, 'Explosivo'),
        (6, 'Arma Branca'),
        (7, 'Dispositivo Movel'),
        (8, 'Objetos Pessoais');
        
insert into bairro (id_bairro, nome, categoria_seg, imagem)
values  (1, 'Asa Norte', 1, null),
        (2, 'Asa Sul', 2, null),
        (3, 'Lago Sul', 3, null);

insert into categoria_seguranca(id_categoria, nivel)
values  (1, 'Seguro'),
        (2, 'Segurança media'),
        (3, 'Inseguro');

--insert into imagem ()
--values  ()

insert into categoria_objeto_pessoal (id_categoria, nome)
values  (1, 'Vestuário'),
        (2, 'Dinheiro'),
        (3, 'Veículo'),
        (4, 'Aparelho eletrônico'),
        (5, 'Documento');


insert into categoria_ocorrencia(id_categoria, nome)
values  (1, 'Furto'), 
        (2, 'Sequestro'),
        (3, 'Acidente');

insert into deposito (nome, chefe, cep, cidade, bairro, estado)
values  ('Deposito de Evidencias', 3,'70521-010', 'Brasilia', 'Taguatinga', 'DF'),
        ('Deposito Militar de Armas e Municoes', 1,'70392-010', 'Brasilia', 'Asa Norte', 'DF'),
        ('Deposito Geral da Policia Civil', 2, '70443-010', 'Brasilia', 'Asa Sul', 'DF'),
        ('Deposito Policial Lago Sul', 6, '70109-010', 'Brasilia', 'Lago Sul', 'DF'),
        ('Deposito de Carros de Planaltina', 10, '70671-010', 'Brasilia', 'Planaltina', 'DF');















