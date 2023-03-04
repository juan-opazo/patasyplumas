FROM amazoncorretto:17-alpine 
COPY "./target/pet-care-app-int-1.0.jar" "pet-app1.jar"
EXPOSE 9090
ENTRYPOINT ["java","-jar","pet-app1.jar"]