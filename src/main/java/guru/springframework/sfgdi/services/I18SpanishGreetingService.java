package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("I18nService")
public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HOLA-ES";
    }
}
