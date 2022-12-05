CREATE DATABASE Hotel
GO

USE Hotel
GO

/* to know company use this app */
CREATE TABLE tb_Company
(
    IDComp NVARCHAR(10) PRIMARY KEY NOT NULL,
    NameCom NVARCHAR(50),
    Phone NVARCHAR(12),
    Fax NVARCHAR(12),
    Email NVARCHAR(50),
    AddressCom NVARCHAR(500)
)
GO

/* to know branch of company */
CREATE TABLE tb_Branch
(
    IDBr NVARCHAR(10) PRIMARY KEY NOT NULL,
    NameBr NVARCHAR(50),
    Phone NVARCHAR(12),
    Fax NVARCHAR(12),
    Email NVARCHAR(50),
    Address NVARCHAR(500),
    IDCom NVARCHAR(10) NOT NULL FOREIGN KEY REFERENCES tb_Company(IDComp)
)
GO

/* to know type of room */
CREATE TABLE tb_TypeRoom
(
    IDTR NVARCHAR(10) PRIMARY KEY NOT NULL,
    NameTR NVARCHAR(50),
    Price FLOAT,
    NumberHuman INT,
    NumberBed INT
)
GO

/* to know equipment in the hotel */
CREATE TABLE tb_Equipment
(
    IDEquip NVARCHAR(10) PRIMARY KEY NOT NULL,
    Name NVARCHAR(50),
    Price FLOAT
)
GO

/* went customer buy some food or water */
CREATE TABLE tb_FBService
(
    IDFB int IDENTITY(1,1) PRIMARY KEY NOT NULL,
    NameFB NVARCHAR(30),
    Price FLOAT
)
GO

/* infor of floor */
CREATE TABLE tb_Floor
(
    IDFl NVARCHAR(10) PRIMARY KEY NOT NULL,
    Name NVARCHAR(20),
)
GO

/* to know who booking room */
CREATE TABLE tb_Customer
(
    IDCust int IDENTITY(1,1) PRIMARY KEY NOT NULL,
    Name NVARCHAR(50),
    IDCard NVARCHAR(12),
    Phone NVARCHAR(12),
    Email NVARCHAR(50),
    Address NVARCHAR(500)
)
GO

/* show the location of room and the status have booking or not */
CREATE TABLE tb_Room 
(
    IDRoom int IDENTITY(1,1) PRIMARY KEY NOT NULL,
    NameRoom NVARCHAR(20),
    Statuss bit,
    IDFloor NVARCHAR(10) NOT NULL FOREIGN KEY REFERENCES tb_Floor(IDFl),
    IDTypeRoom NVARCHAR(10) NOT NULL FOREIGN key REFERENCES tb_TypeRoom(IDTR)
)
GO

/* table to know who use this app */
CREATE TABLE tb_User
(
    IDUser INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
    Username NVARCHAR(30),
    Pass NVARCHAR(30),
    IDComp NVARCHAR(10),
    IDBranch NVARCHAR(10)
)
GO

/* Statictis went issuing bill*/
CREATE TABLE tb_BookRoom
(
    ID INT IDENTITY(1,1) PRIMARY key NOT NULL,
    IDCust INT FOREIGN KEY REFERENCES tb_Customer(IDCust),
    IDRoom INT FOREIGN KEY REFERENCES tb_Room(IDRoom),
    DateCheckIn DATE,
    DateCheckOut Date,
    NumOfDate INT,
    IDUser INT FOREIGN KEY REFERENCES tb_User(IDUser),
    IDFB INT FOREIGN KEY REFERENCES tb_FBService(IDFB),
    IDComp NVARCHAR(10) FOREIGN KEY REFERENCES tb_Company(IDComp),
    IDBranch NVARCHAR(10) FOREIGN KEY REFERENCES tb_Branch(IDBr)
)
GO

/* Show how many equipment in that room*/
CREATE TABLE tb_Room_Equipment
(
    IDRoom INT,
    IDEquip INT,
    Num int,
    PRIMARY KEY(IDRoom,IDEquip)
)
GO