FROM harbor.oyj.net/basic/amazoncorreto:17-alpine
ARG APPLICATION_USER=appuser
RUN adduser --no-create-home -u 1000 -D $APPLICATION_USER

RUN mkdir /app && chown -R $APPLICATION_USER /app
USER 1000
COPY --chown=1000:1000 ./target/demo-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app

EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar" ]
