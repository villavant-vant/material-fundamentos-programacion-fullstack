<img src="https://posgrado.utec.edu.pe/sites/default/files/2023-08/Testimonial-home-2.jpg" alt="UTEC" width="900" height="200">

# Ejercicios de reforzamiento: Sesión 1, Sesión 2 y Sesión 3

Repaso de: `System.out.println/print/printf`, entrada por teclado con `Scanner`, tipos de datos primitivos (`int`, `double`, `boolean`, `char`, `String`), variables y constantes, operadores aritméticos, relacionales y lógicos, precedencia de operadores, concatenación de cadenas, condicionales (`if`, `if/else`, `if/else if`, anidados), operador ternario y `switch`.

---

## Ejercicio 1: Tarjeta de datos personales

Declara variables para nombre, edad, distrito donde vives y correo electrónico. Imprime los datos con `println`, uno por línea.

## Ejercicio 2: Conversor de segundos

Solicita una cantidad de segundos y calcula a cuántas horas, minutos y segundos equivale (usa división entera `/` y módulo `%`). Ejemplo: 3665 segundos = 1 hora, 1 minuto, 5 segundos.

## Ejercicio 3: Área y perímetro de un rectángulo

Solicita por teclado el largo y el ancho de un rectángulo (`double`) y muestra su área y perímetro usando `printf` con 2 decimales.

## Ejercicio 4: Promedio ponderado

Solicita 3 notas y calcula el promedio ponderado sabiendo que la primera vale 20%, la segunda 30% y la tercera 50%. Usa constantes para los pesos.

## Ejercicio 5: Intercambio sin variable auxiliar

Declara dos variables enteras `a` y `b` con valores iniciales. Intercambia sus valores usando solo operaciones aritméticas (sin una tercera variable) e imprime el resultado.

## Ejercicio 6: Conversor de moneda

Define una constante `TIPO_CAMBIO = 3.75`. Solicita un monto en dólares y muestra su equivalente en soles con `printf` (2 decimales).

## Ejercicio 7: Índice de masa corporal (cálculo simple)

Solicita peso (kg) y estatura (m) y calcula el IMC (`peso / (estatura * estatura)`). Aún no se pide clasificar el resultado, solo calcularlo y mostrarlo con 2 decimales.

## Ejercicio 8: Casting explícito

Declara una variable `double` con decimales (por ejemplo 19.87) y conviértela a `int` con casting explícito. Declara también un `char` con una letra y conviértelo a su valor numérico (`int`). Imprime ambos resultados explicando qué pasó con cada conversión.

## Ejercicio 9: Concatenación de cadenas

Solicita nombre y apellido por separado. Construye un mensaje de bienvenida concatenando ambos datos, por ejemplo: `"Bienvenido/a, Jorge Villavicencio"`.

## Ejercicio 10: Incremento y decremento

Declara una variable `int x = 5`. Imprime el valor de `x++` y luego el valor final de `x`. Repite el ejercicio con `++x` desde el inicio y compara la diferencia entre ambos operadores.

## Ejercicio 11: Tabla de verdad

Declara dos variables `boolean`. Imprime el resultado de aplicarles `&&`, `||` y `!` (a cada una por separado), mostrando las 4 combinaciones posibles de valores (puedes cambiar los valores y volver a ejecutar).

## Ejercicio 12: Vuelto de una compra

Solicita el total a pagar y el monto con el que paga el cliente. Calcula el vuelto y muéstralo con `printf` (2 decimales).

## Ejercicio 13: Verificar si un número es par

Solicita un número entero y usa el operador `%` para determinar si es par o impar. Guarda el resultado en una variable `boolean` y muéstrala.

## Ejercicio 14: Área de un círculo

Solicita el radio de un círculo (`double`) y calcula su área usando `Math.PI`. Muestra el resultado con `printf` (2 decimales).

## Ejercicio 15: Conversor de temperatura

Solicita una temperatura en grados Celsius y calcula su equivalente en Kelvin (`C + 273.15`) y en Fahrenheit (`C * 9/5 + 32`).

## Ejercicio 16: Recibo de compra con 3 productos

Solicita nombre, precio y cantidad de 3 productos (repite la solicitud 3 veces con variables distintas). Calcula el subtotal de cada uno y el total de la compra. Muestra un recibo con `printf`.

## Ejercicio 17: Comparación de números

Solicita dos números enteros y muestra el resultado de compararlos con `==`, `>`, `<`, `>=` y `<=` (una línea por cada operador, indicando el resultado boolean).

## Ejercicio 18: Validar rango de edad con operadores lógicos

Solicita una edad y determina, usando `&&`, si la persona está en edad escolar (entre 6 y 17 años). Determina también, usando `||`, si la persona puede pagar tarifa reducida (menor de 18 O mayor de 65).

## Ejercicio 19: Área y circunferencia con constantes

Declara una constante `PI = 3.1416`. Solicita el radio de una circunferencia y calcula su área (`PI * radio^2`) y su longitud (`2 * PI * radio`).

## Ejercicio 20: Ficha de matrícula

Solicita: nombre completo, edad, carrera, costo por crédito (`double`) y número de créditos matriculados (`int`). Calcula el monto total a pagar (créditos × costo por crédito) y si el estudiante es menor de edad (`boolean`). Muestra una ficha final con todos los datos usando `printf`.

## Ejercicio 21: Positivo, negativo o cero

Solicita un número entero y usa `if/else if/else` para indicar si es positivo, negativo o cero.

## Ejercicio 22: El mayor de dos números

Solicita dos números enteros y usa `if/else` para imprimir cuál de los dos es mayor. Contempla el caso en que ambos sean iguales.

## Ejercicio 23: Clasificar un triángulo

Solicita la longitud de los 3 lados de un triángulo. Usando condicionales anidados, determina si es equilátero (los 3 lados iguales), isósceles (2 lados iguales) o escaleno (los 3 lados distintos).

## Ejercicio 24: Par o impar con operador ternario

Solicita un número entero y, usando **solo** el operador ternario (`?:`), guarda en una variable `String` el texto `"Par"` o `"Impar"` según corresponda. Imprime el resultado.

## Ejercicio 25: Clasificación de nota por letra

Solicita una nota (0 a 20) y usa `if/else if` para asignarle una letra:

- 18-20: "A"
- 14-17: "B"
- 11-13: "C"
- 0-10: "D"

Si el valor ingresado está fuera del rango 0-20, imprime `"Nota invalida"`.

## Ejercicio 26: Nombre del día con switch

Solicita un número del 1 al 7 y usa `switch` para imprimir el nombre del día de la semana correspondiente (1 = Lunes, ..., 7 = Domingo). Si el número no está en ese rango, imprime `"Numero invalido"`.

## Ejercicio 27: Descuento por rango de compra (anidado)

Solicita el monto de una compra y si el cliente es miembro (`boolean`). Usando condicionales anidados:

- Si es miembro y el monto es mayor a 100, aplica 20% de descuento.
- Si es miembro y el monto es menor o igual a 100, aplica 10% de descuento.
- Si no es miembro, no aplica descuento.

Muestra el monto original, el descuento aplicado y el monto final.

## Ejercicio 28 (integrador): Tarifa de taxi

Solicita la distancia recorrida en km (`double`) y la hora del día (entero, 0 a 23). Calcula la tarifa:

- Tarifa base: S/ 5 + S/ 1.5 por km.
- Si la hora está entre las 22 y las 5 (horario nocturno), aplica un recargo del 25% sobre el total.
- Si la distancia es mayor a 20 km, aplica además un descuento del 5% sobre el total (después del recargo, si corresponde).

Usa condicionales para evaluar cada regla y `printf` para mostrar el detalle del cálculo y la tarifa final con 2 decimales.
