CREATE SCHEMA personas;

set search_path = personas;

create table Persona(
	dni varchar(20),
	nombre varchar(20),
	apellido varchar(20) ,

	Constraint pk_dni primary key (dni)
);

create table Vehiculo(
	dni varchar(20),
	patente varchar(10),
	marca varchar(20),
	modelo varchar(20),

	Constraint pk_vehiculo primary key (dni, patente),
	Constraint cf_vehiculo foreign key (dni) references Persona (dni) on delete cascade on update cascade
);

create table Mascota(
	dni varchar(20),
	nombre varchar(20),
	raza varchar(20),
	color varchar(20),

	Constraint pk_mascota primary key (dni, nombre),
	Constraint fk_mascota foreign key (dni) references Persona on delete no action on update no action
);
