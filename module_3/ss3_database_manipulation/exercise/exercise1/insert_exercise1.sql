drop database if exists student_management;
create database student_management;
use student_management;
CREATE TABLE class (
    class_id INT PRIMARY KEY AUTO_INCREMENT,
    class_name VARCHAR(20),
    start_date DATE,
    `status` INT
);

CREATE TABLE student(
student_id int primary key AUTO_INCREMENT,
student_name varchar(45),
address varchar(45),
phone varchar(20),
`status` int,
class_id int
);

create table `subject`(
sub_id int PRIMARY key AUTO_INCREMENT,
sub_name varchar(45),
credit int,
`status` int
);

CREATE table mark(
mark_id int PRIMARY key AUTO_INCREMENT,
sub_id int,
student_id int,
mark int,
exam_times int
);