CREATE DATABASE erp;
USE erp;

CREATE TABLE pagamentos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(20) NOT NULL,
    nome_cliente VARCHAR(100) NOT NULL,
    valor DOUBLE NOT NULL,
    data_pagamento DATE NOT NULL,
    descricao VARCHAR(150) NOT NULL
);