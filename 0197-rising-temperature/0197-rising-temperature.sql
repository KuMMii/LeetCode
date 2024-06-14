# Write your MySQL query statement below
# Wrong answer
# select a.id 
# from Weather a
# join Weather b
# on (a.recordDate-1)=b.recordDate 
# where a.temperature > b.temperature;

select a.id 
from Weather a 
join Weather b 
on DATEDIFF(a.recordDate, b.recordDate) =1 
where a.temperature > b.temperature;