create database QuanLyThuVien
use QuanLyThuVien
go
create table Bao(
	IdBao varchar(12) primary key,
	TenNhaXuatBan nvarchar(100),
	SoBanPhatHanh int,
	NgayPhatHanh date,
)
go
create table Sach(
	IdSach varchar(12) primary key,
	TenNhaXuatBan nvarchar(100),
	SoBanPhatHanh int,
	TenTacGia nvarchar(100),
	SoTrang int,
)
go
create table TapChi(
	IdTapChi varchar(12) primary key ,
	TenNhaXuatBan nvarchar(100),
	SoBanPhatHanh int,
	SoPhatHanh varchar(50),
	ThangPhatHanh varchar(50),
)