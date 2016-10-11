# gui

CREATE TABLE item1 (
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
item_code INT(5) null,
item_name VARCHAR(20) null,
rate FLOAT(13,2) null,
stock_in_hand INT(7) null
)ENGINE=INNODB;
