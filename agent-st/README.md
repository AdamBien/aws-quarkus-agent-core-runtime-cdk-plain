# service-st

To perform black box tests locally (uses http://localhost:8080 by default):

To test against a remote environment, set the BASE_URI environment variable:

```
mvn clean test-compile failsafe:integration-test
```