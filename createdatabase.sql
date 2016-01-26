
CREATE TABLE `database1`.`registeredusers` (
  `userId` INT NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(100) NOT NULL,
  `userMail` VARCHAR(200) NOT NULL,
  `userType` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `userId_UNIQUE` (`userId` ASC));
ALTER TABLE `database1`.`registeredusers` 
ADD COLUMN `userpassword` VARCHAR(45) NOT NULL AFTER `userType`;  
INSERT INTO `database1`.`registeredusers` (`userName`, `userMail`, `userType`,`userpassword`) VALUES ('test1', 'test1@yahoo.com', 'person','test');
INSERT INTO `database1`.`registeredusers` (`userName`, `userMail`, `userType`,`userpassword`) VALUES ('test2', 'test2@yahoo.com', 'organization','test');


  CREATE TABLE `database1`.`messages` (
  `userId` INT NOT NULL,
  `destId` INT NOT NULL,
  `message` VARCHAR(500) NULL,
  `messageDate` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `messageRead` TINYINT(1) NOT NULL DEFAULT 0,
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `uID_idx` (`userId` ASC),
  INDEX `dID_idx` (`destId` ASC),
  CONSTRAINT `uID`
    FOREIGN KEY (`userId`)
    REFERENCES `database1`.`registeredusers` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `dID`
    FOREIGN KEY (`destId`)
    REFERENCES `database1`.`registeredusers` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
ALTER TABLE `database1`.`messages` 
CHANGE COLUMN `id` `messageId` INT(11) NOT NULL AUTO_INCREMENT ;

INSERT INTO `database1`.`messages` (`userId`, `destId`, `message`) VALUES ('1', '2', 'mes test');
INSERT INTO `database1`.`messages` (`userId`, `destId`, `message`) VALUES ('1', '2', 'mes test 2');
INSERT INTO `database1`.`messages` (`userId`, `destId`, `message`) VALUES ('2', '1', 'mes test 3');
