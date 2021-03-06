create database RestaurantService
USE RestaurantService

CREATE TABLE Item(
	Id int  NOT NULL AUTO_INCREMENT,
	ItemName varchar(500) NOT NULL,
	Price int NOT NULL,
	Status varchar(50) NOT NULL,
	PRIMARY KEY (Id)
	)

CREATE TABLE Order(
	Id int  NOT NULL AUTO_INCREMENT,
	OrderId varchar(50) NOT NULL,
	ItemId int NOT NULL,
	OrderDate datetime NOT NULL,
	Quantity int NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (ItemId) REFERENCES Item(Id)
	)

CREATE TABLE Table(
	Id int  NOT NULL AUTO_INCREMENT,
	Status varchar(50) NOT NULL,
	PRIMARY KEY (Id)
	)


CREATE TABLE User(
	Id int  NOT NULL AUTO_INCREMENT,
	UserName varchar(50) NOT NULL,
	Password varchar(50) NOT NULL,
	Email varchar(50) NOT NULL,
	UserTypeId int NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (UserTypeId) REFERENCES UserType(Id)
	)
/****** Object:  Table .UserOrderMap    Script Date: 28-04-2016 12:04:36 ******/
CREATE TABLE UserOrderMap(
	Id int NOT NULL AUTO_INCREMENT,
	UserId int NOT NULL,
	OrderId varchar(50) NOT NULL,
	OrderStatus varchar(50) NOT NULL,
	TableNumber int NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (UserId) REFERENCES User(Id),
	FOREIGN KEY (TableNumber) REFERENCES Table(Id),
	)

CREATE TABLE UserType(
	Id int NOT NULL AUTO_INCREMENT,
	Type varchar(50) NOT NULL,
	PRIMARY KEY (Id)
	)