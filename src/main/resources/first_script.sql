-- MySQL Script generated by MySQL Workbench
-- Sun Sep 29 12:14:11 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Zodiacs`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Zodiacs` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Zodiacs` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `zodiac_sign` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Planets`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Planets` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Planets` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `planet` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`City`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`City` ;

CREATE TABLE IF NOT EXISTS `mydb`.`City` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `birth_city` VARCHAR(45) NULL,
  `birth_country` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Date`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Date` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Date` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `birth_date` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Nationality`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Nationality` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Nationality` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nationality` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Time`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Time` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Time` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `time_of_birth` VARCHAR(45) NULL,
  `time_zone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Gender`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Gender` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Gender` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Gender` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Natives`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Natives` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Natives` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NULL,
  `Zodiacs_id` INT NOT NULL,
  `Planets_id` INT NOT NULL,
  `City_id` INT NOT NULL,
  `Date_id` INT NOT NULL,
  `Nationality_id` INT NOT NULL,
  `Time_id` INT NOT NULL,
  `Gender_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Natives_Zodiacs_idx` (`Zodiacs_id` ASC) VISIBLE,
  INDEX `fk_Natives_Planets1_idx` (`Planets_id` ASC) VISIBLE,
  INDEX `fk_Natives_City1_idx` (`City_id` ASC) VISIBLE,
  INDEX `fk_Natives_Date1_idx` (`Date_id` ASC) VISIBLE,
  INDEX `fk_Natives_Nationality1_idx` (`Nationality_id` ASC) VISIBLE,
  INDEX `fk_Natives_Time1_idx` (`Time_id` ASC) VISIBLE,
  INDEX `fk_Natives_Gender1_idx` (`Gender_id` ASC) VISIBLE,
  CONSTRAINT `fk_Natives_Zodiacs`
    FOREIGN KEY (`Zodiacs_id`)
    REFERENCES `mydb`.`Zodiacs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Natives_Planets1`
    FOREIGN KEY (`Planets_id`)
    REFERENCES `mydb`.`Planets` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Natives_City1`
    FOREIGN KEY (`City_id`)
    REFERENCES `mydb`.`City` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Natives_Date1`
    FOREIGN KEY (`Date_id`)
    REFERENCES `mydb`.`Date` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Natives_Nationality1`
    FOREIGN KEY (`Nationality_id`)
    REFERENCES `mydb`.`Nationality` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Natives_Time1`
    FOREIGN KEY (`Time_id`)
    REFERENCES `mydb`.`Time` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Natives_Gender1`
    FOREIGN KEY (`Gender_id`)
    REFERENCES `mydb`.`Gender` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Zodiacs_has_Planets`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Zodiacs_has_Planets` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Zodiacs_has_Planets` (
  `Zodiacs_id` INT NOT NULL,
  `Planets_id` INT NOT NULL,
  PRIMARY KEY (`Zodiacs_id`, `Planets_id`),
  INDEX `fk_Zodiacs_has_Planets_Planets1_idx` (`Planets_id` ASC) VISIBLE,
  INDEX `fk_Zodiacs_has_Planets_Zodiacs1_idx` (`Zodiacs_id` ASC) VISIBLE,
  CONSTRAINT `fk_Zodiacs_has_Planets_Zodiacs1`
    FOREIGN KEY (`Zodiacs_id`)
    REFERENCES `mydb`.`Zodiacs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Zodiacs_has_Planets_Planets1`
    FOREIGN KEY (`Planets_id`)
    REFERENCES `mydb`.`Planets` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Houses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Houses` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Houses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `house` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Planets_has_Houses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Planets_has_Houses` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Planets_has_Houses` (
  `Planets_id` INT NOT NULL,
  `Houses_id` INT NOT NULL,
  PRIMARY KEY (`Planets_id`, `Houses_id`),
  INDEX `fk_Planets_has_Houses_Houses1_idx` (`Houses_id` ASC) VISIBLE,
  INDEX `fk_Planets_has_Houses_Planets1_idx` (`Planets_id` ASC) VISIBLE,
  CONSTRAINT `fk_Planets_has_Houses_Planets1`
    FOREIGN KEY (`Planets_id`)
    REFERENCES `mydb`.`Planets` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Planets_has_Houses_Houses1`
    FOREIGN KEY (`Houses_id`)
    REFERENCES `mydb`.`Houses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Zodiacs_has_Houses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Zodiacs_has_Houses` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Zodiacs_has_Houses` (
  `Zodiacs_id` INT NOT NULL,
  `Houses_id` INT NOT NULL,
  PRIMARY KEY (`Zodiacs_id`, `Houses_id`),
  INDEX `fk_Zodiacs_has_Houses_Houses1_idx` (`Houses_id` ASC) VISIBLE,
  INDEX `fk_Zodiacs_has_Houses_Zodiacs1_idx` (`Zodiacs_id` ASC) VISIBLE,
  CONSTRAINT `fk_Zodiacs_has_Houses_Zodiacs1`
    FOREIGN KEY (`Zodiacs_id`)
    REFERENCES `mydb`.`Zodiacs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Zodiacs_has_Houses_Houses1`
    FOREIGN KEY (`Houses_id`)
    REFERENCES `mydb`.`Houses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
