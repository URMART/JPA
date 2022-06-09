INSERT INTO clientes(id, nombre, apellido, email,celular ,Fecha)  VALUES(1, 'cristian', 'arboleda', 'cris@gmail.com',2, '2002-09-14');
INSERT INTO clientes(id, nombre, apellido, email,celular ,Fecha)  VALUES(2, 'mateo', 'arboleda','teo@gmail.com',2,  '2000-10-03');
INSERT INTO clientes(id, nombre, apellido, email,celular ,Fecha)  VALUES(3, 'luis', 'cormes','xxx@gmail.com',7, '3000-10-03');

INSERT INTO productos(id, Nombre, Cantidad, precio_venta,precio_compra,fecha)  VALUES(1, 'salchichon', '2', 4,2, '3000-10-03');
INSERT INTO productos(id, nombre, cantidad, precio_venta,precio_compra,fecha) VALUES(2, 'salchichon', '2', 4, 2,'3000-10-03');
INSERT INTO productos(id, nombre, cantidad, precio_venta,precio_compra,fecha)  VALUES(3, 'salchichon', '2', 4, 2,'3000-10-03');

INSERT INTO pedidos(id, celular_destino, descuento, direccion_destino,estado,fecha,fecha_entrega,nombre_destino,sub_total,total,id_cliente)   VALUES(10, '78788', 2, 'cr6','activo', '3000-10-03','3000-10-06','caicedo',10,11,1017);
INSERT INTO pedidos(id, celular_destino, descuento, direccion_destino,estado,fecha,fecha_entrega,nombre_destino,sub_total,total,id_cliente)   VALUES(11, '78788', 2, 'cr6','activo', '3000-10-03','3000-10-06','caicedo',10,11,1017);
INSERT INTO pedidos(id, celular_destino, descuento, direccion_destino,estado,fecha,fecha_entrega,nombre_destino,sub_total,total,id_cliente)   VALUES(12, '78788', 2, 'cr6','activo', '3000-10-03','3000-10-06','caicedo',10,11,1017);
INSERT INTO pedidos(id, celular_destino, descuento, direccion_destino,estado,fecha,fecha_entrega,nombre_destino,sub_total,total,id_cliente)   VALUES(13, '78788', 2, 'cr6','activo', '3000-10-03','3000-10-06','caicedo',10,11,1017);

INSERT INTO detallesp(id, id_pedidos, id_productos, descuento,cantidad,valor)  VALUES(1, 1, 1, 4, 2,1);
