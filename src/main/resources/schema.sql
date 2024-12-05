CREATE TABLE IF NOT EXISTS funcionario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    salario DOUBLE NOT NULL
);

INSERT INTO funcionario (nome, cargo, salario) VALUES ('João', 'Gerente', 5000.00);
