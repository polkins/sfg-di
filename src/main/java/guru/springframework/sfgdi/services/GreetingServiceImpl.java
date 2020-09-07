package guru.springframework.sfgdi.services;


import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hi";
    }
}
