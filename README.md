💱 Convertidor de Moneda - Spring Boot

Aplicación web desarrollada en Java con Spring Boot que permite convertir montos entre diferentes monedas utilizando tasas de cambio actualizadas desde una API externa.
🚀 Características principales

    Conversión entre múltiples monedas

    Consumo de API externa para tasas de cambio en tiempo real

    Arquitectura basada en Spring Boot

    Validación de datos de entrada

    Interfaz RESTful para integración

🛠️ Tecnologías utilizadas

    Java 17+

    Spring Boot

    Spring Web

    Spring Data JPA (si aplica)

    API externa de tasas de cambio (ej. ExchangeRate-API, Fixer.io)

    Base de datos: H2 / MySQL / PostgreSQL (según lo que uses)

📦 Cómo ejecutar el proyecto

    Clona el repositorio:

git clone https://github.com/douglasdug/challenge-conversor-moneda-java-backend.git

    Accede al directorio del proyecto:

cd convertidor-moneda-spring

    Compila y ejecuta la aplicación con Maven:

./mvnw spring-boot:run

    Accede a la aplicación:
    Abre tu navegador en http://localhost:8080

📄 Endpoints REST (ejemplo)

    GET /api/convert?from=USD&to=EUR&amount=100
    Convierte 100 dólares estadounidenses (USD) a euros (EUR)

🔒 Seguridad (opcional)

Si implementaste autenticación:

    JWT / Spring Security

    Login en /auth/login

📸 Capturas de pantalla

(Agrega aquí imágenes si tienes interfaz web o resultados JSON)
📄 Licencia

Este proyecto está bajo la licencia MIT.
