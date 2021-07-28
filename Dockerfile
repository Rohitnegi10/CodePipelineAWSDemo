FROM adoptopenjdk:11-jre-hotspot
EXPOSE 9090
ADD target/ecs-demo.jar ecs-demo.jar
ENTRYPOINT [ "java", "-jar", "ecs-demo.jar" ]