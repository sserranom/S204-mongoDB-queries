# Tarea S2.04. MongoDB queries

# Consultas MongoDB para la Base de Datos de Restaurant

Este repositorio contiene un conjunto de consultas MongoDB escritas para interactuar con la base de datos de restaurantes. Las consultas se han desarrollado y probado utilizando MongoDB Compass y mongosh.

## Tecnologías Utilizadas

* **MongoDB:** Base de datos NoSQL utilizada para almacenar la información de los restaurantes.
* **JavaScript:** Lenguaje de programación utilizado para guaardar las consultas.
* **MongoDB Compass:** Interfaz gráfica de usuario para explorar y manipular bases de datos MongoDB.
* **mongosh:** Shell interactivo para MongoDB.
* **BSON:** Formato de serialización utilizado por MongoDB para almacenar documentos y datos.


## Estructura del Repositorio

* **`restaurant_queries.js`**: Este archivo contiene todas las consultas MongoDB escritas en JavaScript.
* **`restaurant.json`**: Copia de la base de datos MongoDB "restaurant".

## Requisitos

* MongoDB instalado y en ejecución
* MongoDB Compass (opcional)
* mongosh

## Configuración

1.  Clona este repositorio:

    ```bash
    git clone [https://github.com/cran/DELTD](https://github.com/cran/DELTD](https://github.com/sserranom/S204-mongoDB-queries.git)
    ```

2.  Restaura la base de datos "restaurant" utilizando el archivo `restaurant.json`. Puedes hacerlo utilizando `mongorestore` desde la línea de comandos o importando el archivo en MongoDB Compass.

## Uso de las Consultas

1.  **Con MongoDB Compass:**
    * Abre MongoDB Compass y conéctate a tu instancia de MongoDB.
    * Abre la base de datos "restaurant".
    * Puedes copiar y pegar las consultas del archivo `restaurant_queries.js` en la barra de consultas de Compass y ejecutarlas.

2.  **Con mongosh:**
    * Abre una terminal y conéctate a tu instancia de MongoDB utilizando mongosh:

        ```bash
        mongosh
        ```

    * Cambia a la base de datos "restaurant":

        ```javascript
        use restaurant
        ```

    * Puedes copiar y pegar las consultas del archivo `restaurant_queries.js` en la terminal y ejecutarlas.
    * 
## Conexion de la BD Restaurant con Java (Extra)

El directorio `mongo-queries` contiene un proyecto Java con Maven que demuestra cómo conectarse a la base de datos MongoDB "restaurant" y ejecutar algunas de las consultas.

### Configuración del Proyecto Java

1.  Asegúrate de que MongoDB esté en ejecución.
2.  Abre un terminal y navega hasta el directorio `mongo-queries/`.
3.  Modifica la cadena de conexión en `src/main/java/MongoDBConnection.java` si es necesario para que coincida con tu configuración de MongoDB.
4.  Ejecuta el siguiente comando para compilar y ejecutar el proyecto:

    ```bash
    mvn clean install exec:java -Dexec.mainClass="Main"
    ```

### Estructura del Proyecto Java

* **`src/main/java/MongoDBConnection.java`**: Clase que establece la conexión con la base de datos MongoDB.
* **`src/main/java/RestaurantDAO.java`**: Clase que contiene métodos para interactuar con la colección de restaurantes en la base de datos.
* **`src/main/java/Main.java`**: Clase principal que ejecuta los métodos del DAO.
* **`pom.xml`**: Archivo de configuración de Maven que gestiona las dependencias del proyecto.


## Contribución

Si tienes alguna consulta adicional o mejoras para las consultas existentes, no dudes en abrir un issue o enviar un pull request.
