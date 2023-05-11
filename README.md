# API REST con Spring Boot Generics

[ColmenaTEC](https://youtube.com/playlist?list=PLRFOqDrY-6nvhgKJ2Db1h8aPJm3zaX6eO)

## Código Genérico

Se trata de crear clases, interfaces y métodos parametrizados, que nos van a permitir reutilizar el mismo código para
distintos tipos de datos.

1. Permite la reutilización de código: usar el mismo código para tipos diferentes
2. Código de mayor calidad, legible y limpio
3. Seguridad de tipos: se reduce la posibiliad de que ocurra un error
4. Evita el casteo de clases
5. Rapidez de ejecución, las comprobaciones de tipo se hacen durante la compilación. En tiempo de ejecución no existe
información sobre tipos.
6. Se pueden restringir los tipos utilizando 'tipos límite' `(<T extends Number>)`

> ⚠️ <br/>
> Sólo podemos usar tipos de referencia, NO tipos primitivos