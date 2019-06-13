FROM openjdk:8-jre

VOLUME ["/hygieia/logs"]

RUN mkdir /hygieia/config


EXPOSE 8080

ENV MONGO_HOST=172.18.0.2
ENV MONGO_PORT=27017
ENV PROP_FILE /hygieia/config/application.properties

WORKDIR /hygieia

COPY target/*.jar /hygieia
COPY docker/properties-builder.sh /hygieia/

CMD ./properties-builder.sh &&\
  java -Djava.security.egd=file:/dev/./urandom -jar *.jar --spring.config.location=$PROP_FILE
