-- Last updated: 15/09/2025, 19:34:49
# Write your MySQL query statement below
select name from Customer
where referee_id != 2 OR referee_id is null;