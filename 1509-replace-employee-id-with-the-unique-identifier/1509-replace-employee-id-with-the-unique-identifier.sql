# Write your MySQL query statement below
select unique_id, name
FROM employees e
left join employeeuni u on e.id = u.id