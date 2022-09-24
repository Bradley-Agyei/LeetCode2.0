-- (player_id, event_date) is the primary key of this table.
-- This table shows the activity of players of some games.
-- Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.
 

-- Write an SQL query to report the first login date for each player.

SELECT player_id, min(event_date) as first_login
FROM activity
GROUP BY player_id 