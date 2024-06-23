# Write your MySQL query statement below
select c.contest_id, ROUND((COUNT(r.user_id)/COUNT(*))*100,2) as percentage
from users u
cross join (select distinct contest_id from register) c
left join register r
on c.contest_id=r.contest_id and u.user_id=r.user_id
group by c.contest_id
order by percentage desc, c.contest_id;

# ROUND((IFNULL(r.user_id,0)/COUNT(*))*100,2) as percentage

