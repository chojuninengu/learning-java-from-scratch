# Dockerized Calculator

This project contains a simple calculator application that can be run in different Java versions using Docker.

## Project Structure

```
.
├── src/
│   └── main/
│       └── java/
│           └── calculator/
│               ├── Adder.java
│               ├── Subtractor.java
│               ├── Multiplier.java
│               ├── Divider.java
│               └── Calculator.java
├── Dockerfile.java8
├── Dockerfile.java11
├── Dockerfile.java17
├── docker-compose.yml
├── pom.xml
└── README.md
```

## Prerequisites

- Docker
- Docker Compose

## Running the Calculator

You can run the calculator in three different Java versions:

### Java 8

```bash
docker-compose run calculator-java8
```

### Java 11

```bash
docker-compose run calculator-java11
```

### Java 17

```bash
docker-compose run calculator-java17
```

## Building All Versions

To build all versions at once:

```bash
docker-compose build
```

## Features

- Basic arithmetic operations (addition, subtraction, multiplication, division)
- Support for different numeric types (int, float, long, double)
- Interactive command-line interface
- Error handling for division by zero and invalid inputs

## Notes

- Each version uses a multi-stage build to minimize the final image size
- The calculator runs in interactive mode, allowing user input
- Use Ctrl+C to exit the calculator
