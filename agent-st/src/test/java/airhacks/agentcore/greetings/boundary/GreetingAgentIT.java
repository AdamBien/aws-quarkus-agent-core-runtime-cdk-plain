package airhacks.agentcore.greetings.boundary;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class GreetingAgentIT {

    @Inject
    @ConfigProperty(name = "uri")
    String baseURI;

    @Test
    void invokeAgent() {

    }

}
