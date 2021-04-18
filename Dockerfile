
FROM openjdk:11
RUN mkdir -p /home/app
COPY . /home/app
ENTRYPOINT ["java", "-jar", "/home/app/target/quarkus-app/quarkus-run.jar"]

