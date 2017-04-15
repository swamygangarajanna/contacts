CREATE DATABASE `contacts_app` /*!40100 DEFAULT CHARACTER SET utf8 */;

grant all on *.* to ''@localhost identified by 'root' with GRANT OPTION;
flush privileges;

CREATE TABLE `contacts_app`.`sequence` (
  `SEQUENCE_NAME` INT NOT NULL,
  `SEQUENCE_NEXT_VALUE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`SEQUENCE_NAME`, `SEQUENCE_NEXT_VALUE`));
  

CREATE TABLE `contacts_app`.`reg_user` (
  `user_name` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NULL,
  `sur_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `mobile_number` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_name`),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC))ENGINE = InnoDB;



CREATE TABLE `contacts_app`.`contact` (
  `contact_name` VARCHAR(20) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NULL,
  `sur_name` VARCHAR(45) NOT NULL,
  `address_id` INT NOT NULL COMMENT 'FK to address table',
  `email` VARCHAR(45) NOT NULL,
  `contact_num` VARCHAR(45) NOT NULL,
  `mobile_number` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`conatct_name`))ENGINE = InnoDB;
  
  
CREATE TABLE `contacts_app`.`address` (
  `address_id` INT NOT NULL AUTO_INCREMENT,
  `unit` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `area` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `pincode` INT NOT NULL,
  PRIMARY KEY (`address_id`))ENGINE = InnoDB;
  
  
  SELECT * FROM contacts_app.address;
  
  SELECT * FROM contacts_app.contact;
  
  /*
ALTER TABLE `contacts_app`.`contact` 
CHANGE COLUMN `conatct_name` `contact_name` VARCHAR(20) NOT NULL ;

ALTER TABLE `contacts_app`.`contact` 
DROP COLUMN `alt_conctact_num`;


*/
