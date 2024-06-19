# Write your MySQL query statement below

select s.user_id, 
    IF(COUNT(*) IS NULL, 0, 
         ROUND((COUNT(IF(c.action='confirmed',c.action,null))/COUNT(*)),2)) as confirmation_rate 
from signups s 
left join confirmations c 
on s.user_id=c.user_id 
group by s.user_id;