drop database if exists ss5_exercise;
CREATE database ss5_exercise;
use ss5_exercise;
CREATE TABLE products (
    p_id INT,
    p_code VARCHAR(45),
    p_name VARCHAR(45),
    p_price DOUBLE,
    p_amount VARCHAR(45),
    p_description VARCHAR(45),
    p_status VARCHAR(45)
);
USE ss5_exercise;
 INSERT INTO products( p_id, p_code, p_name, p_price, p_amount, p_description, p_status)
 VALUES (1, 'one', 'áo', 1500, 'jean', 'new', 'good'),
        (2, 'two', 'quần', 1400, 'hoodie', 'secondhand', 'good');
        
CREATE UNIQUE INDEX product ON products(p_code); 
  
CREATE UNIQUE INDEX clothes ON products(p_name, p_price);

EXPLAIN SELECT * FROM ss5_exercise.products;    

CREATE VIEW products_view AS
SELECT p_code, p_name, p_price, p_status
FROM products;  
 
UPDATE products_view
   SET p_code =  'five'
   WHERE p_code = 'one' ;
   
DROP VIEW products_view; 

delimiter //
CREATE PROCEDURE sp_get_all_products()
BEGIN
SELECT p_id, p_code, p_name, p_price,p_amount, p_description, p_status
from products ;
end //
delimiter ;


       


