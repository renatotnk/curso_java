insert into estados(id, nome, sigla, regiao, populacao)
values (1000, '1000', 'NV', 'Sul', 2.54);

insert into estados (nome, sigla, regiao, populacao)
values ('Mais Novo', 'MN', 'Norte', 2.51);

update `estados`
set nome = 'Novo'
where sigla = 'NV';

select * from `estados`;

