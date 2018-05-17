-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema thelast
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema thelast
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `thelast` DEFAULT CHARACTER SET utf8 ;
USE `thelast` ;

-- -----------------------------------------------------
-- Table `thelast`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `thelast`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `rua` VARCHAR(45) NULL,
  `complemento` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `uf` VARCHAR(2) NULL,
  `cep` VARCHAR(8) NULL,
  `celular` VARCHAR(15) NULL,
  `data_nascimento` VARCHAR(10) NULL,
  `cpf` VARCHAR(15) NULL,
  `rg` VARCHAR(10) NULL,
  `email` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `thelast`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `thelast`.`administrador` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `thelast`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `thelast`.`produto` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `marca` VARCHAR(45) NULL,
  `categoria` VARCHAR(45) NULL,
  `quantidade` INT NULL,
  `estoqueMinimo` INT NULL,
  `estoqueAtual` INT NULL,
  `valor` FLOAT NULL,
  `desconto` FLOAT NULL,
  `total` FLOAT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `thelast`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `thelast`.`fornecedor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome_representante` VARCHAR(45) NULL,
  `rua` VARCHAR(45) NULL,
  `complemento` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `uf` VARCHAR(2) NULL,
  `cep` VARCHAR(12) NULL,
  `celular_representante` VARCHAR(15) NULL,
  `cnpj` VARCHAR(18) NULL,
  `nome_empresa` VARCHAR(45) NULL,
  `telefone_empresa` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `thelast`.`relatorio_compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `thelast`.`relatorio_compra` (
  `data_compra` INT NOT NULL,
  `valor_total` VARCHAR(45) NULL)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



insert into produto (nome,marca, categoria,quantidade,estoqueMinimo,estoqueAtual,valor,desconto,total)
                    values('Bermuda Nike Dry','Nike','Masculino','20','10','20','74.99','5','71.21'),
                          ('Camiseta Regata Nike Legend','Nike','Masculino','20','10','20','69.99','5','66.50'),
                          ('Tênis Nike DownShifter 7','Nike','Masculino','20','10','20','189.99','5','180.50'),
                          ('Calça Legging Oxer Jogging','Oxer', 'Feminino','20','10','20','39.99','5','38'),
                          ('Camiseta Oxer Cord II','Oxer','Feminino', '20','10','20','29.99','5','28.50' ),
                          ('Tênis Oxer Agill','Oxer','Feminino', '20','10','20', '59.99', '5', '56.99'),
                          ('Creatina Integralmedica - 300g', 'Integralmedica', 'Suplemento', '20','10','20','37.90', '2','37.15'),
                          ('Whey Protein Integralmediga nutri - Chocolate - 1.8Kg','Integralmedica','Suplemento', '20','10','20','79.85','3','77.45'),
                          ('Pré Treino BodyAction - Uva com Blueberry - 100g','Integralmedica','Suplemento','20','10','20','50','3','48.50'),
                          ('Energético - Sabor Guaraná e Açaí','Porbiótica','Suplemento','20','10','20','3','0','3' );
