FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY build/libs/jenkins_pipeline-0.0.1-SNAPSHOT.jar docker-app.jar
CMD ["java","-jar","docker-app.jar"]
EXPOSE 8080
