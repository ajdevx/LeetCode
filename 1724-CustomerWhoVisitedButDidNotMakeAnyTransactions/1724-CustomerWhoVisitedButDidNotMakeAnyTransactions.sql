-- Last updated: 15/09/2025, 19:34:12
# Write your MySQL query statement below
select v.customer_id,count(v.customer_id) as count_no_trans
from Visits AS v
LEFT JOIN TRANSACTIONS AS t
ON v.visit_id= t.visit_id
where transaction_id is null
group by v.customer_id;
