-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema scriptobviamente
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema scriptobviamente
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `scriptobviamente` DEFAULT CHARACTER SET utf8 ;
USE `scriptobviamente` ;

-- -----------------------------------------------------
-- Table `scriptobviamente`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scriptobviamente`.`produto` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `marca` VARCHAR(45) NULL,
  `categoria` VARCHAR(45) NULL,
  `quantidade` INT NULL,
  `estoqueMinimo` INT NULL,
  `estoqueAtual` INT NULL,
  `valor` FLOAT NULL,
  `desconto` FLOAT NULL,
  `valorTotal` FLOAT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `scriptobviamente`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scriptobviamente`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `dataNascimento` VARCHAR(9) NULL,
  `cpf` VARCHAR(12) NULL,
  `rg` VARCHAR(9) NULL,
  `celular` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `nome` VARCHAR(45) NULL,
  `rua` VARCHAR(45) NULL,
  `complemento` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `uf` VARCHAR(45) NULL,
  `cep` VARCHAR(45) NULL,  
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `scriptobviamente`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scriptobviamente`.`fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT,
  `cnpj` VARCHAR(45) NULL,
  `nomeRepresentante` VARCHAR(45) NULL,
  `celularRepresentante` VARCHAR(13) NULL,
  `nome` VARCHAR(45) NULL,
  `rua` VARCHAR(45) NULL,
  `complemento` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `uf` VARCHAR(45) NULL,
  `cep` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  PRIMARY KEY (`idFornecedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `scriptobviamente`.`relatorioCompra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scriptobviamente`.`relatorioCompra` (
  `cliente_idCliente` INT NOT NULL,
  `produto_codigo` INT NOT NULL,
  `dataCompra` VARCHAR(11) NULL,
  PRIMARY KEY (`cliente_idCliente`, `produto_codigo`),
  INDEX `fk_cliente_has_produto_produto1_idx` (`produto_codigo` ASC),
  INDEX `fk_cliente_has_produto_cliente1_idx` (`cliente_idCliente` ASC),
  CONSTRAINT `fk_cliente_has_produto_cliente1`
    FOREIGN KEY (`cliente_idCliente`)
    REFERENCES `scriptobviamente`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_produto_produto1`
    FOREIGN KEY (`produto_codigo`)
    REFERENCES `scriptobviamente`.`produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `scriptobviamente`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scriptobviamente`.`administrador` (
  `idadministrador` INT NOT NULL AUTO_INCREMENT,
  `pessoa_idPessoa` INT NOT NULL,
  PRIMARY KEY (`idadministrador`, `pessoa_idPessoa`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
