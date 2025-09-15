-- Last updated: 15/09/2025, 19:34:20
# Write your MySQL query statement below
select e2.unique_id,e1.name from
employees as e1
left join employeeUNI as e2
on e1.id = e2.id;