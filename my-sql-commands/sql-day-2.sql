select * from emp order by deptno asc, job desc;

select ename, hiredate, floor(datediff(curdate(), hiredate)/365) as 'Experience' from emp;



select ename, hiredate, extract(year from curdate())-extract(year from hiredate) as 'Experience Years' from emp;

SELECT * FROM EMPLOYEE;
SELECT * FROM DEPT;

-- JOINS
-- OUTER JOIN - LEFT JOIN, RIGHT JOIN, FULL JOIN
-- INNER JOIN
-- CROSS JOIN
-- SELF JOIN


SELECT emp_id,emp_name, d.deptno, dname, location from employee e right join dept d on e.deptno=d.deptno;

select d.* from dept d left join employee e on d.deptno=e.deptno where emp_id is null;

select e.*, location from employee e join dept d using(deptno) where location='Bangalore'; 

select e.*, location from employee e,dept d where d.deptno=e.deptno and location='Bangalore'; 

select e1.emp_name, e1.salary from employee e1 join employee e2 on e1.salary>e2.salary where e2.emp_name='Rohit';

-- SUB QUERIES

SELECT salary FROM employee WHERE emp_name='Rohit'; 

select * from employee where salary > (SELECT salary FROM employee WHERE emp_name='Rohit');
select * from emp;
select distinct mgr from emp;

select * from emp where empno in(select distinct mgr from emp);
select distinct e1.* from emp e1 join emp e2 on e1.empno=e2.mgr;

select d.* from dept d left join employee e on d.deptno=e.deptno where emp_id is null;
select d.*,(select count(e.emp_id) from employee e where e.deptno=d.deptno) as 'Total_Employees' from dept d;

select * from employee e join dept d using(deptno) where salary=(select max(salary) from employee e join dept d using(deptno) where d.dname='IT') and d.dname='IT' ;

update employee set salary= 55000 where emp_id=104;

select e.* from employee e join dept d using(deptno) where d.dname='IT' order by salary desc limit 1;

create table IT_EMPLOYEE AS (select * from employee where deptno=10);

select * from it_employee;

set autocommit=0;
savepoint p1;

delete from employee where emp_id>0;

select * from employee;

rollback to p1;

set autocommit=1;

 