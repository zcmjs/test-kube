FROM openjdk:17-alpine3.14
EXPOSE 8080
ADD target/kube-0.0.1.jar kube-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/kube-0.0.1.jar"]

#docker build --tag=message-server:latest .