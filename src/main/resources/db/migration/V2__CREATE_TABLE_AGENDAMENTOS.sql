CREATE TABLE agendamentos (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    email VARCHAR(50) NOT NULL,
    assunto VARCHAR(50) NOT NULL,
    mensagem LONGTEXT NOT NULL,
    agendado BOOLEAN NOT NULL
)