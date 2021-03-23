Ejercicio 1

1. Crear una clase Password. El constructor debe recibir una regex (expresión regular)
que valide el formato requerido para la contraseña. Investigar en Internet qué
recursos provee Java para operar con expresiones regulares.
2. Agregar el método public void setValue(String pwd) que permite asignar una
contraseña acorde a la requerida por la regex del punto anterior. En caso de no
concordar, el método debe arrojar una excepción.
a. Discusión: ¿qué tipo de excepción consideras más adecuada?
b. Implementar el método según lo decidido en (i).

3. Escribir tres clases: PasswordFuerte, PasswordIntermedia, PasswordSimple, todas
deben extender a Password y hardcodear una regex acorde al nivel de seguridad que
el mismo nombre de la clase indica.

Ejercicio 2

1. Crear la clase FiguraGeometrica, abstracta y con el método: public abstract double
area();

2. Sobreescribir adecuadamente el método toString. Discutir en grupo: ¿tiene sentido
sobreescribir el método toString en una clase abstracta?

3. Crear las clases Circulo, Triangulo y Rectangulo, todas subclases de
FiguraGeometrica. ¿Qué error de compilación aparece? ¿Cómo lo solucionarías?
4. Agregar los atributos (variables de instancia) que corresponda en cada caso y
sobreescribir adecuadamente el método area en todas las subclases de
FiguraGeometrica.
5. Crear una clase utilitaria con un método estático: public static double areaPromedio
(FiguraGeometrica arr[]), que calcule y retorne el área promedio de las figuras
contenidas en el array. Crear un programa, instanciar un FiguraGeometrica[], cargarle
datos e invocar a areaPromedio para obtener el área promedio. Mostrar el resultado.
