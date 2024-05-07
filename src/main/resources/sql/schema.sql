create database cryptoautomation;
show databases;
use cryptoautomation;

create table report_history(
                               'id' int NOT NULL AUTO_INCREMENT PRIMARY KEY,

                               'market' VARCHAR(45),

                               'price' VARCHAR(45),

                               'reported_at' DATETIME

);
select * from report_history;