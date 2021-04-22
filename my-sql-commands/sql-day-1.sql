use bt_db;
show tables;
select * from trainee;

-- DDL COMMANDS
-- CREATE ALTER DROP TRUNCATE
-- CREATE TABLE table-name(col-name data-type, col-name data-type,....)
-- int varchar char date number(5,4)

create table employee(emp_id int primary key, emp_name varchar(30), salary float, dob date);
desc employee; 

alter table employee add email varchar(30); 
alter table employee modify email varchar(50); 

drop table employee; 
truncate table trainee;

-- CONSTRAINT
-- NOT NULL
-- PRIMARY KEY
-- UNIQUE
-- CHECKED
-- FOREIGN KEY

CREATE TABLE dept (
		deptno int,
        dname varchar(30) NOT NULL,
        location varchar(50),
        constraint pk_dept primary key(deptno)
        );
        
        
desc dept;
drop table dept;
        
create table employee(
		emp_id int primary key, 
        emp_name varchar(30), 
        salary float, 
        dob date,
        deptno int,
		constraint fk_deptno foreign key(deptno) references dept(deptno)
        );

-- DML COMMANDS
-- insert update delete

insert into dept values(30,'SALES','Delhi');
insert into employee values(104,'Harsh', 28000, '1995-04-20',30);
insert into employee values(105,'Praveen', 55000, '1993-05-10',10);
insert into employee values(106,'Pritam', 35000, '1997-02-15',20);
insert into employee values(107,'Gaurav', 29000, null,30);

insert into dept(deptno,dname) values(50,'HR');


SELECT * FROM DEPT;

update employee set salary=salary+10000 where emp_id=101;
select * from employee;

delete from employee where emp_id=101;

-- DQL SELECT

select emp_name,salary from employee;
select distinct deptno from employee;

-- WHERE

select * from employee where salary>=40000 and deptno=10;

select * from employee where salary>=42000 OR deptno=10;

SELECT * FROM employee where salary>=38000 AND salary<=48000;

select * from employee where salary between 38000 AND 48000;

select * from employee where salary not between 38000 AND 48000;

select * from employee where emp_name='Rohit' OR emp_name='Harsh' OR emp_name='Praveen';

select * from employee where emp_name NOT IN('Rohit','Harsh','Praveen');

SELECT * FROM employee ORDER BY salary desc;
SELECT * FROM employee ORDER BY 5 desc;

select count(*) as 'Total Employee' from employee where deptno=10;

select deptno, count(*) as 'Total Employee', avg(salary) as 'Average Salary',
		max(salary) as 'Max Salary',
        sum(salary) as 'Total Salary',
        min(salary) as 'Minimum Salary'
 from employee where deptno<>10 group by deptno having max(salary)<50000 order by 2 desc;

select emp_name,e.deptno,d.location from employee e join dept d on e.deptno=d.deptno;


select * from employee where dob is not null;





