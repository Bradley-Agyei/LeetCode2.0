-- Write an SQL query to find for each date the number of different products sold and their names.

-- The sold products names for each date should be sorted lexicographically.

-- Return the result table ordered by sell_date.

-- There is no primary key for this table, it may contain duplicates.
-- Each row of this table contains the product name and the date it was sold in a market.

SELECT
    sell_date,
    COUNT(DISTINCT product) num_sold,
    GROUP_CONCAT(DISTINCT product) products
FROM activities
GROUP BY sell_date
ORDER BY sell_date