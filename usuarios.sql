create database usuario;
use usuario;

# Creamos la tabla usuario
create table usuario (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
    contraseña VARCHAR(45) NOT NULL,
	correo VARCHAR(45) NOT NULL,
    tarjeta VARCHAR(45) NOT NULL,
	ultima_sesion DATETIME NULL DEFAULT '0000-00-00 00:00:00');

select * from usuario;









