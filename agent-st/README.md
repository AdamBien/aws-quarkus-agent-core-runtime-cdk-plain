# service-st

To perform black box tests locally (uses http://localhost:8080 by default):

export AGENT_ARN=[AgentArn exported during CDK deployment]

```
mvn clean test-compile failsafe:integration-test
```