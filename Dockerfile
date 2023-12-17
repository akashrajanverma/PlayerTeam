FROM openjdk:17-oracle

EXPOSE 8080

ADD target/player-team.jar player-team.jar

ENTRYPOINT ["java","-jar","player-team.jar"]