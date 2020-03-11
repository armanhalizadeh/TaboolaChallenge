/*
	Arman Alizadeh
	Intern Takehome Coding Challenge - Taboola
*/
REM   Script: Taboola Coding Challenge
REM   Intern Coding Takehome Challenge

create table Products (  
Name VARCHAR2(255),  
Category VARCHAR2(255),  
primary key(Name));

create table ProductPriceHistory (  
Name VARCHAR2(255),  
Price NUMBER (11,2),  
StartDate date,  
EndDate date,  
primary key(Name, StartDate),  
foreign key(Name) references Products(Name), 
constraint chk_EndDate check (EndDate >= StartDate));

select * 
from Products, ProductPriceHistory 
where Products.Name = ProductPriceHistory.Name;

