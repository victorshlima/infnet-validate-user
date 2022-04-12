FROM openjdk:11
MAINTAINER  "vlima@<victorshlima@gmail.com>"

#TODO criar uma pasta para o projeto
COPY build/libs/infnet-validate-user-0.0.1-SNAPSHOT.jar infnet-validate-user-0.0.1-SNAPSHOT.jar
#Release Exteranal access
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "infnet-validate-user-0.0.1-SNAPSHOT.jar"]