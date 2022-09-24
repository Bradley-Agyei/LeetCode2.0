-- id is the primary key column for this table.
-- Each row of this table contains an email. The emails will not contain uppercase letters.
 

-- Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. Note that you are supposed to write a DELETE statement and not a SELECT one.

DELETE p2 FROM Person p1
JOIN Person p2 
ON p1.email = p2.email 
WHERE p1.id < p2.id 