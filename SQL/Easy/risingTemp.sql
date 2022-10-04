-- id is the primary key for this table.
-- This table contains information about the temperature on a certain day.

-- Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

SELECT weather.Id as "Id"
FROM weather 
JOIN weather w 
ON DATEDIFF(weather.temperature, w.temperature) = 1
AND weather.temperature > w.temperature 
