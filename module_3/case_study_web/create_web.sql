drop database if exists case_study_web;
create DATABASE case_study_web;
use case_study_web;
create table `position`(
                   id int primary key,
                   name varchar(45));
CREATE table education_degree(
                   id int PRIMARY key,
                   name varchar(45));
CREATE table division(
                   id int PRIMARY key,
                   name varchar(45));
CREATE table employee(
                   id int PRIMARY key,
                   name VARCHAR(45),
                   date_of_birth DATE,
                   id_card VARCHAR(45),
                   salary double,
                   phone_number varchar(45),
                   email varchar(45),
                   address varchar(45),
                   FOREIGN KEY(id) REFERENCES `position`(id),
                   FOREIGN KEY(id) REFERENCES education_degree(id),
                   FOREIGN KEY(id) REFERENCES division(id),
                   username varchar(45));
CREATE table customer_type(
                   id int primary key,
                   name varchar(45));
create table customer(
                   id int PRIMARY key,
                   FOREIGN KEY(id) REFERENCES customer_type(id),
                   name varchar(45),
                   date_of_birth date,
                   gender bit(1),
                   id_card varchar(45),
                   phone_number varchar(45),
                   email varchar(45),
                   address VARCHAR(45));
CREATE table facility_type(
                   id int PRIMARY key,
                   name varchar(45));
CREATE table rent_type(
					id int primary key,
                    name varchar(45));
create table facility(
                    id int primary key, 
                    name varchar(45),
                    area int,
                    cost DOUBLE,
                    max_people int,
                    FOREIGN KEY(id) REFERENCES rent_type(id),
                    FOREIGN KEY(id) REFERENCES facility_type(id),
                    standard_room varchar(45),
                    description_other_convenience varchar(45),
                    pool_area double,
                    number_of_floors int,
                    facility_free TEXT );
create table contract(
                    id int primary key,
                    start_date DATETIME,
                    end_date DATETIME,
                    deposit double,
                    FOREIGN KEY(id) REFERENCES employee(id),
                    FOREIGN KEY(id) REFERENCES customer(id),
                    FOREIGN Key(id) REFERENCES facility(id) );
CREATE table role(
                    role_id int PRIMARY key,
                    role_name varchar(255) );
CREATE table user( 
                    username varchar(255) PRIMARY key,
                    password varchar(255) );
CREATE table user_role(
                    role_id int,
                    username varchar(255),
                    PRIMARY KEY (role_id, username),
                    FOREIGN KEY(role_id) REFERENCES role(role_id),
                    FOREIGN KEY(username) REFERENCES user(username) );
CREATE table attach_facility(
                    id int PRIMARY key,
                    name varchar(45),
                    cost double,
                    unit varchar(10),
                    status varchar(45) );
CREATE TABLE contract_detail(
                    id int PRIMARY key,
                    FOREIGN KEY(id) REFERENCES contract(id),
                    FOREIGN KEY(id) REFERENCES attach_facility(id),
                    quantity int ) ;
                                   