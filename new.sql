--
-- File generated with SQLiteStudio v3.4.17 on Thu May 1 16:03:12 2025
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: purchases
CREATE TABLE IF NOT EXISTS purchases (customer, product);
INSERT INTO purchases (customer, product) VALUES ('A', 'X');
INSERT INTO purchases (customer, product) VALUES ('A', 'Y');
INSERT INTO purchases (customer, product) VALUES ('B', 'X');

-- Table: required_products
CREATE TABLE IF NOT EXISTS required_products (product);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
