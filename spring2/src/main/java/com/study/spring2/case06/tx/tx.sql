create table if not exists book(
	bid integer not null auto_increment, -- 主鍵序號
	bname varchar(20) not null, -- 書名
	price integer, -- 價格
	ct timestamp default current_timestamp, -- 建檔時間
	primary key (bid)
);
	

create table if not exists stock(
	sid integer not null auto_increment, -- 主鍵序號
	bid integer not null, -- book 主鍵
	amount integer, -- 數量
	primary key (sid)
);

create table if not exists wallet(
	wid integer not null auto_increment, -- 主鍵序號
	money integer, -- book 主鍵	
	primary key (wid)
);


insert into book(bname, price) values('java', 80);
insert into stock(bid, amount) values(1, 3);
insert into wallet(money) values(100);








