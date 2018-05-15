-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`produto` (
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
-- Table `mydb`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`pessoa` (
  `idPessoa` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `rua` VARCHAR(45) NULL,
  `complemento` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `uf` CHAR(2) NULL,
  `cep` CHAR(8) NULL,
  `telefone` VARCHAR(16) NULL,
  PRIMARY KEY (`idPessoa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `dataNascimento` VARCHAR(9) NULL,
  `cpf` VARCHAR(12) NULL,
  `rg` VARCHAR(9) NULL,
  `celular` VARCHAR(13) NULL,
  `email` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT,
  `cnpj` VARCHAR(45) NULL,
  `nomeRepresentante` VARCHAR(45) NULL,
  `celularRepresentante` VARCHAR(13) NULL,
  PRIMARY KEY (`idFornecedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`pessoa_has_cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`pessoa_has_cliente` (
  `Pessoa_idPessoa` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`Pessoa_idPessoa`, `Cliente_idCliente`),
  INDEX `fk_Pessoa_has_Cliente_Cliente1_idx` (`Cliente_idCliente` ASC),
  INDEX `fk_Pessoa_has_Cliente_Pessoa_idx` (`Pessoa_idPessoa` ASC),
  CONSTRAINT `fk_Pessoa_has_Cliente_Pessoa`
    FOREIGN KEY (`Pessoa_idPessoa`)
    REFERENCES `mydb`.`pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pessoa_has_Cliente_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`pessoa_has_fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`pessoa_has_fornecedor` (
  `Pessoa_idPessoa` INT NOT NULL,
  `Fornecedor_idFornecedor` INT NOT NULL,
  PRIMARY KEY (`Pessoa_idPessoa`, `Fornecedor_idFornecedor`),
  INDEX `fk_Pessoa_has_Fornecedor_Fornecedor1_idx` (`Fornecedor_idFornecedor` ASC),
  INDEX `fk_Pessoa_has_Fornecedor_Pessoa1_idx` (`Pessoa_idPessoa` ASC),
  CONSTRAINT `fk_Pessoa_has_Fornecedor_Pessoa1`
    FOREIGN KEY (`Pessoa_idPessoa`)
    REFERENCES `mydb`.`pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pessoa_has_Fornecedor_Fornecedor1`
    FOREIGN KEY (`Fornecedor_idFornecedor`)
    REFERENCES `mydb`.`fornecedor` (`idFornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`relatorioCompra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`relatorioCompra` (
  `cliente_idCliente` INT NOT NULL,
  `produto_codigo` INT NOT NULL,
  `dataCompra` VARCHAR(11) NULL,
  PRIMARY KEY (`cliente_idCliente`, `produto_codigo`),
  INDEX `fk_cliente_has_produto_produto1_idx` (`produto_codigo` ASC),
  INDEX `fk_cliente_has_produto_cliente1_idx` (`cliente_idCliente` ASC),
  CONSTRAINT `fk_cliente_has_produto_cliente1`
    FOREIGN KEY (`cliente_idCliente`)
    REFERENCES `mydb`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_produto_produto1`
    FOREIGN KEY (`produto_codigo`)
    REFERENCES `mydb`.`produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
