package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * Provides general shell functions.
 */
@ShellComponent
public class General {

    @Autowired
    private ApplicationConfiguration config;

    @ShellMethod(value = "Selects the environment.", key = {"env", "environment"})
    public void environment(String environment) {
        config.setEnvironment(environment);
    }
}
