CREATE DATABASE agenda;
USE agenda;
CREATE TABLE Personas (
    Código INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(20) NOT NULL,
    Apellidos VARCHAR(50) NOT NULL,
    Tlf1 VARCHAR(15) NOT NULL,
    Email VARCHAR(100),
    Dirección VARCHAR(255)
);
alter table Personas
add constraint check_email check (Email like '%@s%');



-- Ejemplo 1
INSERT INTO Personas (Nombre, Apellidos, Tlf1, Email, Dirección)
VALUES ('Juan', 'Pérez', '555-123-456', 'juan@email.com', 'Calle Principal 123');

-- Ejemplo 2
INSERT INTO Personas (Nombre, Apellidos, Tlf1, Email, Dirección)
VALUES ('María', 'López', '555-789-012', 'maria@email.com', 'Avenida Central 45');

-- Ejemplo 3
INSERT INTO Personas (Nombre, Apellidos, Tlf1, Email, Dirección)
VALUES ('Carlos', 'Sánchez', '555-456-789', 'carlos@email.com', 'Calle de la Rosa 67');

-- Ejemplo 4
INSERT INTO Personas (Nombre, Apellidos, Tlf1, Email, Dirección)
VALUES ('Laura', 'Gómez', '555-987-654', 'laura@email.com', 'Plaza Mayor 8');

-- Ejemplo 5
INSERT INTO Personas (Nombre, Apellidos, Tlf1, Email, Dirección)
VALUES ('Alejandro', 'Torres', '555-321-654', 'alejandro@email.com', 'Avenida del Sol 33');
