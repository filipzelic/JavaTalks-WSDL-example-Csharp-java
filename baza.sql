CREATE DATABASE iis
GO

USE iis

CREATE TABLE Student
(
	IDStudent int primary key identity,
	Ime nvarchar(50) not null,
	Prezime nvarchar(50) not null,
	JMBAG nvarchar(14) null,
	godStudija int null
)

INSERT INTO Student VALUES('Filip', 'Zelic', '0229033456', 3)
INSERT INTO Student VALUES('Marko', 'Markic', '12345637', 1)
INSERT INTO Student VALUES('Ivo', 'Ivic', '23234355', 3)

CREATE TABLE Kolegij
(
	IDKolegij int primary key identity,
	Naziv nvarchar(60) null,
	Nositelj nvarchar(40) null,
	ECTS int null	
)

INSERT INTO Kolegij VALUES('Java 2', 'Danijel Kucak', 6)
INSERT INTO Kolegij VALUES('Oblikovanje baza podataka', 'Goran Dambic', 4)
INSERT INTO Kolegij VALUES('Razvoj WEB aplikacija', 'Bojan Fulanovic', 5)

CREATE TABLE Upis
(
	IDUpis int primary key identity,
	StudentID int FOREIGN KEY REFERENCES Student(IDStudent),
	KolegijID int FOREIGN KEY REFERENCES Kolegij(IDKolegij)
)
GO

INSERT INTO Upis VALUES (1, 1)
INSERT INTO Upis VALUES (2, 1)
INSERT INTO Upis VALUES (2, 2)
INSERT INTO Upis VALUES (3, 3)

CREATE PROCEDURE ListaUpisanihKolegijaZaStudenta
@studentID int
AS
(
	SELECT 
		k.Naziv,
		k.Nositelj,
		k.ECTS
	FROM Kolegij as k
	INNER JOIN Upis as u
	on k.IDKolegij = u.KolegijID
	WHERE u.StudentID = @studentID
)
GO

CREATE PROCEDURE ListaUpisanihStudenataZaKolegij
@kolegijID int
AS
(
	SELECT 
		s.Ime,
		s.Prezime,
		s.JMBAG,
		s.godStudija		
	FROM Student as s
	INNER JOIN Upis as u
	on s.IDStudent = u.StudentID
	WHERE u.KolegijID = @kolegijID
)
GO