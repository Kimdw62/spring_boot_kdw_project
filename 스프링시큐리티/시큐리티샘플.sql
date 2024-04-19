강사님-project
https://github.com/n3316202/spring_boot_hjs_project



drop table users;

create table users(
    username varchar2(50) primary key,
    password varchar2(100) not null,
    enabled char(1) default '1' 
);

create table authorities(
     username varchar2(50) not null,
     authority varchar2(50) not null,
     constraint fk_authorities_users foreign key(username) references users(username)
); 

commit;

select * from users;
select * from authorities;
insert into users (username, password) values ('member', 'member');

insert into authorities (username, authority) values ('admin', 'ROLE_USER');
insert into authorities (username, authority) values ('admin', 'ROLE_MANAGER');
insert into authorities (username, authority) values ('admin', 'ROLE_ADMIN');
insert into authorities (username, authority) values ('member', 'ROLE_MANAGER');
insert into authorities (username, authority) values ('user', 'ROLE_USER');
insert into authorities (username, authority) values ('scott', 'ROLE_USER');
insert into authorities (username, authority) values ('kkk', 'ROLE_MANAGER');

select username, authority from users;



select *
from (
    select rownum rn, bid, bname, btitle 
    from mvc_board
)
where rn > 100 and rn <= 110; 

select *
from dept a inner join emp b
on a.deptno = b.deptno
order by a.deptno, b.empno;

                
select b.empno, b.ename, b.job, b.mgr, b.hiredate, b.sal, b.comm, b.deptno, a.dname
from dept a inner join emp b
on a.deptno = b.deptno
order by a.deptno, b.empno;
                
select empno, ename, job, mgr, hiredate, sal, comm, deptno, dname
from (
    SELECT A.*
    FROM (
        SELECT A.*
        FROM (
            select ROWNUM as RNUM, b.*, a.dname
            from dept a inner join emp b
            on a.deptno = b.deptno
            order by a.deptno, b.empno
        ) A
        WHERE ROWNUM <= 1 * 10
    ) A
    WHERE RNUM > ((1 - 1) * 10)
);

select * from emp;
select * from salgrade;

select b.empno, b.ename, b.job, b.mgr, b.hiredate, b.sal, b.comm, a.deptno, a.dname,
    c.grade, c.losal, c.hisal
from dept a inner join emp b
on a.deptno = b.deptno
inner join salgrade c
on b.sal between c.losal and c.hisal;




select count(*) from emp;

desc salgrade;


--begin
--  for i in 1..1000 loop
--   insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, 'test' , '테스트', '테스트', 0, mvc_board_seq.currval, 0, 0);
--  end loop;
--end;
--commit;

