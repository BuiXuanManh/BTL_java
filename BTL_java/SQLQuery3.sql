USE [master]
GO

/****** Object:  Database [PhongKham]    Script Date: 11/7/2022 3:44:54 PM ******/
CREATE DATABASE [PhongKham]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PhongKham', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\PhongKham.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'PhongKham_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\PhongKham_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PhongKham].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [PhongKham] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [PhongKham] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [PhongKham] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [PhongKham] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [PhongKham] SET ARITHABORT OFF 
GO

ALTER DATABASE [PhongKham] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [PhongKham] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [PhongKham] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [PhongKham] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [PhongKham] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [PhongKham] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [PhongKham] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [PhongKham] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [PhongKham] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [PhongKham] SET  ENABLE_BROKER 
GO

ALTER DATABASE [PhongKham] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [PhongKham] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [PhongKham] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [PhongKham] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [PhongKham] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [PhongKham] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [PhongKham] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [PhongKham] SET RECOVERY FULL 
GO

ALTER DATABASE [PhongKham] SET  MULTI_USER 
GO

ALTER DATABASE [PhongKham] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [PhongKham] SET DB_CHAINING OFF 
GO

ALTER DATABASE [PhongKham] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [PhongKham] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [PhongKham] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [PhongKham] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO

ALTER DATABASE [PhongKham] SET QUERY_STORE = OFF
GO

ALTER DATABASE [PhongKham] SET  READ_WRITE 
GO


