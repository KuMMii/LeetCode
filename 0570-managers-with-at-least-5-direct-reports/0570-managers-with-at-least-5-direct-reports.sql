# Write your MySQL query statement below
select m.name 
from employee e 
join employee m 
on e.managerId=m.id 
group by e.managerId 
having COUNT(e.managerId) >= 5;