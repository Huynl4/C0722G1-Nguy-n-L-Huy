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
        
--  Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
CREATE UNIQUE INDEX product ON products(p_code); 
  
--   Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
CREATE UNIQUE INDEX clothes ON products(p_name, p_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
EXPLAIN SELECT * FROM ss5_exercise.products;    

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
CREATE VIEW products_view AS
SELECT p_code, p_name, p_price, p_status
FROM products;  
 
--  Tiến hành sửa đổi view
UPDATE products_view
   SET p_code =  'five'
   WHERE p_code = 'one' ;
   
   
-- Tiến hành xoá view
DROP VIEW products_view; 


-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
CREATE PROCEDURE sp_get_all_products()
BEGIN
SELECT p_id, p_code, p_name, p_price,p_amount, p_description, p_status
from products ;
end //
delimiter ;

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure sp_add_products(
in p_id int ,
in p_code varchar(45),
in p_name varchar(45),
in p_price double,
in p_amount int,
in p_description varchar(500),
in p_status varchar(45))
begin
insert into products value(p_id,p_code,p_name,p_price,p_amount,p_description,p_status);
end //
delimiter ;
call sp_add_products(3,'five','dép',1300,'sandal','new','good');

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure sp_edit_products(in p_name varchar(45),in p_id int)
begin
update products 
set product_name=p_name
where id=p_id;
end //
delimiter ;

call sp_edit_products('sữa',11);

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure sp_delete_products(in p_id int)
begin
delete from products
where id=p_id;
end //
delimiter ;
call sp_delete_products(10);
       


