package com.dependency.injection.rebuild.dir;

import com.dependency.injection.rebuild.dir.controllers.PropertyInjectionController;
import com.dependency.injection.rebuild.dir.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"guru.springframework.sfgdi"})
@SpringBootTest
class DirApplicationTests {

	@Mock
	PropertyInjectionController propertyInjectionController;

	PropertyInjectedGreetingService propertyInjectedGreetingService;

	@BeforeEach
	public void setup(){
		propertyInjectedGreetingService = new PropertyInjectedGreetingService();

	}

	@Test
	void contextLoads() {
	}

	@Test
	public void propertyGreetingBean(){

		when(propertyInjectionController.getGreeting()).thenReturn(propertyInjectedGreetingService.sayGreeting());

		System.out.println("---- Primary Bean ----");
		System.out.println(propertyInjectionController.getGreeting());

		verify(propertyInjectionController, times(1)).getGreeting();
		assertEquals("Hello World - Property", propertyInjectionController.getGreeting());
	}
}
