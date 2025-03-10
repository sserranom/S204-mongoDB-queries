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

## Contribución

Si tienes alguna consulta adicional o mejoras para las consultas existentes, no dudes en abrir un issue o enviar un pull request.
