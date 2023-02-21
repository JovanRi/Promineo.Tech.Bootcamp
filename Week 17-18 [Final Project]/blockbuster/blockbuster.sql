-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema blockbuster
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema blockbuster
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `blockbuster` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `blockbuster` ;

-- -----------------------------------------------------
-- Table `blockbuster`.`director`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blockbuster`.`director` (
  `director_id` INT NOT NULL AUTO_INCREMENT,
  `director_name` TEXT NOT NULL,
  `nationality` TEXT NOT NULL,
  `gender` VARCHAR(20) NOT NULL,
  `awards` INT NOT NULL,
  PRIMARY KEY (`director_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `blockbuster`.`genre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blockbuster`.`genre` (
  `genre_id` INT NOT NULL AUTO_INCREMENT,
  `genre_name` VARCHAR(128) NOT NULL,
  PRIMARY KEY (`genre_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `blockbuster`.`movies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blockbuster`.`movies` (
  `movies_id` INT NOT NULL AUTO_INCREMENT,
  `director_id` INT NOT NULL,
  `movies_name` VARCHAR(128) NOT NULL,
  `rating` INT NULL DEFAULT NULL,
  `synopsis` TEXT NULL DEFAULT NULL,
  PRIMARY KEY (`movies_id`),
  INDEX `director_id` (`director_id` ASC) VISIBLE,
  CONSTRAINT `movies_ibfk_1`
    FOREIGN KEY (`director_id`)
    REFERENCES `blockbuster`.`director` (`director_id`)
    ON DELETE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `blockbuster`.`movies_genre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blockbuster`.`movies_genre` (
  `movies_id` INT NOT NULL,
  `genre_id` INT NOT NULL,
  UNIQUE INDEX `movies_id` (`movies_id` ASC, `genre_id` ASC) VISIBLE,
  INDEX `genre_id` (`genre_id` ASC) VISIBLE,
  CONSTRAINT `movies_genre_ibfk_1`
    FOREIGN KEY (`movies_id`)
    REFERENCES `blockbuster`.`movies` (`movies_id`)
    ON DELETE CASCADE,
  CONSTRAINT `movies_genre_ibfk_2`
    FOREIGN KEY (`genre_id`)
    REFERENCES `blockbuster`.`genre` (`genre_id`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
