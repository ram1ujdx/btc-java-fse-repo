
use bt_db;

create table emp(
EMPNO bigint(4), ENAME varchar(30), JOB varchar(30),
HIREDATE date, MGR bigint(4), SAL bigint(4), COMM bigint(4),
DEPTNO bigint(2));

desc emp;

INSERT into emp values('7369', 'SMITH', 'CLERK', '1980-12-17', '7902', '800', NULL, '20');
select * 
from emp;
INSERT into emp values('7499', 'ALLEN', 'SALESMAN', '1981-02-20', '7698', '1600', '300', '30');
INSERT into emp values('7521', 'WARD', 'SALESMAN', '1981-02-22', '7698', '1250', '500', '30');
INSERT into emp values('7566', 'JONES', 'MANAGER', '1981-04-02', '7839', '2975', NULL, '20');
INSERT into emp values('7654', 'MARTIN', 'SALESMAN', '1981-09-28', '7698', '1250', '1400', '30');
INSERT into emp values('7698', 'BLAKE', 'MANAGER', '1981-05-01', '7839', '2850', NULL, '30');
INSERT into emp values('7782', 'CLARK', 'MANAGER', '1981-06-09', '7839', '2450', NULL, '10');
INSERT into emp values('7788', 'SCOTT', 'ANALYST', '1987-04-19', '7566', '3000', NULL, '20');
INSERT INTO emp values(7839,'king','president','1981-11-17',null,
5000,null,10);
INSERT INTO emp values(7844,'turner','salesman','1981-09-08',7698,
1500,0,30);
INSERT INTO emp values(7876,'adams','clerk','1987-05-23',7788,
1100,null,20);
INSERT INTO emp values(7900,'james','clerk','1981-12-03',7698,
950,null,30);
INSERT INTO emp values(7902,'ford','analyst','1981-12-03',7566,
3000,null,20);
INSERT INTO emp values(7934,'miller','clerk','1982-01-23',7782,
1300,null,10);
