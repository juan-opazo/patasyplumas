# Use the Java image
FROM openjdk:14

# Set the working directory
WORKDIR /app

# Copy the Spring Boot jar file
COPY .mvn/wrapper/maven-wrapper.jar /app/spring-boot-app.jar

# Expose the port for the Spring Boot application
EXPOSE 5000

# Start the Spring Boot application
CMD [ "java", "-jar", "spring-boot-app.jar" ]
