package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyGreetingServiceTest {

    PropertyInjectedController injectedController;

    @BeforeEach
    void setUp() {
        injectedController = new PropertyInjectedController();
        injectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(injectedController.getGreeting());
    }
}