package example;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * Custom Prompt Provider to customize the shell prompt.
 */
@Component
public class CustomPromptProvider implements PromptProvider {

    @Autowired
    private ApplicationConfiguration config;

    @Override
    public AttributedString getPrompt() {
        return new AttributedString(config.getEnvironment() + ":>", AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE));
    }
}
