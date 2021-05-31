/* Tabla Tipo Usuarios */  
INSERT INTO tipousuarios (id,nombre) VALUES(1,'ADMINISTRADOR GENERAL');
INSERT INTO tipousuarios (id,nombre) VALUES(2,'ADMINISTRADOR LOCAL');
INSERT INTO tipousuarios (id,nombre) VALUES(3,'VISITANTE');

/*  Tabla usuarios */
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(1,'213415646','5646546','pepe@gmail.com','pepe','1234','pepe',1);
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(2,'878915646','2346546','juan@gmail.com','juan','1234','juan',2);
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(3,'213479646','5645546','monica@gmail.com','monica','1234','monica',3);
INSERT INTO usuarios (id,cedula,celular,correo,nombre,password,user,tipousuarios) VALUES(4,'216752646','56465656','camilo@gmail.com','camilo','1234','camilo',3);