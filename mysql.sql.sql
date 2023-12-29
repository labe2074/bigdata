-- SQL(구조화 질의 언어)
-- MySQL DBMS(RDBMS:관계형데이터베이스) -> TABLE(관리)
-- insert into --> 기입?
-- values --> 복수형
-- auto_increment --> 자동기입
-- not null --> 겹치치 않는?

create database bigdata;

create table student (
	num int not null primary key auto_increment,
	name varchar(50),
	tel varchar(50),
    age int,
    email varchar(50)
);

-- CRUD 
insert into student(name,tel,age,email)
values('홍길동','010-1111-1111',20,'aaa@naver.com');

insert into student(name,tel,age,email)
values('박종현','010-9535-7868',23,'jhp3015@naver.com');

select * from student;
-- num가 2인 학생의 나이를 99로 수정하세요
update student set age=99 where num=2

delete from student
where num=2;

-- 테이블 삭제(drop)
drop table student;