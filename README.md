An example project showing how to use Gradle to build a Groovy Script into an executable JAR file.

It uses the shadow plugin to generate the jar file...

## Prerequisites

You need to have a jdk installed on your machine. (I'm using OpenJdk Zulu 17)

## Running via Gradle

To run the project via Gradle, use the following command:

```bash
./gradlew run
```

## Building an Executable JAR

To build an executable JAR file, use the following command:

```bash
./gradlew shadowJar
```

## Running the Executable JAR

To run the executable JAR file, use the following command:

```bash
java -jar app/build/libs/app-all.jar
```

## Running the tests

To run the tests, use the following command:

```bash
./gradlew test
```
