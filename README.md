# Arrays

## Overview

This project mirrors a subset of methods from the Java utility class, util.Arrays.

## Requirements

| Software                | Version   |
|:------------------------|:----------|
| Apache Maven            | >=3.9.9   |
| OpenJDK Development Kit | >=21.0.12 |

## Maven Commands

### Checkstyle

```shell
mvn checkstyle:check
```

### Spotless

```shell
mvn spotless:check
mvn spotless:apply
```

### JUnit

```shell
mvn test
```

### JMH

```shell
mvn package
java -jar target/Arrays-1.0.0-SNAPSHOT.jar
```

### JavaDoc

```shell
mvn javadoc:javadoc
```

