select * from (
            select rank () over (partition by department_id order by salary desc) rn
            ,last_name, department_id, salary 
            from employees) 
where rn < 4;


select  dept_name, emp_name, salary from (
	select d.name as dept_name, e.name as emp_name, e.salary, 
	rank() over(partition by d.name order by e.salary desc) as rank_count 
	from employee e, department d 
	where d.id = e.dept_id) a 
where a.rank_count <4


