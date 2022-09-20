-- Write an SQL query to report the names of the customer that are not referred by the customer with id = 2.

-- Return the result table in any order.

-- id is the primary key column for this table.
-- Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

SELECT name 
FROM Customer
WHERE NOT referee_id = 2 OR referee_id is NULL