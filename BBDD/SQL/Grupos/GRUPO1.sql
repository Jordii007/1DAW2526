-- 1. Seleccionar de la tabla EMPLE aquellas filas cuyo APELLIDO empiece por "A" y el OFICIO tenga una "E" en cualquier posición.
SELECT APELLIDO, OFICIO
FROM EMPLE
WHERE APELLIDO LIKE 'A%';
-- 2. Seleccionar el apellido, el oficio y la localidad de los empleados de los departamentos donde trabajan los ANALISTAS.
SELECT APELLIDO, OFICIO, DIR
FROM EMPLE
WHERE OFICIO = 'ANALISTA'
-- 3. Mostrar los empleados (nombre, oficio, salario y fecha de alta) que desempeñen el mismo oficio que "JIMÉNEZ" o que tengan un salario mayor o igual que "FERNÁNDEZ".
SELECT EMP_NO, OFICIO, SALARIO, FECHA_ALT
FROM EMPLE
WHERE OFICIO = (SELECT OFICIO
                FROM EMPLE
                WHERE APELLIDO='JIMÉNEZ'
                )
OR SALARIO >= (SELECT SALARIO
              FROM EMPLE
              WHERE APELLIDO = 'FERNÁNDEZ'
              )
-- 4. Mostrar en pantalla el nombre, oficio y salario, de los empleados del departamento de "FERNÁNDEZ" que tengan su mismo salario.
SELECT EMP_NO, OFICIO, SALARIO
FROM EMPLE
WHERE DEPT_NO = (SELECT DEPT_NO
                FROM EMPLE
                WHERE APELLIDO='FERNÁNDEZ'
                )
AND SALARIO = (SELECT SALARIO
               FROM EMPLE
               WHERE APELLIDO='FERNÁNDEZ'
               )
-- 5. Presentar los nombres y oficios de los empleados que tienen el mismo trabajo que" JIMÉNEZ".
SELECT APELLIDO
FROM EMPLE
WHERE OFICIO = (SELECT OFICIO
                FROM EMPLE
                WHERE APELLIDO='JIMÉNEZ'
                )
-- 6. Visualizar el tema, estante y ejemplares de las filas de LIBRERIA con ejemplares comprendidos entre 8 y 15.
 SELECT TEMA, ESTANTE, EJEMPLARES
 FROM LIBRERIA
 WHERE EJEMPLARES >= 8
 AND EJEMPLARES <= 15
-- 7. Visualizar las columnas TEMA, ESTANTE Y EJEMPLARES de las filas cuyo ESTANTE no esté comprendido entre la "B" y la "D".
 SELECT TEMA, ESTANTE, EJEMPLARES
 FROM LIBRERIA
 WHERE ESTANTE NOT BETWEEN 'B' AND 'D'
-- 8. Visualizar con una sola orden SELECT todos los temas de LIBRERÍA cuyo número de ejemplares sea inferior a los que hay en "Medicina".

-- 9. Visualizar loslos temas de LIBRERÍA cuyo número de ejemplares no esté entre 15 y 20, ambos incluidos.
 SELECT TEMA, ESTANTE, EJEMPLARES
 FROM LIBRERIA
 WHERE ESTANTE NOT BETWEEN 'B' AND 'D'
-- 10. Visualizar todas las asignaturas que contengan tres letras "o" en su interior y tengan alumnos matriculados de "Madrid".
SELECT NOMBRE
FROM ASIGNATURAS
WHERE NOMBRE LIKE '%o%o%o%'
  AND NOMBRE IN (
      SELECT NOMBRE
      FROM ALUMNOS
      WHERE POBLA = 'Madrid'
  );
-- 11. Visualizar los nombres de alumnos que tengan una nota entre 7 y 8 en la asignatura de "FOL "
SELECT DISTINCT APENOM
FROM ALUMNOS
WHERE DNI IN (
    SELECT DNI   
    FROM NOTAS
    WHERE NOTA BETWEEN 7 AND 8
      AND COD IN (
          SELECT COD
          FROM ASIGNATURAS
          WHERE COD = 4
      )
);
-- 12. Visualizar los nombres de asignaturas que no tengan suspensos.
SELECT DISTINCT NOMBRE
FROM ASIGNATURAS
WHERE COD NOT IN (SELECT DISTINCT COD
              FROM NOTAS
              WHERE NOTA < 5
              )
-- 13. Visualizar los nombres de alumnos de "Madrid' que tengan alguna asignatura suspendida.
SELECT DISTINCT APENOM
FROM ALUMNOS
WHERE POBLA = 'Madrid'
AND DNI IN(SELECT DISTINCT DNI
          FROM NOTAS
          WHERE NOTA < 5
          )
-- 14. Mostrar los nombres de alumnos que tengan misma nota que tiene "Díaz Fernández, Maria' en "FOL" en alguna asignatura.


SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS;