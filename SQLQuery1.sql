CREATE DATABASE java
ON PRIMARY(NAME=java,FILENAME='D:\LTHSK_Java\java.mdf',SIZE=10MB,MAXSIZE=15MB,FILEGROWTH=20%)
LOG ON(NAME=java_log,FILENAME='D:\LTHSK_Java\java.ldf',SIZE=3MB,MAXSIZE=5MB,FILEGROWTH=1MB)
create table taikhoan(
	maTK Nvarchar(50) primary key not null,
	tentk Nvarchar(20),
	mk Nvarchar (10),
	vaitro Nvarchar(20)
)
create table benhnhan(
	maBN Nvarchar(50) primary key not null,
	gioiTinh Nvarchar(10),
	sdt Nvarchar(20),
	cmnd Nvarchar(20),
	canBenh Nvarchar(20),
	tinhTrang Nvarchar(50),
	thoiGianKham datetime,
	maTK Nvarchar(50) foreign key references taikhoan(maTK)
)
create table phieuKham(
	maPhieu Nvarchar(50) primary key not null,
	maBS Nvarchar(50) foreign key references bacsi(maBS),
	maBN Nvarchar(50) foreign key references benhnhan(maBN),
)
create table nhanvien(
	maNV Nvarchar(50) primary key not null,
	tenNV Nvarchar(50) ,
	nghiepVu Nvarchar(10),
	maTK Nvarchar(50) foreign key references taikhoan(maTK)
)
create table bacsi(
	maBS Nvarchar(50) primary key not null,
	tenBS Nvarchar(50) ,
	sdt Nvarchar(20),
	maTK Nvarchar(50) foreign key references taikhoan(maTK)
)
create table toathuoc(
	maToa Nvarchar(20),
	loaiThuoc Nvarchar (50),
	benhTri Nvarchar(20),
	maBS Nvarchar(50) foreign key references bacsi(maBS),
	maNV Nvarchar(50) foreign key references nhanvien(maNV),
)
create table xetNghiem(
	maXN Nvarchar(20),
	huyetAp int ,
	XNNuoctieu int,
	UngThuGan int,
	ThanYeu int,
	ngayXN date,
	maBS Nvarchar(50) foreign key references bacsi(maBS),
	maBN Nvarchar(50) foreign key references benhnhan(maBN),
)
