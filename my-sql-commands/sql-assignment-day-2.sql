use bt_db;
select e1.empno, e1.ename,e1.sal, e1.mgr, e2.sal from emp e1 join emp e2 on e1.mgr=e2.empno 
		where e1.sal<e2.sal and e1.sal>ANY(select sal from emp where empno in(select mgr from emp WHERE empno<>e1.mgr));
        
 select * from emp where mod(sal,200)=0;  
 
 select * from dept where deptno=(select deptno from emp group by deptno order by 1 desc limit 1);