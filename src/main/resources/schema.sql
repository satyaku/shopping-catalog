




CREATE TABLE product(
id INTEGER PRIMARY KEY NOT NULL,
sku VARCHAR(255)  NOT NULL,
name VARCHAR(255)  NOT NULL,
description NCHAR,
item_size VARCHAR(64),
color VARCHAR(64),
price NUMERIC,
brand_id Integer,
seller_id INTEGER,
total_count INTEGER,
status VARCHAR(64)
);

create table categories (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,
   inserted_at timestamp with time zone ,
   updated_at  timestamp with time zone ,
);
create table brand (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,
);
create table sellers (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,

);

create table product_categories (
   product_id  integer                  not null,
   category_id integer                  not null,
);



