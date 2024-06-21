# Write your MySQL query statement below

# ROUND(AVG(SUM(price*units)),2) as average_price
# and (purchase_date between start_date and end_date)
select p.product_id, (ROUND(IFNULL(SUM(price*units)/sum(units),0),2)) as average_price
from prices p 
left join unitssold u 
on p.product_id=u.product_id 
and (purchase_date between start_date and end_date)
group by p.product_id;

