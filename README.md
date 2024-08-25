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

```markdown
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
```

## Test Output

```plaintext
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for eu.trahe:gldf_spring:jar:1.0-SNAPSHOT
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: org.mockito:mockito-core:jar -> version 4.0.0 vs 5.3.1 @ line 72, column 21
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: org.junit.jupiter:junit-jupiter-api:jar -> version 5.8.1 vs 5.11.0 @ line 77, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] ------------------------< eu.trahe:gldf_spring >------------------------
[INFO] Building gldf_spring 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ gldf_spring ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ gldf_spring ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ gldf_spring ---
[INFO] Copying 2 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ gldf_spring ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- surefire:3.0.0:test (default-test) @ gldf_spring ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running eu.trahe.gldf_spring.controller.FileUploadControllerTest
19:55:56.676 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [eu.trahe.gldf_spring.controller.FileUploadControllerTest]: FileUploadControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
19:55:56.726 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration eu.trahe.gldf_spring.GldfSpringApplication for test class eu.trahe.gldf_spring.controller.FileUploadControllerTest
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.4)
2024-08-25T19:55:56.874+02:00  INFO 4213 --- [           main] e.t.g.c.FileUploadControllerTest         : Starting FileUploadControllerTest using Java 21.0.2 with PID 4213 (started by htr in /Users/htr/Documents/develeop/java/gldf_spring)
2024-08-25T19:55:56.875+02:00  INFO 4213 --- [           main] e.t.g.c.FileUploadControllerTest         : No active profile set, falling back to 1 default profile: "default"
2024-08-25T19:55:57.340+02:00  INFO 4213 --- [           main] e.t.g.c.FileUploadControllerTest         : Started FileUploadControllerTest in 0.565 seconds (process running for 1.016)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (/Users/htr/.m2/repository/net/bytebuddy/byte-buddy-agent/1.14.8/byte-buddy-agent-1.14.8.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.454 s - in eu.trahe.gldf_spring.controller.FileUploadControllerTest
[INFO] Running eu.trahe.gldf_spring.GldfSpringApplicationTests
2024-08-25T19:55:58.039+02:00  INFO 4213 --- [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [eu.trahe.gldf_spring.GldfSpringApplicationTests]: GldfSpringApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2024-08-25T19:55:58.042+02:00  INFO 4213 --- [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration eu.trahe.gldf_spring.GldfSpringApplication for test class eu.trahe.gldf_spring.GldfSpringApplicationTests
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 s - in eu.trahe.gldf_spring.GldfSpringApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.468 s
[INFO] Finished at: 2024-08-25T19:55:58+02:00
[INFO] ------------------------------------------------------------------------
```
```