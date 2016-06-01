# Write your MySQL query statement below
select distinct(p1.Email) from Person as p1 inner join Person as p2 where p1.Email = p2.Email and p1.Id<>p2.Id; 