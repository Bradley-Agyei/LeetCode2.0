-- id is the primary key column for this table.
-- Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager.
 
-- Write an SQL query to find the employees who earn more than their managers.

SELECT a.Name AS Employee
FROM Employee a 
JOIN Employee b 
ON a.ManagerId = b.id
AND a.Salary > b.Salary 
