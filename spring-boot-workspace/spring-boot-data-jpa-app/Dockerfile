FROM adoptopenjdk/openjdk11
WORKDIR /
ADD target/spring-boot-data-jpa-app-0.0.1-SNAPSHOT.war spring-boot-jpa.war
EXPOSE 8000
CMD java -jar spring-boot-jpa.war
