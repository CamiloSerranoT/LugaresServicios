/* Tabla Tipo Usuarios */  
INSERT INTO tipousuarios (id,nombre) VALUES(1,'ADMINISTRADOR GENERAL');
INSERT INTO tipousuarios (id,nombre) VALUES(2,'ADMINISTRADOR LOCAL');
INSERT INTO tipousuarios (id,nombre) VALUES(3,'VISITANTE');

/*  Tabla usuarios */
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(1,'213415646','5646546','pepe@gmail.com','pepe','1234','pepe',1);
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(2,'878915646','2346546','juan@gmail.com','juan','1234','juan',2);
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(3,'213479646','5645546','monica@gmail.com','monica','1234','monica',3);
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(4,'216752646','56465656','camilo@gmail.com','camilo','1234','camilo',3);

/* Tabla clasificacion */  
INSERT INTO clasificacion (id,nombre) VALUES(1,'Paquete de Diversiones');
INSERT INTO clasificacion (id,nombre) VALUES(2,'Museos');
INSERT INTO clasificacion (id,nombre) VALUES(3,'Parques Publicos');

/* Tabla Sitios turisticos */  
INSERT INTO sitiosturisticos (id,nombrelugar,ubicacion,cantidadpersonas,estado,clasificacion) VALUES(1,'PARQUE SIMON BOLIVAR','CARRERA 68 72-23','1000','1','3');
INSERT INTO sitiosturisticos (id,nombrelugar,ubicacion,cantidadpersonas,estado,clasificacion) VALUES(2,'PARQUE MUNDO AVENTURA','AV AMERICAS 30-22','550','1','2');

/* Tabla Cita */
INSERT INTO citas (id,fecha,hora,numeroacompanantes,usuarios,sitiosturisticos) values(1,'2021-05-26','08:00:00','20','3','1');
INSERT INTO citas (id,fecha,hora,numeroacompanantes,usuarios,sitiosturisticos) values(2,'2021-05-26','09:00:00','20','4','2');
