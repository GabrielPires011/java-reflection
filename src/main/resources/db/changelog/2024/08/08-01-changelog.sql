CREATE TABLE usuario
(
    id   BIGINT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cpf  INT NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (id)
);