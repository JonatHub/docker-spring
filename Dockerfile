# Etapa 1: Construcción
FROM gradle:8.8-jdk17 AS builder

# Directorio de trabajo en la imagen
WORKDIR /app

# Copia los archivos de configuración de Gradle y el código fuente
COPY build.gradle settings.gradle gradle.properties ./
COPY gradle ./gradle
COPY src ./src

# Construye el JAR ejecutable
RUN gradle build --no-daemon

# Etapa 2: Imagen de ejecución
FROM openjdk:17-jdk-slim

# Directorio de trabajo en la imagen
WORKDIR /app

# Copia el JAR construido desde la etapa de construcción
COPY --from=builder /app/build/libs/tu-app.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
