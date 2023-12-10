CREATE DATABASE blackjack;
USE blackjack;

CREATE TABLE usuario (
idUsuario INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50),
sobrenome VARCHAR(50),
email VARCHAR(100),
senha VARCHAR(80)
);

CREATE TABLE ficha(
idFicha INT PRIMARY KEY AUTO_INCREMENT,
qntFichasCinco INT,
qntFichasDez INT,
qntFichasVinte INT,
qntFichasCinquenta INT,
qntFichasCem INT
);

