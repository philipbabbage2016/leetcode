# Write your MySQL query statement below
select a.Name as Customers from Customers a  left join (select distinct CustomerId from Orders ) b on a.Id = b.CustomerId where  CustomerId is  null