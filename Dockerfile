FROM eclipse-temurin:17
COPY target/automationtask.jar automationtask.jar
CMD ["java", "-jar", "automationtask.jar"]