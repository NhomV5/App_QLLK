create database QUANLYDT
use QUANLYDT
create table LinhKien(
	MaLK char(12) primary key,
	TenLK nvarchar(50),
	SLG int,
	LLK nvarchar(30),
	Gia int,
	MASX char(5),
	NNH date
)

create table Users(
	username varchar(30) primary key,
	password varchar(30),
	QH nvarchar(30)
)
CREATE TABLE NhanVien(
  MaNV          varchar(7) primary key,
  TenNV         nvarchar(50),
  SDT          varchar(11),
  Email         varchar(40),
  SaLaRy        money
)

CREATE TABLE ChuUser(
	username varchar(50),
	pass varchar(50)
)
CREATE TABLE NhanVienUser(
	username varchar(50),
	pass varchar(50)
)
insert into ChuUser
values('Admin01','admin01')
	
insert into NhanVienUser
values('Nv01','nv01')


insert into LinhKien(MaLK,TenLK,SLG,LLK,Gia,NNH)
values('LK01',N'CPU core i5',15,N'CPU',1500000,'4/24/2022'),
	  ('LK02',N'CPU core i3',5,N'CPU',1000000,'1/10/2022'),
	  ('LK03',N'Khung bao bản rộng',10,N'Khung Máy',500000,'3/23/2021'),
	  ('LK04',N'Khung bao bản hẹp',10,N'Khung Máy',500000,'3/20/2021')
	 

insert into Users(username,password,QH)
values('Admin01','123456',N'Quản lý'),
	  ('Admin02','123456',N'Quản lý'),
	  ('nhanvien01','123456',N'Quản lý'),
	  ('nhanvien02','123456',N'Quản lý')

INSERT INTO NhanVien
VALUES ('NV00001',N'Trần Gia Khang','0899885289','khangtra@gmail.com','5000000'),
		('NV00002',N'Nguyễn Thanh Khải','0899885639','khai123@gmail.com','5000000'),
		('NV00003',N'Lê Minh Quốc','0389885289','uckj@gmail.com','5000000'),
		('NV00004',N'Phạm Hoàng Khánh','0892885289','khanhkkk@ute.udn.vn','50000000'),
		('NV00005',N'Trần Hà Vy','0899885631','vyyakdi@ute.udn.vn','50000000'),
		('NV00006',N'Phan Thu Uyên','0899888971','uyennn@ute.udn.vn','50000000'),
		('NV00007',N'Đặng Kiều Oanh','0899885565','oanhvip123@gmail.com','50000000'),
		('NV00008',N' Tạ Trường An','0897797646','an123c@ute.udn.vn','50000000'),
		('NV00009',N' Trần Hữu Đạt','0995554616','dat09@gmail.com','50000000'),
		('NV00010',N'Hồ Thanh Hưng','0753369554','hung@ute.udn.vn','50000000')