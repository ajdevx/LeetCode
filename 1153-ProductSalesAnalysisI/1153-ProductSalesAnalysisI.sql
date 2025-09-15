-- Last updated: 15/09/2025, 19:34:29
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from sales as s
inner join product as p
on s.product_id = p.product_id;
