# lab2_cvds

## Preguntas

## Ejercicio de las figuras
### Crear un proyecto con maven
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/1.png)
### Ajustar las configuraciones
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/2.png)
### Compilar y ejecutar
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/3.png)

### Cual es el objetivo del parámetro *package*
El objetivo del parámetro package es recorrer todas las fases del ciclo de vida,
desde la compilación hasta la ejecución de pruebas y finalmente genera un archivo empaquetado
(normalmente *.jar* o *.war*) que puede distribuirse o desplegarse.

### Que otros comandos se le puede lanzar al *mvn*
- mvn clean
- mvn compiler:compile
- mvn compiler:testCompile
- mvn install
- mvn deploy
- mvn validate
- mvn dependency:tree
- mvn dependency:analyze
- mvn archetype:generate
- mvn site:site
- mvn test
- mvn compile
- mvn verify

### Como ejecutar desde la linea de comandos un proyecto maven y verifique la salida cuando se ejecuta con la clase *app.jar* con parametro en "mainClass"
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/4.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/5.png)
### Como enviar parametros al plugin exec.
mvn exec:java  -Dexec.args="Inserte parametro"
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/7.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/6.png)
### Enviar como parametro mi nombre
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/8.png)

### Enviar como parametro nombre y apellido
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/9.png)
Solo se envia mi nombre mas no mi apellido

### Verifique como mandar los parametros de forma compuesta
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/10.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/11.png)