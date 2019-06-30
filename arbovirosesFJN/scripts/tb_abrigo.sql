CREATE TABLE IF NOT EXISTS `arboviroses`.`tb_abrigo` (
  `id_abrigo` INT NOT NULL AUTO_INCREMENT,
  `nm_abrigo` VARCHAR(250) NOT NULL,
  `nm_contato` VARCHAR(250),
  `num_telefone1` VARCHAR(13),
  `num_telefone2` VARCHAR(13),
  `email` VARCHAR(250),
  `logradouro` VARCHAR(250) NOT NULL,
  `numero` VHARCHAR(5) NOT NULL,
  `bairro` VARCHAR(250),
  `cidade` VARCHAR(250),
  `estado` VARCHAR(250),
  `cep` VARCHAR(10),
  `dt_cadastro` DATETIME Default NOW(),
  PRIMARY KEY (`id_abrigo`));
    
INSERT tb_abrigo (nm_abrigo, nm_contato, num_telefone1, num_telefone2, logradouro, numero, bairro, cidade, estado, cep) VALUES ('Creche Sorriso de Crianca', 'Miguel Guiseppe Sacramento de Oliveira', '081982263903', '081982263903', 'Rua Joaquim de Brito', '150', 'Ilha do Leite', 'Recife', 'Pernambuco', '50070280');
INSERT tb_abrigo ( nm_abrigo, nm_contato, num_telefone1, num_telefone2, logradouro, numero, bairro, cidade, estado, cep) VALUES ('Pai mais Feliz a cada dia', 'Zuamir Gutemberg VC de Oliveira', '081982263903', '081982263903', 'Rua Joaquim de Brito', '150', 'Ilha do Leite', 'Recife', 'Pernambuco', '50070280');
INSERT tb_abrigo (nm_abrigo, nm_contato, num_telefone1, num_telefone2, logradouro, numero, bairro, cidade, estado, cep) VALUES ('Mãe mais Feliz a cada dia', 'Mirelly Guiseppe do Sacramento', '081982263903', '081982263903', 'Rua Joaquim de Brito', '150', 'Ilha do Leite', 'Recife', 'Pernambuco', '50070280');

DROP TABLE tb_abrigo;