# Write your MySQL query statement below
select Salary from (select Salary from Employee order by Salary limit 1,1);