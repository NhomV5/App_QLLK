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
create table NHANVIEN(
	MaNV char(12) primary key,
	TenNV nvarchar(50),
	NgSinh date,
	SDT char(10),
	Gtinh bit ,
	luong money,
) 



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

insert into NHANVIEN(MaNV,TenNV,NgSinh,SDT,Gtinh,luong)
values('nv01',N'Nguyễn Văn Phát','12/11/2002','0872672672',1,1500000),
	  ('nv02',N'Đặng Văn Luận','2/10/2002','0872622272',1,1500000),
	  ('nv03',N'Lưu Nguyễn Trọng Nghĩa','3/16/2002','0872673672',1,1500000)