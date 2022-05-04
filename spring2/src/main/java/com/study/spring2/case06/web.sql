-- 建立 web schema
create database web character set utf8mb4 collate utf8mb4_general_ci


-- 建立 emp table
create table web.emp(
	eid int not null auto_increment, -- primary key (auto foreign key: 1, 2, 3, ...)
    ename varchar(50) not null unique, -- 員工姓名
    age int, -- 員工年齡
    createtime timestamp default current_timestamp, -- 建檔時間
    primary key(eid)
);

-- 建立 emp 範例資料
insert into emp(ename, age) values('john', 28);
insert into emp(ename, age) values('mary', 21);
insert into emp(ename, age) values('bobo', 20);
insert into emp(ename, age) values('david', 99);
insert into emp(ename, age) values('jason', 21);
insert into emp(ename, age) values('gogoro', 22);
insert into emp(ename, age) values('python', 2);


-- 查詢 emp 資料
select eid, ename, age, createtime from emp;


