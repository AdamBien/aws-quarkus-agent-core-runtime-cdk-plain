# CDK Infrastructure

Deploys the Quarkus agent as AWS Bedrock Agent Runtime.

## Stack

`AgentCoreStack` creates:
- Agent Runtime from Docker asset
- Public network configuration
- Outputs: AgentRuntimeId and AgentArn

## Configuration

Region is configured via `ZCfg` from `stack.props.region` property.

## Deploy

```bash
../buildAndDeployDontAsk.sh
```
