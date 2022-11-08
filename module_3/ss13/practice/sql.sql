CREATE DATABASE if not EXISTS demo;
USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');

DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;
DELIMITER $$

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;

delimiter //
CREATE PROCEDURE select_user()
BEGIN 
SELECT * FROM users;
end //
delimiter ;

delimiter // 
CREATE PROCEDURE edit_user(
IN name_edit varchar(50),
IN email_edit varchar(50),
IN country_edit varchar(50),
IN id_edit int)
BEGIN
UPDATE users set name = name_edit, email = email_edit, country = country_edit where id=id_edit;
end //
delimiter ;

delimiter // 
CREATE PROCEDURE delete_user(in id_delete int)
BEGIN
delete from users where users.id = id_delete;
END //
delimiter ;
call delete_user(5);