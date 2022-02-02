package com.dependency.injection.rebuild.dir.controllers;


import com.dependency.injection.rebuild.dir.services.GreetingService;
import com.dependency.injection.rebuild.dir.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;

public class PropertyInjectionControllerTest {

    @Mock
    GreetingService greetingService;

    @InjectMocks
    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    public void startUp(){}

    @Test
    public void sayGreetingTest() {
    }
}
