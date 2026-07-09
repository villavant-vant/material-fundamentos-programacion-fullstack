<img src="https://posgrado.utec.edu.pe/sites/default/files/2023-08/Testimonial-home-2.jpg" alt="UTEC" width="900" height="200">

# Ejercicios de reforzamiento: Sesión 4, Sesión 5 y Sesión 6

Repaso de: bucles `for`, `while` y `do-while`, `break` y `continue`, métodos (parámetros, retorno y `void`), alcance (scope) de variables, y arreglos (`int[]`, `double[]`, `String[]`, `boolean[]`).

---

## Ejercicio 1: Suma de los primeros N números

Crea un método `sumarHasta(int n)` que retorne la suma de los números del 1 al `n` usando un `for`. Solicita `N` por teclado y muestra el resultado.

## Ejercicio 2: Tabla de multiplicar

Solicita un número y, con un `while`, imprime su tabla de multiplicar del 1 al 10.

## Ejercicio 3: Contar números pares

Crea un método `contarPares(int n)` que cuente e imprima cuántos números pares hay entre 1 y `n` usando un `for`.

## Ejercicio 4: Factorial de un número

Crea un método `factorial(int n)` que retorne el factorial de `n` usando un bucle. Solicita un número y muestra su factorial.

## Ejercicio 5: Serie de Fibonacci

Solicita cuántos términos `N` de la serie de Fibonacci se desean generar e imprímelos usando un `while`.

## Ejercicio 6: Validación con do-while

Usa un `do-while` para pedir repetidamente un número al usuario hasta que ingrese uno positivo (mayor a 0). Muestra un mensaje de error en cada intento fallido.

## Ejercicio 7: Menú interactivo

Crea un menú con un `while` que se repita hasta que el usuario elija la opción "Salir". Dentro del bucle usa un `switch` para procesar al menos 3 opciones distintas (por ejemplo: saludar, mostrar fecha simulada, salir).

## Ejercicio 8: Suma de impares con continue

Usando un `for` del 1 al `N` y la instrucción `continue`, suma únicamente los números impares y muestra el total.

## Ejercicio 9: Primer múltiplo de 7

Usando un `for` y `break`, encuentra e imprime el primer número mayor a 100 que sea divisible entre 7.

## Ejercicio 10: Método isPrimo

Crea un método `boolean esPrimo(int n)` y utilízalo dentro de un `for` para listar todos los números primos entre 1 y `N`.

## Ejercicio 11: Suma y promedio de un arreglo

Solicita `N` y llena un arreglo de `double` con `N` números leídos por teclado. Crea métodos `sumar(double[] arr)` y `promedio(double[] arr)` que reciban el arreglo y retornen los resultados.

## Ejercicio 12: Máximo y mínimo de un arreglo

Con un arreglo de enteros ya definido en el código, crea dos métodos separados, `obtenerMaximo(int[] arr)` y `obtenerMinimo(int[] arr)`, que retornen el valor máximo y mínimo respectivamente.

## Ejercicio 13: Invertir un arreglo

Crea un método `int[] invertir(int[] arr)` que retorne un nuevo arreglo con los elementos en orden inverso al original. Imprime ambos arreglos para comparar.

## Ejercicio 14: Contar apariciones

Dado un arreglo de enteros y un valor a buscar, crea un método `contarApariciones(int[] arr, int valor)` que retorne cuántas veces aparece ese valor en el arreglo.

## Ejercicio 15: Buscar en un arreglo de nombres

Dado un arreglo de `String` con nombres de estudiantes, crea un método `buscarPosicion(String[] nombres, String buscado)` que retorne la posición del nombre buscado, o `-1` si no lo encuentra.

## Ejercicio 16: Clasificación de notas

Dado un arreglo de `double` con notas de un salón, crea un método `contarAprobados(double[] notas)` que retorne cuántos alumnos aprobaron (nota >= 13) y otro `promedioSalon(double[] notas)` que retorne el promedio general.

## Ejercicio 17: Ordenar un arreglo (burbuja)

Crea un método `void ordenar(int[] arr)` que ordene un arreglo de menor a mayor usando el algoritmo de burbuja (bucles `for` anidados). Imprime el arreglo antes y después de ordenarlo.

## Ejercicio 18: Duplicar valores de un arreglo

Crea un método `int[] duplicar(int[] arr)` que retorne un nuevo arreglo donde cada elemento sea el doble del original. No debe modificar el arreglo recibido.

## Ejercicio 19: Caja registradora con descuento

Dado un arreglo de `double` con precios de productos, crea un método `calcularTotal(double[] precios)` que sume todos los precios, y un método `aplicarDescuento(double total, double porcentaje)` que retorne el total con el descuento aplicado.

## Ejercicio 20 (integrador): Registro de asistencia semanal

Usa un arreglo `boolean[7]` donde cada posición representa si el alumno asistió (`true`) o faltó (`false`) un día de la semana (lunes a domingo). Crea:
- Un método `contarAsistencias(boolean[] asistencia)` que retorne el total de días asistidos.
- Un método `mostrarResumen(boolean[] asistencia)` que recorra el arreglo con un `for` y, usando un `switch` sobre el índice del día, imprima el nombre del día junto con "Asistió" o "Faltó".
