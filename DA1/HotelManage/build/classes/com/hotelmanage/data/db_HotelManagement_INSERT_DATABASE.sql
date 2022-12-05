use HotelManagement
go

insert into tb_User 
values
(N'MN001',N'Nguyễn Thị Bảo Vi','3/27/2003',N'mn001',N'1',1,N''),
(N'MN002',N'Nguyễn Lê Minh Trung','2/15/2000',N'mn003',N'1',1,N''),
(N'MN003',N'Hoàng Minh Đức','1/1/2003',N'mn003',N'1',1,N''),
(N'MN004',N'Lê Như Hoàng','1/1/2003',N'mn004',N'1',1,N''),
(N'ST001',N'Bing Chilling','1/1/2003',N'st001',N'1',0,N''),
(N'ST003',N'World Cup','1/1/2003',N'st002',N'1',0,N'')
(N'MN001',N'Nguyễn Thị Bảo Vi','3/27/2003',N'mn001',N'1',N''),
(N'MN002',N'Nguyễn Lê Minh Trung','2/15/2000',N'mn003',N'1',N''),
(N'MN003',N'Hoàng Minh Đức','1/1/2003',N'mn003',N'1',''),
(N'MN004',N'Lê Như Hoàng','1/1/2003',N'mn004',N'1',''),
(N'ST001',N'Bing Chilling','1/1/2003',N'st001',N'1',''),
(N'ST003',N'World Cup','1/1/2003',N'st002',N'1','')
go

insert into tb_Customer
values 
(N'Leonardo Dicarpio',N'01213141516',N'leodicarpio@gmail.com',N'123456789012'),
(N'Da Vinci',N'0102188616',N'vincida_artist@gmail.com',N'987654321012'),
(N'Beneditch Cumalot',N'01215151647',N'icumalot@gmail.com',N'74125896302'),
(N'Nờ Ô Nô',N'036985214785',N'hellobagiacodongiuamuadonglanhgia@gmail.com',N'01364547989215')
go

insert into tb_Room
values
(N'R101',0,1,1,2000000),
(N'R102',0,1,1,2000000),
(N'R103',0,1,1,2000000),
(N'R104',0,1,1,2000000),
(N'R105',0,1,1,2000000),
(N'R106',0,1,1,2000000),

(N'R201',0,1,1,2000000),
(N'R202',0,1,1,2000000),
(N'R203',0,1,1,2000000),
(N'R204',0,1,1,2000000),
(N'R205',0,1,1,2000000),
(N'R206',0,1,1,2000000),

(N'R301',0,1,1,2000000),
(N'R302',0,1,1,2000000),
(N'R303',0,1,1,2000000),
(N'R304',0,1,1,2000000),
(N'R305',0,1,1,2000000),
(N'R306',0,1,1,2000000),

(N'R401',0,1,1,2000000),
(N'R402',0,1,1,2000000),
(N'R403',0,1,1,2000000),
(N'R404',0,1,1,2000000),
(N'R405',0,1,1,2000000),
(N'R406',0,1,1,2000000),

(N'R501',0,1,1,2000000),
(N'R502',0,1,1,2000000),
(N'R503',0,1,1,2000000),
(N'R504',0,1,1,2000000),
(N'R505',0,1,1,2000000),
(N'R506',0,1,1,2000000),

(N'R601',0,1,1,2000000),
(N'R602',0,1,1,2000000),
(N'R603',0,1,1,2000000),
(N'R604',0,1,1,2000000),
(N'R605',0,1,1,2000000),
(N'R606',0,1,1,2000000)
go

insert into tb_Service
values
(N'Dọn Phòng',500000),
(N'Giặt Ủi',500000),
(N'Ship Đồ Ăn',500000),
(N'Tài Xế',500000),
(N'Sử Dụng Quầy Bar',500000)
go

insert into tb_Property
values
(N'prop1',N'Đèn bàn',200000),
(N'prop2',N'Giường',5000000),
(N'prop3',N'Tủ lạnh',6000000)
go

