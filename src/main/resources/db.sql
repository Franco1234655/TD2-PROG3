--creation de base de donnee
CREATE DATABASE mini_dish_db;

--Creation d'utilisateur
CREATE USER mini_dish_manager WITH PASSWORD 'password123*';

-- Donnation de droit
GRANT ALL PRIVILEGES ON DATABASE mini_dish_db_manager;

\c mini_dish_db