# lab2_cvds

## Preguntas
### Cuál es su mayor utilidad
Su principal utilidad radica en la simplificación y automatización de los procesos del ciclo 
de vida de desarrollo de software, lo que mejora la productividad y la calidad de vida de los
desarrolladores.

### Fases de maven y ciclo de vida de la construcción
1. __Validate:__
   Verifica que el proyecto tiene toda la información necesaria para ser procesado. Es una fase inicial que asegura que el proyecto esté correctamente configurado antes de comenzar el proceso de construcción.
2. __Compile:__
   Compila los archivos fuente (.java) del proyecto y genera archivos compilados (.class). Esta fase es crucial, ya que si falla, el ciclo de vida se detendrá.
3. __Test:__
   Ejecuta las pruebas unitarias del proyecto. Si alguna prueba falla, el proceso se detiene para evitar errores en etapas posteriores.
4. __Package:__
   Empaqueta el código compilado en un formato estándar de Java, como un archivo .jar, que puede ser utilizado para su ejecución o despliegue en un servidor.
5. __Verify:__
   Realiza pruebas de integración para asegurar que todo funciona correctamente y que la calidad del proyecto es adecuada1.
6. __Install:__
   Instala el artefacto en el repositorio local, permitiendo que otros proyectos Maven en la misma máquina lo utilicen como dependencia.
7. __Deploy:__
   Despliega el artefacto en un servidor remoto, haciéndolo accesible para otros proyectos Maven que tengan acceso a ese servidor.

### Para qué sirven los plugins
Los plugins en Maven son componentes esenciales que permiten extender y personalizar el comportamiento de Maven para satisfacer las necesidades específicas de un proyecto.

- Los plugins automatizan tareas comunes en el ciclo de vida de construcción de un proyecto, como la compilación de código, la ejecución de pruebas, la creación de documentación y el empaquetado de artefactos.
- Permiten reutilizar lógica de construcción común a través de múltiples proyectos, lo que facilita la gestión y mantenimiento de proyectos grandes y complejos.
- Los plugins pueden ser configurados para adaptarse a las necesidades específicas de un proyecto mediante parámetros únicos que se exponen en la descripción de cada objetivo (goal) del plugin.
- Muchos plugins están diseñados para integrarse con herramientas externas y frameworks, permitiendo a los desarrolladores utilizar herramientas adicionales dentro del proceso de construcción de Maven.
- Algunos plugins se encargan de crear archivos específicos como JARs, WARs, y documentación del proyecto, facilitando así el proceso de empaquetado y distribución del software.

### Qué es y para qué sirve el repositorio central de maven
Es un repositorio remoto público que almacena una amplia variedad de librerías Java, plugins y otros artefactos de construcción. Este repositorio es fundamental para el funcionamiento de Maven, ya que proporciona acceso a las dependencias necesarias para construir proyectos de software.
- Maven Central almacena miles de librerías y artefactos que son utilizados comúnmente en el desarrollo de software Java. Esto permite a los desarrolladores acceder fácilmente a las dependencias necesarias para sus proyectos sin tener que descargarlas manualmente.
- Los proyectos Maven pueden especificar las dependencias que necesitan en su archivo POM (Project Object Model). Maven utiliza el repositorio central para descargar automáticamente estas dependencias cuando se construye el proyecto, asegurando que todas las librerías necesarias estén disponibles.
- Al utilizar un repositorio centralizado, Maven garantiza que todos los proyectos tengan acceso a las mismas versiones de las librerías, lo que ayuda a mantener la consistencia y estandarización en el desarrollo de software.
- Los desarrolladores pueden buscar y utilizar diferentes versiones de las librerías desde Maven Central, lo que facilita la gestión de versiones y actualizaciones en los proyectos.

## Ejercicio de las figuras
### Crear un proyecto con maven
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/1.png)
### Ajustar las configuraciones
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/2.png)
### Compilar y ejecutar
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/3.png)

### Cuál es el objetivo del parámetro *package*
El objetivo del parámetro package es recorrer todas las fases del ciclo de vida,
desde la compilación hasta la ejecución de pruebas y finalmente genera un archivo empaquetado
(normalmente *.jar* o *.war*) que puede distribuirse o desplegarse.

### Qué otros comandos se le puede lanzar al *mvn*
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

### Cómo ejecutar desde la linea de comandos un proyecto maven y verifique la salida cuando se ejecuta con la clase *app.jar* con parametro en "mainClass"
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/4.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/5.png)
### Cómo enviar parámetros al plugin exec
mvn exec:java  -Dexec.args="Inserte parametro"
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/7.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/6.png)
### Enviar como parámetro mi nombre
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/8.png)

### Enviar como parámetro nombre y apellido
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/9.png)
Solo se envia mi nombre, mas no mi apellido.

### Verifique como mandar los parámetros de forma compuesta
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/10.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/11.png)

## HACER EL ESQUELETO DE LA APLICACIÓN

### Cree una interfaz llamada *Shape.java*
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/16.png)

### Cree una enumeración llamada *RegularShapeType.java*
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/17.png)

###  Cree las diferentes clases *(Triangle, Quadrilateral, Pentagon, Hexagon)*, que implementen la interfaz creada y retornen el número correspondiente de vértices que tiene la figura.
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/18.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/19.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/20.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/21.png)

### Cree el archivo *ShapeMain.java*
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/22.png)

### Cree el archivo *ShapeFactory.java*
Se usa la fabrica abstracta (Abstract Factory)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/23.png)

### Ejecuciones de prueba del programa 
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/12.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/13.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/14.png)
![](https://github.com/lisaforero/lab2_cvds/blob/main/Imagenes/15.png)

- De las anteriores pruebas la unica que pasa es la ultima, esto ocurre ya que al revisar el codigo se
puede ver que es el unico caso donde el switch case es el apropiado para devolver una respuesta.


