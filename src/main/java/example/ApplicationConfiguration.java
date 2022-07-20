package example;

import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 * Manages the configuration and current state of the application.
 */
@Component
public class ApplicationConfiguration {

    private String environment = "";
    private final Logger log = Logger.getLogger(getClass().getName());

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
