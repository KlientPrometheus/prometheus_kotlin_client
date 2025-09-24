# Benchmarks

This module contains performance benchmarks for the **Prometheus Kotlin Client**.  
The goal is to compare our client’s performance against the official **Java Prometheus Client** using [JMH (Java Microbenchmark Harness)](https://openjdk.org/projects/code-tools/jmh/).

## Running the benchmarks

To execute the benchmarks, run:

```bash
./gradlew :benchmarks:jmh
