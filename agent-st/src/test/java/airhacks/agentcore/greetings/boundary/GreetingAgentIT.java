package airhacks.agentcore.greetings.boundary;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class GreetingAgentIT {

    @Inject
    @ConfigProperty(name = "aws.region",defaultValue = "eu-central-1")
    String region;

    @Inject
    @ConfigProperty(name = "aws.account.id")
    String accountId;

    /**
     * The agent ID as configured in the CDK stack
     */
    String agentId = "QuarkusAgentRuntime";


   String arn() {
        return String.format(
            "arn:aws:bedrock-agentcore:%s:%s:agent/%s",
            this.region, this.accountId, this.agentId
        );
    } 

    @Test
    void invokeAgent() {

    }

}
