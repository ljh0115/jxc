--����Ա��¼�˺�����
create table Logininfo(
	uesrname varchar(20),
	pwd varchar(20)
)
--�鼮��
create table Logbook(
	BookNo int,
	BookName varchar(20),
	BookJG int,
	BookJF int,
	BookNumber int
)
--���߱�
create table Logreader(
	ReaderNo int,
	ReaderName varchar(20),
	ReaderJF int,
	ReaderNumber int
)
--���ı�
create table Logborrow(
	ReaderNo int,
	BookNo int,
	BorrowNumber int,
	BorrowTime varchar(20)
)