drop DATABASE IF EXISTS customer;
CREATE DATABASE customer;
USE customer;
CREATE TABLE customer(
 id BIGINT  PRIMARY key,
 first_name VARCHAR(45),
 last_name VARCHAR(45)
);
INSERT INTO customer(id,first_name,last_name) VALUES
                                            (1,'Nguyễn Lê Huy','huynl'),
                                            (2,'Nông Quốc Trung','TrungNQ');