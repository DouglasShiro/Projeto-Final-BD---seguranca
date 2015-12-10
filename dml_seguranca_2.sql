insert into categoria_delegacia( nome)
values  ('Atendimento a Mulher'),
        ('Atendimento a Terceira Idade'),
        ('Policia Fazendaria'),
        ('Protecao ao Meio Ambiente'),
        ('Homicidios'),
        ('Repressao aos Crimes de Informatica'),
        ('Crimes Contra a Saude Publica'),
        ('Repressao aos Crimes Contra a Propriedade Imaterial'),
        ('Roubos e Furtos de Automoveis'),
        ('Protecao a Infancia e Adolescencia');

insert into delegacia ( nome, cep, cidade, bairro, estado, categoria)
values  ('06 DP - Taguatinga', '70531-010', 'Brasilia',
                'Taguatinga', 'DF', 9),
        ('02 DP - Asa Norte', '70344-010', 'Brasilia',
                'Asa Norte', 'DF', 1),
        ('16 DP - Planaltina', '70620-010', 'Brasilia',
                'Planaltina', 'DF', 5),
        ('15 DP - Ceilandia Centro', '70911-010', 'Brasilia',
                'Ceilandia', 'DF', 6),
        ('01 DP - Asa Sul', '70422-010', 'Brasilia',
                'Asa Sul', 'DF', 2),
        ( '10 DP - Lago Sul', '70102-010', 'Brasilia',
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

insert into cidadao (cpf, nome, sexo, estado_civil, data_nascimento,
cep, cidade, bairro, estado)
values  ('039467971-32', 'Maria de Paula Fernandes', 'F', 'Casada', 
                '1978/04/04', '70553-040', 'Brasilia', 'Taguatinga', 'DF'),
        ('053732133-76', 'Igor Dantes Cardoso', 'M', 'Solteiro', 
                '1977/07/22', '70322-050', 'Brasilia', 'Asa Norte', 'DF'),
        ('095268138-95', 'Pamela dos Santos Orrico', 'F', 'Solteiro', 
                '1989/02/14', '70341-010', 'Brasilia', 'Asa Norte', 'DF'),
        ('026966242-21', 'Marina Gasparini', 'F', 'Casada', 
                '1973/05/11', '70498-030', 'Brasilia', 'Asa Sul', 'DF'),
        ('012451134-58', 'Rafael Marques de Paula', 'M', 'Casado', 
                '1975/11/29', '70498-030', 'Brasilia', 'Asa Sul', 'DF');        

insert into categoria_item (nome)
values  ('Veiculo'),
        ('Substancia Entorpecente'),
        ('Dinheiro'),
        ( 'Arma de Fogo'),
        ( 'Explosivo'),
        ( 'Arma Branca'),
        ( 'Dispositivo Movel'),
        ( 'Objetos Pessoais');

insert into categoria_seguranca( nivel)
values  ('Seguro'),
        ( 'Segurança media'),
        ( 'Inseguro');
        
insert into bairro ( nome, categoria_seg, imagem)
values  ( 'Asa Norte', 1, null),
        ( 'Asa Sul', 2, null),
        ( 'Lago Sul', 3, null);

--insert into imagem ()
--values  ()

insert into categoria_objeto_pessoal (nome)
values  ('Vestuário'),
        ('Dinheiro'),
        ( 'Veículo'),
        ( 'Aparelho eletrônico'),
        ( 'Documento');


insert into categoria_ocorrencia(nome)
values  ( 'Furto'), 
        ( 'Sequestro'),
        ( 'Acidente');

insert into deposito (nome, chefe, cep, cidade, bairro, estado)
values  ('Deposito de Evidencias', 3,'70521-010', 'Brasilia', 'Taguatinga', 'DF'),
        ('Deposito Militar de Armas e Municoes', 1,'70392-010', 'Brasilia', 'Asa Norte', 'DF'),
        ('Deposito Geral da Policia Civil', 2, '70443-010', 'Brasilia', 'Asa Sul', 'DF'),
        ('Deposito Policial Lago Sul', 6, '70109-010', 'Brasilia', 'Lago Sul', 'DF'),
        ('Deposito de Carros de Planaltina', 10, '70671-010', 'Brasilia', 'Planaltina', 'DF');



select po.nome,
                de.nome,
        cd.nome

from policial po, delegacia de, categoria_delegacia cd

where po.delegacia = de.id_delegacia
and   de.categoria = cd.id_categoria













