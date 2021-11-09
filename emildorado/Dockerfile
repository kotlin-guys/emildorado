FROM adoptopenjdk/openjdk11:alpine-jre

COPY ./build/libs/emildorado.jar emildorado.jar
CMD ["java", "-Xmx128m", "-jar", "emildorado.jar"]
