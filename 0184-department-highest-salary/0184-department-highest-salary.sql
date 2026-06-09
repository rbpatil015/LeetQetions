# Write your MySQL query statement below
select d.name as Department,
e.name as Employee , 
e.salary as Salary 
from employee e 
inner join Department d 
on d.id=e.departmentId 
where (e.departmentId, e.salary)
in (
    select departmentId , max(salary) 
    from employee 
    group by departmentId
    );