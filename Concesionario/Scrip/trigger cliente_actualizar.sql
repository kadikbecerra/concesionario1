Use registro;

DELIMITER \\

CREATE TRIGGER actualizar_cliente AFTER UPDATE ON cliente
	FOR EACH ROW
BEGIN
	INSERT INTO bitacora_cliente(SEXO_CLIENTE, Codbit, NOMBRE_CLIENTE, APELLIDO_CLIENTE, DIRECCION_CLIENTE, TELEFONO_CLIENTE, Movimiento)
    VALUES (new.SEXO_CLIENTE, null, new.NOMBRE_CLIENTE, new.APELLIDO_CLIENTE, new.DIRECCION_CLIENTE,
    new.TELEFONO_CLIENTE, 'DELETE');
END \\