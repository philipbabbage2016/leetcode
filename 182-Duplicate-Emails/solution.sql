# Write your MySQL query statement below
select p1.Email from Person as p1 left join Person as p2 where p1.Email = p2.Email and P1.Id<>P2.Id  where p2.ID is not NUll;