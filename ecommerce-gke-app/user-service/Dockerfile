FROM java:8
EXPOSE 9090
ADD /target/user-service-0.0.1-SNAPSHOT.jar user.jar
ENTRYPOINT ["java","-jar","user.jar"]