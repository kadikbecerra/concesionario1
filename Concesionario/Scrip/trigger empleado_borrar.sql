Use registro;

DELIMITER \\

CREATE TRIGGER borrar_empleado AFTER DELETE ON empleado
	FOR EACH ROW
BEGIN
	INSERT INTO bitacora_empleado(CODEMPLEADO, NOMBRE_EMPLEADO, APELLIDO_EMPLEADO, DIRECCION_EMPLEADO, 
    TELEFONO_EMPLEADO, SEXO_EMPLEADO, SALARIO_EMPLEADO, CI_EMPLEADO, EDAD, EMPLEADO, Movimiento)
    VALUES (null, old.NOMBRE_EMPLEADO, old.APELLIDO_EMPLEADO, old.DIRECCION_EMPLEADO, old.TELEFONO_EMPLEADO, 
    old.SEXO_EMPLEADO, old.SALARIO_EMPLEADO, old.CI_EMPLEADO, old.EDAD, old.EDAD, old.EMPLEADO, 'DELETE');
END \\