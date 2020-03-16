

INSERT INTO product (id, sku, name, description,item_size,color,price,brand_id,seller_id,total_count,status) VALUES
(1, 'shitrsmall001', 'tshirt', 'test desc', 'm' , 'black' , 123 , 1,2,10,'Available'),
(2, 'shitrsmall002', 'tshirt', 'test desc1', 's' , 'white' , 13 , 2,2,110,'Available'),
(3, 'shitrsmall003', 'jacket', 'test desc2', 'm' , 'black' , 123 , 3,2,10,'Blocked');

INSERT INTO brand (id, name) VALUES
(1, 'nike'),
(2, 'puma'),
(3, 'dell');

INSERT INTO categories (id, name) VALUES
(1, 'fit T shirt'),
(2, 'pants'),
(3, 'jacket');

INSERT INTO sellers (id, name) VALUES
(1, 'myntra_auth_store'),
(2, 'jabong_auth_store'),
(3, 'andheri_retials_limited');

INSERT INTO product_categories (product_id,category_id) VALUES
(1, 1),
(2, 1),
(3, 3);

