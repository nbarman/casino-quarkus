# quarkus-commands

mvn -U io.quarkus:quarkus-maven-plugin:create

https://code.quarkus.io/

mvnw quarkus:dev

=====To debug=======

mvnw compile quarkus:dev -Ddebug

Connect Debugger to localhost:5005


=====Native GraalVM package=========

mvnw package -DskipTests=true -Dquarkus.package.type=native

mvnw package -DskipTests=true -Pnative

=========
cd C:\Program Files\GraalVM\graalvm-ce-java11-22.3.1\bin

gu install native-image


=====docker=============


mvnw quarkus:add-extension -Dextensions="container-image-docker"

mvnw package -Dquarkus.container-image.build=true -Dquarkus.package.type=jar -Dquarkus.container-image.tag=jvm

docker run -i --rm -p 8080:8080 barmanam/casino-quarkus