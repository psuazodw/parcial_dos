create database db_motocicleta;
use db_motocicleta;

CREATE TABLE moto_cliente(
	cli_id int auto_increment not null,
    cli_nit int not null,
    cli_nombre varchar(20) not null,
    cli_apellido varchar(20) not null,
    cli_direccion varchar(35) not null,
    cli_creado datetime,
    primary key(cli_id)
);

INSERT INTO moto_cliente (cli_nit, cli_nombre, cli_apellido, cli_direccion, cli_creado) VALUES 
(35628591 , 'Kirk', 'Smith', 'Ciudad', NOW()),
(34678923 , 'John', 'Coltraine', 'Mixco', NOW()),
(56789456 , 'Louie', 'Benson', 'San Cristobal', NOW()),
(12123434 , 'Charles', 'Johnson', 'Santa Catarina Pinula', NOW());

SELECT * FROM moto_cliente;

CREATE TABLE moto_marca(
	mar_id int auto_increment not null,
    mar_marca varchar(20) not null,
    mar_color varchar(20) not null,
    mar_modelo varchar(20) not null,
    mar_existencia int not null,
    mar_creado datetime,
    primary key(mar_id)
);

INSERT INTO moto_marca (mar_marca, mar_color, mar_modelo, mar_existencia, mar_creado) VALUES 
('Yamaha', 'Rojo', '1987', 400, NOW()),
('Bajaj', 'Azul', '1960', 350, NOW()),
('Suzuki', 'Verde', '2010', 525, NOW()),
('Harley Davidson', 'Plata', '2018', 150, NOW());

SELECT * FROM moto_marca;

CREATE TABLE moto_proveedor(
	pro_id int auto_increment not null,
    pro_nit int not null,
    pro_nombre varchar(20) not null,
    pro_direccion varchar(20) not null,
    pro_creado datetime,
    primary key(pro_id)
);

INSERT INTO moto_proveedor (pro_nit, pro_nombre, pro_direccion, pro_creado) VALUES 
(14567890 , 'La Provision', 'Ciudad', NOW()),
(44567651 , 'Distribuidora LM', 'Chuarrancho', NOW()),
(54230977 , 'Moto Salvacion', 'Fraijanes', NOW()),
(12345678 , 'VCR Motocicletas', 'San Jose Pinula', NOW());

SELECT * FROM moto_proveedor;

CREATE TABLE moto_motocicleta(
	mot_id int auto_increment not null,
    mot_cli_id int not null,
    mot_mar_id int not null,
    mot_pro_id int not null,
    mot_cantidad int not null,
    mot_creado datetime not null,
    primary key(mot_id),
    foreign key(mot_cli_id) references moto_cliente(cli_id),
    foreign key(mot_mar_id) references moto_marca(mar_id),
    foreign key(mot_pro_id) references moto_proveedor(pro_id)
);

INSERT INTO moto_motocicleta (mot_cli_id, mot_mar_id, mot_pro_id, mot_cantidad, mot_creado) VALUES
(1, 1, 1, 2, NOW()),
(2, 2, 2, 1, NOW()),
(3, 2, 3, 5, NOW()),
(3, 3, 3, 5, NOW()),
(4, 4, 4, 10, NOW());