CREATE DATABASE sales_manager;
USE sales_manager;
CREATE TABLE customer (
    c_id INT PRIMARY KEY,
    c_name VARCHAR(20),
    c_age INT
);

CREATE TABLE oder (
    o_id INT PRIMARY KEY,
    c_id INT,
    FOREIGN KEY (c_id)
        REFERENCES customer (c_id),
    o_date DATE,
    o_total_price VARCHAR(20)
);

CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(20),
    p_price VARCHAR(20)
);

CREATE TABLE oder_detail(
o_id INT,
p_id INT,
PRIMARY KEY(o_id,p_id),
FOREIGN KEY(o_id) REFERENCES oder(o_id),
FOREIGN KEY(p_id) REFERENCES product(p_id),
o_dqty VARCHAR(20)
);

