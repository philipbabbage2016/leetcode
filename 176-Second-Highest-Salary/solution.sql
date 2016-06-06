# Write your MySQL query statement below
select (case a.Salary when NULL then 'NULL' else a.Salary)
from (
select Salary from Employee order by Salary limit 1,1) a