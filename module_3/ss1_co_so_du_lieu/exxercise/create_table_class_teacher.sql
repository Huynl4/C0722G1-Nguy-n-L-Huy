create database exercise;
use exercise;
create table class(
 id int primary key ,
`name` varchar(50));
create table teacher(
id int primary key,
`name` varchar(10),
age int,
coutry varchar(10));
insert into class(id,name)value(1,'Huynl'),(2,'huyNL');
select * from class;
set sql_safe_updates = 0;
update class set id = 100 where id =2;
insert into teacher 
value(1,'Huynl',18,'USA'),
     (2,'LEHUY',19,'Thailand'),
     (3,'HUY',20,'VN');
update teacher set age = 24; 
delete from teacher where id = 3; 
insert into teacher
value(3,'huy',24,'canada');  
select name,coutry
from teacher;  