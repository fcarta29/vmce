FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
COPY target/psolabs-vmce-webapp.war /opt/app
CMD ["java", "-jar", "/opt/app/psolabs-vmce-webapp.war"]