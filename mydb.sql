
create table t_member(
 id varchar2(10) primary key,
 pwd varchar2(20),
 name varchar2(50),
 email varchar2(20),
 joinDate date
);

insert into t_member
values('kwon', '1234', 'kwon' ,'abcd@naver.com', sysdate);
commit;
select * from t_member;

