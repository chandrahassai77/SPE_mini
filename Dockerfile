FROM openjdk:11
COPY ./target/Calculator2-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator2-1.0-SNAPSHOT.jar"]
