CREATE TABLE item1 (
item_code INT(5) null,
item_name VARCHAR(20) null,
rate FLOAT(13,2) null,
stock_in_hand INT(7) null
)ENGINE=INNODB;


CREATE TABLE item2 (
customer_code INT(5) NULL,
customer_name VARCHAR(25) NULL,
Address VARCHAR(30) NULL,
City VARCHAR(20) NULL,
State VARCHAR(20) NULL,
pin_no INT(6) NULL,
phone_no INT(15) NULL
)ENGINE=INNODB;


CREATE TABLE item3 (
Billno INT(6) NULL,
customer_type VARCHAR(8) NULL,
Name VARCHAR(25) NULL,
Date DATE NULL,
item_code INT(16) NULL,
item_name VARCHAR(15) NULL,
Quantity INT(7) NULL,
Amount FLOAT(13,2) NULL,
Discount FLOAT(13,2) NULL,
Netamount FLOAT(13,2) NULL
)ENGINE=INNODB;

CREATE TABLE item4 (
supplier_code INT(5) NULL,
supplier_name VARCHAR(25) NULL,
Address VARCHAR(30) NULL,
City VARCHAR(20) NULL,
State VARCHAR(20) NULL,
pin_no INT(6) NULL,
phone_no INT(15) NULL
)ENGINE=INNODB;