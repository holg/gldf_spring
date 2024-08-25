[![Java CI with Maven on macOS](https://github.com/holg/gldf_spring/actions/workflows/maven.yml/badge.svg)](https://github.com/holg/gldf_spring/actions/workflows/maven.yml)

# GLDF Spring Demo Application

This is a sample Java Spring application designed to load and utilize the native GLDF library (.so/.dll/.dylib) within a Spring environment.

## Features

- Loads the native GLDF library.
- Includes test files (`test.gldf` and `test.json`) for validation.
- Ensures the GLDF library is loaded correctly through `mvn test`.

## Getting Started

To run the tests and verify the setup, use the following command:

```sh
mvn test