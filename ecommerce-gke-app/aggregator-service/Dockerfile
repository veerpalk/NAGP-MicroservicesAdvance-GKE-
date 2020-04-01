FROM java:8
EXPOSE 9092
ADD /target/aggregator-service-0.0.1-SNAPSHOT.jar aggregator.jar
ENTRYPOINT ["java","-jar","aggregator.jar"]