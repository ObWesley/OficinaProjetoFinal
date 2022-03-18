/**
Agenda de contatos
Aluno: Wesley
Curso: Técnico em informática - Senac Tatuapé - SP
*/
-- Pesquisar bancos de dados disponíveis
show databases;
-- Verificar tabelas disponível
show tables;

-- Criando um banco de dados
create database dbmw;


-- Remover um banco de dados
drop database dbmw;
-- iniciando banco de dados
use  dbmw;

-- (((((((((((((((((((((((((( INICIANDO CADASTRO DE USUÁRIO )))))))))))))))))))))))))))))))))))))))))))))))))))

create table dbmw.usuarios(
id int primary key auto_increment,
usuario varchar(50) not null,
login varchar(50) not null unique,
senha varchar(250) 
);
select * from dbmw.usuarios;

-- Criando usuário e fazendo 
insert into dbmw.usuarios (usuario,login,senha) values ('Maxswell','maxswell@email.com', md5('1234'));
 
insert into dbmw.usuarios (usuario,login, senha) values ('jailson','jailson@email.com', md5('1234'));
insert into dbmw.usuarios (usuario,login, senha) values ('wesley','wesley@email.com', md5('1234'));
insert into dbmw.usuarios (usuario,login, senha) values ('wesley oliveira','wesley@email.br', md5('1234'));
-- Fazendo verificação de usuário para ligar com Eclipse
select * from usuario where usuario ='Maxswell' and senha= md5('1234');
select * from usuario where usuario ='jailson' and senha= md5('1234');



-- Cadastro CRUD de colaboradores
insert into usuarios (usuario,login,senha) values
 ('Daniel','danielemail.com','123');
 insert into usuarios (usuario,login,senha) values
 ('carlos','danielemail.com','124783');
-- Armazenando um campo com criptografia
insert into usuarios (usuario,login,senha) values ('Daniel','danielemail.com', md5('1234'));
insert into usuarios (usuario,login,senha) values ('carlos','danielemail.com', md5('124783'));


-- Verificar tabelas disponível
show tables;

-- Comando usado para descrever a tabela
describe usuarios;

select * from usuarios;











-- ((((((((((((((((((((((((((((((((((( finalizando cadastro de usuário ))))))))))))))))))))))))))))))))))))))))))))))))



-- (((((((((((((( INICIANDO TABELA DE CADASTRO DE CLIENTES ))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))

-- Criando tabela cadastro de clientes
create table clientes(
idcli int primary key auto_increment,
nome varchar(50) not null,
Cpf varchar(12)  not null unique,
email varchar(50) not null unique,
telefone varchar(15) not null,
cep varchar(12) not null,
endereco varchar (100) not null,
numero varchar (100) not null,
cidade varchar (16) not null,
bairro varchar (200) not null,
complemento varchar (100) not null


);
-- Verificar tabelas disponível
show tables;

-- Comando usado para descrever a tabela
describe clientes;


-- preenchimento não obrigatório
-- alter table clientes modify fone varchar(15); 

-- CRUD CREATE Criando Registro de clientes para teste 
insert into clientes (nome,cpf,email,telefone,cep,endereco,numero,cidade,bairro,complemento) values
 ('Camila','456512586-12','camila@gmail.com','8456-5455','8654-250','rua três coquinho','54','São paulo','Barão','Ao lado da pastelaria');
 
-- Criando pesquisas avançadas por nome 
select * from clientes where nome like 'm%';
 
 

select * from  clientes ;



-- -----------------------------  FINAL DA CONFIGURAÇÃO DE CADASTRO DE CLIENTES ------------------------------------------------------

 

 
 
select * from OsMecanica ;

-- Comando usado para descrever a tabela
describe OsMecanica;





-- CAMPO PARA DELETAR TABELA
drop table clientes;
drop table usuarios ;

-- Comando usado para descrever a tabela



-- ((((((((((((((((((((((((( Campo para CRUD de Atualização, pesquisa e Delete ))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))





