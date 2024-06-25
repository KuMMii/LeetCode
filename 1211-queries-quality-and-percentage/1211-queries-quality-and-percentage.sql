# Write your MySQL query statement below
select query_name,
ROUND(SUM(rating/position)/COUNT(*),2) as quality,
ROUND((COUNT(IF(rating<3,rating,null))/COUNT(*))*100,2) as poor_query_percentage
from queries
group by query_name
having query_name is not null;
