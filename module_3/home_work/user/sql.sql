CREATE DATABASE IF not EXISTS homework;
USE homework;
CREATE TABLE user(
id INT(3) NOT NULL AUTO_INCREMENT,
name varchar(45)  NOT NULL,
email VARCHAR(45) NOT NULL,
country VARCHAR(77),
PRIMARY KEY (id)
);

INSERT INTO user(name, email, country) VALUES ("Nguyễn Lê Huy","nglehuy@gmail.com","Việt Nam");
INSERT INTO user(name, email, country) VALUES ("Huynl","huynl4@gmail.com","Canada");
