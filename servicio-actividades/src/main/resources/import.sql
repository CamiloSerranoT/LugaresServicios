/* Tabla clasificacion */  
INSERT INTO clasificacion (id,nombre) VALUES(1,'Paquete de Diversiones');
INSERT INTO clasificacion (id,nombre) VALUES(2,'Museos');
INSERT INTO clasificacion (id,nombre) VALUES(3,'Parques Publicos');

/* Tabla Sitios turisticos */  
INSERT INTO sitiosturisticos (id,nombrelugar,ubicacion,cantidadpersonas,estado,clasificacion) VALUES(1,'PARQUE SIMON BOLIVAR','CARRERA 68 72-23','1000','1','3');
INSERT INTO sitiosturisticos (id,nombrelugar,ubicacion,cantidadpersonas,estado,clasificacion) VALUES(2,'PARQUE MUNDO AVENTURA','AV AMERICAS 30-22','550','1','2');


/* Tabla Actividad */
INSERT INTO actividades (id,nombre,descripcion,duracion,fechainicio,fechafinal,hora,sitiosturisticos) VALUES(1,'PASEO POR EL LAGO','PASEO POR EL LAGO Y MONTADA LANCHA','1','2021-05-01','2021-05-01','08:30:00','1');
INSERT INTO actividades (id,nombre,descripcion,duracion,fechainicio,fechafinal,hora,sitiosturisticos) VALUES(2,'CAMPEONATO INFATIL','CAMPEONATO VOLETBALL','1','2021-05-01','2021-05-01','09:30:00','1');
INSERT INTO actividades (id,nombre,descripcion,duracion,fechainicio,fechafinal,hora,sitiosturisticos) VALUES(3,'CAMPING','ALMUERZO DE COMPAÑEROS','1','2021-05-01','2021-05-01','12:00:00','1');