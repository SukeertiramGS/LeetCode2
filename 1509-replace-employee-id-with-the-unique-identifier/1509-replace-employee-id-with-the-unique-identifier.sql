# Write your MySQL query statement below
select e.unique_id,emp.name from Employees as emp left join EmployeeUNI as e on emp.id=e.id;