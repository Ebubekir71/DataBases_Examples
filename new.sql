--
-- File generated with SQLiteStudio v3.4.17 on Sun Jun 8 12:18:51 2025
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Enrollments
CREATE TABLE IF NOT EXISTS Enrollments (enrollment_id INTEGER PRIMARY KEY, students_id INTEGER REFERENCES Students (students_id), course_name TEXT (50));
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1001, 1, ' Math');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1002, 2, ' Biology');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1003, 3, 'Türkisch');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1004, 4, 'Fizik');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1005, 5, 'Kimya');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1006, 6, 'Spor');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1007, 7, ' Math');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1008, 8, ' Biology');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1009, 9, 'Türkisch');
INSERT INTO Enrollments (enrollment_id, students_id, course_name) VALUES (1010, 10, NULL);

-- Table: ogrenci
CREATE TABLE IF NOT EXISTS ogrenci(id integer, ad text, dogum_yili integer);
INSERT INTO ogrenci (id, ad, dogum_yili) VALUES (NULL, 'falan', NULL);
INSERT INTO ogrenci (id, ad, dogum_yili) VALUES (1, NULL, NULL);

-- Table: ogretmen
CREATE TABLE IF NOT EXISTS ogretmen(id text, isim text);

-- Table: Students
CREATE TABLE IF NOT EXISTS Students (students_id INTEGER PRIMARY KEY, name TEXT (50));
INSERT INTO Students (students_id, name) VALUES (1, 'Ayse');
INSERT INTO Students (students_id, name) VALUES (2, 'Mehmet');
INSERT INTO Students (students_id, name) VALUES (3, 'Veli');
INSERT INTO Students (students_id, name) VALUES (4, 'Ercan');
INSERT INTO Students (students_id, name) VALUES (5, 'Ersin');
INSERT INTO Students (students_id, name) VALUES (6, 'Mehmet');
INSERT INTO Students (students_id, name) VALUES (7, 'Yusuf');
INSERT INTO Students (students_id, name) VALUES (8, 'Kamil');
INSERT INTO Students (students_id, name) VALUES (9, 'Mikail');
INSERT INTO Students (students_id, name) VALUES (10, 'Selim');
INSERT INTO Students (students_id, name) VALUES (11, 'Ebubekir');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
