package com.dependency.injection.rebuild.dir.services;

import com.dependency.injection.rebuild.dir.DirApplication;
import com.dependency.injection.rebuild.dir.controllers.PropertyInjectionController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    @Mock
    PropertyInjectionController propertyInjectionController;

    DirApplication dirApplication;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testBaseGreeting(){
        verify(propertyInjectionController, times(1)).getGreeting();

    }
}