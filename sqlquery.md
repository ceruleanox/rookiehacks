-- create database storeMgmtSystem;
-- show databases;

-- use storeMgmtSystem;

-- create table login(username varchar(25), password varchar(25));
-- insert into login values('admin', '12345');
-- select * from login;

    create table items(
        id integer not null,
        item_name varchar(255) not null,
        price float,
        item_count int not null,
        available_item int not null,
        borrow_charge varchar(255) not null,
        duration varchar(255) not null,
        duration_type varchar(1) not null default 'D',
        borrow_status varchar(1) not null default 'I',
    
        constraint primary key(id)
    );