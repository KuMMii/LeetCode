# Write your MySQL query statement below
# select m.name as name 
# from employee e 
# left join 
# (select managerId, count(managerId) 
# from employee 
# group by managerId) m 
# on e.managerId=m.id
# where
# group by m.name, m.department;

# select managerId, count(managerId) 
# from employee 
# group by managerId 

select e.name as name 
from (select managerId, count(managerId) as count 
from employee 
group by managerId) m 
join employee e 
on m.managerId=e.id 
where m.count >= 5;
