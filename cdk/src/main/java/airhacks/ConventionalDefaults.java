package airhacks;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface ConventionalDefaults {

    Path dockerFilePath = Paths.get("..", "agent","src/main/docker/").toAbsolutePath();

    static String stackName(String appName, String stackName) {
        return "%s-%s-stack".formatted(appName, stackName);
    }
}
