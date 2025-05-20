FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B

COPY src ./src

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]
