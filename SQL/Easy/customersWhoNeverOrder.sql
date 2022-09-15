-- id is the primary key column for this table.
-- Each row of this table indicates the ID and name of a customer.

-- id is the primary key column for this table.
-- customerId is a foreign key of the ID from the Customers table.
-- Each row of this table indicates the ID of an order and the ID of the customer who ordered it.

-- Write an SQL query to report all customers who never order anything.

SELECT c.name FROM Customers c 
WHERE c.id NOT IN 
(
    SELECT customerid FROM Orders 
)