FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/psolabs-vmce-webapp.war psolabs-vmce-webapp.war
RUN sh -c 'touch /psolabs-vmce-webapp.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/psolabs-vmce-webapp.war.war"]
