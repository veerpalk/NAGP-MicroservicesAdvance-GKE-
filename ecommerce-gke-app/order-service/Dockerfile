FROM java:8
EXPOSE 9091
ADD /target/order-service-0.0.1-SNAPSHOT.jar order.jar
ENTRYPOINT ["java","-jar","order.jar"]