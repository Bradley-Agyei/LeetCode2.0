-- product_id is the primary key for this table.
-- low_fats is an ENUM of type ('Y', 'N') where 'Y' means this product is low fat and 'N' means it is not.
-- recyclable is an ENUM of types ('Y', 'N') where 'Y' means this product is recyclable and 'N' means it is not.
 

-- Write an SQL query to find the ids of products that are both low fat and recyclable.

SELECT product_id FROM Products WHERE low_fats = 'Y' and recyclable = 'Y'