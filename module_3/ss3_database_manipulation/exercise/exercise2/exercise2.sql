drop database if exists sale_manager;
CREATE database sale_manager;
use sale_manager;

CREATE TABLE customer (
    c_id INT PRIMARY KEY,
    name VARCHAR(25),
    c_age INT
);

CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(25),
    p_price INT
);

CREATE TABLE oder (
    o_id INT PRIMARY KEY,
    c_id INT,
    o_date DATETIME,
    o_total_price INT,
    FOREIGN KEY (c_id)
        REFERENCES customer (c_id)
);

CREATE TABLE order_detail (
    o_id INT,
    p_id INT,
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id)
        REFERENCES oder (o_id),
    FOREIGN KEY (p_id)
        REFERENCES product (p_id),
    o_dqty INT
);

INSERT INTO customer 
VALUES(1,'Minh Quân',10),
	  (2,'Ngọc Oanh',20),
      (3,'Hồng Hà',50);
      
INSERT INTO product
VALUES(1,'may giat', 3),
      (2,'tu lanh', 5),
      (3,'dieu hoa', 7),
      (4,'quat',1),
      (5,'bep dien',2);
      
INSERT INTO oder
VALUES(1, 1, '2006-03-26', NULL),
      (2, 2, '2006-03-23', NULL),
      (3, 1, '2006-03-16', NULL);
      
INSERT INTO order_detail
VALUES(1,1,3),
	 (3,3,7),
     (1,4,2),
     (2,1,1),
     (3,1,8),
     (2,5,4),
     (2,3,3);
     
     
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oder.o_id,oder.o_date,oder.o_total_price 
FROM oder;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT customer.name, product.p_name
FROM customer
join oder on customer.c_id = oder.c_id
join order_detail on oder.o_id = order_detail.o_id
join product on product.p_id = order_detail.p_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT customer.c_id, customer.name, customer.c_age, oder.o_id
FROM customer
LEFT JOIN oder  on customer.c_id = oder.c_id
WHERE oder.c_id is null;

	-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
--     Giá bán của từng loại được tính = odQTY*pPrice)
select oder.o_id, oder.o_date, order_detail.o_dqty * product.p_price as tatol
from oder join order_detail on oder.o_id = order_detail.o_id join product on order_detail.p_id = product.p_id;

